package interfaces.impl;

import interfaces.Spell;

public class Heal implements Spell {

    public void castSpell() {
        System.out.println("I will save U! ->");
        System.out.println(dealDmg());
    }

    public int dealDmg() {
        int min = 0;
        int max = -20;
        return (min + (int)(Math.random() * ((max - min) + 1)));
    }
}
