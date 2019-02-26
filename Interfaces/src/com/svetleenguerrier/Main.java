package com.svetleenguerrier;

public class Main {

    public static void main(String[] args) {
	    ITelephone svetleensphone;
	    svetleensphone = new DeskPhone(2123456776);
	    svetleensphone.powerOn();
	    svetleensphone.callPhone(2123456776);
	    svetleensphone.answer();

	    svetleensphone = new MobilePhone(516345677);
	    svetleensphone.powerOn();
	    svetleensphone.callPhone(516345677);
	    svetleensphone.answer();

    }
}
