import java.util.*;

import java.lang.*;

import java.io.*;

class Pythog{

public static void main(String args[]){

int a[]={3,2,4,6,5};
Set<Integer> el=new HashSet<Integer>();
boolean flag=false;

for(int i=0;i<a.length;i++){
el.add(a[i]*a[i]);
}

for(int i=0;i<a.length-1;i++){
for(int j=0;j<a.length;j++){
if(el.contains((a[j]*a[j])+(a[i]*a[i]))){
System.out.print("YES");
flag=true;
break;
}
}
if(flag==true){
break;
}
}


}
}