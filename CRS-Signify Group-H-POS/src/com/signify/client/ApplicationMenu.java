package com.signify.client;

import com.signify.service.AdminService;
import com.signify.service.RegisteredCourseService;

public class ApplicationMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisteredCourseService service= new RegisteredCourseService();
		service.dropCourse(101);
		service.viewGrade(701);
		AdminService adservice= new AdminService();
		adservice.addProfessor(200);
		adservice.approveStudent(101);
		adservice.assignCourse(701);
	}

}
