package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Battery2 implements IBattery{

	@Override
	public void energy() {
		System.out.println("노랑색건전지");
	}
	
}
