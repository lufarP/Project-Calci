package Project.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Calculator
	{

		private JFrame frmCalculator;
		private JTextField textField;
		// private String expression;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args)
			{
				EventQueue.invokeLater(new Runnable()
					{
						public void run()
							{
								try
									{
										Calculator window = new Calculator();
										window.frmCalculator.setVisible(true);
									} catch (Exception e)
									{
										e.printStackTrace();
									}
							}
					});
			}

		/**
		 * Create the application.
		 */
		public Calculator()
			{
				initialize();
			}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize()
			{
				frmCalculator = new JFrame();
				frmCalculator.setTitle("Calculator");
				frmCalculator.setBounds(100, 100, 450, 312);
				frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frmCalculator.getContentPane().setLayout(null);
				frmCalculator.setResizable(false);
				textField = new JTextField();
				textField.addKeyListener(new KeyAdapter()
					{
						@Override
						public void keyPressed(KeyEvent e)
							{
								if (e.getKeyCode() == KeyEvent.VK_ENTER)
									{
										try
											{
												calculate();
											} catch (ScriptException e1)
											{
												// TODO Auto-generated catch
												// block
												e1.printStackTrace();
											}
									}
							}
					});

				textField.setBounds(10, 11, 414, 62);
				frmCalculator.getContentPane().add(textField);
				textField.setColumns(10);

				JButton seven = new JButton("7");

				seven.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "7");

							}
					});
				seven.setBounds(10, 98, 48, 32);
				frmCalculator.getContentPane().add(seven);

				JButton four = new JButton("4");
				four.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "4");
							}
					});
				four.setBounds(10, 141, 48, 32);
				frmCalculator.getContentPane().add(four);

				JButton one = new JButton("1");
				one.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "4");
							}
					});
				one.setBounds(10, 184, 48, 32);
				frmCalculator.getContentPane().add(one);

				JButton five = new JButton("5");
				five.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "5");
							}
					});
				five.setBounds(70, 141, 48, 32);
				frmCalculator.getContentPane().add(five);

				JButton two = new JButton("2");
				two.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "2");
							}
					});
				two.setBounds(70, 184, 48, 32);
				frmCalculator.getContentPane().add(two);

				JButton six = new JButton("6");
				six.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "6");
							}
					});
				six.setBounds(130, 141, 48, 32);
				frmCalculator.getContentPane().add(six);

				JButton eight = new JButton("8");
				eight.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "8");
							}
					});
				eight.setBounds(70, 98, 48, 32);
				frmCalculator.getContentPane().add(eight);

				JButton nine = new JButton("9");
				nine.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "9");

							}
					});
				nine.setBounds(130, 98, 48, 32);
				frmCalculator.getContentPane().add(nine);

				JButton three = new JButton("3 ");
				three.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + "3");
							}
					});
				three.setBounds(130, 184, 48, 32);
				frmCalculator.getContentPane().add(three);

				JButton add = new JButton("+");
				add.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + " + ");
							}
					});
				add.setBounds(188, 141, 48, 32);
				frmCalculator.getContentPane().add(add);

				JButton subtract = new JButton("-");
				subtract.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								textField.setText(textField.getText() + " - ");
							}
					});
				subtract.setBounds(188, 98, 48, 32);
				frmCalculator.getContentPane().add(subtract);

				JButton divide = new JButton("/");
				divide.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								textField.setText(textField.getText() + " / ");

							}
					});
				divide.setBounds(246, 98, 48, 32);
				frmCalculator.getContentPane().add(divide);

				JButton btnXor = new JButton("XOR");
				btnXor.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								textField.setText(textField.getText() + " ^ ");

							}
					});
				btnXor.setBounds(336, 227, 74, 32);
				frmCalculator.getContentPane().add(btnXor);

				JButton zero = new JButton("0");

				zero.addActionListener(new ActionListener()
					{

						public void actionPerformed(ActionEvent e)
							{
								textField.setText(textField.getText() + "0");
							}
					});
				zero.setBounds(70, 227, 48, 32);
				frmCalculator.getContentPane().add(zero);

				JButton open = new JButton("(");
				open.setBounds(10, 227, 48, 32);
				frmCalculator.getContentPane().add(open);

				JButton product = new JButton("*");
				product.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								textField.setText(textField.getText() + " * ");

							}
					});
				product.setBounds(246, 141, 48, 32);
				frmCalculator.getContentPane().add(product);

				JButton equals = new JButton("=");
				equals.setBackground(Color.LIGHT_GRAY);
				equals.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{

								try
									{
										calculate();
									} catch (ScriptException e1)
									{
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

							}
					});
				equals.setBounds(188, 184, 48, 32);
				frmCalculator.getContentPane().add(equals);

				JButton btnOr = new JButton("OR");
				btnOr.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								textField.setText(textField.getText() + " | ");
							}
					});
				btnOr.setBounds(268, 227, 58, 32);
				frmCalculator.getContentPane().add(btnOr);

				JButton btnAnd = new JButton("AND");
				btnAnd.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								textField.setText(textField.getText() + " & ");
							}
					});
				btnAnd.setBounds(188, 227, 58, 32);
				frmCalculator.getContentPane().add(btnAnd);

				JButton remainder = new JButton("%");
				remainder.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								textField.setText(textField.getText() + " % ");

							}
					});
				remainder.setBounds(246, 184, 48, 32);
				frmCalculator.getContentPane().add(remainder);

				JButton clear = new JButton("C");
				clear.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
							{
								textField.setText("");

							}
					});
				clear.setBounds(362, 98, 48, 32);
				frmCalculator.getContentPane().add(clear);

				JButton closes = new JButton(")");
				closes.setBounds(130, 227, 48, 32);
				frmCalculator.getContentPane().add(closes);
			}

		private void calculate() throws ScriptException
			{
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");

				try{
					textField.setText("" + engine.eval(textField.getText()));
					}
				catch(ScriptException se)
				
					{
						textField.setText("Wrong Expression");
						try
							{
								Thread.sleep(1000);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			}
	}
	}
