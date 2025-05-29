package com.dookie;

import com.birdbrain.Finch;

public class test {

    public static void main(String[] args) {
        System.out.println("Hello!");
        
        Finch b = new Finch();

        b.setMove("F", 10.0, 50);
        b.setTurn("L", 90, 50);
        b.setMove("F", 10.0, 50);

        b.setBeak(50, 50, 50);
        b.setTail("all", 50, 50, 50);

        b.pause(0.5);

        b.setTail("all", 0, 0, 0);
        b.setBeak(0, 0, 0);

        b.print("HELLO ");

        b.pause(2.0);

        b.setPoint(1, 1, 1);

        // for(int i = 1; i <= 5; i++) {
        //     for(int j = 1; j <= 5; j++) {
        //         b.setPoint(i, j, 1);
        //         b.playNote(60, 0.1);
        //         b.pause(0.1);
        //     }
        // }

        // for(int i = 5; i <= 1; i++) {
        //     for(int j = 5; j <= 1; j++) {
        //         b.setPoint(i, j, 0);
        //         b.playNote(60, 0.1);
        //         b.pause(0.1);
        //     }
        // }

        b.stop();
        b.disconnect();
    }
    
}