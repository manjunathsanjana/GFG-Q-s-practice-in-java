class Equi{

public static void main(String args[]){
int a[]={1,3,5,2,2};
int sum=0,sum1=0;
int m=a.length;
if(a.length >2){
for(int i=1;i<m;i++){
for(int j=i-1;i>=0;j--){
sum=sum+a[j];
}
for(int k=i+1;k<m;k++){
sum1=sum1+a[k];
}
if(sum==sum1){
System.out.println(i);
break;
}

}
}


}
}