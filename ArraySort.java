import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int a[]= {1,2,1,4,5,6,8,8};
        int n = a.length,i,j,c;
        Arrays.sort(a);
        int h=n/2;
        c= n%2==0 ? h-1:h;
        for(i=c,j=c+1;i>=0;i--,j++){
            if(i==0 && n%2!=0){
                System.out.print(a[i]);
            }
            else{
                System.out.print(a[i]+" ");
                System.out.print(a[j]+" ");
            }
        }
    }
}
