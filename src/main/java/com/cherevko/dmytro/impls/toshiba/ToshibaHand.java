package com.cherevko.dmytro.impls.toshiba;


import com.cherevko.dmytro.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
