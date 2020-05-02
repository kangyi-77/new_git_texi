package com.jiker.keju;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculateFareTest {
    @Test
    public void getReceipt_and_kilometre_2_test(){
        int[] taxibo = new int[]{2,0};
        String result = new AppRunner().getReceipt(taxibo);
        assertEquals("收费6元\n",result);
    }
    @Test
    public void getReceipt_and_kilometre_6_test(){
        int[] taxibo = new int[]{6,0};
        String result = new AppRunner().getReceipt(taxibo);
        assertEquals("收费9元\n",result);
    }
    @Test
    public void getReceipt_and_kilometre_10_test(){
        int[] taxibo = new int[]{10,0};
        String result = new AppRunner().getReceipt(taxibo);
        assertEquals("收费13元\n",result);
    }
    @Test
    public void getReceipt_and_kilometre_10_and_minute_2_test(){
        int[] taxibo = new int[]{10,2};
        String result = new AppRunner().getReceipt(taxibo);
        assertEquals("收费14元\n",result);
    }
}
