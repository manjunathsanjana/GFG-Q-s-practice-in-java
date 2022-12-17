import java.util.*; 

import java.lang.*;

import java.io.*;

class AbsoluteDiffer{
public static void main(String args[]){
int a[]={7,98,56,43,45,23,12,8};

int n=54;
int b=0;
for(int i=0;i<a.length;i++){
if(a[i]<n){
b=a[i];
String s=Integer.toString(b);
char c[]=s.toCharArray();
if(c.length==2){
if(Math.abs(c[0]-c[1])==1){
System.out.print(b+" ");
}
}
}

}

}

}