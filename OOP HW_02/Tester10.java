import java.util.Scanner;

public class Tester10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Fraction fraction = new Fraction();
        MixedNumber mixedNumber = new MixedNumber();
        Fraction fraction2 = new Fraction();
        MixedNumber mixedNumber2 = new MixedNumber();

        Fraction resultFraction = new Fraction();
        
        int count = kb.nextInt();
        char type = kb.next().charAt(0);

        if(type == 'M'){
            int numberals = kb.nextInt();
            int numerator = kb.nextInt();
            int denominator = kb.nextInt();

            fraction.setValue((numberals * denominator) + numerator, denominator);
            
        }
        if(type == 'F'){
            int numerator = kb.nextInt();
            int denominator = kb.nextInt();

            fraction.setValue(numerator, denominator);

        }

        for(int i = 0; i < count-1; i++){
            type = kb.next().charAt(0);

            if(type == 'M'){
                int numberals2 = kb.nextInt();
                int numerator2 = kb.nextInt();
                int denominator2 = kb.nextInt();

                if(numerator2 == 0 && denominator2 == 0){
                    numerator2 = 1;
                    denominator2 = 1;
                }

                fraction2.setValue((numberals2 * denominator2) + numerator2, denominator2);

                fraction = fraction.add(fraction2);
            }
            if(type == 'F'){
                int numerator2 = kb.nextInt();
                int denominator2 = kb.nextInt();

                fraction2.setValue(numerator2, denominator2);

                fraction = fraction.add(fraction2);
            }
        }
        mixedNumber.setValue(0, fraction.makeNewFormat());

        type = kb.next().charAt(0);
        if(type == 'F'){
            mixedNumber.convertToFraction().print();
        }else {
            mixedNumber.makeNewFormat().print();
        }


    }
}