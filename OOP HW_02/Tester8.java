import java.util.Scanner;

public class Tester8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numberals = kb.nextInt();
        int numerator = kb.nextInt();
        int denominator = kb.nextInt();

        Fraction fraction = new Fraction(numerator, denominator);
        MixedNumber mixedNumber = new MixedNumber();

        mixedNumber.setValue(numberals, fraction);

        int numerator2 = kb.nextInt();
        int denominator2 = kb.nextInt();
        
        Fraction fraction2 = new Fraction(numerator2, denominator2);
        
        // 8
        mixedNumber.add(fraction2).print();
    }
}
