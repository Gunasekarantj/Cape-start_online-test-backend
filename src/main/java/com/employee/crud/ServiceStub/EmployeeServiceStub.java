package com.employee.crud.ServiceStub;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.employee.crud.Entity.EmployeeEntity;

public class EmployeeServiceStub {
	private static Map<Integer, EmployeeEntity> employees = new HashMap<Integer, EmployeeEntity>();
	 private static int idIndex = 3;
	  static {
	    EmployeeEntity a = new EmployeeEntity(1, "TCS","Gunasekaran");
	    employees.put(1, a);
	    EmployeeEntity b = new EmployeeEntity(2, "CTS","Parthi");
	    employees.put(2, b);
	    EmployeeEntity c = new EmployeeEntity(3, "Infoview","Vignesh");
	    employees.put(3, c);
	   
	  }
	  public static List<EmployeeEntity> list() {
	    return new ArrayList<EmployeeEntity>(employees.values());
	  }
	  public static EmployeeEntity create(EmployeeEntity employee) {
	    idIndex += idIndex;
	    employee.setId(idIndex);
	    employees.put(idIndex, employee);
	    return employee;
	  }
	  public static EmployeeEntity get(int id) {
	    return employees.get(id);
	  }
	  public static EmployeeEntity update(int id, EmployeeEntity city) {
	    employees.put(id, city);
	    return city;
	  }
	  public static EmployeeEntity delete(int id) {
	    return employees.remove(id);
	  }
}
