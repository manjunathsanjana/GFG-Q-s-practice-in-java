class LastNFirst{

public static void main(String args[]){

int a[]={1,3,5,5,5,5,67,9,123,125};
int k=9;
int b[]=new int[2];
for(int i=0;i<a.length;i++){
if(a[i]==k){
b[0]=i;
b[1]=i;
break;
}
}
for(int j=a.length-1;j>=0;j--){
if(a[j]==k){
b[1]=j;
break;
}
}
System.out.print(b[0]+" "+b[1]);

}
}