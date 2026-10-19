import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        prime(10);
        prime(7);
        factorial(5);
        sum(5);
//Task 41
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a=scanner.nextInt();

        if (a%2==0){
            System.out.println("Cut");
        }
        else{
            System.out.println("Tek");
        }

//Task 48
        int [] numbers={1,2,3,4,5};
        int sum=0;
        double avg=0;
        for (int num:numbers){
            sum+=num;
        }
        System.out.println( (double) sum/ numbers.length);
        System.out.println(sum);


        //Task 46
        String word = "java";
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i) + " ");
        }

        //Task 47
        String words = "radar";
        String reverse = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            reverse += words.charAt(i);
        }
        if (words.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        //Task49
        for (int i = 1; i <=50 ; i++) {

            if (i%3==0 && i%5==0){
                System.out.println("I-nin deyeri:"+i+" "+"FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("I-nin deyeri:"+i+" "+"Fizz");
            } else if (i%5==0) {
                System.out.println("I-nin deyeri:"+i+" "+"Buzz");
            }
        }


        //Task50
 /*       int[] numbers={3,4,2,5,6,8,7};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
*/

        //Task 43
        int [] array={1,2,3,6,4,5};

        Arrays.sort(array);

        System.out.println("En boyuk :"+array[( array.length-1)]);
        System.out.println("En kicik:"+(array[0]));




        //Task44

    }

    public static boolean prime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Sade deyil");
                return false;
            }
        }
        System.out.println("Sadedir");
        return true;
    }

    //Task45
    public static void factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
    //Task42

    public static void sum(int a) {
        int sum = 1;
        for (int i = 1; i < a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
