import java.util.Scanner;

public class TopperProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int last_digit;
        int even_count = 0;
        int odd_count = 0;
        while(number!=0){
            last_digit = number % 10;
            if(last_digit % 2 ==0){
                even_count +=last_digit;
            }
            else{
                odd_count += last_digit;
            }
            number /=10;
        }
        if(even_count == odd_count){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
