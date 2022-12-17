import java.util.*;

import java.lang.*;

import java.io.*;



class PalMax1{
	
public static void main (String[] args) {
		

String str="abbabb";
int count=0;
int x=0,y=0,sum=0;

for(int i=0;i<str.length();i++){
for(int j=i+2;i<str.length()+1;j++){
String s=str.substring(i,j);
x=s.length()-1;
for(int k=0;k<s.length()/2;k++){
x=x-1;
if(s.charAt(k)==s.charAt(x)){
count=count+1;
}
}
if((count==(s.length()/2)) || (s.length()>sum)){
y=s.length();
sum=y;
}


}


}

System.out.println("THE MAX IS :"+y);

}


}