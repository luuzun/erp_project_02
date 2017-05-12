package erp_project_02;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import dto.Department;
import dto.Employee;
import dto.Title;
import service.EmployeeService;

public class EmployeeMapperTest {
	private static EmployeeService employeeService; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		employeeService = EmployeeService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		employeeService = null;
	}
	/*
	@Test
	public void testAInsert() {
		Employee employee = new Employee(17012,"이사원",2000000,new Department(1,"마케팅",10),false,"2017-03-01",new Title(1,"사장"));
		int res = EmployeeService.getInstance().insertEmployeeItem(employee);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testBDelete() {
		int res = EmployeeService.getInstance().deleteEmployeeItem(new Employee(17012));
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testCUpdate() {
		int res = EmployeeService.getInstance().deleteEmployeeItem(new Employee(17011,"UpdateTest"));
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testDSelect() {
		List<Employee> lists = EmployeeService.getInstance().selectEmployeeByAll();
		for(Employee e : lists){
			System.out.println(e);
		}
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void testESelectOne() {
		Employee employee = EmployeeService.getInstance().selectEmployeeByNo();
		Assert.assertNotNull(employee);
	}*/
}
