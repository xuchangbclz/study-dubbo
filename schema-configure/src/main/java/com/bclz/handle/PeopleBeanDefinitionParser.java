/**  
* Title: PeopleBeanDefinitionParser.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年4月16日  
* @version 1.0  
*/  
package com.bclz.handle;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.bclz.domain.People;

/**  
* Title: PeopleBeanDefinitionParser
* Description: 
* @author xuchang 
* @date 2018年4月16日  
*/
public class PeopleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser#doParse(org.w3c.dom.Element, org.springframework.beans.factory.support.BeanDefinitionBuilder)
	 */
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// TODO Auto-generated method stub
		String name=element.getAttribute("name");
		String age=element.getAttribute("age");
		String id = element.getAttribute("id");
		if (StringUtils.hasText(id)) {  
			builder.addPropertyValue("id", id);  
        }  
        if (StringUtils.hasText(name)) {  
        	builder.addPropertyValue("name", name);  
        }  
        if (StringUtils.hasText(age)) {  
        	builder.addPropertyValue("age", Integer.valueOf(age));  
        } 
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser#getBeanClass(org.w3c.dom.Element)
	 */
	@Override
	protected Class<?> getBeanClass(Element element) {
		// TODO Auto-generated method stub
		return People.class;
	}
		
	
	
}
