import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz : ");
            x = input.nextInt();
            if(x % 2 == 0 && x % 4 == 0 ){
                total+=x;
            }
        }while (x>=0 && x % 2 ==0);
        System.out.println("Toplam : " + total);


    }
}