package co.in.pp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args)
	{
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookImpl bsi=(BookImpl)ac.getBean("BookBEAN");
		
		bsi.printBook("Shubham");
		
		bsi.printErrorBook();
		
	}
	
}
