package stumng;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class stuQueryClass extends JFrame {
  DBConnManager dbconnmanager = new DBConnManager();
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  JLabel jLabel1 = new JLabel();
  JComboBox jComboBox1 = new JComboBox();
  JScrollPane jScrollPane1 = new JScrollPane();
  JTable jTable1 = new JTable();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();

  private String aclass;
  private String aname = "";

  public stuQueryClass() {
    try {
      jbInit();
      //设置frame的大小
      this.setSize(600, 400);
      //得到当前屏幕大小
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      //得到frame的大小
      Dimension frameSize = this.getSize();
      if (frameSize.height > screenSize.height) {
        frameSize.height = screenSize.height;
      }
      if (frameSize.width > screenSize.width) {
        frameSize.width = screenSize.width;
      }
      this.setTitle("查询学生信息");
      //设置frame在屏幕上显示的位置
      this.setLocation( (screenSize.width - frameSize.width) / 2,
                       (screenSize.height - frameSize.height) / 2);
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }

    //按学号查询该学生的基本信息
    jButton1.addActionListener(new ActionListener()
   {
     public void actionPerformed(ActionEvent e)
     {
       //清空变量
       Vector result = new Vector();
       Vector resultdate = new Vector();
       Vector headline = new Vector();
       aname = "";
       aclass = "";

     //添加表头信息
       headline.add("学号");
       headline.add("姓名");
       headline.add("班级");
       headline.add("性别");
       headline.add("生日");
       headline.add("民族");
       headline.add("籍贯");

     //清空表
       jTable1 = new JTable();
       jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //滚动条设置左右滚
       jScrollPane1.getViewport().add(jTable1, null); //在滚动条中放入表

       aclass = (String)jComboBox1.getSelectedItem();
       result = dbconnmanager.stuinfQuery(0, aclass, aname);
       if( result.size() == 0 ) JOptionPane.showMessageDialog(null, "无记录");
       else {
         //将结果中的数据转换为table中能显示的数据模型
         for(int i = 0; i < result.size() / 7; i++) {
           Vector temp = new Vector();
           for (int j = 0; j <= 6; j++) {
             String str = (String) result.elementAt(j + i * 7);
             temp.add(str);
           }
           resultdate.add(temp);
         }
         jTable1 = new JTable(resultdate, headline);
         jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //滚动条设置左右滚
         jScrollPane1.getViewport().add(jTable1, null); //在滚动条中放入表
       }
     }
   });

    //退出frame
    jButton2.addActionListener(new ActionListener()
   {
     public void actionPerformed(ActionEvent e)
     {
       jButton2_actionPerformed(e);
     }
   });
  }

  void jbInit() throws Exception {
    this.getContentPane().setLayout(borderLayout1);
    jLabel1.setFont(new java.awt.Font("Dialog", 0, 13));
    jLabel1.setText("请输入班级");
    jComboBox1.setFont(new java.awt.Font("Dialog", 0, 13));
    jComboBox1.addItem("A2241");
    jComboBox1.addItem("A2242");
    jComboBox1.addItem("A2243");
    jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 13));
    jButton1.setFont(new java.awt.Font("Dialog", 0, 13));
    jButton1.setText("提交");
    jButton2.setFont(new java.awt.Font("Dialog", 0, 13));
    jButton2.setText("退出");
    this.getContentPane().add(jPanel1, BorderLayout.NORTH);
    jPanel1.add(jLabel1, null);
    jPanel1.add(jComboBox1, null);
    jPanel1.add(jButton1, null);
    jPanel1.add(jButton2, null);
    this.getContentPane().add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(jTable1, null);
  }
  void jButton2_actionPerformed(ActionEvent e)
  {
    //清空table
    jTable1 = new JTable();
    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //滚动条设置左右滚
    jScrollPane1.getViewport().add(jTable1, null); //在滚动条中放入表

    this.dispose();
    dbconnmanager.closeConns();
  }
}


