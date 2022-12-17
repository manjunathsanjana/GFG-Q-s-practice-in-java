import java.util.*;

import java.lang.*;

class ArrayMissin{

public static void main(String args[]){

int a[]={1,2,3,4,5,6,7,8,10};

int total_num;
   total_num = 10;
   int expected_num_sum = total_num * ((total_num + 1) / 2);
   int num_sum = 0;
   for (int i: a) {
    num_sum += i;
   }
       System.out.print( expected_num_sum - num_sum);
	   System.out.print("\n");


}

}