package prim;

public class Prim {
    public static void numbers(byte b, short s, int i, long l){
        String[] types = new String[]{"Hi", "Hello", "Good Day","Nice Day", "Wasaa", "Tee?", "Coffee", "Wrong, Water"};
        System.out.println("Chosen by your byte" + types[b]);
        System.out.println();

        System.out.println(s++ + " Пример того как невозможно выйти за пределы");
        System.out.println();

        System.out.println(i + 10 + " Сложение чисел");
        System.out.println();

        System.out.println(l + 9223372036854775807L + " Работа с пределами long");
        System.out.println();
    };

    public static void dots(float f, double d){
        System.out.println(f + d);
        System.out.println("Compare floating point");
        System.out.println();
    };

    public static void two_val(boolean b){
        System.out.println("Ваш логический тип данных равен:" + b);
        System.out.println();
    }

    public static void word(char[] c){
        System.out.println("Выводим слово");
        for (char value : c) {
            System.out.print(value);
        }
    }


}
