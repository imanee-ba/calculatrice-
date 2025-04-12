package ex8;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
class calculatrice extends JFrame{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,begal,bsomme,bc,bsoust,bmul,bdiv,a,b,c,d,E,f,bcos,bsin,btan,bexpo,blog,bln,barctan,barccos,barcsin,pi,carre,cube,racine,abs,cosh,sinh,tanh,pow;
	int x,y;
	String operation ;
	JButton and,or,xor;
	JPanel pn1,pn2; 
	JLabel lb;
	 
	calculatrice(){
		setTitle("calculatrice");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,500);
		getContentPane().setLayout(null);
		b1=new JButton("1");           b2=new JButton("2");   a=new JButton("A");  bcos=new JButton("Cos");  barccos=new JButton("Arccos");     pow=new JButton("Pow");
		b0=new JButton("0");           b3=new JButton("3");    b=new JButton("B"); bsin=new JButton("Sin");	  barcsin=new JButton("Arcsin");  racine=new JButton("Racine");
		b4=new JButton("4");           b5=new JButton("5");   c=new JButton("C");  bexpo=new JButton("expo");  barctan=new JButton("Arctan");  abs=new JButton("abs");
		b6=new JButton("6");           b7=new JButton("7");   d=new JButton("D");  blog=new JButton("Log");    pi=new JButton("pi");           cosh=new JButton("Cosh");
		b8=new JButton("8");           b9=new JButton("9");   E=new JButton("E");  bln=new JButton("Ln");      carre=new JButton("^2");         sinh=new JButton("Sinh");
		bsoust=new JButton("-");       bmul=new JButton("*"); f=new JButton("F");  btan=new JButton("Tang");   cube=new JButton("^3");             tanh=new JButton("Tanh");
		bdiv=new JButton("%"); 
		bsomme=new JButton("+");       begal=new JButton("=");
		bc=new JButton("Cl");           lb=new JLabel("");
		pn1=new JPanel();pn2=new JPanel();
		pn1.add(b1);pn1.add(b2);pn1.add(b3);pn1.add(b4); pn1.add(b5);pn1.add(b6); pn1.add(b7); pn1.add(b8);pn1.add(b9);pn1.add(b0);pn1.add(bsomme);
		pn1.add(bsoust);pn1.add(bmul);pn1.add(bdiv);
		pn1.add(begal);pn1.add(bc);
		pn2.setBackground(Color.PINK);
		pn2.setBounds(40,20,300,300); pn1.setBounds(50,50,280,220);
		getContentPane().add(pn1); getContentPane().add(pn2);
		pn2.add(lb);
		lb.setBounds(10,210,70,22);
		pn1.setLayout(new GridLayout(4,3));
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()=="1") {
					lb.setText(lb.getText()+b1.getActionCommand());
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()=="2") {
					lb.setText(lb.getText()+b2.getActionCommand());
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()=="3") {
					lb.setText(lb.getText()+b3.getActionCommand());
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()=="4");
				lb.setText(lb.getText()+b4.getActionCommand());
			
			}
		});
		 b5.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e)
			 {if(e.getActionCommand()=="5");
				lb.setText(lb.getText()+b5.getActionCommand());
				}
		 });
		 b6.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if(e.getActionCommand()=="6");
				 lb.setText(lb.getText()+b6.getActionCommand());
			 }
		 });
		 b7.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if(e.getActionCommand()=="7");
				 lb.setText(lb.getText()+b7.getActionCommand());
			 }
		 });
		 b8.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if(e.getActionCommand()=="8");
				 lb.setText(lb.getText()+b8.getActionCommand());
			 }
		 });
		 b9.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 if(e.getActionCommand()=="9");
			   lb.setText(lb.getText()+b9.getActionCommand());
			 }
		 });
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()=="0") {
					lb.setText(lb.getText()+b0.getActionCommand());
				}
			}
		});
		bsomme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					x=Integer.parseInt(lb.getText());
					operation="+";
					
					lb.setText("");
					
				
			}
		});
		
		bsoust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					x=Integer.parseInt(lb.getText());
					operation="-";
					lb.setText("");
			}	
		});
			
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					x=Integer.parseInt(lb.getText());
					operation="/";
					lb.setText("");
				
			}
		});
		
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					x=Integer.parseInt(lb.getText());
					operation="*";
					lb.setText("");
				
			}
		});
		
		begal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			y=Integer.parseInt(lb.getText());
			switch(operation) {
			case"+":
				lb.setText(String.valueOf(x+y));
				break;
			case"-":
				lb.setText(String.valueOf(x-y));
				break;
			case"*":
				lb.setText(String.valueOf(x*y));
				break;
			case"/":
				if(y!=0) {
				lb.setText(String.valueOf((double) x / y));
				}
				else {
					lb.setText("Erreur");
				
				}
				break;
			}
			}
		});
		
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand()=="Cl")
					lb.setText("");
			}
		});
		
		JMenuBar barre=new JMenuBar();
		setJMenuBar(barre);
		JMenu mode ;
		mode=new JMenu("Mode");
		
		
		barre.add(mode);
	JMenuItem binaire,octal,hexa,scientifique;
	scientifique=new JMenuItem("scientifique");mode.add(scientifique);
	
	binaire=new JMenuItem("Binaire"); mode.add(binaire);
	
	octal=new JMenuItem("Octal"); mode.add(octal);
	octal.setActionCommand("octal");
	hexa=new JMenuItem("Hexadecimale");mode.add(hexa);
	hexa.setActionCommand("hexa");
	
	
	 binaire.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand()=="Binaire"){
				JLabel lab=new JLabel("");
				
				JPanel pn=new JPanel();
				pn.setBackground(Color.PINK);
				pn.setLayout(new GridLayout(4,3));
				JFrame nv=new JFrame(" calcul Binaire");
				 nv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				 nv.setSize(500,500);
				 nv.setLayout(new BorderLayout());
				
				
				lab.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				JPanel p=new JPanel();
				p.add(lab);
				p.setBackground(Color.PINK);
				and=new JButton("AND");
				or=new JButton("OR");
				xor=new JButton("XOR");
				
				pn.add(b0);
				pn.add(b1);
				pn.add(and);
				pn.add(or);
				pn.add(xor);
				
				pn.add(bsomme);
				pn.add(bsoust);
				pn.add(bmul);
				pn.add(bdiv);
				pn.add(begal);
				pn.add(bc);
				nv.add(lab,BorderLayout.NORTH);
				nv.add(pn ,BorderLayout.CENTER);
			
				b0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						 lab.setText(lab.getText()+b0.getActionCommand());
					}
				});
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						 lab.setText(lab.getText()+b1.getActionCommand());
					}
				});
				
				
				
				and.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						

						x=Integer.parseInt(lab.getText(),2);
						operation="AND";
						lab.setText("");
						
					}
				});
				or.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						x=Integer.parseInt(lab.getText(),2);
						operation="OR";
						lab.setText("");
						}
					
				});
				bsomme.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
							x=Integer.parseInt(lab.getText(),2);
							operation="+";
							
							lab.setText("");
							
						
					}
				});
				
				bsoust.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
							x=Integer.parseInt(lab.getText(),2);
							operation="-";
							lab.setText("");
					}	
				});
					
				bdiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
							x=Integer.parseInt(lab.getText(),2);
							operation="/";
							lab.setText("");
						
					}
				});
				
				bmul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
							x=Integer.parseInt(lab.getText(),2);
							operation="*";
							lab.setText("");
						
					}
				});
				begal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int y=Integer.parseInt(lab.getText(),2);
						
						switch(operation) {
						case"AND":
							lab.setText(Integer.toBinaryString(x&y));
							break;
						case"OR":
							lab.setText(Integer.toBinaryString(x|y));
							break;
						case"XOR":
							lab.setText(Integer.toBinaryString(x^y));
							break;
						
						case"+":
							lab.setText(Integer.toBinaryString(x+y));
							break;
						case"-":
							lab.setText(Integer.toBinaryString(x-y));
							break;
						case"*":
							lab.setText(Integer.toBinaryString(x*y));
							break;
						case"/":
							if(y!=0) {
							lab.setText(Integer.toBinaryString(x / y));
							}
							else {
								lab.setText("Erreur");
							
							}
							break;
					}
					}
				});
				bc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
							lab.setText("");
					}
				});
				
				

				nv.setVisible(true);
				
				
				
				
			}
		}
		 
	 });
	 octal.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 if(e.getActionCommand().equals("octal")) {
				 JFrame n=new JFrame(" calcul Octal");
				 JLabel lab=new JLabel("");
					
					JPanel pn=new JPanel();
					pn.setBackground(Color.PINK);
					pn.setLayout(new GridLayout(4,3));
					
					
					 n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					 n.setSize(500,500);
					 n.setLayout(new BorderLayout());
					
					
					lab.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					JPanel p=new JPanel();
					p.add(lab);
					p.setBackground(Color.PINK);
					and=new JButton("AND");
					or=new JButton("OR");
					xor=new JButton("XOR");
					
					pn.add(b0);
					pn.add(b1);
					pn.add(b2);
					pn.add(b3);
					pn.add(b4);
					pn.add(b5);
					pn.add(b6);
					pn.add(b7);
					pn.add(and);
					pn.add(or);
					pn.add(xor);
					
					pn.add(bsomme);
					pn.add(bsoust);
					pn.add(bmul);
					pn.add(bdiv);
					pn.add(begal);
					pn.add(bc);
					n.add(lab,BorderLayout.NORTH);
					n.add(pn ,BorderLayout.CENTER);
				
					b0.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b0.getActionCommand());
						}
					});
					b1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b1.getActionCommand());
						}
					});
					b2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b2.getActionCommand());
						}
					});
					b3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b3.getActionCommand());
						}
					});
					b4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b4.getActionCommand());
						}
					});
					b5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b5.getActionCommand());
						}
					});
					b6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b6.getActionCommand());
						}
					});
					b7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b7.getActionCommand());
						}
					});
					
					
					
					
					and.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							

							x=(int) Long.parseLong(lab.getText(),8);
							operation="AND";
							lab.setText("");
							
						}
					});
					or.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 x=(int) Long.parseLong(lab.getText(),8);
							operation="OR";
							lab.setText("");
							}
						
					});
					bsomme.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								x=Integer.parseInt(lab.getText(),8);
								operation="+";
								
								lab.setText("");
								
							
						}
					});
					
					bsoust.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								x=Integer.parseInt(lab.getText(),8);
								operation="-";
								lab.setText("");
						}	
					});
						
					bdiv.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								x=Integer.parseInt(lab.getText(),8);
								operation="/";
								lab.setText("");
							
						}
					});
					
					bmul.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								x=Integer.parseInt(lab.getText(),8);
								operation="*";
								lab.setText("");
							
						}
					});
					begal.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int y=Integer.parseInt(lab.getText(),8);
							
							switch(operation) {
							case"AND":
								lab.setText(Long.toOctalString(x&y));
								break;
							case"OR":
								lab.setText(Long.toOctalString(x|y));
								break;
							case"XOR":
								lab.setText(Long.toOctalString(x^y));
								break;
							
							case"+":
								lab.setText(Long.toOctalString(x+y));
								break;
							case"-":
								lab.setText(Long.toOctalString(x-y));
								break;
							case"*":
								lab.setText(Long.toOctalString(x*y));
								break;
							case"/":
								if(y!=0) {
								lab.setText(Long.toOctalString(x / y));
								}
								else {
									lab.setText("Erreur");
								
								}
								break;
						}
						}
					});
					bc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								lab.setText("");
						}
					});
					
					

					n.setVisible(true);
					
					
					
					
				}
			}
			 
		 });
			 
	 hexa.addActionListener(new ActionListener() {
		 public void actionPerformed( ActionEvent e) {
			 if(e.getActionCommand().equals("hexa")) {
				 JFrame n=new JFrame(" calcul Hexadecimale");
				 JLabel lab=new JLabel("");
					
					JPanel pn=new JPanel();
					pn.setBackground(Color.PINK);
					pn.setLayout(new GridLayout(4,3));
					
					
					 n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					 n.setSize(500,500);
					 n.setLayout(new BorderLayout());
					
					
					lab.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					JPanel p=new JPanel();
					p.add(lab);
					p.setBackground(Color.PINK);
					and=new JButton("AND");
					or=new JButton("OR");
					xor=new JButton("XOR");
					
					pn.add(b0);
					pn.add(b1);
					pn.add(b2);
					pn.add(b3);
					pn.add(b4);
					pn.add(b5);
					pn.add(b6);
					pn.add(b7);
					pn.add(b8);
					pn.add(b9);
					pn.add(a);
					pn.add(b);
					pn.add(c);
					pn.add(d);
					pn.add(E);
					pn.add(f);
					pn.add(and);
					pn.add(or);
					pn.add(xor);
					
					pn.add(bsomme);
					pn.add(bsoust);
					pn.add(bmul);
					pn.add(bdiv);
					pn.add(begal);
					pn.add(bc);
					n.add(lab,BorderLayout.NORTH);
					n.add(pn ,BorderLayout.CENTER);
				
					b0.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b0.getActionCommand());
						}
					});
					b1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b1.getActionCommand());
						}
					});
					b2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b2.getActionCommand());
						}
					});
					b3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b3.getActionCommand());
						}
					});
					b4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b4.getActionCommand());
						}
					});
					b5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b5.getActionCommand());
						}
					});
					b6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b6.getActionCommand());
						}
					});
					b7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b7.getActionCommand());
						}
					});
					b8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b8.getActionCommand());
						}
					});
					b9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b9.getActionCommand());
						}
					});
					
					
					a.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+a.getActionCommand());
						}
					});
					b.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b.getActionCommand());
						}
					});
					c.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+c.getActionCommand());
						}
					});
					d.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+d.getActionCommand());
						}
					});
					E.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+E.getActionCommand());
						}
					});
					f.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+f.getActionCommand());
						}
					});
					
					
					and.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							

							x=(int) Long.parseLong(lab.getText(),16);
							operation="AND";
							lab.setText("");
							
						}
					});
					or.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 x=(int) Long.parseLong(lab.getText(),16);
							operation="OR";
							lab.setText("");
							}
						
					});
					bsomme.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								x=Integer.parseInt(lab.getText(),16);
								operation="+";
								
								lab.setText("");
								
							
						}
					});
					
					bsoust.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								x=Integer.parseInt(lab.getText(),16);
								operation="-";
								lab.setText("");
						}	
					});
						
					bdiv.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								x=Integer.parseInt(lab.getText(),16);
								operation="/";
								lab.setText("");
							
						}
					});
					
					bmul.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								x=Integer.parseInt(lab.getText(),16);
								operation="*";
								lab.setText("");
							
						}
					});
					begal.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int y=Integer.parseInt(lab.getText(),16);
							
							switch(operation) {
							case"AND":
								lab.setText(Long.toHexString(x&y));
								break;
							case"OR":
								lab.setText(Long.toHexString(x|y));
								break;
							case"XOR":
								lab.setText(Long.toHexString(x^y));
								break;
							
							case"+":
								lab.setText(Long.toHexString(x+y));
								break;
							case"-":
								lab.setText(Long.toHexString(x-y));
								break;
							case"*":
								lab.setText(Long.toHexString(x*y));
								break;
							case"/":
								if(y!=0) {
								lab.setText(Long.toHexString(x / y));
								}
								else {
									lab.setText("Erreur");
								
								}
								break;
						}
						}
					});
					bc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
								lab.setText("");
						}
					});
					
					

					n.setVisible(true);
					
					
					
					
				}
			}
			 
		 });
	 
	 scientifique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("scientifique")){
					int nb = 0;
					JLabel lab=new JLabel("");
					JFrame n=new JFrame("calcul Scientifique");
					JPanel pn=new JPanel();
					pn.setBackground(Color.PINK);
					pn.setLayout(new GridLayout(4,3));
					n.setVisible(true);			
					dispose();
					
					 n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					 n.setSize(500,500);
					
					n.add(lab,BorderLayout.NORTH);
					n.add(pn,BorderLayout.CENTER);
					
					n.add(pn);
					lab.setBorder(BorderFactory.createLineBorder(Color.BLACK));
					JPanel p=new JPanel();
					n.add(p);
					p.add(lab);
					p.setBackground(Color.PINK);
					pn.add(b0);
					pn.add(b1);
					pn.add(b2);
					pn.add(b3);
					pn.add(b4);
					pn.add(b5);
					pn.add(b6);
					pn.add(b7);
					pn.add(b8);
					pn.add(b9);
					pn.add(bcos);
					pn.add(bsin);
					pn.add(bexpo);
					pn.add(blog);
					pn.add(btan);
					pn.add(barccos);
					pn.add(barcsin);
					pn.add(barctan);
					pn.add(pi);
					pn.add(carre);
					pn.add(cube);
					
					pn.add(bln);
					pn.add(racine);
					pn.add(cosh);
					pn.add(sinh);
					pn.add(tanh);
					pn.add(pow);
					pn.add(abs);
					pn.add(bsomme);
					pn.add(bsoust);
					pn.add(bmul);
					pn.add(bdiv);
					pn.add(begal);
					pn.add(bc);
					n.add(lab,BorderLayout.NORTH);
					n.add(pn ,BorderLayout.CENTER);
				
					b0.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b0.getActionCommand());
						}
					});
					b1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b1.getActionCommand());
						}
					});
					b2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b2.getActionCommand());
						}
					});
					b3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b3.getActionCommand());
						}
					});
					b4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b4.getActionCommand());
						}
					});
					b5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b5.getActionCommand());
						}
					});
					b6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b6.getActionCommand());
						}
					});
					b7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b7.getActionCommand());
						}
					});
					b8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b8.getActionCommand());
						}
					});
					b9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							 lab.setText(lab.getText()+b9.getActionCommand());
						}
					});
					bcos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="cos";
							lab.setText("");
						}
					});
					bsin.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="sin";
							lab.setText("");
						}
					});
					btan.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="tan";
							lab.setText("");
						}
					});
					btan.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="tan";
							lab.setText("");
						}
					});
					bexpo.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="expo";
							lab.setText("");
						}
					});
					blog.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="log";
							lab.setText("");
						}
					});
					bln.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="ln";
							lab.setText("");
						}
					});
					barccos.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="arccos";
							lab.setText("");
						}
					});
					barcsin.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="arcsin";
							lab.setText("");
						}
					});
					barctan.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="arctan";
							lab.setText("");
						}
					});
					pi.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="pi";
							lab.setText("");
						}
					});
					carre.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="carre";
							lab.setText("");
						}
					});
					cube.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="cube";
							lab.setText("");
						}
					});
				
					abs.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="abs";
							lab.setText("");
						}
					});
					cosh.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="cosh";
							lab.setText("");
						}

					});
					sinh.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="sinh";
							lab.setText("");
						}
					});
					tanh.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="tanh";
							lab.setText("");
						}
					});
					racine.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="racine";
							lab.setText("");
						}
					});
					pow.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							x=(int) Double.parseDouble(lab.getText());
							operation="pow";
							lab.setText("");
						}
					});
					begal.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							double y=(int) Double.parseDouble(lab.getText());
							switch(operation) {
							case "cos":
								lab.setText(String.valueOf(Math.cos(x)));
								break;
							case"sin":
								lab.setText(String.valueOf(Math.sin(x)));
								break;
							case"tan":
								lab.setText(String.valueOf(Math.tan(x)));
								break;
							case"expo":
								lab.setText(String.valueOf(Math.exp(x)));
								break;
							case"log":
								lab.setText(String.valueOf(Math.log(x)));
								break;
							case"ln":
								lab.setText(String.valueOf(Math.log1p(x)));
								break;
							case"arccos":
								lab.setText(String.valueOf(Math.acos(x)));
								break;
							case"arcsin":
								lab.setText(String.valueOf(Math.asin(x)));
								break;
							case"arctan":
								lab.setText(String.valueOf(Math.atan(x)));
								break;
							case"pi":
								lab.setText(String.valueOf(Math.PI));
								break;
							case"carre":
								lab.setText(String.valueOf(Math.pow(x, 2)));
								break;
							case"cube":
								lab.setText(String.valueOf(Math.pow(x, 3)));
								break;
							case"racine":
								lab.setText(String.valueOf(Math.sqrt(x)));
								break;
							case"abs":
								lab.setText(String.valueOf(Math.abs(x)));
								break;
							case"cosh":
									lab.setText(String.valueOf(Math.cosh(x)));
									break;
						    case"sinh":
									lab.setText(String.valueOf(Math.sinh(x)));
									break;
							case"tanh":
								lab.setText(String.valueOf(Math.tanh(x)));
							case"pow":
								lab.setText(String.valueOf(Math.pow(x, nb)));

							case"+":
								lab.setText(String.valueOf(x+y));
								break;
							case"-":
								lab.setText(String.valueOf(x-y));
								break;
							case"*":
								lab.setText(String.valueOf(x*y));
								break;
							case"/":
								if(y!=0) {
								lab.setText(String.valueOf(x / y));
								}
								else {
									lab.setText("Erreur");
								
								}
								break;	

							}
							bc.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
										lab.setText("");
								}
							});
							
							
						}
					});
					
					n.setVisible(true);
				}
		
		
			}
		
				});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		setVisible(true);
	}

	 }
public class ex8 {
	public static void main(String[]args) {
		new calculatrice();
	}
	
}

