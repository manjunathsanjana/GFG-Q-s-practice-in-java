import java.util.*; 

import java.lang.*;

import java.io.*;

class ClosestNumber{

public static void main(String args[]){
int n=4;
int sum=10000;
int a[]={1,3,6,7};
int b=0;
for(int i=0;i<a.length;i++){
if(Math.abs(a[i]-n)<sum){
sum=Math.abs(a[i]-n);
b=a[i];
}
}
System.out.println(b);

}
}