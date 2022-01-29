package ca.nbcc;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.util.ArrayList;
import java.util.List;
import ca.nbcc.student;

public class studentdropdown extends SimpleTagSupport {
	private String name;
	private String className;
	private int selectIndex;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public int getSelectIndex() {
		return selectIndex;
	}
	
	public void setSelectIndex(int selectIndex) {
		this.selectIndex = selectIndex;
	}
	
    @Override
    public void doTag() throws JspException, java.io.IOException {
       JspWriter out = getJspContext().getOut();
       student s = new student() ;
       StringBuilder sb = new StringBuilder();
       
       sb.append("<select name='");
       sb.append(this.name);
       sb.append("'");
       if (this.className != null || this.className != "") {
           sb.append(" class='");
           sb.append(this.className);
           sb.append("'");
       }
       sb.append(">");
       
       int i = 0;
       
       for (student student : s.getStudents()) {
        sb.append("<option value='");
        sb.append(student.getId());
        sb.append("' ");
        
        if (i == this.selectIndex) {
        	sb.append("selected");
        }
        
        sb.append(">");
        sb.append(student.getLastName());
        sb.append(", ");
        sb.append(student.getFirstName());
        sb.append("</option>");
        
        i++;
       }
       sb.append("</select>");
       
       out.println(sb.toString());
    }
	
	
}
