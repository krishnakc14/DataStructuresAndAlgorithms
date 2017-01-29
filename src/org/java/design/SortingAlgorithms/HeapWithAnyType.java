package org.java.design.SortingAlgorithms;


@SuppressWarnings("unchecked")
public class HeapWithAnyType<AnyType extends Comparable<AnyType>> {
	
	int CAPACITY = 2;
	
	private AnyType[] heap;
	private int size;
	
	public HeapWithAnyType(AnyType[] array)
	{
		size = array.length+1;
	}
	
	public void heapify(AnyType[] array)
	{
		heap = shiftElements(array);
		
		for (int k = heap.length/2; k > 0; k--)
	    {
			buildHeap(heap, k);
	    }
		
		System.out.println("Built Heap:");
		print();
		
	}
	
	public void print()
	{
		
	    for (int k = 1; k < size; k++)
	    {
	    	System.out.print(heap[k].toString()+"\t");
        }
	}
	
	public AnyType[] shiftElements(AnyType[] array)
	{
		AnyType[] newArray = (AnyType[]) new Comparable[array.length+1];
		System.arraycopy(array, 0, newArray, 1, array.length);
		return newArray;
		
	}
	
	public void buildHeap(AnyType[] array, int i)
	{
		
		int l = 2*i, r=l+1, max = i, size = array.length - 1;
		
		if((l <= size && r > size) || l<= size && array[l].compareTo(array[r]) > 0)
			max = l;
		else if(r<= size && array[r].compareTo(array[max]) > 0)
			max = r;
		
		if(array[i].compareTo(array[max]) >= 0)
			max = i;
		
		if(max != i)
		{
			swap(array, i, max);
			buildHeap(array, max);
		}
		
	}
	
	public void swap(AnyType[] array, int n1, int n2)
	{
		AnyType tmp = array[n2];
		array[n2] = array[n1];
		array[n1] = tmp;
	}
	
	public void ensureCapacity()
	{
		if(size <= heap.length)
		{
			size = heap.length;
			AnyType[] old = heap;
			heap = (AnyType[]) new Comparable[size*2];
			System.arraycopy(old, 1, heap, 1, old.length-1);
		}
		
	}
	
	public int getParent(int i)
	{
		return i/2;
	}
	
	public void insert (AnyType var)
	{
		ensureCapacity();
		
		heap[size] = var; 
		int child = size;
		
		while(child > 1 && heap[getParent(child)].compareTo(heap[child]) < 0)
		{
			
			swap(heap, getParent(child), child);
			child = getParent(child);
			
		}
		
		++size;
	}
	
	public static void main(String[] args)
	{
		 Integer[] a = {72,94,88,93,84,45,74,99,5,157};
		 HeapWithAnyType<Integer> he = new HeapWithAnyType<>(a);
		 he.heapify(a);
		 he.insert(1000);
		 System.out.print("\nAfter Adding elemets:\n");
		 he.print();
		 
		 System.out.println();
		 String[] s = {"Krishna","Anu", "Achu", "Kandhari", "Z", "Sri"};
		 HeapWithAnyType<String> str = new HeapWithAnyType<>(s);
		 str.heapify(s);
		 str.insert("ZLux");
		 System.out.print("\nAfter Adding elemets:\n");
		 str.print();
		
	}
	

}
