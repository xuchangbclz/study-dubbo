/**  
* Title: NamespaceHandle.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年4月16日  
* @version 1.0  
*/  
package com.bclz.handle;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**  
* Title: NamespaceHandle
* Description: 
* @author xuchang 
* @date 2018年4月16日  
*/
public class NamespaceHandle  extends NamespaceHandlerSupport{

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.xml.NamespaceHandler#init()
	 */
	@Override
	public void init() {
		// TODO Auto-generated method stub
		registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
	}

}
