package numbers;

public class Armstrong {

    public static void main(String[] args) {
        int number=15467;
        String num =""+number;
        int length=num.length();
        int result=0;
        int remainder=0;
        int originalNumber=number; //Math.pow(a,n)=a*a*....n times;

        while(originalNumber!=0){ //while the number is not 0, 15!=0, 1!=0
            remainder=originalNumber%10; // remainder 3==>15%10=>remainder=>5==1%10=>remainder =1
            result+=Math.pow(remainder,length); //armstrong number is 3, because 3 digits:3*3*3=27;5*5*5=125;1*1*1=1
            //27+125+1=153
            originalNumber=originalNumber/10;//153/10=>number=15;15/10=1;1/10=0

        }
        System.out.println(result);
        if(number==result){
            System.out.println("Armstrong number "+result);
        }else{
            System.out.println("Not armstrong number "+ result);
        }
        System.out.println("Hello from Yuliia");
    }

}
