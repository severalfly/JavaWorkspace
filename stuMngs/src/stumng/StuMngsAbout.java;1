package stumng;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StuMngsAbout extends JFrame
{
  private JLabel lab_icon = new JLabel();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JPanel jPanel1 = new JPanel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JButton jButton1 = new JButton();
  private Label label1 = new Label();

  public StuMngsAbout()
  {
    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception
  {
    lab_icon.setBorder(BorderFactory.createEtchedBorder());
    lab_icon.setBounds(new Rectangle(9, 9, 166, 104));
    this.getContentPane().setBackground(Color.white);
    this.getContentPane().setLayout(null);
    jLabel1.setFont(new java.awt.Font("Serif", 1, 18));
    jLabel1.setForeground(Color.red);
    jLabel1.setToolTipText("");
    jLabel1.setText("Student Manage System");
    jLabel1.setBounds(new Rectangle(177, 21, 202, 24));
    jLabel2.setFont(new java.awt.Font("Serif", 0, 14));
    jLabel2.setText("    学生管理系统Version 1.0");
    jLabel2.setBounds(new Rectangle(183, 78, 175, 19));
    jPanel1.setBackground(Color.lightGray);
    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setBounds(new Rectangle(-5, 125, 394, 72));
    jPanel1.setLayout(null);
    jLabel3.setFont(new java.awt.Font("Serif", 0, 14));
    jLabel3.setText("制作:王灏");
    jLabel3.setBounds(new Rectangle(17, 19, 78, 18));
    jLabel5.setFont(new java.awt.Font("Serif", 0, 14));
    jLabel5.setText("感谢: 各位读者对本书的支持");
    jLabel5.setBounds(new Rectangle(18, 39, 129, 18));
    jButton1.setBounds(new Rectangle(250, 39, 64, 22));
    jButton1.setFont(new java.awt.Font("Serif", 0, 12));
    jButton1.setText("关闭");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton1_actionPerformed(e);
      }
    });
    label1.setText("E-Mail: yn_wqy@yahoo.com.cn");
    label1.setBounds(new Rectangle(198, 102, 156, 18));
    this.getContentPane().add(lab_icon, null);
    this.getContentPane().add(jPanel1, null);
    jPanel1.add(jButton1, null);
    jPanel1.add(jLabel5, null);
    jPanel1.add(jLabel3, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(label1, null);
    Icon icon1=new ImageIcon(stumng.StuMngsAbout.class.getResource("tiger.gif"));
    lab_icon.setIcon(icon1);
    this.setTitle("关于这个程序");
    this.setBounds(200,200,385,220);
    this.setResizable(false);

  }

  void jButton1_actionPerformed(ActionEvent e)
  {
    this.dispose();
  }
}
