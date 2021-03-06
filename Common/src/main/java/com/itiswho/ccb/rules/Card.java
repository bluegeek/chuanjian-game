package com.itiswho.ccb.rules;

/**
 * @author ccb
 */
public class Card implements Comparable<Card> {
    int val;
    int color;
    private int weight;
    static final int black = 1;
    static final int red = 2;
    static final int flower = 3;
    static final int slice = 4;

    public Card(int val, int color) {
        this.val = val;
        this.color = color;
    }

    public int getVal() {
        return val;
    }

    public int getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.val, o.val);
    }

    @Override
    public String toString() {
        return  val+"*"+color;
    }

    public boolean equals(Card obj) {
        return Boolean.getBoolean(Integer.toString(Integer.compare(this.val,obj.val)));
    }
}
