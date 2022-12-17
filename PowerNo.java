import java.util.*;

import java.lang.*;

import java.io.*;

class PowerNo{
public static void main(String args[]){

int num=5;
int po=3;
int sum=0;
int increased =num;

for(int i=1;i<po;i++){
sum=0;
for(int j=1;j<=num;j++){
sum=sum+increased;         // math.pow(2,i) is used to find the power of 2 where i is an integer
}
increased=sum;
}
System.out.print("the power of a number is:"+increased);
}
}