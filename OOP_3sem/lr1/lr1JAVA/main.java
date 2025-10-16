public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тестирование класса CustomString ===");

        CustomString str1 = new CustomString("Hello, World!");
        CustomString str2 = new CustomString();

        System.out.print("str1: ");
        str1.print();
        System.out.println("Длина str1: " + str1.Length());

        str2.Copy(str1);
        System.out.print("str2 после копирования: ");
        str2.print();

        System.out.println("Поиск 'o' с позиции 0: " + str1.Find('o', 0));
        System.out.println("Последнее вхождение 'l': " + str1.FindLast('l'));

        CustomString substr = str1.Substr(7, 5);
        System.out.print("Подстрока (7,5): ");
        substr.print();

        str1.Remove(5, 2);
        System.out.print("После удаления (5,2): ");
        str1.print();

        str1.Insert(" Java", 5);
        System.out.print("После вставки ' Java' в позицию 5: ");
        str1.print();

        System.out.println("\n=== Тестирование класса Complex ===");

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);

        System.out.print("c1: ");
        c1.print();

        System.out.print("c2: ");
        c2.print();

        Complex sum = c1.add(c2);
        System.out.print("c1 + c2: ");
        sum.print();

        Complex diff = c1.subtract(c2);
        System.out.print("c1 - c2: ");
        diff.print();

        Complex product = c1.multiply(c2);
        System.out.print("c1 * c2: ");
        product.print();

        Complex quotient = c1.divide(c2);
        System.out.print("c1 / c2: ");
        quotient.print();
    }
}