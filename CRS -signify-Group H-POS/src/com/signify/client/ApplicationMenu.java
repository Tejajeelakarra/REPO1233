package com.signify.client;

import com.signify.service.CatalogService;
import com.signify.service.SemesterRegistrationService;

public class ApplicationMenu {
	
public static void main(String[] args) {
		
		SemesterRegistrationService service = new SemesterRegistrationService();
		
		service.registerCourses();
		service.addCourse();
		service.dropCourse();
		service.payFees();
		service.viewRegisteredCourses();
		
		CatalogService cservice = new CatalogService();
		
		cservice.addCourse();
		cservice.deleteCourse();
		cservice.viewCourseDetails();
	}
}
