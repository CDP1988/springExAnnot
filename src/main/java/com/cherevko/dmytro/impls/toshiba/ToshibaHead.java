package com.cherevko.dmytro.impls.toshiba;


import com.cherevko.dmytro.interfaces.Head;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHead implements Head {
	
	public void calc(){
		System.out.println("Thinking about Toshiba...");
	}

}
