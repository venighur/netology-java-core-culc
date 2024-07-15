public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        /*
            при данных значениях b, которое используется в качестве делителя в calc.devide, равно 0
            в результате возникает ошибка деления на 0

            можно
             либо в самом методе divide выполнять проверку значения делителя,
             либо ловить исколючение с выводом сообщения об ошибке
         */
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА: деление на 0");
        }
    }
}