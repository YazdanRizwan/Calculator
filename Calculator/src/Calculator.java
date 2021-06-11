import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	
	double first;
	double second;
	double result;
	String operation;
	String finalResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 281, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(10, 11, 245, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton_5 = new JButton("/");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setBounds(135, 69, 55, 47);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("*");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6.setBounds(197, 69, 55, 47);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("CE");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBounds(10, 69, 55, 47);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton.getText();
				textField.setText(num);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(10, 127, 55, 47);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(71, 127, 55, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(132, 127, 55, 47);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_3.getText();
				textField.setText(num);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(10, 185, 55, 47);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_4.getText();
				textField.setText(num);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(71, 185, 55, 47);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_8 = new JButton("6");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_8.getText();
				textField.setText(num);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_8.setBounds(132, 185, 55, 47);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("1");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_9.getText();
				textField.setText(num);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_9.setBounds(10, 243, 55, 47);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("2");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_10.getText();
				textField.setText(num);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBounds(71, 243, 55, 47);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("3");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_11.getText();
				textField.setText(num);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_11.setBounds(132, 243, 55, 47);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_12.setBounds(197, 127, 55, 47);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("+");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_13.setBounds(197, 185, 55, 47);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_14.setBounds(197, 301, 55, 47);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("00");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_15.getText();
				textField.setText(num);
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_15.setBounds(71, 301, 55, 47);
		frame.getContentPane().add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("0");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_16.getText();
				textField.setText(num);
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_16.setBounds(10, 301, 55, 47);
		frame.getContentPane().add(btnNewButton_16);
		
		btnNewButton_17 = new JButton(".");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btnNewButton_17.getText();
				textField.setText(num);
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_17.setBounds(132, 301, 55, 47);
		frame.getContentPane().add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("%");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_18.setBounds(197, 243, 55, 47);
		frame.getContentPane().add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("\uf0e7");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder (textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					b=str.toString();
					textField.setText(b);
				}
			}
		});
		btnNewButton_19.setFont(new Font("windings", Font.BOLD, 18));
		btnNewButton_19.setBounds(70, 69, 55, 47);
		frame.getContentPane().add(btnNewButton_19);
	}
}
