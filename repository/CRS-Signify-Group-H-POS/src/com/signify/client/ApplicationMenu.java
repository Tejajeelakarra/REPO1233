/**
 * 
 */
package com.signify.client;

import com.signify.service.Professorservice;
import com.signify.service.Userservice;
/**
 * @author palak
 *
 */
public class ApplicationMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professorservice service = new Professorservice();
		Userservice service1 = new Userservice();
		service.viewEnrolledStudents();
		service.addGrade();
		service1.updateDetails(100);
		service1.updatePassword(100);
	}

}
