class MaxSubarray{     //calculate the maximum element in the subarray size of 3
public static void main(String args[]){
int sum=0;
int a[]={1,2,3,1,4,5,2,3,6};
for(int i=0;i<a.length-2;i++){
sum=0;
for(int j=i;j<i+3;j++){
if(a[j]>sum){
sum=a[j];
}
}
System.out.print(sum+" ");
}
}

}