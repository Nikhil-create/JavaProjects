package first;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class calculator {

	private JFrame frame;
	String str=new String("");
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,oadd,osub,ocal,omul,odiv,oclear;
	JTextField tf;
	


	
	public calculator() {
		frame=new JFrame("Calculator");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setBounds(300,300,320,350);
		 tf=new JTextField();
		tf.setBounds(10, 10, 280, 40);
		//tf.setBackground(Color.black);
		//tf.setForeground(Color.white);
		frame.add(tf);
		b1=new JButton("1");
		b1.setBounds(20, 60, 45, 45);
		b1.setBackground(Color.WHITE);
		frame.add(b1);
		
		b2=new JButton("2");
		b2.setBounds(90, 60, 45, 45);
		b2.setBackground(Color.WHITE);
		frame.add(b2);
		
		b3=new JButton("3");
		b3.setBounds(160, 60, 45, 45);
		b3.setBackground(Color.WHITE);
		frame.add(b3);
		
		oadd=new JButton("+");
		oadd.setBounds(230, 60, 45, 45);
		oadd.setBackground(Color.yellow);
		frame.add(oadd); 
		
		b4=new JButton("4");
		b4.setBounds(20, 120, 45, 45);
		b4.setBackground(Color.WHITE);
		frame.add(b4);
		
		b5=new JButton("5");
		b5.setBounds(90, 120, 45, 45);
		b5.setBackground(Color.WHITE);
		frame.add(b5);
		
		b6=new JButton("6");
		b6.setBounds(160, 120, 45, 45);
		b6.setBackground(Color.WHITE);
		frame.add(b6);
		
		osub=new JButton("-");
		osub.setBounds(230, 120, 45, 45);
		osub.setBackground(Color.yellow);
		frame.add(osub);  
		
		b7=new JButton("7");
		b7.setBounds(20, 180, 45, 45);
		b7.setBackground(Color.WHITE);
		frame.add(b7);
		
		b8=new JButton("8");
		b8.setBounds(90, 180, 45, 45);
		b8.setBackground(Color.WHITE);
		frame.add(b8);
		
		b9=new JButton("9");
		b9.setBounds(160, 180, 45, 45);
		b9.setBackground(Color.WHITE);
		frame.add(b9);
		
		omul=new JButton("*");
		omul.setBounds(230, 180, 45, 45);
		omul.setBackground(Color.yellow);
		frame.add(omul);  
		
		oclear=new JButton("C");
		oclear.setBounds(20, 240, 45, 45);
		oclear.setBackground(Color.red);
		frame.add(oclear);
		
		b0=new JButton("0");
		b0.setBounds(90, 240, 45, 45);
		b0.setBackground(Color.WHITE);
		frame.add(b0);
		
		ocal=new JButton("=");
		ocal.setBounds(160, 240, 45, 45);
		ocal.setBackground(Color.green);
		frame.add(ocal);
		
		odiv=new JButton("/");
		odiv.setBounds(230, 240, 45, 45);
		odiv.setBackground(Color.yellow);
		frame.add(odiv);  
		
		 b0.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"0");  
			    }  
			    });
		 b1.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"1");  
			    }  
			    });
		 b2.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"2");  
			    }  
			    });
		 b3.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"3");  
			    }  
			    });
		 b4.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"4");  
			    }  
			    });
		 b5.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"5");  
			    }  
			    });
		 b6.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"6");  
			    }  
			    });
		 b7.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"7");  
			    }  
			    });
		 b8.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"8");  
			    }  
			    });
		 b9.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"9");  
			    }  
			    });
		 
		 //----------------------------operators---------------------
		 
		 oclear.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText("");  
			    }  
			    });
		 oadd.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"+");  
			    }  
			    });
		 osub.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"-");  
			    }  
			    });
		 odiv.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"/");  
			    }  
			    });
		 omul.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			          tf.setText(tf.getText()+"*");  
			    }  
			    });
		 ocal.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			         str=tf.getText();
			         int value=Calculate(str);
			         tf.setText(Integer.toString(value));
			    }

				private Integer Calculate(String str) {
					// TODO Auto-generated method stub
					char[] tokens = str.toCharArray();
					Stack<Integer> values = new Stack<Integer>();
					Stack<Character> ops = new Stack<Character>();
					 for (int i = 0; i < tokens.length; i++)
				        {
				            if (tokens[i] == ' ')
				                continue;
				            if (tokens[i] >= '0' && 
				                 tokens[i] <= '9')
				            {
				                StringBuffer sbuf = new
				                            StringBuffer();
				                while (i < tokens.length && 
				                        tokens[i] >= '0' && 
				                          tokens[i] <= '9')
				                    sbuf.append(tokens[i++]);
				                values.push(Integer.parseInt(sbuf.
				                                      toString()));
				           
				                  i--;
				            }
				            else if (tokens[i] == '(')
				                ops.push(tokens[i]);
				 
				            else if (tokens[i] == ')')
				            {
				                while (ops.peek() != '(')
				                  values.push(applyOp(ops.pop(), 
				                                   values.pop(), 
				                                 values.pop()));
				                ops.pop();
				            }
				            else if (tokens[i] == '+' || 
				                     tokens[i] == '-' ||
				                     tokens[i] == '*' || 
				                        tokens[i] == '/')
				            {
				                
				                while (!ops.empty() && 
				                       hasPrecedence(tokens[i], 
				                                    ops.peek()))
				                  values.push(applyOp(ops.pop(), 
				                                   values.pop(),
				                                 values.pop()));
				 
				                
				                ops.push(tokens[i]);
				            }
				        }
				 
				        while (!ops.empty())
				            values.push(applyOp(ops.pop(), 
				                             values.pop(), 
				                           values.pop()));
				 
				        return values.pop();
				    }
				 
				  
				    private boolean hasPrecedence(
				                           char op1, char op2)
				    {
				        if (op2 == '(' || op2 == ')')
				            return false;
				        if ((op1 == '*' || op1 == '/') && 
				            (op2 == '+' || op2 == '-'))
				            return false;
				        else
				            return true;
				    }
				    public int applyOp(char op, 
				                           int b, int a)
				    {
				        switch (op)
				        {
				        case '+':
				            return a + b;
				        case '-':
				            return a - b;
				        case '*':
				            return a * b;
				        case '/':
				            if (b == 0)
				                throw new
				                UnsupportedOperationException(
				                      "Cannot divide by zero");
				            return a / b;
				        }
				        return 0;
				    }
					
				 
			    });
	}
		
	public static void main(String[] args) {
		new calculator();
	}
	
}