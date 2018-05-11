package com.cherevko.dmytro.impls.robot;

import com.cherevko.dmytro.interfaces.Hand;
import com.cherevko.dmytro.interfaces.Head;
import com.cherevko.dmytro.interfaces.Leg;
import com.cherevko.dmytro.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ModelT5000 implements Robot {

    @Autowired
    @Qualifier("toshibaHand")
    private Hand hand;

    @Autowired
    @Qualifier("sonyLeg")
    private Leg leg;

    @Autowired
    @Qualifier("sonyHead")
    private Head head;

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT5000() {
    }

    public ModelT5000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public ModelT5000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    public void action() {
        leg.go();
        hand.catchSomething();
        head.calc();
    }

}
