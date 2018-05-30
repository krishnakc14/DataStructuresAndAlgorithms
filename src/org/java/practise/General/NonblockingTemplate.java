package org.java.practise.General;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicStampedReference;

public class NonblockingTemplate {

    public static class IntendedModification {
        public AtomicBoolean completed = new AtomicBoolean(false);
    }

    private AtomicStampedReference<IntendedModification> ongoingMod = new AtomicStampedReference<IntendedModification>(null, 0);

    //declare the state of the data structure here.


    public void modify() {
        while(!attemptModifyASR());
    }

    public boolean attemptModifyASR(){

        boolean modified = false;
    
        IntendedModification currentlyOngoingMod = ongoingMod.getReference();
        
        int stamp = ongoingMod.getStamp();
        
    
        if(currentlyOngoingMod == null){

        	IntendedModification newMod =new IntendedModification();
        
            boolean modSubmitted =ongoingMod.compareAndSet(null, newMod, stamp, stamp + 1);
        
            if(modSubmitted){
            
                modified = true;
            }
    
        } else {
        
            modified = false;
        }
    
        return modified;
    }
}