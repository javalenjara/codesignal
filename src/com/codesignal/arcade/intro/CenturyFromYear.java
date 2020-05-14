package com.codesignal.arcade.intro;

/**
 * Created by javalenja on 13-May-20
 */

public class CenturyFromYear {

    public static void main(String[] args) {
        CenturyFromYear app = new CenturyFromYear();
        System.out.println(app.centuryFromYear(1050));
    }

    private int centuryFromYear(int year) {
        if(year % 100 == 0){
            return year/100;
        }
        else return (year/100) + 1;
    }
}
