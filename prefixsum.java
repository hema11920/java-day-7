import java.util.*;
public class prefixsum{
    public static void main(String array[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={11,2,3,4,3};
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        pre[i]=pre[i-1]+arr[i];
        System.out.println(Arrays.toString(pre));
    }
}
        