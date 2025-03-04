package Employee.SpringEmployee;

import org.springframework.context.annotation.Bean;



public class EmployeeConfiguration {
	@Bean (name="emp1")
	public Employee getEmployee1() {
		Employee s=new Employee();
		s.setEmpId(1);
		s.setEmpName("ANSH");
		s.setSalary(250000);
		return s;
	}
	
	@Bean (name="emp2")
	public Employee getEmployee2() {
		Employee s=new Employee();
		s.setEmpId(2);
		s.setEmpName("Gaba");
		s.setSalary(9500000);
		return s;
	}
	 
	@Bean (name="department1")
	public Department getDepartment1() {
		Department d=new Department();
		d.setDeptId(1);
		d.setDeptName("Marketing");
		return d;
	}
	
}
