import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bclz.domain.People;

/**  
* Title: TestSchema.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年4月16日  
* @version 1.0  
*/

/**  
* Title: TestSchema
* Description: 
* @author xuchang 
* @date 2018年4月16日  
*/
public class TestSchema {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		People p=(People)context.getBean("person");
		System.out.println(p.getName());
		System.out.println(p.getId());
		System.out.println(p.getAge());
	}
	
	
}
