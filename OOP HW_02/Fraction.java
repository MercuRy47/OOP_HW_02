public class Fraction {
    private int numerator;
    private int denominator;

    // Constructor
    public Fraction(){
        numerator = 0;
        denominator = 0;
    }
    public Fraction(int n, int d){
        this.numerator = n;
        this.denominator = d;
    }

    // SET
    public void setValue(int n, int d){
        this.numerator = n;
        this.denominator = d;
    }

    // GET
    public int getDenominator(){
        return denominator;
    }
    public int getNumerator(){
        return numerator;
    }

    // Other
    public void print(){
        if(numerator > 0 && denominator < 0){
            System.out.println(-numerator + "/" + Math.abs(denominator));
        }else {
            System.out.println(numerator + "/" + denominator);
        }
    }
    public void checkprint(){
        System.out.println(numerator + "/" + denominator);
    }
    private int gcd(int n, int d){
        if(d == 0){
            return n;
        }else {
            return gcd(d, n % d);
        }
    }
    public Fraction makeNewFormat() {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
        Fraction newfraction = new Fraction(numerator, denominator);
        
        return newfraction;
    }
    
    // Calculate
    public Fraction add(Fraction f2){
        int newNumerator;
        int newDenominator;

        if(denominator == f2.denominator){
            newNumerator = numerator + f2.numerator;
            newDenominator = denominator;
        }else {
            newNumerator = (numerator * f2.denominator) + (f2.numerator * denominator);
            newDenominator = denominator * f2.denominator;
        }
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        return newFraction;
    }
    public Fraction minus(Fraction f2) {
        int newNumerator;
        int newDenominator;
    
        if (denominator == f2.denominator) {
            newNumerator = numerator - f2.numerator;
            newDenominator = denominator;
        } else {
            newNumerator = (numerator * f2.denominator) - (f2.numerator * denominator);
            newDenominator = denominator * f2.denominator;
        }
    
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        return newFraction;
    }
    
    public Fraction multiply(Fraction f2){
        int newNumerator = this.numerator * f2.numerator;
        int newDenominator = this.denominator * f2.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
    
        return newFraction;
    }
    public Fraction divide(Fraction f2){     
        int newNumerator = this.numerator * f2.denominator;
        int newDenominator = this.denominator * f2.numerator;
        Fraction newfraction = new Fraction(newNumerator, newDenominator);
        
        return newfraction;
    }

    // Only 10
    public boolean isEqual(Fraction f2){
        boolean checkNumerator = numerator == f2.numerator;
        boolean checkDenominator = denominator == f2.denominator;
        if(checkNumerator == true && checkDenominator == true){
            return true;
        }
        return false;
    }
}
