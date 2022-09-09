public class TwoDimensionalArray {
    public static void main(String[] args) {
        String arr[][]={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i][1].equals("ronaldo")){
                for(int j=0;j< arr.length;j++){
                    if(arr[j][1].equals(arr[i][0])){
                        ++count;
                    }
                }
                break;
            }
        }
        System.out.println("Grandchildren ronaldo has = "+count);
    }
}
