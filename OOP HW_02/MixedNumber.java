public class MixedNumber extends Fraction{
    private int numberals;
    private Fraction fraction;

    // Constructor
    public MixedNumber(){
        numberals = 0;
    }

    // SET
    public void setValue(int n, Fraction f){
        this.numberals = n;
        this.fraction = f;
    }

    // Other
    public void print(){
        if(fraction.getNumerator() == fraction.getDenominator()){
            fraction.setValue(0, 0);
        }
        System.out.println(numberals + " " + fraction.getNumerator() + "/" + fraction.getDenominator());
    }
    public MixedNumber makeNewFormat(){
        MixedNumber newMixedNumber = new MixedNumber();
        //fraction.makeNewFormat();
        while (true) {
            if(fraction.getNumerator() > fraction.getDenominator()){
                int newNumerator = fraction.getNumerator() - fraction.getDenominator();
                int newDenominator = fraction.getDenominator();
                fraction.setValue(newNumerator, newDenominator);
                this.numberals++;
            }else {
                newMixedNumber.setValue(numberals, fraction);
                return newMixedNumber;
            }
        }
    }
    public Fraction convertToFraction(){
        Fraction newFraction = new Fraction();
        fraction.makeNewFormat();
        int newNumerator = (numberals * fraction.getDenominator()) + fraction.getNumerator(); 
        newFraction.setValue(newNumerator, fraction.getDenominator());
        return newFraction;
    }
    
    public MixedNumber add(MixedNumber m){
        MixedNumber newMixedNumber = new MixedNumber();
        int resultNumberals = this.numberals + m.numberals;
        Fraction resultFraction = m.fraction;
        resultFraction = resultFraction.add(fraction);
        newMixedNumber.setValue(resultNumberals, resultFraction);
        newMixedNumber.makeNewFormat();
        if(resultFraction.getNumerator() == resultFraction.getDenominator()){
            resultFraction.setValue(0, 0);
            newMixedNumber.numberals++;
        }
        return newMixedNumber;
    }
    public MixedNumber add(Fraction f){
        MixedNumber newMixedNumber = new MixedNumber();
        if(numberals != 0){
            int newNumerator1 = (numberals * fraction.getDenominator()) + fraction.getNumerator();
            fraction.setValue(newNumerator1, fraction.getDenominator());
            setValue(0, fraction);
        }
        
        Fraction resultFraction = fraction.add(f);
        newMixedNumber.setValue(0, resultFraction);
        newMixedNumber.makeNewFormat();
        if(newMixedNumber.fraction.getNumerator() == newMixedNumber.fraction.getDenominator()){
            newMixedNumber.fraction.setValue(0, 0);
            newMixedNumber.numberals++;
        }
        return newMixedNumber;
    }
    public MixedNumber minus(MixedNumber m) {
        MixedNumber newMixedNumber = new MixedNumber();
        int resultNumberals = this.numberals - m.numberals;
        Fraction resultFraction = fraction.minus(m.fraction);
        newMixedNumber.setValue(resultNumberals, resultFraction);
        //newMixedNumber.makeNewFormat();
        if (resultFraction.getNumerator() == resultFraction.getDenominator()) {
            resultFraction.setValue(0, 0);
        }
        if (resultFraction.getNumerator() == 0) {
            resultFraction.setValue(0, 0);
        }
        return newMixedNumber;
    }
    public MixedNumber multiple(MixedNumber m){
        MixedNumber newMixedNumber = new MixedNumber();
        if(numberals != 0){
            int newNumerator1 = (numberals * fraction.getDenominator()) + fraction.getNumerator();
            fraction.setValue(newNumerator1, fraction.getDenominator());
            setValue(0, fraction);
        }
        if(m.numberals != 0){
            int newNumerator2 = (m.numberals * m.fraction.getDenominator()) + m.fraction.getNumerator();
            m.fraction.setValue(newNumerator2, m.fraction.getDenominator());
            m.setValue(0, m.fraction);
        }  
        
        newMixedNumber.setValue(0, fraction.multiply(m.fraction));
        newMixedNumber.makeNewFormat();
        if(newMixedNumber.fraction.getNumerator() == newMixedNumber.fraction.getDenominator()){
            newMixedNumber.fraction.setValue(0, 0);
            newMixedNumber.numberals++;
        }
        return newMixedNumber;
    }
    public MixedNumber divide(MixedNumber m){
        MixedNumber newMixedNumber = new MixedNumber();
        if(numberals != 0){
            int newNumerator1 = (numberals * fraction.getDenominator()) + fraction.getNumerator();
            fraction.setValue(newNumerator1, fraction.getDenominator());
            setValue(0, fraction);
        }
        if(m.numberals != 0){
            int newNumerator2 = (m.numberals * m.fraction.getDenominator()) + m.fraction.getNumerator();
            m.fraction.setValue(newNumerator2, m.fraction.getDenominator());
            m.setValue(0, m.fraction);
        }  
        
        newMixedNumber.setValue(0, fraction.divide(m.fraction));
        newMixedNumber.makeNewFormat();
        if(newMixedNumber.fraction.getNumerator() == newMixedNumber.fraction.getDenominator()){
            newMixedNumber.fraction.setValue(0, 0);
            newMixedNumber.numberals++;
        }
        return newMixedNumber;
    }
}
