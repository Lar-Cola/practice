import javaCode.FlowLayout;
import javaCode.JButton;
import javaCode.JFrame;
import javaCode.JLabel;
import javaCode.JPanel;

public class HelloWorld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		   JFrame frame = new JFrame("JFrame Example");  
	        JPanel panel = new JPanel();  
	        panel.setLayout(new FlowLayout());  
	        JLabel label = new JLabel("JFrame By Example");  
	        JButton button = new JButton();  
	        button.setText("Button");  
	        panel.add(label);  
	        panel.add(button);  
	        frame.add(panel);  
	        frame.setSize(200, 300);  
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        frame.setVisible(true);  
		
		
		
		
	}

}
