public final class Fraction extends Number implements Comparable<Fraction>, Cloneable { // сущ-ть Дроби

    private final int numerator;
    private final int denominator;
    private final int originalNumerator;
    private final int originalDenominator;

    public Fraction(int num, int denom) {
        if (denom == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.originalNumerator = num;
        this.originalDenominator = denom;
        if (denom < 0) {      // если зн-ль отриц, переносим знак к числителю
            num = -num;
            denom = -denom;
        }
        int gcd = gcd(Math.abs(num), Math.abs(denom));  //упрощение дроби
        this.numerator = num / gcd;
        this.denominator = denom / gcd;
    }

    private int gcd(int a, int b) { // НОД
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // геттеры для полей
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        String originalFraction = originalNumerator + "/" + originalDenominator;
        if(denominator == 1) {
            return originalFraction + " = " + numerator;
        } else if (numerator == 0) { return originalFraction + " = 0";
        } else {
            return originalFraction + " = " + numerator + "/" + denominator;
        }
    }

    // 3.4.2 реализация методов класса Number
    @Override
    public int intValue() {
        return numerator / denominator; // преобразование к int
    }
    @Override
    public long longValue() {
        return (long) numerator / denominator; // пр-е к long
    }
    @Override
    public float floatValue() {
        return (float) numerator / denominator; // пр-е к float
    }
    @Override
    public double doubleValue() {
        return (double) numerator / denominator; // пр-е к double
    }

    // 3.6.1 переопределяем метод equals для сравнения дробей
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fraction other = (Fraction) obj;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }
    @Override   // пер-м hashCode для обеспечения согл-ти с equals
    public int hashCode() {
        return 31 * numerator + denominator;
    }
    @Override   //  для сравнения на большее или менышее
    public int compareTo(Fraction other) {
        int leftNumerator = this.numerator * other.denominator;
        int rightNumerator = other.numerator * this.denominator;
        return Integer.compare(leftNumerator, rightNumerator);
    }

    // 3.8.3 Клонирование дроби
    @Override
    public Fraction clone() {
        try {
            // Создаем новый объект путем клонирования
            Fraction cloned = (Fraction) super.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается", e);
        }
    }


    // алгоритм-е выр-я
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

}
