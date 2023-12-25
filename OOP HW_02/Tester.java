import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numberals = kb.nextInt();
        int numerator = kb.nextInt();
        int denominator = kb.nextInt();

        Fraction fraction = new Fraction(numerator, denominator);
        MixedNumber mixedNumber = new MixedNumber();

        mixedNumber.setValue(numberals, fraction);

        // 1
        //mixedNumber.print();

        // 2
        //mixedNumber.makeNewFormat().print();

        // 3
        //mixedNumber.convertToFraction().print();

        // 4
        int numberals2 = kb.nextInt();
        int numerator2 = kb.nextInt();
        int denominator2 = kb.nextInt();

        Fraction fraction2 = new Fraction(numerator2, denominator2);
        MixedNumber mixedNumber2 = new MixedNumber();

        mixedNumber2.setValue(numberals2, fraction2);

        //mixedNumber.add(mixedNumber2).print();

        // 5
        mixedNumber.minus(mixedNumber2).print();
        
        // 6
        //mixedNumber.multiple(mixedNumber2).print();

        // 7
        //mixedNumber.divide(mixedNumber2).print();

        
    }
}
