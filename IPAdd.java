import java.util.*;

import java.io.*;


class IPAdd{
public static void main(String args[]){

String str="0000.0000.0000.0000";
String words[]=str.split("\\.");
int sum=0;
for(int i=0;i<words.length;i++){
if(Integer.parseInt(words[i])>=0 && Integer.parseInt(words[i])<=255){
sum=sum+1;
}
}

if(sum==words.length){
System.out.println("1");
}
else{
System.out.println("0");
}

}


}