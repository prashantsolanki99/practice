/**
 * @authos : Saumm
 * Added on 01-Dec-2018 12:09:46 PM
 */
package in.diszhappy.services;

import java.util.ArrayList;
import java.util.List;

import in.diszhappy.bean.DepartmentBean;
import in.diszhappy.bean.EmployeeBean;

/**
 * @author Saumm created on 01-Dec-2018 12:09:46 PM 
 * Desc : This class is the service class for Department
 */
public class DepartmentService {
	public static List<DepartmentBean> getDepartments(){
		 List<DepartmentBean> depts = new ArrayList<>();
		 List<EmployeeBean> employees = EmployeeService.getEmployees();
		 depts.add(new DepartmentBean(1, "IT", "Add1", employees));
		 depts.add(new DepartmentBean(2, "IT", "Add2", employees));
		 depts.add(new DepartmentBean(3, "Procurement", "Add3", employees));
		 return depts;
	}
}
