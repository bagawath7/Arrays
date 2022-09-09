import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        int length= string.length();
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i==j || i+j == length-1){
                    System.out.print(string.charAt(j));
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
