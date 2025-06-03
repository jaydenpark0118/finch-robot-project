package com.dookie;

import com.birdbrain.Finch;

public class test {

    public static void main(String[] args) {

        //new finch object
        Finch b = new Finch();

        //square
        for(int i = 0; i < 4; i++) {
            b.setMove("F", 20.0, 60);
            b.setTurn("R", 90.0, 60);
            b.setTail(i+1,0, 0, 100);
        }

        //lights up all
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                b.setPoint(i, j, 1);
                b.playNote(80, 0.1);
                b.pause(0.1);
            }
        }

        //turns off all
        for(int i = 5; i >= 1; i--) {
            for(int j = 5; j >= 1; j--) {
                b.setPoint(i, j, 0);
                b.playNote(50, 0.1);
                b.pause(0.1);
            }
        }

        //moves in a line and spins
        b.setMove("F", 20.0, 70);
        b.setTurn("R", 900.0, 70);
        b.setMove("F", 20.0, 70);

        //spins 5 times
        b.setTurn("R", 1800.0, 70);

        //turns off all tail lights
        for(int i = 1; i <= 4; i++) {
            b.setTail(i, 0, 0, 0);
            b.playNote(80, 0.1);
            b.pause(0.1);
        }

        //prints done
        b.print("DONE");


        b.stop();
        b.disconnect();
    }
    
}