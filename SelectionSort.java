public class SelectionSort{
public static void selectionsort(int[] arr){
int n=arr.length;
for(int i=0;i<n-1;i++){
int minIndex=i;
for(int j=i+1;j<n;j++){
if (arr[j]<arr[minIndex]){
minIndex=j;
}
}
int temp=arr[minIndex];
arr[minIndex]=arr[i];
arr[i]=temp;
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
selectionsort(arr);
System.out.println("sorted array:");
printArray(arr);
}
}