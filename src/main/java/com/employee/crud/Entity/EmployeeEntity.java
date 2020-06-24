package com.employee.crud.Entity;



public class EmployeeEntity {
	    private int id;
	    private String CompanyName;
	    private String EmployeeName;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCompanyName() {
			return CompanyName;
		}
		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}
		public String getEmployeeName() {
			return EmployeeName;
		}
		public void setEmployeeName(String employeeName) {
			EmployeeName = employeeName;
		}
		public EmployeeEntity(int id, String companyName, String employeeName) {
			super();
			this.id = id;
			CompanyName = companyName;
			EmployeeName = employeeName;
		}
		public EmployeeEntity() {
			super();
		}
		
	   
		
	    
}
