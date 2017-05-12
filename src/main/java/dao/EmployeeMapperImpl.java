package dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import dto.Employee;

public class EmployeeMapperImpl implements EmployeeMapper{
	private SqlSession sqlSession;
	private static final Log log = LogFactory.getLog(EmployeeMapperImpl.class);
	private String nameSpace = "dao.EmployeeMapper.";

	public EmployeeMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Employee> selectEmployeeByAll() {
		log.debug("selectEmployeeByAll()");
		return sqlSession.selectList(nameSpace + "selectEmployeeByAll");
	}

	@Override
	public int insertEmployeeItem(Employee employee) {
		log.debug("insertEmployeeItem()");
		return sqlSession.insert(nameSpace + "insertEmployeeItem",employee);
	}

	@Override
	public int updateEmployeeItem(Employee employee) {
		log.debug("updateEmployeeItem()");
		return sqlSession.update(nameSpace + "updateEmployeeItem",employee);
	}

	@Override
	public int deleteEmployeeItem(Employee employee) {
		log.debug("deleteEmployeeItem()");
		return sqlSession.update(nameSpace + "deleteEmployeeItem",employee);
	}

	@Override
	public Employee selectEmployeeByNo() {
		log.debug("selectEmployeeByNo()");
		return sqlSession.selectOne(nameSpace + "selectEmployeeByNo");
	}
}
