package numbers;

public class Fibonacci {

    public static void main(String[] args) {


        System.out.println(fibonacci(8));
    }

    //create a method fibonacci
    public static int fibonacci( int n){
        if(n==0){
            return 0;
        }else if( n==1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    //explain the code return fibonacci(n - 1) + fibonacci(n - 2);

    //return (n-1)+(n-2);
    //n=3==> (3-1)+(3-2)=2+1=3==>2


        //Fibonacci is a series of numbers in which
        // each number is the sum of the two preceding numbers Fn= Fn-1 + Fn-2
        // fibonacci= 0, 1, 1,     2, 3, 5, 8, 13, 21
       // n=          0, 1, 2,     3, 4, 5, 6,  7,  8

        /* That's how we solve it with Murodil's approach
        int first = 0;
        int second = 1;
        int next = first + second;
        System.out.print(first + ", " + second);
        System.out.print(", " + next);
        for (int i = 2; i <= 10; i++) {
            first = second;
            second = next;
            next = first + second;
            System.out.print(", " + next);
        }
         */

/*
       int a =0;
       int b =1;

       for( int i = 2; i <= n; i++){
           int next = a+b; //1
           a=b;
           b=next;

       }
       return b;
 */
    }
