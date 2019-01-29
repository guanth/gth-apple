package com.gth.apple.gthapplejavabase.enum_my;

public enum MyEnum {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}


class Test {
    public static void main(String[] args) {

        for(MyEnum myEnum:MyEnum.values()){
            System.out.println(myEnum.toString());
        }
        System.out.println("----------------我是分隔线------------------");

        MyEnum sat = MyEnum.SAT ;
        switch (sat) {
            case MON:
                System.out.println("今天是星期一");
                break;
            case TUE:
                System.out.println("今天是星期二");
                break;
            // ... ...
            default:
                System.out.println(sat.toString());
                break;
        }
    }
}
