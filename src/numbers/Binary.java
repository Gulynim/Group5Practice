package numbers;

public class Binary {
    public static void main(String[] args) {
        System.out.println(binary(9)); // Output: 1010
    }

    public static String binary(int n){
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n=n/2;
        }
        return binary;
    }
}
