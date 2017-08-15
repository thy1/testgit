package com.c10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
/**
 *   
 * @author user01
 *
 */
public class Calculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private String name="";
	private String name2="";
	private Integer symbol=0;
	private String result="";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("\u8BA1\u7B97\u673A");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(Color.RED);

		//textPane.setAlignment(attr, a);
		textPane.setBounds(10, 10, 292, 27);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "1";
					}else {
						name2 =name2+"1";
					}
				}else {
					if(name =="") {
						name = "1";
					}else {
						name =name+"1";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		btnNewButton.setBounds(10, 47, 87, 35);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "2";
					}else {
						name2 =name2+"2";
					}
				}else {
					if(name =="") {
						name = "2";
					}else {
						name =name+"2";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button.setBounds(112, 47, 87, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "3";
					}else {
						name2 =name2+"3";
					}
				}else {
					if(name =="") {
						name = "3";
					}else {
						name =name+"3";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_1.setBounds(215, 47, 87, 35);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol == 0) {
					symbol=1;
				}else {
					//计算结果
				}
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_2.setBounds(313, 47, 62, 35);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "4";
					}else {
						name2 =name2+"4";
					}
				}else {
					if(name =="") {
						name = "4";
					}else {
						name =name+"4";
					}
				}
				
		
				textPane.setText(name+""+fhao(symbol)+""+name2);				
			}
		});
		button_3.setBounds(10, 92, 87, 35);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "5";
					}else {
						name2 =name2+"5";
					}
				}else {
					if(name =="") {
						name = "5";
					}else {
						name =name+"5";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_4.setBounds(112, 92, 87, 35);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "6";
					}else {
						name2 =name2+"6";
					}
				}else {
					if(name =="") {
						name = "6";
					}else {
						name =name+"6";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_5.setBounds(215, 92, 87, 35);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(symbol == 0) {
					symbol=2;
				}else {
					//计算结果
				}
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_6.setBounds(313, 92, 62, 35);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "7";
					}else {
						name2 =name2+"7";
					}
				}else {
					if(name =="") {
						name = "7";
					}else {
						name =name+"7";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_7.setBounds(10, 137, 87, 35);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "8";
					}else {
						name2 =name2+"8";
					}
				}else {
					if(name =="") {
						name = "8";
					}else {
						name =name+"8";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_8.setBounds(112, 137, 87, 35);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "9";
					}else {
						name2 =name2+"9";
					}
				}else {
					if(name =="") {
						name = "9";
					}else {
						name =name+"9";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_9.setBounds(215, 137, 87, 35);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol == 0) {
					symbol=3;
				}else {
					//计算结果
				}
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_10.setBounds(313, 137, 62, 35);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = "0";
					}else {
						name2 =name2+"0";
					}
				}else {
					if(name =="") {
						name = "0";
					}else {
						name =name+"0";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_11.setBounds(10, 182, 87, 35);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(symbol > 0) {	
					if(name2 =="") {
						name2 = ".";
					}else {
						name2 =name2+".";
					}
				}else {
					if(name =="") {
						name = ".";
					}else {
						name =name+".";
					}
				}
				
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_12.setBounds(112, 182, 87, 35);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 switch (symbol) {
				 case 0:
		                break;

		         case 1:
		        	 result=""+(Integer.parseInt(name)+Integer.parseInt(name2));
		        	 name=result;
		        	 name2="";
		        	 symbol=0;
		        	 textPane.setText(name);
		                break;

		         case 2:
		        	 result=""+(Integer.parseInt(name)-Integer.parseInt(name2));
		        	 name=result;
		        	 name2=""; 
		        	 symbol=0;
		        	 textPane.setText(name);
		                break;

		          case 3:
		        	  	 result=""+(Integer.parseInt(name)*Integer.parseInt(name2));
			        	 name=result;
			        	 name2="";
			        	 symbol=0;
			        	 textPane.setText(name);
		        	  
		                break;
		          case 4:
		        	  result=""+(Integer.parseInt(name)/Integer.parseInt(name2));
			        	 name=result;
			        	 name2="";
			        	 symbol=0;
			        	 textPane.setText(name);
		                break;
				 
				 
				 
				 }
				
			}
		});
		button_13.setBounds(215, 182, 87, 35);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(symbol == 0) {
					symbol=4;
				}else {
					
				}
				
				textPane.setText(name+""+fhao(symbol)+""+name2);
			}
		});
		button_14.setBounds(313, 182, 62, 35);
		contentPane.add(button_14);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name="";
				name2="";
				symbol=0;
				textPane.setText("");
				
			}
		});
		btnNewButton_1.setBounds(312, 10, 62, 27);
		contentPane.add(btnNewButton_1);
	}

	public String fhao(int f) {
		 switch (f) {
		 case 0:
			 return "";

         case 1:
        	 return "+";
            
         case 2:
        	 return "-";
              
          case 3:
        	  return "*";
               
          case 4:
        	  return "/";

		 }
		 return "";
	}
}
