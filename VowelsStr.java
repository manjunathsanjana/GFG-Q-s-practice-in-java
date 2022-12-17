import java.util.*;

import java.lang.*;

import java.io.*;

class VowelsStr{
public static void main(String args[]){
String s="ransomware";
char c[]=s.toCharArray();
Set<Character> d=new HashSet<Character>();
d.add('a');
d.add('e');
d.add('i');
d.add('o');
d.add('u');
String str="";

for(int i=0;i<c.length;i++){
if(d.contains(c[i])){
str=str+c[i];
}
}
int j=str.length()-1;
for(int i=0;i<c.length;i++){
if(d.contains(c[i]) && j>=0){
c[i]=str.charAt(j);
j--;
}
System.out.print(c[i]);
}
}
}