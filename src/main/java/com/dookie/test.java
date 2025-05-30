package com.dookie;

import com.birdbrain.Finch;

public class test {

    public static void main(String[] args) {

        Finch b = new Finch();
        bob x = new bob(b);

        for(int i = 0; i < 7; i++) {

        
        if(x.isBlocked()) {
            b.setTurn("R", 90.0, 70);
            if(x.isBlocked()) {
                b.setTurn("L", 180.0, 70);
                if(x.isBlocked()) {
                    b.setTurn("L", 90.0, 70);
                }
            }
        }
        x.moveSpec();
        // b.setTurn("R", 90.0, 70);
        // x.moveSpec();
        System.out.println("WATWA");
    }
        

        b.stop();
        b.disconnect();
    }
    
}