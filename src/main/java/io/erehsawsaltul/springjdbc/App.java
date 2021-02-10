package io.erehsawsaltul.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.erehsawsaltul.springjdbc.employee.Employee;
import io.erehsawsaltul.springjdbc.employee.EmployeeDAO;

/**
 * Hello world!
 *
 */
/**
 * @author Muyoba Lutlas
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext dbConfigFile = new ClassPathXmlApplicationContext("io/erehsawsaltul/springjdbc/global_config.xml");
    	EmployeeDAO employeeDao = (EmployeeDAO) dbConfigFile.getBean("employeeImpl");
//    	Employee employee = new Employee();
//    	
//		
//		  employee.setId(3); employee.setFirstName("Mask"); employee.setLastName("Goom");
//		 
//    	
//    	int result = employeeDao.create(employee);
//    	System.out.println("Number Of Records Inserted Are: "+ result);
    	//int result = employeeDao.update(employee);
    	//System.out.println("Number Of Records Updated Are: "+ result);
    	//int result = employeeDao.delete(0);
    	//System.out.println("Number Of Records Deleted Are: "+ result);
    	//Employee employeeResult = employeeDao.read(3);
    	//System.out.println("Employee Record: "+ employeeResult);
    	List<Employee> employeeResult = employeeDao.read();
    	System.out.println("Employee Record: "+ employeeResult);
    	
    }
}
