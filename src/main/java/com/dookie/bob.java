package com.dookie;

import com.birdbrain.Finch;

public class bob {

    private Finch finch;
    private boolean blocked;

    public bob(Finch finch) {
        this.finch = finch;
        blocked = false;
    }

    public void moveSpec() {
        int dis = finch.getDistance();

        double m = dis - 8.0;

        System.out.println(dis);
        System.out.println(m);

        finch.setMove("F", m, 60);
    }

    public boolean isBlocked() {
        if(finch.getDistance() < 7) {
            blocked = true;
        }

        return blocked;
    }
}
