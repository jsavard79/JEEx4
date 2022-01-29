package ca.nbcc;

import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class student extends BodyTagSupport {
	
	private String id;
	private String firstName;
	private String lastName;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public student(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public int doStartTag() {	
		try {
			String option = "<option value='" + getId() + "'>" + getFirstName() + " " + getLastName() + "</option>";
			
			JspWriter out = pageContext.getOut();
			out.println(option);
			
		} catch (Exception ex ){
			System.out.println(ex.getMessage());
		}		
		return EVAL_BODY_INCLUDE;
	}
	

}
