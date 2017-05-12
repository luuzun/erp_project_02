package dao;

import java.util.List;

import dto.Employee;

public interface EmployeeMapper {
	List<Employee> selectEmployeeByAll();
	int insertEmployeeItem(Employee employee);
    int updateEmployeeItem(Employee employee);
    int deleteEmployeeItem(Employee employee);
    Employee selectEmployeeByNo();
}
