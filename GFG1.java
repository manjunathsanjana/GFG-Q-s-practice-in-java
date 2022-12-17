import java.util.*;

import java.lang.*;

import java.io.*;


class GFG1 {
	
public static void main (String[] args) {
		
//code
  
int arr[]={0,1,2,1,0}    ;           
int count0=0;
            int count1=0;
            int count2=0;
            
for(int i=0;i<arr.length;i++){
                
if(arr[i]==0){
                    
count0=count0+1;
                
}
                
else if(arr[i]==1){
                    
count1=count1+1;
                
}
                
else{
                    
count2=count2+1;
                
}
            
}
            
for(int i=0;i<count0;i++){
                
arr[i]=0;
            
}
            
for(int i=count0;i<count1+count0;i++){
                
arr[i]=1;
            
}
            
for(int i=count1+count0;i<count0+count1+count2;i++){
               
arr[i]=2; 
            
}
		  
for(int i=0;i<arr.length;i++){
		      
System.out.print(arr[i]+" ");
		  
}

		   
System.out.println("") ;  
		  	  
	
}

}