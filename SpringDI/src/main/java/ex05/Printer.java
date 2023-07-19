package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	
	/*
	 *  @Autowired
	 *  - 멤버변수, 생성자, setter 모두 사용가능
	 *  - Bean중에서 주입될 수 있는 적합한 타입을 찾아서 자동 주
	 */
	
	@Autowired
	@Qualifier("document1")
	private Document document;
	
	// 기본생성자
	public Printer() {
		
	}
	
	// 생성자를 통한 주입이 가능
	
	public Printer(Document document) {
		this.document = document;
	}

	// getter setter를 통한 주입이 가능
	@Autowired
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}
	
	

}
