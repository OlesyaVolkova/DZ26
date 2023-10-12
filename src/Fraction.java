public class Fraction {
    private int integer; //целая часть
    private int numerator; //числитель
    private int denominator; // знаменатель

    public int getInteger() {
        return integer;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) denominator = 1; //фильтрация данных
        this.denominator = denominator;
    }
    public Fraction(int integer, int numerator, int denominator)  //конструктор с тремя параметрами
    {
        this.integer = integer;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print(){
        System.out.println(this.toString());
    }

    /*    private void normFraction(int integer, int numerator, int denominator) {
            if (numerator >= denominator) {
                integer += numerator / denominator;
                numerator = numerator % denominator;
            }
        }

        public Fraction add(Fraction other) {
            int Integer = this.integer + other.integer;
            int Numerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int Denominator = this.denominator * other.denominator;

            normFraction(Integer, Numerator, Denominator);

            return new Fraction(Integer, Numerator, Denominator);
        }

        public Fraction sub(Fraction other) {
            int Integer = this.integer - other.integer;
            int Numerator = this.numerator * other.denominator - other.numerator * this.denominator;
            int Denominator = this.denominator * other.denominator;

            normFraction(Integer, Numerator, Denominator);

            return new Fraction(Integer, Numerator, Denominator);
        }

        public Fraction mul(Fraction other) {
            int mulThis = this.integer * this.denominator + this.numerator;
            int mulOther = other.integer * other.denominator + other.numerator;
            int mulThisOther = mulThis * mulOther;

            int Denominator = this.denominator * other.denominator;
            int Integer = mulThisOther / Denominator;
            int Numerator = mulThisOther % Denominator;

            normFraction(Integer, Numerator, Denominator);

            return new Fraction(Integer, Numerator, Denominator);
        }

        public Fraction div(Fraction other) {
            int divThis = this.integer * this.denominator + this.numerator;
            int divOther = other.integer * other.denominator + other.numerator;

            int newNumerator = divThis * other.denominator;
            int Denominator = this.denominator * divOther;

            int Integer = newNumerator / Denominator;
            int Numerator = newNumerator % Denominator;

            normFraction(Integer, Numerator, Denominator);

            return new Fraction(Integer, Numerator, Denominator);
        }
*/
    public void increment() {
        this.integer++;
    }

    public void decrement() {
        this.integer--;
    }

    public int compareTo(Fraction other) {
        double thisValue = this.integer + (double) this.numerator / this.denominator;
        double otherValue = other.integer + (double) other.numerator / other.denominator;

        return Double.compare(thisValue, otherValue);
    }

    public String toString() {
        return integer + " (" + numerator + "/" + denominator + ")";
    }
}