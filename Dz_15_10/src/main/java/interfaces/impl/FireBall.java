package interfaces.impl;

import interfaces.Spell;

public class FireBall implements Spell {

    public void castSpell() {
        System.out.println("Fire in your Face ->!");
        System.out.println(dealDmg());
    }

    public int dealDmg() {
        int min = 0;
        int max = 20;
        return (min + (int)(Math.random() * ((max - min) + 1)));
    }

}
