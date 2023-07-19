package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

@Configuration
public class JavaConfig {
	
	
	
	// <bean id="test" class="ex01.SpringTest"/> 랑 똑같
	@Bean
	public SpringTest test() {
		
		return new SpringTest();
	}
	
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	@Bean
	public Hotel hotel() {
		return new Hotel(chef());
	}
	
	@Bean
	public DatabaseDev dev() {
		
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("url");
		dev.setUid("uid");
		dev.setUpw("upw");
		return dev;
	}
	
	@Bean
	public MemberDAO memberDAO() {
		
		MemberDAO dao = new MemberDAO();
		
		dao.setDataSource(dev());
		
		return dao;
		
	}

}
