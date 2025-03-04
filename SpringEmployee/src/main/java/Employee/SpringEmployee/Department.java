package Employee.SpringEmployee;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
public class Department {

	private int deptId;
	private String deptName;
	@Autowired
	private List<Employee> empList;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

}

