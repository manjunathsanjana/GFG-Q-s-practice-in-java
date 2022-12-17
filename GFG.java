import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
		
    while(t>0){
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int m=0;
    int sum=0;
    for(int i=1;i<=arr.length;i++){
        if(arr[m]==i){
        m=m+1;
        sum=sum+1;
        }
        else{
            System.out.println(i);
            break;
        }
    }
    if(sum==0){
        System.out.println("not present");
    }
}
	}
}