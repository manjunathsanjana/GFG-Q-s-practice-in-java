import java.util.*;

import java.lang.*;

import java.io.*;

class Vowels{

public static void main(String args[]){ 

String str="what are you doing";

StringBuilder s=new StringBuilder();

Set<Character> m=new HashSet<Character>();
m.add('a');
m.add('e');
m.add('i');
m.add('o');
m.add('u');

for(int i=0;i<str.length();i++){
if(m.contains(str.charAt(i))){
s.append(str.charAt(i));
}
}

System.out.println(s);
}
}