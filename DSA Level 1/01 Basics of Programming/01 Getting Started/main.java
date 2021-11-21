import java.util.Scanner;
public class main
{   
    public static Scanner sc = new Scanner(System.in);

    public static void gradingSystem(int marks){
        if(marks > 90){
            System.out.println("excellent");
        } 
        else if(marks > 80 && marks <= 90){          
            System.out.println("good");
        }
        else if(marks > 70 && marks <= 80){          
            System.out.println("fair");
        }
        else if(marks > 60 && marks <= 70){          
            System.out.println("meets expectations");
        }
        else{
            System.out.println("below par");
        }        
    }

    public static boolean isPrime(int num){
        boolean prime = true;
        for(int i=2; i*i <= num; i++){
            if(num % i == 0){
                prime = false;
            }
        }
        return prime;
    }

    public static void printAllPrimes(int lo, int hi){
        for(int i=lo; i<=hi; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void printFibonacci(int n){
        int first = 0;
        int second = 1;
        int temp = 0;

        for(int i=0; i<n; i++){
            if(i == 0){
                System.out.println(first);
            }
            else if(i == 1){
                System.out.println(second);
            }
            else{
                temp = first;
                first = second;
                second = first+temp;
                System.out.println(second);
            }
        }
    }

    public static int countADigit(int num){
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }

    public static void digitsOfNumber(int num){
        int power = countADigit(num);
        while(power-- > 0){
            int remainder = num % (int)(Math.pow(10,power));
            num = num / (int)(Math.pow(10,power));
            System.out.println(num);
            num = remainder;            
        }
    }

    public static void reverseANumber(int num){
        // int reverse = 0;
        while(num > 0){
            int remainder = num % 10;
            System.out.println(remainder);
            // reverse = reverse * 10 + remainder;
            num = num/10;
        }
    }

	public static void main(String[] args) {    
        
        // Ques - 9
        
        // Ques - 10
        
        // Ques - 11
        
        // Ques - 12
        
        // Ques - 13
        
        // Ques - 14
        
        // Ques - 15
        
        // Ques - 16
             
        
        // Ques - 8
        // reverseANumber(65784383);

        // Ques - 7
        // digitsOfNumber(65784383);

        // Ques - 6
        // System.out.println(countADigit(65784383));

        // Ques - 5
        // printFibonacci(10);

        // Ques - 4
        // printAllPrimes(6,24);

        // Ques - 3
        // System.out.println(isPrime(9));    

        // Ques - 2
        // gradingSystem(30);    

        // Ques - 1
        // Done
	}
}

  
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
