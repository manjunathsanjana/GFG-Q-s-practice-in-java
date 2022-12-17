import java.util.*;

import java.lang.*;

import java.io.*;

class RverseWord{
public static void main(String args[]){

String str="i.like.this.program.very.much";
String s="";
String word[]= str.split("\\.");      //because string contains "." operator
for(int i=word.length-1;i>=0;i--){
if(i==0){
s=s+word[i];                         // concatenating the words into the string 
}
else{
s=s+word[i]+".";
}
}


System.out.println(s);


}


}