package lld_practice.structural.proxy;

public class EmployeeDaoProxyImpl implements EmployeeDao{

	private EmployeeDao employeeDao;
	
	public EmployeeDaoProxyImpl() {
		// TODO Auto-generated constructor stub
		this.employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public void createEmployee(String userRole) throws Exception {
		// TODO Auto-generated method stub
		if(userRole.equalsIgnoreCase("admin")) {
			employeeDao.createEmployee(userRole);
			return;
		}
		throw new Exception("Access Denied !!");
	}

	@Override
	public void updateEmployee(String userRole) throws Exception{
		// TODO Auto-generated method stub
		if(userRole.equalsIgnoreCase("admin")) {
			this.employeeDao.updateEmployee(userRole);
			return;
		}
		throw new Exception("Access Denied !!");
	}

	@Override
	public void getEmployees(String userRole) throws Exception{
		// TODO Auto-generated method stub
		if(userRole.equalsIgnoreCase("manager")) {
			System.out.println("Employee Fetched !!");
			return;
		}
		throw new Exception("Access Denied !!");
	}

	@Override
	public void deleteEmployee(String userRole) throws Exception{
		// TODO Auto-generated method stub
		if(userRole.equalsIgnoreCase("admin")) {
			System.out.println("Employee Deleted !!");
			return;
		}
		throw new Exception("Access Denied !!");
	}
}
