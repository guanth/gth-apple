package com.gth.apple.gthapplejavabase.process.choose.switch_my;

import com.gth.apple.gthapplejavabase.enum_my.MyEnum;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * @author nginx_guan
 * @version $Id: MySwitch, v 0.1 2019/1/29 20:31 nginx_guan Exp$
 */
public class MySwitch {
    public static void main(String[] args) {
        switchTest1();

    }

    private static void switchTest1() {
        //支持类型 byte、short、int、char、enum
        char grade = 'C';

        switch (grade) {
            case ('A'):
                System.out.println("优秀");
                break;

            case ('B'):
            case ('C'):
                System.out.println("优良");
                break;

            case ('D'):
                System.out.println("及格");
                break;

            case ('F'):

            default:
                System.out.println("无效的输入");

        }
    }
}
