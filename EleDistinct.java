import java.util.*;

import java.io.*;

class EleDistinct{
public static void main(String args[]){

int a[]={1,2,1,3,4,2,3};
int sum;
Set<Integer> el=new HashSet<Integer>(); // it adds only unique elements in the set

for(int i=0;i<=a.length-4;i++){   // here window is 4
sum=0;
for(int j=i;j<i+4;j++){
el.add(a[j]);
}

System.out.println(el.size());

el.clear();
}


}
}