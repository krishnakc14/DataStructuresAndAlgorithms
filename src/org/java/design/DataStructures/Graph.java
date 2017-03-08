package org.java.design.DataStructures;

import java.util.Scanner;

public class Graph {
	
	public Vertex[] getGraph()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("No of Vertices: ");
		int num = Integer.parseInt(sc.nextLine());
		
		Vertex[] vertex = new Vertex[num];
		
		System.out.print("Vertices: ");
		for(int i = 0; i < num; i++)
			vertex[i] = new Vertex(sc.nextLine());
		
		System.out.println("Edges: ");
		int i = 0;
		while(i<8)
		{
			//Find the edges that are connected
			int v1 = findTheVertex(sc.nextLine(), vertex);
			int v2 = findTheVertex(sc.nextLine(), vertex);
			
			//Add vertex V2 to V1
			if(vertex[v1].nodes == null){
				vertex[v1].nodes = new LinkedList();
				vertex[v1].nodes.add(v2);
			}else
				vertex[v1].nodes.add(v2);
				
			//Add vertex V1 to V2
			if(vertex[v2].nodes == null){
				vertex[v2].nodes = new LinkedList();
				vertex[v2].nodes.add(v1);
			}else
				vertex[v2].nodes.add(v1);
			
			i++;
		}
		sc.close();
		return vertex;
		
	}
	
	
	public int findTheVertex(String name, Vertex[] vertex)
	{
		
		for(int i = 0; i < vertex.length; i++)
		{
			if(vertex[i].name.equalsIgnoreCase(name))
				return i;
		}
		
		return -1;
	}
	
	public void findConnectedNodes(String name, Vertex[] vertex)
	{
		
		int v = findTheVertex(name, vertex);
		Node node = vertex[v].nodes.head;
		LinkedList.print(node);
		
		
	}

	public static void main(String[] args) {

		Graph graph = new Graph();
		Vertex[] vertex = graph.getGraph();
		graph.findConnectedNodes("a",vertex);
		
	}
	
	
	class Vertex
	{
		public String name;
		public LinkedList nodes;
		public Vertex(String name)
		{
			this.name = name;
		}
		
		
	}

}
