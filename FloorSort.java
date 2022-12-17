class FloorSort{

public static void main(String args[]){
int a[]={1,2,8,10,11,12,19};
int k=11;
int sum=0;
int i;
for(i=0;i<a.length-1;i++){
if((a[i+1]>k)&&(a[i]<=k)){
System.out.println(i);
break;
}
}

if(i==a.length-1){
System.out.println("-1");
}

}

}

