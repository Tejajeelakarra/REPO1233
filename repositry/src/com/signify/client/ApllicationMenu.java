/**
 * 
 */
package com.signify.client;
import com.signify.service.StudentService;

/**
 * @author WELCOME
 *
 */
public class ApllicationMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService service1 = new StudentService();
		service1.register(20);
		service1.changePassword(10);
		service1.viewGradeCard(10);
		
	}

}
