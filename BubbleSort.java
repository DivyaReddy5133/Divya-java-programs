public class BubbleSort{
static void bubblesort(int[] arr){
int n=arr.length;
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
}
static void  printArray(int[] arr){
for(int value:arr){
System.out.println(value+" ");
}
}
public static void main(String args[]){
int[] arr={50,20,30,10,90,30};
System.out.println("original array:");
printArray(arr);
bubblesort(arr);
System.out.println("sorted array:");
printArray(arr);
}
}

