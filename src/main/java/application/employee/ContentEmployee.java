package application.employee;

import javax.swing.JPanel;

import util.framework.ComboPanel;
import util.framework.RadioPanel;
import util.framework.SpinnerPanel;
import util.framework.TextFieldFormatPanel;
import util.framework.TextFieldPanel;

import java.awt.GridLayout;

public class ContentEmployee extends JPanel {
	private TextFieldPanel empNo;
	private TextFieldPanel empName;
	private ComboPanel empTitle;
	private SpinnerPanel empSalary;
	private RadioPanel empGender;
	private ComboPanel empDepartment;
	private TextFieldFormatPanel empJoinDate;

	public ContentEmployee() {
		setLayout(new GridLayout(7, 0, 0, 0));
		
		empNo = new TextFieldPanel();
		empName = new TextFieldPanel();
		empTitle = new ComboPanel();
		empSalary = new SpinnerPanel();
		empGender = new RadioPanel();
		empDepartment = new ComboPanel();
		empJoinDate = new TextFieldFormatPanel();
		
		add(empNo);
		add(empName);
		add(empTitle);
		add(empSalary);
		add(empGender);
		add(empDepartment);
		add(empJoinDate);
		
		empNo.setTitle("번호");
		empName.setTitle("사원명");
		empTitle.setTitle("직책");
		empSalary.setTitle("급여");
		empGender.setTitle("성별");
		empDepartment.setTitle("부서");
		empJoinDate.setTitle("입사일");
		
		
	}

}
