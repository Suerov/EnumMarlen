import java.util.Scanner;

;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Select one currency:");
        for (Currency  currency : Currency.values()) {
            System.out.println(currency.ordinal()+1+" "+currency.name());


        }

        Scanner scanner =new Scanner(System.in);
        int curren= scanner.nextInt();
        switch (curren){
            case 1:
                System.out.println(Currency.USD);
                break;
            case 2:
                System.out.println(Currency.EUR);
                break;
            case 3:
                System.out.println(Currency.RUB);
                break;
            case 4:
                System.out.println(Currency.JPY);
            default:
                System.out.println(" No such currency ");
        }
    }
}
