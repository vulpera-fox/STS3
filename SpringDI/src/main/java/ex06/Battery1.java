package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Battery1 implements IBattery {

	@Override
	public void energy() {
		System.out.println("에너자이저");
	}

}
