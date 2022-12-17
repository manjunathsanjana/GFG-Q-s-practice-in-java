class GFG {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int sum;
		
while(t>0){
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){

 arr[i]=sc.nextInt();

}
	
for(int i=0;i<=arr.length-1;i++){

sum=0;
		    
for(int j=i+1;j<=arr.length-1;j++){
if(arr[i]>=arr[j]){

sum=sum+1;
	
}
		    
}
		    
if(sum==n-(i+1)){
		  
      
System.out.print(arr[i]+" ");

		    }
		
}
		
System.out.println(" ");
		
t=t-1;
	  
}
	
}


}