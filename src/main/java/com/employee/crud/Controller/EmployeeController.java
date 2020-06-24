package com.employee.crud.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.crud.ServiceStub.EmployeeServiceStub;
import com.employee.crud.Entity.EmployeeEntity;


@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	  @RequestMapping(value = "employees", method = RequestMethod.GET)
	  public List<EmployeeEntity> list(){
	    return EmployeeServiceStub.list();
	  }
	  @RequestMapping(value = "employee", method = RequestMethod.POST)
	  public EmployeeEntity create(@RequestBody EmployeeEntity employeeEntity){
	    return EmployeeServiceStub.create(employeeEntity);
	  }
	  @RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
	  public EmployeeEntity get(@PathVariable int id){
	    return EmployeeServiceStub.get(id);
	  }
	  @RequestMapping(value = "employee/{id}", method = RequestMethod.PUT)
	  public EmployeeEntity update(@PathVariable int id, @RequestBody EmployeeEntity employeeEntity){
	    return EmployeeServiceStub.update(id, employeeEntity);
	  }
	  @RequestMapping(value = "employee/{id}", method = RequestMethod.DELETE)
	  public EmployeeEntity delete(@PathVariable int id){
	    return EmployeeServiceStub.delete(id);
	  }
}
