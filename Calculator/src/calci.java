import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;
	private JTextField textField;
	private JButton btnBackspace;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnClear;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnDot;
	private JButton btn00;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnEqual;
	private JButton btnPlus;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDivide;
	private JButton btnPercent;
	
	double first;
	double second;
	double result;
	String answer;
	String operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getBtnBackspace());
		frame.getContentPane().add(getBtn7());
		frame.getContentPane().add(getBtn4());
		frame.getContentPane().add(getBtn1());
		frame.getContentPane().add(getBtn0());
		frame.getContentPane().add(getBtnClear());
		frame.getContentPane().add(getBtn8());
		frame.getContentPane().add(getBtn5());
		frame.getContentPane().add(getBtn2());
		frame.getContentPane().add(getBtnDot());
		frame.getContentPane().add(getBtn00());
		frame.getContentPane().add(getBtn9());
		frame.getContentPane().add(getBtn6());
		frame.getContentPane().add(getBtn3());
		frame.getContentPane().add(getBtnEqual());
		frame.getContentPane().add(getBtnPlus());
		frame.getContentPane().add(getBtnSub());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnDivide());
		frame.getContentPane().add(getBtnPercent());
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(21, 21, 216, 52);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnBackspace() {
		if (btnBackspace == null) {
			btnBackspace = new JButton("\u2190");
			btnBackspace.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String backSpace = null;
					if(textField.getText().length()>0)
					{
						StringBuilder str = new StringBuilder(textField.getText());
						str.deleteCharAt(textField.getText().length()-1);
						backSpace = str.toString();
						textField.setText(backSpace);
					}
				}
			});
			btnBackspace.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnBackspace.setBounds(22, 78, 53, 45);
		}
		return btnBackspace;
	}
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn7.getText();
					textField.setText(number);
				}
			});
			btn7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn7.setBounds(22, 124, 53, 45);
		}
		return btn7;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn4.getText();
					textField.setText(number);
				}
			});
			btn4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn4.setBounds(22, 171, 53, 45);
		}
		return btn4;
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn1.getText();
					textField.setText(number);
				}
			});
			btn1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn1.setBounds(22, 217, 53, 45);
		}
		return btn1;
	}
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn0.getText();
					textField.setText(number);
				}
			});
			btn0.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn0.setBounds(22, 262, 53, 45);
		}
		return btn0;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("C");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(null);
				}
			});
			btnClear.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnClear.setBounds(76, 78, 53, 45);
		}
		return btnClear;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn8.getText();
					textField.setText(number);
				}
			});
			btn8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn8.setBounds(76, 124, 53, 45);
		}
		return btn8;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn5.getText();
					textField.setText(number);
				}
			});
			btn5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn5.setBounds(76, 171, 53, 45);
		}
		return btn5;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn2.getText();
					textField.setText(number);
				}
			});
			btn2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn2.setBounds(75, 217, 53, 45);
		}
		return btn2;
	}
	private JButton getBtnDot() {
		if (btnDot == null) {
			btnDot = new JButton(".");
			btnDot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btnDot.getText();
					textField.setText(number);
				}
			});
			btnDot.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btnDot.setBounds(75, 262, 53, 45);
		}
		return btnDot;
	}
	private JButton getBtn00() {
		if (btn00 == null) {
			btn00 = new JButton("00");
			btn00.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn00.getText();
					textField.setText(number);
				}
			});
			btn00.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btn00.setBounds(130, 78, 53, 45);
		}
		return btn00;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn9.getText();
					textField.setText(number);
				}
			});
			btn9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn9.setBounds(130, 124, 53, 45);
		}
		return btn9;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn6.getText();
					textField.setText(number);
				}
			});
			btn6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn6.setBounds(130, 171, 53, 45);
		}
		return btn6;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = textField.getText()+btn3.getText();
					textField.setText(number);
				}
			});
			btn3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btn3.setBounds(129, 217, 53, 45);
		}
		return btn3;
	}
	private JButton getBtnEqual() {
		if (btnEqual == null) {
			btnEqual = new JButton("=");
			btnEqual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String answer;
					second=Double.parseDouble(textField.getText());
					
					if(operation=="+")
					{
						result = first+second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					}
					
					else if(operation=="-")
					{
						result = first-second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					}
					
					else if(operation=="*")
					{
						result = first*second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					}
					
					else if(operation=="/")
					{
						result = first/second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					}
					
					else if(operation=="%")
					{
						result = first%second;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					}
					
				}
			});
			btnEqual.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btnEqual.setBounds(129, 262, 53, 45);
		}
		return btnEqual;
	}
	private JButton getBtnPlus() {
		if (btnPlus == null) {
			btnPlus = new JButton("+");
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation ="+";
				}
			});
			btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnPlus.setBounds(183, 78, 53, 45);
		}
		return btnPlus;
	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation ="-";
				}
			});
			btnSub.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnSub.setBounds(183, 124, 53, 45);
		}
		return btnSub;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("*");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation ="*";
				}
			});
			btnMul.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnMul.setBounds(183, 171, 53, 45);
		}
		return btnMul;
	}
	private JButton getBtnDivide() {
		if (btnDivide == null) {
			btnDivide = new JButton("/");
			btnDivide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation ="/";
				}
			});
			btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnDivide.setBounds(182, 217, 53, 45);
		}
		return btnDivide;
	}
	private JButton getBtnPercent() {
		if (btnPercent == null) {
			btnPercent = new JButton("%");
			btnPercent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operation ="%";
				}
			});
			btnPercent.setFont(new Font("Times New Roman", Font.BOLD, 15));
			btnPercent.setBounds(182, 262, 53, 45);
		}
		return btnPercent;
	}
}
