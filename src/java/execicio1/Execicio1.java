package execicio1;

import java.util.Locale;

public class Execicio1 {
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "Office deck";

        int age = 30;
        int code = 5290;
        char gener = 'F';

        double price1 =2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.printf("%s , while price is $%f%n" ,product1,price1);
        System.out.printf("%s , while price is $%f%n",product2,price2);

        System.out.printf("record; %d years old , code %d and gender: %s%n",age,code,gener);
        System.out.printf("measure with eigth decimal places :'%f %n'",measure);
        System.out.printf("rouded ( there decimal places):'%.2f%n'",measure);
        Locale.setDefault(Locale.US);

        System.out.printf("US decimal point: %.2f",measure);


    }
}
