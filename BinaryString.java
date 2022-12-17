import java.util.*;

import java.lang.*;

import java.io.*;

class BinaryString{
public static void main(String arrgs[]){
String str="01101";
int sum=0;

for(int i=0;i<str.length()-1;i++){
for(int j=i+2;j<=str.length();j++){
String s=str.substring(i,j);
if(s.charAt(0)=='1' && s.charAt(s.length()-1)=='1'){
sum=sum+1;
}
}
}

System.out.println(sum);

}


}