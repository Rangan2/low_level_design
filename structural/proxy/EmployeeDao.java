package lld_practice.structural.proxy;

public interface EmployeeDao {

	void createEmployee(String userRole) throws Exception;
	void updateEmployee(String userRole)  throws Exception;
	void getEmployees(String userRole) throws Exception;
	void deleteEmployee(String userRole) throws Exception;
}
