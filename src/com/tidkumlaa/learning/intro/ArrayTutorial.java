package com.tidkumlaa.learning.intro;

import java.util.Arrays;


public class ArrayTutorial {
    
    public int findMinSimple(int[] data){
        int min = data[0];
        
        for(int i = 1; i < data.length - 1 ; i++){
            
            if(data[i] < min){
                System.out.println("swap "+min+ " => "+data[i]);
                min = data[i];
                
            }else{
                System.out.println("compare and swap"+min+ " => "+data[i]);
 
            }
                
        }
        return min;
    }
    
    public int findMinRecursive(int[] data, int n){
         
        if(n == 0)
        {
            System.out.println("initial array "+data[n]);
            return data[n];
        }
        
        int min = findMinRecursive(data, n-1);
        if(data[n] < min)
        {
            System.out.println("Recursive:compare and swap "+min+ " => "+data[n]);
            return data[n];
            
        }else{
            System.out.println("Recursive:compare "+min+ " => "+data[n]);
            return min;
        }
        
        
    }
    
    
     public int findMin(int[] data, int start, int end){
         
        return findMinR(data, start, end);
        
        
    }
    
    public int findMinR(int[] data, int start, int end){
         
        if(start == end)
        {
            //System.out.println("initial array "+data[start]);
            return data[start];
        }
        
        
        int mid = (start+end)/2;
        
        int min1 = findMin(data, start, mid);
        int min2 = findMin(data, mid+1, end);
        
        System.out.println("Array : "+data[start]+" to "+data[end]+" "+Arrays.toString(data));
        
        System.out.println("Left min "+min1);
        System.out.println("Right min "+min2);
        
        if(min1 < min2) 
        {
            System.out.println("Min is "+min1);
            return min1;
        }else{
            System.out.println("Min is "+min2);
            return min2;
        }
        
        
    }
    
}
