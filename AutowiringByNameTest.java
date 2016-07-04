package _06.autowiring.byName.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _05.bean.aliasing.model.Person;
import _06.autowiring.byName.model.Employee;

public class AutowiringByNameTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("06.autowiring.byName.xml");
		
		Employee employee=context.getBean("employeeId",Employee.class);
		System.out.println(employee);
	}
}

// Spring, otomatik olarak bean bagimliliklarini cozebilir , Bu yaklasima Autowiring yaklasimi adi verilir.
// XML ile ya da Annotation ile bu yaklasimi/teknigi kullanabiliriz.
// XML de varsayilan olarak kapalidir.

// XML icin 3 tane yaklasim mevcuttur ;

// 1 - byName
	// byName kullanildiginda bean id ile ayni isimde olmali(addressByName)

// 2 - byType
	// Address tipinde olmasi yeterli ismi onemli degil bean icin. birden fazla tanimladigimizda hata verir.
	//bu nedenle autowire-candidate="false" kullan.

// 3 - constructor
// yapilandirici/construcotr uzerinden autowirigin yapilmaktadir.