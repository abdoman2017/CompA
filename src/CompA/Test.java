package CompA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
				//Lire un bean tissé
				//MonService monService = new MonService ();
				Vol vols = (Vol)context.getBean("vols");
				
				Aeroport a = new Aeroport("aero1");
				vols.escale(a);
				}

	}


