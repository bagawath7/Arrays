import java.util.Arrays;

public class ArraySort {
        public static void main(String[] args) {
            int a[]= {1,2,1,4,5,6,8,8};
            Arrays.sort(a);
            int n=a.length,b=n/2,i,j;
            if(n%2!=0) {
                for(i=b,j=1;i>0;i--,j++) {
                    System.out.print(a[i]+" "+a[b+j]);
                    System.out.print(" ");}
                if(i==0){
                    System.out.print(a[i]);}
            }
            else {
                for(i=b-1,j=0;i>=0;i--,j++) {
                    System.out.print(a[i]+" "+a[b+j]);
                    System.out.print(" ");}
            }
        }
    }

