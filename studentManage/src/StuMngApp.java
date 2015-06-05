import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.UIManager;

public class StuMngApp {
	boolean packFrame = false;
	
	public StuMngApp() {
		// TODO Auto-generated constructor stub
		StuInfMng frame = new StuInfMng();
		
		if (packFrame) {
			frame.pack();
		}else {
			frame.validate();
		}
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = frame.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		
		frame.setTitle("欢迎进入学生管理系统");
		frame.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
		frame.setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		new StuInfMng();
	}

}
