package Employee.SpringEmployee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	 AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
         
         Employee s=(Employee) cont.getBean("emp1");
         System.out.println("Employee Name is: "+s.getEmpName());
         System.out.println("Salary is: "+ s.getSalary());
         Department d = (Department) cont.getBean("department1");
         System.out.println("Department ID: " + d.getDeptId());
         System.out.println("Department Name: " + d.getDeptName());

         cont.close();
    }
}
