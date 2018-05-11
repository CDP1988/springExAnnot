package com.cherevko.dmytro.impls.toshiba;


import com.cherevko.dmytro.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component
public class ToshibaLeg implements Leg {
	
	public void go(){
		System.out.println("Go to Toshiba!");
	}

}
