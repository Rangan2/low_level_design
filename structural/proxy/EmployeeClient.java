package lld_practice.structural.proxy;

public class EmployeeClient {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoProxyImpl();
		try {
			employeeDao.createEmployee("admin");
			System.out.println("Operation Successful !!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
