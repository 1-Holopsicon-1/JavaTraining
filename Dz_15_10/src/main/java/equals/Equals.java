package equals;

public class Equals {
    public static void eq() {
        String s1 = "Str1";
        String s2 = new String("Str1");
        System.out.print("Cравнение через ==: ");
        System.out.println(s1 == s2);
        System.out.print("Сравнение через equals: ");
        System.out.println(s1.equals(s2));
        System.out.print("Сравнение через hashCode: ");
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}

