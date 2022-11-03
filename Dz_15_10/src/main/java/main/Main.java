package main;

import objmapper.GsonUsage;
import objmapper.ObjectMapperUsage;
import upcast_downcast.Child;
import upcast_downcast.Parent;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        // Примитивы
        /*
        Prim.numbers((byte) 5, (short) 32767, 10, -9223372036854775808L);
        Prim.two_val(true);
        Prim.dots(2.10f, 3.28);
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        Prim.word(chars);*/

        //Upcast-Downcast
        //inheritance();

        //Equals - HashCode
        //Equals.eq();

        //Overload
        /*
        System.out.println(Overload.calculate(1, 1));
        System.out.println(Overload.calculate(1.1f, 2.3f));
        System.out.println(Overload.calculate(4.4, 5.5));
        */

        //Interface
        /*
        FireBall fb = new FireBall();
        fb.castSpell();
        Heal hl = new Heal();
        hl.castSpell();
        */

        //ObjectMapper (extra GSON)
        GsonUsage gu = new GsonUsage("Test1", "Hello World");
        gu.writeJSON(gu, "./testGSON.json");
        System.out.println(gu.readJSON("./testGSON.json"));

        ObjectMapperUsage omu = new ObjectMapperUsage("Testing ObjectMapper", "ObjectMapper writing");
        omu.writeJSON(omu, "testObjM.json");
        System.out.println(omu.readJSON("testObjM.json"));
    }
    public static void inheritance(){
        // Upcasting
        Parent p = new Child();
        p.name = "Parent";

        System.out.println(p.name);
        p.method();

        // Downcasting
        Child c = (Child)p;

        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();

    }
}
