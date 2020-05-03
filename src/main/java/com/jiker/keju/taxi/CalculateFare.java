package com.jiker.keju.taxi;


public class CalculateFare {
    
    public int calculate(int kilometre, int minute) {
        if (kilometre <= 2) {
            return (int) Math.round(0.25 * minute + 6);
        } else if (kilometre > 2 && kilometre <= 8) {
            return (int) Math.round(4.4 + 0.8 * bean.dstance + 0.25 * bean.waiteTime);
        } else {
            return (int) Math.round(1.2 + 1.2 * bean.dstance + 0.25 * bean.waiteTime);
        }
    }
}
