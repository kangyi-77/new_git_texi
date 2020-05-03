package com.jiker.keju.taxi;


public class CalculateFare {

    public int calculate(int kilometre, int minute) {
        float fare;
        if (kilometre <= 2) {
            fare = Math.round(0.25 * minute + 6);
        } else if (kilometre > 2 && kilometre <= 8) {
            fare = Math.round((kilometre - 2) * 0.8 + 0.25 * minute + 6);
        } else {
            fare = Math.round(1.2 + 1.2 * kilometre + 0.25 * kilometre);
        }
        return (int) fare;
    }


}
