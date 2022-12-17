import java.util.*;

import java.lang.*;

class StringInterleave{

public static void main(String args[]){
String a="YX";
String b="X";
String c="XXY";
int s1=a.length();
int s2=b.length();


for(int i=0;i<c.length();i++){
if(s1!=0){
for(int j=0;j<a.length();j++){
if(c.charAt(i)==a.charAt(j)){
s1=s1-1;
}
}
}
if(s2!=0){
for(int k=0;k<b.length();k++){
if(c.charAt(i)==b.charAt(k)){
s2=s2-1;
}
}
}

}
if(s1==0 && s2==0){
System.out.println("true");
}

}


}