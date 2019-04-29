import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;


public class Menu {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Jmenu");
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JMenuBar bar=new JMenuBar();
		bar.setBounds(0, 0, 600, 25);
		JMenu menufile=new JMenu("File");
		menufile.setBounds(5, 5,30, 20);
		
		JMenu menuopen=new JMenu("open");
		JMenu menunew=new JMenu("new");
		
		JMenu menuclose=new JMenu("close");
		JMenu menucloseAll=new JMenu("closeAll");
		JMenu menuswitch=new JMenu("switchworkplace");
		
		
		JMenuItem item=new JMenuItem("aaa");
		JMenuItem item2=new JMenuItem("bbb");
		JMenuItem item3=new JMenuItem("other...");
		
	
		frame.add(bar);
		frame.add(menufile);
		menuopen.add(menunew);
		menuopen.add(menuopen);
		menuopen.addSeparator();
		menuopen.add(menuclose);
		menuopen.add(menucloseAll);
		menuopen.addSeparator();
		menuopen.add(menuswitch);
		
		menuswitch.add(item);
		menuswitch.add(item2);
		menuswitch.add(item3);
		
		frame.add(bar);
		frame.setVisible(true);
		
		
	
		
		
	}
}
