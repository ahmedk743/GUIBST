import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DrawTree extends JPanel implements KeyListener, ActionListener{
	private static final long serialVersionUID = 4657341532426646510L;
	private final TreeGenerator tree;
	private final Timer timer;
    private final int delay = 6;
    private final boolean main_menu = true;
    public static boolean flag;
    static {flag = true;}
    private final ArrayList<Integer> arr;
    TreeAlgorithm bstree = new TreeAlgorithm();
    
	public DrawTree(final ArrayList<Integer> arr){
		this.arr = arr;
		tree = new TreeGenerator();
		addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
        timer.start();
	}
//	public void setTree(TreeGenerator tree) {
//		this.tree = tree;
//	}
	public void paint(final Graphics g){
		if(main_menu){
//			jf.setLayout(null);
//			
//			jb1.setText("CREATETREE");
//	        jb1.setBounds(500, 600, 180, 30);
//	        jf.add(jb1);
//	        g.setFont(new Font("serif", Font.BOLD, 25));
//			g.drawString("Select any of Options Below!", 300, 350);
//			g.setFont(new Font("serif", Font.BOLD, 12));
			
		}
//		else {
//		if(flag) {
			bstree.createTree(arr);
			tree.setCode(bstree.getCode());
//		}
			tree.draw((Graphics2D)g);
			g.dispose();
//		}
	}
	@Override
	public void actionPerformed(final ActionEvent e) {
		timer.start();
//		bstree.createTree(arr);
//		tree.setCode(bstree.getCode());
		
		repaint();
	}

	@Override
	public void keyPressed(final KeyEvent arg0) {}

	@Override
	public void keyReleased(final KeyEvent arg0) {}

	@Override
	public void keyTyped(final KeyEvent arg0) {}
	
}
