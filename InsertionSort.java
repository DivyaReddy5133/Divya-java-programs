public class InsertionSort{
    public static void main(String[] args)
    {
        int[] a={1,4,5,6,10,2};
        int=a.length;
        for(int i=0;i<n;i++){
            int temp=a[i];
            j=i-1;
            while(j>=0&&a[j]>temp){
                a[j+1]=a[j];
                j--;
                
            }
            a[j+1]=temp;
            for(int i=0;i<n;i++){
                System.out.println(a[i]+" ");
            }
                    }
        
    }
}