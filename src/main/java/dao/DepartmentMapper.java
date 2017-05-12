package dao;

import java.util.List;

import dto.Department;

public interface DepartmentMapper {
	List<Department> selectDepartmentByAll();
	int insertDepartmentItem(Department department);
    int updateDepartmentItem(Department department);
    int deleteDepartmentItem(Department department);
    Department selectDepartmentByNo();
}
