import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class StuInfMng extends JFrame {
	JPanel contentPanel;
	AddStuInf addStuInf = new AddStuInf();
	EditStuInf editStuInf = new EditStuInf();
	DelStuInf delStuInf = new DelStuInf();
	
	GradeInfMng gradeInfMng = new GradeInfMng();
	StuQueryId stuQueryId = new StuQueryId();
	StuQueryName stuQueryName = new StuQueryName();
	StuQueryClass stuQueryClass = new StuQueryClass();
	
	GradeRank gradeRank = new GradeRank();
	GradeQuery gradeQuery = new GradeQuery();
	
	SumGrade sumGrade = new SumGrade();
	SumPeople sumPeople = new SumPeople();
	StuMngsAbout stuMngsAbout = new StuMngsAbout();
	JMenuBar jMenuBar1 = new JMenuBar();
	JMenu stuInfMngJMenu = new JMenu();
	JMenuItem addStuInfMenuItem = new JMenuItem();
	
	JMenu stuGradeMngMenu = new JMenu();
	JMenuItem gradeMngMenuItem = new JMenuItem();
	
	BorderLayout borderLayout1 = new BorderLayout();
	JMenu queryMenu = new JMenu();
	JMenu sumMenu = new JMenu();
	JMenu helpMenu = new JMenu();
	JMenu exitMenu = new JMenu();
	JMenuItem editStuInfMenuItem = new JMenuItem();
	JMenuItem delStuInfMenuItem = new JMenuItem();
	JMenuItem gradeQueryMenuItem = new JMenuItem();
	
	JMenuItem sumStuMenuItem = new JMenuItem();
	JMenuItem sumGradeMenuItem = new JMenuItem();
	JMenuItem helpMenuItem = new JMenuItem();
	JMenu stuQueryMenu = new JMenu();
	JMenuItem stuQueryNameMenuItem = new JMenuItem();
	JMenuItem stuQueryIdMenuItem = new JMenuItem();
	JMenuItem stuQueryClassMenuItem = new JMenuItem();
	
	JMenuItem exitsystemMenuItem = new JMenuItem();
	JMenuItem totalrankMenuItem = new JMenuItem();
	JMenuItem mathrankMenuItem = new JMenuItem();
	JMenuItem englishrankMenuItem = new JMenuItem();
	JMenuItem chineseRankMenuItem = new JMenuItem();
	
	JMenuItem commentrankMenuItem = new JMenuItem();
	JMenuItem gradeRankMenuItem = new JMenuItem();
	JLabel jLabel1 = new JLabel();
	
	public StuInfMng() {
		// TODO Auto-generated constructor stub
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
			exitsystemMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
			});
			
			addStuInfMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					addStuInf.show();
				}
			});
			
			editStuInfMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					editStuInf.show();
				}
			});
			
			delStuInfMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					delStuInf.show();
				}
			});
			
			gradeMngMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					gradeInfMng.show();
				}
			});
			
			stuQueryNameMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					stuQueryName.show();
				}
			});
			
			stuQueryIdMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					stuQueryId.show();
				}
			});
			
			stuQueryClassMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					stuQueryClass.show();
				}
			});
			
			gradeRankMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					gradeRank.show();
				}
			});
			
			gradeQueryMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					gradeQuery.show();
				}
			});
			
			sumGradeMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					sumGrade.show();
				}
			});
			
			sumStuMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					sumPeople.show();
				}
			});
			
			helpMenuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					stuMngsAbout.show();
				}
			});
			
			
		} catch (Exception e) {
			e.printStackTrace();//: handle exception
		}
	}
	
	private void  jbInit() throws Exception {
		contentPanel = (JPanel)this.getContentPane();
		contentPanel.setLayout(borderLayout1);
		this.setTitle("Frame Title");
		this.setSize(new Dimension(400,300));
		stuInfMngJMenu.setFont(new java.awt.Font("Dialog",0,13));
		stuInfMngJMenu.setText("学生信息管理");
		
		addStuInfMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		addStuInfMenuItem.setText("增加学生信息");
		
		stuGradeMngMenu.setFont(new java.awt.Font("Dialog",0,13));
		stuGradeMngMenu.setText("学生成绩管理");
		
		gradeMngMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		gradeMngMenuItem.setForeground(Color.black);
		gradeMngMenuItem.setText("学生成绩综合管理");
		
		queryMenu.setFont(new Font("Dialog",0,13));
		queryMenu.setText("查询");
		
		sumMenu.setFont(new java.awt.Font("Dialog",0,13));
		sumMenu.setText("统计");
		helpMenu.setFont(new java.awt.Font("Dialog",0,13));
		helpMenu.setText("帮助");
		
		exitMenu.setFont(new java.awt.Font("Dialog",0,13));
		exitMenu.setText("退出");
		editStuInfMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		editStuInfMenuItem.setText("修改学生信息");
		delStuInfMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		delStuInfMenuItem.setText("删除学生信息");
		
		gradeQueryMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		gradeQueryMenuItem.setActionCommand("学生成绩查询");
		gradeQueryMenuItem.setText("成绩查夜");
		
		sumStuMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		sumStuMenuItem.setText("人员统计");
		sumGradeMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		sumGradeMenuItem.setText("成绩统计");
		
		helpMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		helpMenuItem.setText("关于");
		
		stuQueryMenu.setFont(new java.awt.Font("Dialog",0,13));
		stuQueryMenu.setActionCommand("");
		stuQueryMenu.setText("学生基本信息查询");
		
		stuQueryNameMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		stuQueryNameMenuItem.setText("按姓名");
		
		stuQueryIdMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		stuQueryIdMenuItem.setText("按学号");
		stuInfMngJMenu.addSeparator();
		
		stuQueryClassMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		stuQueryClassMenuItem.setText("按班级");
		
		exitsystemMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		exitsystemMenuItem.setText("退出系统");
		
		totalrankMenuItem.setText("按总分");
		mathrankMenuItem.setText("按数学成绩");
		englishrankMenuItem.setText("按英语成绩");
		chineseRankMenuItem.setText("按语文成绩");
		commentrankMenuItem.setText("按总成绩");
		
		gradeRankMenuItem.setFont(new java.awt.Font("Dialog",0,13));
		gradeRankMenuItem.setText("排名");
		
		contentPanel.setFont(new java.awt.Font("Dialog",0,11));
		jLabel1.setFont(new java.awt.Font("Dialog",1,25));
		jLabel1.setForeground(Color.red);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
		jLabel1.setText("欢迎进入学生管理系统");
		
		stuInfMngJMenu.add(addStuInfMenuItem);
		stuInfMngJMenu.addSeparator();
		stuInfMngJMenu.add(editStuInfMenuItem);
		stuInfMngJMenu.addSeparator();
		stuInfMngJMenu.add(delStuInfMenuItem);
		
		stuGradeMngMenu.addSeparator();
		stuGradeMngMenu.add(gradeMngMenuItem);
		stuGradeMngMenu.addSeparator();
		stuGradeMngMenu.add(gradeRankMenuItem);
		
		jMenuBar1.add(stuInfMngJMenu);
		jMenuBar1.add(stuGradeMngMenu);
		jMenuBar1.add(queryMenu);
		jMenuBar1.add(sumMenu);
		jMenuBar1.add(helpMenu);
		jMenuBar1.add(exitMenu);
		
		queryMenu.addSeparator();
		queryMenu.add(stuQueryMenu);
		queryMenu.addSeparator();
		queryMenu.add(gradeQueryMenuItem);
		
		sumMenu.addSeparator();
		sumMenu.add(sumStuMenuItem);
		sumMenu.addSeparator();
		sumMenu.add(sumGradeMenuItem);
		
		helpMenu.addSeparator();
		helpMenu.add(helpMenuItem);
		
		stuQueryMenu.add(stuQueryNameMenuItem);
		stuQueryMenu.addSeparator();
		stuQueryMenu.add(stuQueryIdMenuItem);
		stuQueryMenu.addSeparator();
		stuQueryMenu.add(stuQueryClassMenuItem);
		
		exitMenu.add(exitsystemMenuItem);
		contentPanel.add(jLabel1,BorderLayout.CENTER);
		this.setJMenuBar(jMenuBar1);
		
	}
	
	
}
