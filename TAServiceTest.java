//import com.shaik.spring.service.*;
//import com.shaik.spring.dao.*;
//import com.shaik.spring.dao.daoimpl.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.support.*;
import org.springframework.core.io.FileSystemResource;
import com.shaik.spring.service.TAService;
public class TAServiceTest
{
	private TAService taService;
	public void testTransfer()
	{
		boolean flag=taService.transfer(111,876,6000);
		System.out.println("amount transferd"+flag);
	}
	public static void main(String args[])
	{
		System.out.println("in test case");
		//Setp1 to get bean factory objects of depencies form xml file
		DefaultListableBeanFactory beans=new DefaultListableBeanFactory();
		//setp2 to read the xml file and send the objects to bean factory
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beans);
		//step3
		reader.loadBeanDefinitions(new FileSystemResource("MyBeans.xml"));

		TAServiceTest test=new TAServiceTest();
		Object o=beans.getBean("taService");
		test.taService=(TAService)o;
		test.testTransfer();
		System.out.println("end of test case");

	}
}