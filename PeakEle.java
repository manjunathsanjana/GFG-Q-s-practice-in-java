class PeakEle{

public static void main(String args[]){

int arr[]={1,2,3};
int m=arr.length;
int b=0;
for(int i=0;i<m;i++){
if(i==0){
if(arr[i]>arr[i+1]){
b=i;
}
}

else if(i==m-1){
if(arr[i]>arr[i-1]){
b=i;
}
}

else{
if((arr[i]>arr[i-1])&& (arr[i]>arr[i+1])){
b=i;
}

}

}
System.out.println(b);
} 

}