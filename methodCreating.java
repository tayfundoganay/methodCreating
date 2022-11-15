import java.util.Scanner;
public class methodCreating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir : ");
        int number = scanner.nextInt();

        pattern(number, number,0);
    }

    static void pattern(int number,int temp,int n){
        if(number > 0 && n == 0){
            System.out.print(number + " ");
            number -=5;
            pattern(number,temp,0);
        }
        else if (number <= 0) {
            System.out.print(number + " ");
            number +=5;
            pattern(number,temp,1);
        }
        else if(number > 0 && number <= temp && n == 1){
            System.out.print(number + " ");
            number  +=5;
            pattern(number,temp,1);
        }
    }
}
