package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.EmployeeMapper;
import dao.EmployeeMapperImpl;
import dto.Employee;
import util.MyBatisSqlSessionFactory;
public class EmployeeService {
	private static final EmployeeService instance = new EmployeeService();
	private EmployeeService() {}
	public static EmployeeService getInstance(){
		return instance;
	}
	
	public List<Employee> selectEmployeeByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			return EmployeeMapper.selectEmployeeByAll();
		} 
	}

	public int insertEmployeeItem(Employee employee) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			int res= EmployeeMapper.insertEmployeeItem(employee);
			sqlSession.commit();
			return res;
		} 
	}

	public int updateEmployeeItem(Employee employee) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			int res= EmployeeMapper.updateEmployeeItem(employee);
			sqlSession.commit();
			return res;
		} 
	}

	public int deleteEmployeeItem(Employee employee) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			int res= EmployeeMapper.deleteEmployeeItem(employee);
			sqlSession.commit();
			return res;
		} 
	}
	
	public Employee selectEmployeeByNo() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			return EmployeeMapper.selectEmployeeByNo();
		} 
	}
	
}
