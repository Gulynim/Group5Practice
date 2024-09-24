package numbers;

public class Factorial {

    //create factorial method
//    public static int factorial(int n){
//        int result=1;
//        for (int i = 1; i <=n ; i++) {
//            result*=i;
//        }
//        return result;
//    }
    //5! = 5*4*3*2*1
    //4! = 4*3*2*1
    //3! = 3*2*1
    //2! = 2*1
    //1! = 1
    //create factorial recursive method
    public static int factorialRecursive(int n){
        if(n==0){
            return 1;
        }
        return n*factorialRecursive(n-1);
        //n=1==>1*0!==>1*1==>1 n(n-1)=1*0=0
        //n=2==> 2*factorialRecursive(1)=2*1=2
        //n=4==> 4*factorialRecursive(4-1)=4*3!=4*3*2*1=
    }

    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
        System.out.println(Fac(5));
    }

    public static int Fac(int n){
        if(n==0){
            return 1;
        }
        return n*Fac(n-1);
    }





}
