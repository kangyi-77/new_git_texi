package com.jiker.keju.taxi;


public class CalculateFare {

    public int calculate(int kilometre, int minute) {
        if (kilometre <= 2) {
            return (int) Math.round(0.25 * minute + 6);
        } else if (kilometre > 2 && kilometre <= 8) {
            return (int) Math.round((kilometre - 2) * 0.8 + 0.25 * minute + 6);
        } else {
            return (int) Math.round((kilometre - 2) * 0.8 + (kilometre - 8) * 0.5 + 0.25 * minute + 6);
        }
    }
}
