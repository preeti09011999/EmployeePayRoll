package test;
import com.hsbc.employeepayroll.entity.Employee;
import com.hsbc.employeepayroll.entity.Hr;
import com.hsbc.employeepayroll.entity.Manager;

public class TestAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = getEmployee(); // emp reference is created at compile time and the object which is created at run-time will be returned by the method
		Employee e = (Employee)emp; // reference variable casting
		emp.salary();
		
		// ******* DownCasting (Explicitly)(Reference Variable Casting)*******************
			// down casting may give java.lag.ClassCastException, EG - Hr h = (Hr) e; => as e is  
			// of Manager type returned by getEmployee 
			// if(e instanceof Hr){   //instanceof is an operator
			//		Hr h = (Hr) e;
			//	}
			// Manager mg = (Manager) e; // here the manager(the reference) is downcasted 
			// and not the object
		// *******************************************************************************
		
	}

	public static Employee getEmployee() {
		boolean flag = true;
		if(flag) {
			return new Manager();
		}
		else {
			return new Hr();
		}
	}
	
}
