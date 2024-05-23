package lld_practice.structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void createEmployee(String userRole) {
		// TODO Auto-generated method stub
		System.out.println("Employee Created !!");
	}

	@Override
	public void updateEmployee(String userRole) {
		// TODO Auto-generated method stub
		System.out.println("Employee Updated !!");
	}

	@Override
	public void getEmployees(String userRole) {
		// TODO Auto-generated method stub
		System.out.println("Employee Fetched !!");
	}

	@Override
	public void deleteEmployee(String userRole) {
		// TODO Auto-generated method stub
		System.out.println("Employee Deleted !!");
	}
}
