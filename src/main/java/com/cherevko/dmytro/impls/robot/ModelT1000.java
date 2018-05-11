package com.cherevko.dmytro.impls.robot;

import com.cherevko.dmytro.interfaces.Hand;
import com.cherevko.dmytro.interfaces.Head;
import com.cherevko.dmytro.interfaces.Leg;
import com.cherevko.dmytro.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ModelT1000 implements Robot {

    @Autowired
    @Qualifier("sonyHand")
    private Hand hand;

    @Autowired
    @Qualifier("sonyLeg")
    private Leg leg;

    @Autowired
    @Qualifier("toshibaHead")
    private Head head;

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnable) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void action() {
        leg.go();
        hand.catchSomething();
        head.calc();
        System.out.println("color " + color);
        System.out.println("year " + year);
        System.out.println("can play sound " + soundEnable);
    }

    public void initObject() {
        System.out.println("init");
    }
    public void destroyObject() {
        System.out.println("destroy");
    }
}
