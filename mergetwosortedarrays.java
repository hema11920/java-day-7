import java.util.*;
public class mergetwosortedarrays{
    public static void main(String array[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]={3,4,5,6};
        int arr2[]={4,7,8};
        int k=0;
        int temp[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            temp[k]=arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            temp[k]=arr2[i];
            k++;
        }
        System.out.println(Arrays.toString(temp));
    }
}
        