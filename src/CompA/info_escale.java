package CompA;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;

public class info_escale {
	public void logMethodEntry(JoinPoint joinPoint) {
		// une méthode avec une jointure en paramétre
		Object[] args = joinPoint.getArgs();
		String name = joinPoint.getSignature().toLongString();
		StringBuffer sb = new StringBuffer(name + " called with: [");
		for(int i = 0; i < args.length; i++) {
		Object o = args[i];
		sb.append("'"+o+"'");
		if(i == args.length - 1){sb.append("");} else{sb.append(", ");} 
		} 
		sb.append("]"); 
		System.out.println(sb);
		
		
		System.out.print("la date d'aujourd'hui est ");
		System.out.println(new java.util.Date());
	

		}
	public void logMethodExit(StaticPart staticPart, Object result) 
	{ 
	String name = staticPart.getSignature().toLongString(); 
	System.out.println(name + " returning: [" + result + "]");

	}
	
}
