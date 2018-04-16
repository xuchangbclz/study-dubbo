
#### 在很多情况下，我们需要为系统提供可配置化支持，简单的做法可以直接基于Spring的标准Bean来配置，但配置较为复杂或者需要更多丰富控制的时候，会显得非常笨拙。一般的做法会用原生态的方式去解析定义好的xml文件，然后转化为配置对象，这种方式当然可以解决所有问题，但实现起来比较繁琐，特别是是在配置非常复杂的时候，解析工作是一个不得不考虑的负担。Spring提供了可扩展Schema的支持，这是一个不错的折中方案，完成一个自定义配置一般需要以下步骤：
	1. 设计配置属性和JavaBean;
	2. 编写XSD文件 ;
	3. 编写BeanDefinitionParser和 NamespaceHandler完成解析工作;
	4. 编写spring.handlers和spring.schemas串联起所有部件;
	5. 在Bean文件中应用.

### 设计配置属性和JavaBean
	需要配置People实体见People.java， id 是默认需要的
### 编写XSD文件
	为People编写XSD文件，XSD是schema的定义文件见src/main/resources/people.xsd
	完成后需要放入classpath下 ，id 是默认需要的，不用配置。
### 编写NamespaceHandler和BeanDefinitionParser完成解析工作
	Spring提供了默认实现类NamespaceHandlerSupport和 	AbstractSingleBeanDefinitionParser ， 简单的方式就是去继承这两个类
	见:com.bclz.handle.PeopleBeanDefinitionParser
	   com.bclz.handle.NamespaceHandle
### 编写spring.handlers和spring.schemas串联起所有部件
	spring会默认加载src/main/resources/META-INF下的两个配置文件
	http\://47.93.41.195/people=com.bclz.handle.NamespaceHandle
	表示当使用到名为"http\://47.93.41.195/people=com.bclz.handle.NamespaceHandle"的引用时，会通过com.bclz.handle.NamespaceHandle完成解析

### 运用见test
