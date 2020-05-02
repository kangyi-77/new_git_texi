package com.jiker.keju;
import com.jiker.keju.taxi.CalculateFare;

import java.io.BufferedReader;
import java.io.File;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class AppRunner {

        public static void main(String[] args) throws Exception {
            String testDataFile =  args[0];;
            String receipt= new AppRunner().readFile(new File("src/main/resources/"+testDataFile));
            System.out.println(receipt);
        }

        public String readFile(File file) throws Exception {
            BufferedReader br = new BufferedReader(new java.io.FileReader(file));
            StringBuffer sb = new StringBuffer();
            String s;
            while ((s = br.readLine()) != null) {
                sb.append(getReceipt(getTimeAndDistance(s)));
            }
            br.close();
            return sb.toString();
        }

        public int[] getTimeAndDistance(String str) {
            String[] oneline = str.split(",");
            Pattern p = compile("[^\\d]");
            int[] result = new int[2];
            result[0] = Integer.parseInt(p.matcher(oneline[0]).replaceAll(""));
            result[1] = Integer.parseInt(p.matcher(oneline[1]).replaceAll(""));
            return result;
        }

        public String getReceipt(int[] strline) {
            int fare = new CalculateFare().calculate(strline[0], strline[1]);
            String result = "收费" + fare + "元\n";
            return result;
        }
    }
