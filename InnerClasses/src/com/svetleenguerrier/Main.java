package com.svetleenguerrier;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
        testGearBoxPrivate();
        testButton1();
        testButton2();
    }
    public static void testGearBoxPrivate(){
        GearBox mcBox = new GearBox(6);
        //If Gear was a public inner class
//        GearBox.Gear first = mcBox.new Gear(1,12.3);
//        //Cannot create new objects doing this.
////        GearBox.Gear firstWrong = new GearBox.Gear(2,4.5);
////        GearBox.Gear secondWrong = new McBox.Gear(3.4.5);
//        System.out.println(first.driveSpeed(1000));

        mcBox.addGear(1,5.3);
        mcBox.addGear(2, 10.6);
        mcBox.addGear(3,15.9);
        mcBox.operateClutch(true);
        mcBox.operateClutch(true);
        mcBox.changeGear(1);
        mcBox.operateClutch(false);
        System.out.println(mcBox.wheelSpeed(1000));
        mcBox.changeGear(2);
        System.out.println(mcBox.wheelSpeed(3000));
        mcBox.operateClutch(true);
        mcBox.changeGear(3);
        mcBox.operateClutch(false);
        System.out.println(mcBox.wheelSpeed(6000));
    }
    public static void testButton1(){
        class ClickListner implements Button.OnClickListner{
            public ClickListner() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title +" was clicked");
            }
        }
        btnPrint.setOnClickListner(new ClickListner());
        listen();
    }

    public static void testButton2(){
        btnPrint.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }

}
