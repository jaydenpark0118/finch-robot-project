package com.dookie;

import com.birdbrain.Finch;

public class test {

    public static void main(String[] args) {

        Finch b = new Finch();
        bob x = new bob(b);

        for(int i = 0; i < 4; i++) {
            b.setMove("F", 20.0, 60);
            b.setTurn("R", 90.0, 60);

        }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                b.setPoint(i, j, 1);
                b.playNote(80, 0.1);
                b.pause(0.1);
            }
        }

        for(int i = 5; i >= 1; i--) {
            for(int j = 5; j >= 1; j--) {
                b.setPoint(i, j, 0);
                b.playNote(50, 0.1);
                b.pause(0.1);
            }
        }

        b.print("DONE");


        b.stop();
        b.disconnect();
    }
    
}