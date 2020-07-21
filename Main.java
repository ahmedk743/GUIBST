import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.*;
public class Main
{
	private static boolean flag = false;
	private static ArrayList<Integer> arr = new ArrayList<Integer>(15);
	private static JTextField tf1 = new JTextField();
	private static JFrame jf = new JFrame();
	private static JFrame jf2 = new JFrame();
	private static JButton jb1 = new JButton();
    public static void main(String[] args) 
    {
//    	TreeAlgorithm bstree = new TreeAlgorithm();
//    	TreeGenerator tree = new TreeGenerator();
    	JPanel jp = new JPanel();
    	JPanel jp2 = new JPanel();
    	jp.setBounds(5, 5, 150, 755);
    	jp.setBackground(Color.YELLOW);
    	
    	jp2.setBounds(175, 5, 1100, 755);
    	jp2.setBackground(Color.LIGHT_GRAY);
    	
    	JLabel l1 = new JLabel("Assalam-O-Alaikum To Every Buddy.");
    	l1.setForeground(Color.BLACK);
        l1.setFont(new Font("monospace", Font.BOLD, 15));
        JLabel l2 = new JLabel("Here on the TextField you can Enter Data for");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Purisa", Font.BOLD, 15));
        JLabel l3 = new JLabel("BST by Placing a Space in Between them.");
        l3.setForeground(Color.DARK_GRAY);
        l3.setFont(new Font("Purisa", Font.BOLD, 15));
        JLabel l4 = new JLabel("Enjoy Then, by Clicking CreateTree Button...");
        l4.setForeground(Color.GRAY);
        l4.setFont(new Font("Purisa", Font.BOLD, 15));
        
        jf.setLayout(null);
        jb1.setText("CREATETREE");
        jb1.setBounds(170, 520, 130, 30);
        tf1.setBounds(20, 470, 450, 30);
        
//        jp.setLayout(null);
//        jp.add(l2);
//        jp.add(jb1);
//        jp.add(tf1);
        
        tf1.setFont(new Font("Purisa", Font.BOLD, 20));

        jf.setBounds(10, 30, 500, 800);
        jf.setTitle("BinarySearchTree:INPUT");
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jf2.setBounds(510, 30, 1080, 800);
        jf2.setTitle("BinarySearchTree:OUTPUT");
        jf2.setResizable(false);
        jf2.setVisible(true);
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        jf.add(jp);
//        jf.add(jp2);
        
       
//        jb1.setText("CREATETREE");
//        jb1.setBounds(545, 450, 180, 30);
//        tf1.setBounds(450, 400, 380, 45);
        
        l1.setBounds(65, 150, 400, 30);
        l2.setBounds(30, 200, 400, 30);
        l3.setBounds(50, 250, 400, 40);
        l4.setBounds(40, 300, 400, 40);
        
        
        jf.add(l1);
        jf.add(l2);
        jf.add(l3);
        jf.add(l4);
        
        jf.add(tf1);
        jf.add(jb1);
//       jf.setOpacity(-23);
        
        jb1.addActionListener(new MyHandler());
//        if(flag) {
//        	jf.remove(jb1);
//    		jf.remove(l1);	
//        }
//        
        
//        jf.setLayout(null);
        //Getting from User & Setting up Data (For TREE) in DrawTree 
//        jp2.setLayout(null);
        DrawTree drawTree = new DrawTree(arr);
//        drawTree.setTree(tree);
        jf2.add(drawTree);
        
    }
    static class MyHandler implements ActionListener{
		

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String str = new String(tf1.getText());
			String tempstr;
			char[] chararr = new char[2];
			for(int i = 0; i < str.length(); i++) {
	    		if(str.charAt(i) == ' ') continue;
	    		else {
	    			if(i!=str.length()-1) {
	    				if(str.charAt(i+1) != ' ') {
		    				chararr[0] = str.charAt(i);
		    				chararr[1] = str.charAt(++i);
		    				tempstr = String.valueOf(chararr[0]);
		    				arr.add(Integer.parseInt(tempstr.concat(String.valueOf(chararr[1])))); 
		    			}
		    			else {
		    				chararr[0] = str.charAt(i);
		    				arr.add(Integer.parseInt(String.valueOf(chararr[0])));
		    			}
	    			}
	    			else {
	    				chararr[0] = str.charAt(i);
	    				arr.add(Integer.parseInt(String.valueOf(chararr[0])));
	    			}
	    				
	    		}
	    	}
			flag = true;
		}
	}
}
