package stumng;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * <p>Title:学生管理系统 </p>
 * <p>Description: </p>
 * <p>Copyright:Copyright (c) 2005</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class stuInfMng extends JFrame {
  JPanel contentPane;
  addStuInf addstuinf = new addStuInf();            //添加学生基本信息
  editStuInf editstuinf = new editStuInf();         //修改学生基本信息
  delStuInf delstuinf = new delStuInf();            //删除学生基本信息
  gradeInfMng gradeinfmng = new gradeInfMng();      //学生成绩管理
  stuQueryId stuqueryid = new stuQueryId();          //按学号查询学生基本信息
  stuQueryName stuqueryname = new stuQueryName();    //按姓名查询学生基本信息
  stuQueryClass stuqueryclass = new stuQueryClass(); //按班级查询学生基本信息
  gradeRank graderank = new gradeRank();             //学生成绩排名
  gradeQuery gradequery = new gradeQuery();           //学生成绩查询
  sumGrade sumgrade = new sumGrade();                 //成绩统计
  sumPeople sumpeople = new sumPeople();               //学生统计
  StuMngsAbout stumngsabout = new StuMngsAbout();      //帮助
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu stuInfMngMenu = new JMenu();
  JMenuItem addStuInfMenuItem = new JMenuItem();
  JMenu stuGradeMngMenu = new JMenu();
  JMenuItem gradeMngMenuItem = new JMenuItem();
  BorderLayout borderLayout1 = new BorderLayout();
  JMenu QueryMenu = new JMenu();
  JMenu sumMenu = new JMenu();
  JMenu HelpMenu = new JMenu();
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
  JMenuItem chineserankMenuItem = new JMenuItem();
  JMenuItem commentrankMenuItem = new JMenuItem();
  JMenuItem gradeRankMenuItem = new JMenuItem();
  JLabel jLabel1 = new JLabel();

  //Construct the frame
  public stuInfMng() {

  //添加菜单响应事件
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
      exitsystemMenuItem.addActionListener(new ActionListener()
      {
        public void actionPerformed( ActionEvent event )
        {
          System.exit(0);
        }
      }
      );

      addStuInfMenuItem.addActionListener(new ActionListener()
      {
        public void actionPerformed( ActionEvent event )
       {
         addstuinf.show();
       }
     }
      );

      editStuInfMenuItem.addActionListener(new ActionListener()
      {
        public void actionPerformed( ActionEvent event )
       {
         editstuinf.show();
       }
     }
      );

      delStuInfMenuItem.addActionListener(new ActionListener()
      {
        public void actionPerformed( ActionEvent event )
       {
         delstuinf.show();
       }
     }
      );

      gradeMngMenuItem.addActionListener(new ActionListener()
      {
        public void actionPerformed( ActionEvent event )
       {
         gradeinfmng.show();
       }
     }
      );

      stuQueryNameMenuItem.addActionListener(new ActionListener()
      {
        public void actionPerformed( ActionEvent event )
       {
         stuqueryname.show();
       }
     }
      );

      stuQueryIdMenuItem.addActionListener(new ActionListener()
     {
       public void actionPerformed( ActionEvent event )
      {
        stuqueryid.show();
      }
    }
     );

     stuQueryClassMenuItem.addActionListener(new ActionListener()
     {
       public void actionPerformed( ActionEvent event )
      {
        stuqueryclass.show();
      }
    }
     );

     gradeRankMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed( ActionEvent event )
     {
       graderank.show();
     }
   }
    );

    gradeQueryMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed( ActionEvent event )
     {
       gradequery.show();
     }
   }
    );

    sumGradeMenuItem.addActionListener(new ActionListener()
   {
     public void actionPerformed( ActionEvent event )
    {
      sumgrade.show();
    }
  }
   );

   sumStuMenuItem.addActionListener(new ActionListener()
   {
     public void actionPerformed( ActionEvent event )
    {
      sumpeople.show();
    }
  }
   );


   helpMenuItem.addActionListener(new ActionListener()
    {
      public void actionPerformed( ActionEvent event )
     {
       stumngsabout.show();
     }
   }
    );

    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  //Component initialization
  private void jbInit() throws Exception  {
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    this.setSize(new Dimension(400, 300));
    this.setTitle("Frame Title");
    stuInfMngMenu.setFont(new java.awt.Font("Dialog", 0, 13));
    stuInfMngMenu.setText("学生信息管理");
    addStuInfMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    addStuInfMenuItem.setText("增加学生信息");
    stuGradeMngMenu.setFont(new java.awt.Font("Dialog", 0, 13));
    stuGradeMngMenu.setText("学生成绩管理");
    gradeMngMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    gradeMngMenuItem.setForeground(Color.black);
    gradeMngMenuItem.setText("学生成绩综合管理");
    QueryMenu.setFont(new java.awt.Font("Dialog", 0, 13));
    QueryMenu.setText("查询");
    sumMenu.setFont(new java.awt.Font("Dialog", 0, 13));
    sumMenu.setText("统计");
    HelpMenu.setFont(new java.awt.Font("Dialog", 0, 13));
    HelpMenu.setText("帮助");
    exitMenu.setFont(new java.awt.Font("Dialog", 0, 13));
    exitMenu.setText("退出");
    editStuInfMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    editStuInfMenuItem.setText("修改学生信息");
    delStuInfMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    delStuInfMenuItem.setText("删除学生信息");
    gradeQueryMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    gradeQueryMenuItem.setActionCommand("学生成绩查询");
    gradeQueryMenuItem.setText("成绩查询");
    sumStuMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    sumStuMenuItem.setText("人员统计");
    sumGradeMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    sumGradeMenuItem.setText("成绩统计");
    helpMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    helpMenuItem.setText("关于");
    stuQueryMenu.setFont(new java.awt.Font("Dialog", 0, 13));
    stuQueryMenu.setActionCommand("");
    stuQueryMenu.setText("学生基本信息查询");
    stuQueryNameMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    stuQueryNameMenuItem.setText("按姓名");
    stuQueryIdMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    stuQueryIdMenuItem.setText("按学号");
    stuInfMngMenu.addSeparator();
    stuQueryClassMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    stuQueryClassMenuItem.setText("按班级");
    exitsystemMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    exitsystemMenuItem.setText("退出系统");
    totalrankMenuItem.setText("按  总  分");
    mathrankMenuItem.setText("按数学成绩");
    englishrankMenuItem.setText("按英语成绩");
    chineserankMenuItem.setText("按语文成绩");
    commentrankMenuItem.setText("按  总成绩");
    gradeRankMenuItem.setFont(new java.awt.Font("Dialog", 0, 13));
    gradeRankMenuItem.setText("排              名");
    contentPane.setFont(new java.awt.Font("Dialog", 0, 11));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 25));
    jLabel1.setForeground(Color.red);
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
    jLabel1.setText("欢迎进入学生管理系统");
    stuInfMngMenu.add(addStuInfMenuItem);
    stuInfMngMenu.addSeparator();
    stuInfMngMenu.add(editStuInfMenuItem);
    stuInfMngMenu.addSeparator();
    stuInfMngMenu.add(delStuInfMenuItem);
    stuGradeMngMenu.addSeparator();
    stuGradeMngMenu.add(gradeMngMenuItem);
    stuGradeMngMenu.addSeparator();
    stuGradeMngMenu.add(gradeRankMenuItem);
    jMenuBar1.add(stuInfMngMenu);
    jMenuBar1.add(stuGradeMngMenu);
    jMenuBar1.add(QueryMenu);
    jMenuBar1.add(sumMenu);
    jMenuBar1.add(HelpMenu);
    jMenuBar1.add(exitMenu);
    QueryMenu.addSeparator();
    QueryMenu.add(stuQueryMenu);
    QueryMenu.addSeparator();
    QueryMenu.add(gradeQueryMenuItem);
    sumMenu.addSeparator();
    sumMenu.add(sumStuMenuItem);
    sumMenu.addSeparator();
    sumMenu.add(sumGradeMenuItem);
    HelpMenu.addSeparator();
    HelpMenu.add(helpMenuItem);
    stuQueryMenu.add(stuQueryNameMenuItem);
    stuQueryMenu.addSeparator();
    stuQueryMenu.add(stuQueryIdMenuItem);
    stuQueryMenu.addSeparator();
    stuQueryMenu.add(stuQueryClassMenuItem);
    exitMenu.add(exitsystemMenuItem);
    contentPane.add(jLabel1, BorderLayout.CENTER);
    this.setJMenuBar(jMenuBar1);
  }
}

