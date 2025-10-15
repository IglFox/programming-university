public class Complex {
    private double real;
    private double imaginary;
    private double modulus;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        calculateModulus();
    }

    private void calculateModulus() {
        this.modulus = Math.sqrt(real * real + imaginary * imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getModulus() {
        return modulus;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero complex number");
        }

        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    public void print() {
        if (imaginary >= 0) {
            System.out.printf("%.2f + %.2fi\n", real, imaginary);
        } else {
            System.out.printf("%.2f - %.2fi\n", real, Math.abs(imaginary));
        }
        System.out.printf("Модуль: %.2f\n", modulus);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return String.format("%.2f + %.2fi (modulus: %.2f)", real, imaginary, modulus);
        } else {
            return String.format("%.2f - %.2fi (modulus: %.2f)", real, Math.abs(imaginary), modulus);
        }
    }
}