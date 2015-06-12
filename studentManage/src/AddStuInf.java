import java.sql.Date;
import java.text.DateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddStuInf extends JFrame {
	DBConnManager dbConnManager = new DBConnManager();
	XYLayout xyLayout1 = new XYLayout();
	JLabel jLabel1 = new JLabel();
	JTextField jTextField = new JTextField();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JTextField jTextField3 = new JTextField();
	JLabel jLabel4 = new JLabel();
	JTextField jTextField4 = new JTextField();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel6 = new JLabel();
	
	JFormattedTextField jTextField6 = new JFormattedTextField(DateFormat.getDateInstance());
	JLabel jLabel7 = new JLabel();
	JTextField jTextField7 = new JLabel();
	
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	
	JComboBox jComboBox1 = new JComboBox();
	JComboBox jComboBox2 = new JComboBox();
	
	int astu_id; // 学号
	String userid; // 接收界面传入的学号
	String anameString; // 姓名
	String aclasString; // 班级号
	String asexString; // 性别
	Date abirthday; //出生日期
	

}
