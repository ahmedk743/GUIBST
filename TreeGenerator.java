import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.HashMap;

public class TreeGenerator {
//	private boolean tree
	private HashMap<Integer, Integer> code;
	private int []arr_code;
	public TreeGenerator() {
		arr_code = new int[] {0, -2, -1, -6, 1, 3, -4, -12, -10, 9, -20, -5, 6, 2, -9};
		code = new HashMap<Integer, Integer>();
	}
	public void setCode(HashMap<Integer, Integer> code) {
		this.code = code;
	}
	public void draw(Graphics2D g) {
		g.getFontRenderContext();
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(3));
		g.setFont(new Font("monospace", Font.BOLD, 10));
		
//		String str = String.valueOf(code.keySet());
//		for(int i = 0; i < arr_code.length; i++) {
			if(code.containsKey(arr_code[0])) {
				//root
				g.drawOval(600, 95, 30, 30);//1
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[0]))), 607, 115);			
			}
			if(code.containsKey(arr_code[1])) {
//				level1
				g.setColor(Color.BLACK);
				g.drawLine(470, 195, 605, 120);//leftLine  (+50inX)
				g.drawOval(450, 195, 30, 30);//2
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[1]))), 457, 215);//(+7, +20)
			}
			if(code.containsKey(arr_code[2])) {
				g.setColor(Color.BLACK);
				g.drawLine(760, 195, 625, 120);//right Line  (+50inX)
				g.drawOval(750, 195, 30, 30);//3
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[2]))), 757, 215);
			}
			if(code.containsKey(arr_code[3])) {
				g.setColor(Color.BLACK);
				g.drawLine(390, 295, 455, 225);//leftLine
				g.drawOval(370, 295, 30, 30);
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[3]))), 377, 315);
			}
			if(code.containsKey(arr_code[4])) {
				g.setColor(Color.BLACK);
				g.drawLine(540, 295, 475, 225);//right Line
				g.drawOval(530, 295, 30, 30);
				g.drawString((String.valueOf(code.get(arr_code[4]))), 537, 315);
			}
			if(code.containsKey(arr_code[5])) {
				g.setColor(Color.BLACK);
				g.drawLine(700, 295, 755, 225);//leftLine
				g.drawOval(690, 295, 30, 30);//(x+30ooper waly se)
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[5]))), 697, 315);
			}
			if(code.containsKey(arr_code[6])) {
				g.setColor(Color.BLACK);
				g.drawLine(850, 295, 775, 225);//right Line
				g.drawOval(830, 295, 30, 30);//(x+140ooper waly se)
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[6]))), 837, 315);
			}
			if(code.containsKey(arr_code[7])) {
				g.setColor(Color.BLACK);
				g.drawLine(340, 395, 375, 325);//leftLine
				g.drawOval(320, 395, 30, 30);
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[7]))), 327, 415);
			}
			if(code.containsKey(arr_code[8])) {
				g.setColor(Color.BLACK);
				g.drawLine(445, 395, 395, 325);//right Line
				g.drawOval(430, 395, 30, 30);
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[8]))), 437, 415);
			}
			if(code.containsKey(arr_code[9])) {
				g.setColor(Color.BLACK);
				g.drawLine(650, 395, 700, 325);//leftLine
				g.drawOval(640, 395, 30, 30);//(x+30ooper waly se)
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[9]))), 647, 415);
			}
			if(code.containsKey(arr_code[10])) {
				g.setColor(Color.BLACK);
				g.drawLine(750, 395, 715, 325);//right Line
				g.drawOval(730, 395, 30, 30);//(x+140ooper waly se)
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[10]))), 737, 415);
			}
			if(code.containsKey(arr_code[11])) {
				g.setColor(Color.BLACK);
				g.drawLine(490, 395, 535, 325);//leftLine
				g.drawOval(470, 395, 30, 30);
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[11]))), 477, 415);
			}
			if(code.containsKey(arr_code[12])) {
				g.setColor(Color.BLACK);
				g.drawLine(595, 395, 545, 325);//right Line
				g.drawOval(580, 395, 30, 30);
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[12]))), 587, 415);
			}
			if(code.containsKey(arr_code[13])) {
				g.setColor(Color.BLACK);
				g.drawLine(800, 395, 845, 325);//leftLine
				g.drawOval(790, 395, 30, 30);//(x+30ooper waly se)
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[13]))), 797, 415);
			}
			if(code.containsKey(arr_code[14])) {
				g.setColor(Color.BLACK);
				g.drawLine(900, 395, 855, 325);//right Line
				g.drawOval(880, 395, 30, 30);//(x+140ooper waly se)
				g.setColor(Color.RED);
				g.drawString((String.valueOf(code.get(arr_code[14]))), 887, 415);
			}
//		}
		
		

		
//		level1
//		g.drawLine(470, 195, 605, 120);//leftLine  (+50inX)
//		g.drawOval(450, 195, 30, 30);//2
//		g.drawString("02", 457, 215);//(+7, +20)
//		
//		g.drawLine(760, 195, 625, 120);//right Line  (+50inX)
//		g.drawOval(750, 195, 30, 30);//3
//		g.drawString("03", 757, 215);
//		
////		//level2
////				g.drawLine(420, 295, 505, 225);//leftLine
////				g.drawOval(400, 295, 30, 30);
////				g.drawString("04", 407, 315);
////				
////				g.drawLine(610, 295, 525, 225);//right Line
////				g.drawOval(600, 295, 30, 30);
////				g.drawString("22", 607, 315);
//		
////		//level2////////////////////////
//		g.drawLine(390, 295, 455, 225);//leftLine
//		g.drawOval(370, 295, 30, 30);
//		g.drawString("04", 377, 315);
//		
//		g.drawLine(540, 295, 475, 225);//right Line
//		g.drawOval(530, 295, 30, 30);
//		g.drawString("05", 537, 315);
////		
//		g.drawLine(700, 295, 755, 225);//leftLine
//		g.drawOval(690, 295, 30, 30);//(x+30ooper waly se)
//		g.drawString("06", 697, 315);
//		
//		g.drawLine(850, 295, 775, 225);//right Line
//		g.drawOval(830, 295, 30, 30);//(x+140ooper waly se)
//		g.drawString("07", 837, 315);
//		
//		//level3////////////////////////
//		g.drawLine(340, 395, 375, 325);//leftLine
//		g.drawOval(320, 395, 30, 30);
//		g.drawString("08", 327, 415);
//		
//		g.drawLine(445, 395, 395, 325);//right Line
//		g.drawOval(430, 395, 30, 30);
//		g.drawString("09", 437, 415);
////		
//		g.drawLine(650, 395, 700, 325);//leftLine
//		g.drawOval(640, 395, 30, 30);//(x+30ooper waly se)
//		g.drawString("12", 647, 415);
//		
//		g.drawLine(750, 395, 715, 325);//right Line
//		g.drawOval(730, 395, 30, 30);//(x+140ooper waly se)
//		g.drawString("13", 737, 415);
////		
//		g.drawLine(490, 395, 535, 325);//leftLine
//		g.drawOval(470, 395, 30, 30);
//		g.drawString("10", 477, 415);
//		
//		g.drawLine(595, 395, 545, 325);//right Line
//		g.drawOval(580, 395, 30, 30);
//		g.drawString("11", 587, 415);
//////		
//		g.drawLine(800, 395, 845, 325);//leftLine
//		g.drawOval(790, 395, 30, 30);//(x+30ooper waly se)
//		g.drawString("14", 797, 415);
//		
//		g.drawLine(900, 395, 855, 325);//right Line
//		g.drawOval(880, 395, 30, 30);//(x+140ooper waly se)
//		g.drawString("15", 887, 415);
	}
}
