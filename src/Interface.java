import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Interface {
	private  List<String> tokens = new ArrayList<String>(); 
	private JFrame frame;
	String ans ="",expression="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 392, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCasio = new JLabel("CASIO");
		lblCasio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCasio.setForeground(Color.WHITE);
		lblCasio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCasio.setBounds(0, 0, 53, 29);
		frame.getContentPane().add(lblCasio);
		
		JButton b0 = new JButton("0");
		b0.setBackground(Color.LIGHT_GRAY);
		b0.setFont(new Font("Tahoma", Font.BOLD, 11));
		b0.setBounds(10, 386, 67, 23);
		frame.getContentPane().add(b0);
		
		JButton bPoint = new JButton(".");
		bPoint.setFont(new Font("Tahoma", Font.BOLD, 11));
		bPoint.setBackground(Color.LIGHT_GRAY);
		bPoint.setBounds(81, 386, 67, 23);
		frame.getContentPane().add(bPoint);
		
		JButton btnExp = new JButton("EXP");
		btnExp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExp.setBackground(Color.LIGHT_GRAY);
		btnExp.setBounds(153, 386, 67, 23);
		frame.getContentPane().add(btnExp);
		
		JButton b1 = new JButton("1");
		b1.setFont(new Font("Tahoma", Font.BOLD, 11));
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setBounds(10, 350, 67, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.setFont(new Font("Tahoma", Font.BOLD, 11));
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setBounds(81, 350, 67, 23);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.setFont(new Font("Tahoma", Font.BOLD, 11));
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setBounds(153, 350, 67, 23);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.setFont(new Font("Tahoma", Font.BOLD, 11));
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setBounds(10, 316, 67, 23);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.setFont(new Font("Tahoma", Font.BOLD, 11));
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setBounds(81, 316, 67, 23);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.setFont(new Font("Tahoma", Font.BOLD, 11));
		b6.setBackground(Color.LIGHT_GRAY);
		b6.setBounds(153, 316, 67, 23);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.setFont(new Font("Tahoma", Font.BOLD, 11));
		b7.setBackground(Color.LIGHT_GRAY);
		b7.setBounds(10, 282, 67, 23);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.setFont(new Font("Tahoma", Font.BOLD, 11));
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setBounds(81, 282, 67, 23);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.setFont(new Font("Tahoma", Font.BOLD, 11));
		b9.setBackground(Color.LIGHT_GRAY);
		b9.setBounds(153, 282, 67, 23);
		frame.getContentPane().add(b9);
		
		JButton btnDel = new JButton("DEL");
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDel.setBackground(new Color(128, 0, 0));
		btnDel.setBounds(225, 282, 67, 23);
		frame.getContentPane().add(btnDel);
		
		JButton btnAc = new JButton("AC");
		btnAc.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAc.setBackground(new Color(128, 0, 0));
		btnAc.setBounds(298, 282, 67, 23);
		frame.getContentPane().add(btnAc);
		
		JButton bMul = new JButton("*");
		bMul.setFont(new Font("Tahoma", Font.BOLD, 15));
		bMul.setBackground(Color.LIGHT_GRAY);
		bMul.setBounds(225, 316, 67, 23);
		frame.getContentPane().add(bMul);
		
		JButton bDiv = new JButton("/");
		bDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		bDiv.setBackground(Color.LIGHT_GRAY);
		bDiv.setBounds(298, 316, 67, 23);
		frame.getContentPane().add(bDiv);
		
		JButton bAdd = new JButton("+");
		bAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		bAdd.setBackground(Color.LIGHT_GRAY);
		bAdd.setBounds(225, 350, 67, 23);
		frame.getContentPane().add(bAdd);
		
		JButton btnAns = new JButton("Mod");
		btnAns.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAns.setBackground(Color.LIGHT_GRAY);
		btnAns.setBounds(225, 386, 67, 23);
		frame.getContentPane().add(btnAns);
		
		JButton bSub = new JButton("-");
		bSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		bSub.setBackground(Color.LIGHT_GRAY);
		bSub.setBounds(298, 350, 67, 23);
		frame.getContentPane().add(bSub);
		
		JButton equ = new JButton("=");
		equ.setFont(new Font("Tahoma", Font.BOLD, 15));
		equ.setBackground(Color.LIGHT_GRAY);
		equ.setBounds(298, 386, 67, 23);
		frame.getContentPane().add(equ);
		
		JButton sinh = new JButton("sinh");
		sinh.setForeground(Color.WHITE);
		sinh.setBackground(Color.BLACK);
		sinh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		sinh.setBounds(10, 254, 53, 17);
		frame.getContentPane().add(sinh);
		
		JButton cosh = new JButton("cosh");
		cosh.setForeground(Color.WHITE);
		cosh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		cosh.setBackground(Color.BLACK);
		cosh.setBounds(70, 254, 53, 17);
		frame.getContentPane().add(cosh);
		
		JButton openBrace = new JButton("(");
		openBrace.setForeground(Color.WHITE);
		openBrace.setFont(new Font("Tahoma", Font.PLAIN, 9));
		openBrace.setBackground(Color.BLACK);
		openBrace.setBounds(192, 254, 53, 17);
		frame.getContentPane().add(openBrace);
		
		JButton closingBrace = new JButton(")");
		closingBrace.setForeground(Color.WHITE);
		closingBrace.setFont(new Font("Tahoma", Font.PLAIN, 9));
		closingBrace.setBackground(Color.BLACK);
		closingBrace.setBounds(253, 254, 53, 17);
		frame.getContentPane().add(closingBrace);
		
		JButton tanh = new JButton("tanh");
		tanh.setForeground(Color.WHITE);
		tanh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		tanh.setBackground(Color.BLACK);
		tanh.setBounds(130, 254, 53, 17);
		frame.getContentPane().add(tanh);
		
		JButton btnM = new JButton("M +");
		btnM.setForeground(Color.WHITE);
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnM.setBackground(Color.BLACK);
		btnM.setBounds(312, 254, 53, 17);
		frame.getContentPane().add(btnM);
		
		JButton btnSin_1 = new JButton("asin");
		btnSin_1.setForeground(Color.WHITE);
		btnSin_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSin_1.setBackground(Color.BLACK);
		btnSin_1.setBounds(10, 226, 53, 17);
		frame.getContentPane().add(btnSin_1);
		
		JButton btnAcos = new JButton("acos");
		btnAcos.setForeground(Color.WHITE);
		btnAcos.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnAcos.setBackground(Color.BLACK);
		btnAcos.setBounds(70, 226, 53, 17);
		frame.getContentPane().add(btnAcos);
		
		JButton btnTan_1 = new JButton("atan");
		btnTan_1.setForeground(Color.WHITE);
		btnTan_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTan_1.setBackground(Color.BLACK);
		btnTan_1.setBounds(130, 226, 53, 17);
		frame.getContentPane().add(btnTan_1);
		
		JButton btnSin = new JButton("sin");
		btnSin.setForeground(Color.WHITE);
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSin.setBackground(Color.BLACK);
		btnSin.setBounds(192, 226, 53, 17);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.setForeground(Color.WHITE);
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCos.setBackground(Color.BLACK);
		btnCos.setBounds(253, 226, 53, 17);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.setForeground(Color.WHITE);
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTan.setBackground(Color.BLACK);
		btnTan.setBounds(312, 226, 53, 17);
		frame.getContentPane().add(btnTan);
		
		JButton btnABc = new JButton("2PI");
		btnABc.setForeground(Color.WHITE);
		btnABc.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnABc.setBackground(Color.BLACK);
		btnABc.setBounds(10, 198, 53, 17);
		frame.getContentPane().add(btnABc);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.setForeground(Color.WHITE);
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSqrt.setBackground(Color.BLACK);
		btnSqrt.setBounds(70, 198, 53, 17);
		frame.getContentPane().add(btnSqrt);
		
		JButton xSequar = new JButton("X^2");
		xSequar.setForeground(Color.WHITE);
		xSequar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		xSequar.setBackground(Color.BLACK);
		xSequar.setBounds(130, 198, 53, 17);
		frame.getContentPane().add(xSequar);
		
		JButton expo = new JButton("^");
		expo.setForeground(Color.WHITE);
		expo.setFont(new Font("Tahoma", Font.PLAIN, 9));
		expo.setBackground(Color.BLACK);
		expo.setBounds(192, 198, 53, 17);
		frame.getContentPane().add(expo);
		
		JButton btnLog = new JButton("log");
		btnLog.setForeground(Color.WHITE);
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnLog.setBackground(Color.BLACK);
		btnLog.setBounds(253, 198, 53, 17);
		frame.getContentPane().add(btnLog);
		
		JButton btnLn = new JButton("ln");
		btnLn.setForeground(Color.WHITE);
		btnLn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnLn.setBackground(Color.BLACK);
		btnLn.setBounds(312, 198, 53, 17);
		frame.getContentPane().add(btnLn);
		
		JButton inverse = new JButton("1/X");
		inverse.setForeground(Color.WHITE);
		inverse.setFont(new Font("Tahoma", Font.PLAIN, 9));
		inverse.setBackground(Color.BLACK);
		inverse.setBounds(10, 170, 53, 17);
		frame.getContentPane().add(inverse);
		
		JButton btnNcr = new JButton("nCr");
		btnNcr.setForeground(Color.WHITE);
		btnNcr.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNcr.setBackground(Color.BLACK);
		btnNcr.setBounds(70, 170, 53, 17);
		frame.getContentPane().add(btnNcr);
		
		JButton Rnd = new JButton("Rnd");
		Rnd.setForeground(Color.WHITE);
		Rnd.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Rnd.setBackground(Color.BLACK);
		Rnd.setBounds(253, 170, 53, 17);
		frame.getContentPane().add(Rnd);
		
		JButton xCube = new JButton("X^3");
		xCube.setForeground(Color.WHITE);
		xCube.setFont(new Font("Tahoma", Font.PLAIN, 9));
		xCube.setBackground(Color.BLACK);
		xCube.setBounds(312, 170, 53, 17);
		frame.getContentPane().add(xCube);
		
		JButton OFF = new JButton("");
		OFF.setForeground(Color.WHITE);
		OFF.setFont(new Font("Tahoma", Font.PLAIN, 9));
		OFF.setBackground(Color.LIGHT_GRAY);
		OFF.setBounds(10, 114, 53, 17);
		frame.getContentPane().add(OFF);
		
		JButton onBtn = new JButton("");
		onBtn.setForeground(Color.WHITE);
		onBtn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		onBtn.setBackground(Color.LIGHT_GRAY);
		onBtn.setBounds(312, 114, 53, 17);
		frame.getContentPane().add(onBtn);
		
		JLabel lblShift = new JLabel("OFF");
		lblShift.setHorizontalAlignment(SwingConstants.CENTER);
		lblShift.setForeground(new Color(255, 255, 153));
		lblShift.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblShift.setBounds(8, 102, 46, 11);
		frame.getContentPane().add(lblShift);
		
		JLabel lblOn = new JLabel("ON");
		lblOn.setForeground(new Color(119, 136, 153));
		lblOn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblOn.setHorizontalAlignment(SwingConstants.CENTER);
		lblOn.setBounds(312, 102, 46, 11);
		frame.getContentPane().add(lblOn);
		
		JLabel lblM = new JLabel("M -");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setForeground(new Color(255, 255, 153));
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblM.setBounds(298, 242, 46, 11);
		frame.getContentPane().add(lblM);
		
		JLabel lblM_1 = new JLabel("M");
		lblM_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblM_1.setForeground(new Color(165, 42, 42));
		lblM_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblM_1.setBounds(322, 240, 46, 14);
		frame.getContentPane().add(lblM_1);
		
		Label keyEnter = new Label("");
		keyEnter.setFont(new Font("Dialog", Font.PLAIN, 14));
		keyEnter.setBackground(new Color(255, 255, 255));
		keyEnter.setBounds(0, 35, 378, 25);
		frame.getContentPane().add(keyEnter);
		
		Label result = new Label("0");
		result.setFont(new Font("Dialog", Font.PLAIN, 14));
		result.setAlignment(Label.RIGHT);
		result.setBackground(new Color(255, 255, 255));
		result.setBounds(0, 70, 378, 25);
		frame.getContentPane().add(result);
		
		JButton btnNpr = new JButton("nPr");
		btnNpr.setForeground(Color.WHITE);
		btnNpr.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNpr.setBackground(Color.BLACK);
		btnNpr.setBounds(130, 170, 53, 17);
		frame.getContentPane().add(btnNpr);
		
		JButton btnX = new JButton("X!");
		btnX.setForeground(Color.WHITE);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnX.setBackground(Color.BLACK);
		btnX.setBounds(192, 170, 53, 17);
		frame.getContentPane().add(btnX);
		
		JButton btnE = new JButton("e^x");
		btnE.setForeground(Color.WHITE);
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnE.setBackground(Color.BLACK);
		btnE.setBounds(10, 142, 53, 17);
		frame.getContentPane().add(btnE);
		
		JButton btnx = new JButton("10^x");
		btnx.setForeground(Color.WHITE);
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnx.setBackground(Color.BLACK);
		btnx.setBounds(70, 142, 53, 17);
		frame.getContentPane().add(btnx);
		
		JButton btnEx = new JButton("x\u221A");
		btnEx.setForeground(Color.WHITE);
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEx.setBackground(Color.BLACK);
		btnEx.setBounds(130, 142, 53, 17);
		frame.getContentPane().add(btnEx);
		
		JButton btnPI = new JButton("PI");
		btnPI.setForeground(Color.WHITE);
		btnPI.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnPI.setBackground(Color.BLACK);
		btnPI.setBounds(192, 142, 53, 17);
		frame.getContentPane().add(btnPI);
		
		JButton btnCubRoot = new JButton("3\u221A");
		btnCubRoot.setForeground(Color.WHITE);
		btnCubRoot.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCubRoot.setBackground(Color.BLACK);
		btnCubRoot.setBounds(253, 142, 53, 17);
		frame.getContentPane().add(btnCubRoot);
		
		JButton button_7 = new JButton("%");
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_7.setBackground(Color.BLACK);
		button_7.setBounds(312, 142, 53, 17);
		frame.getContentPane().add(button_7);
		
		Label illusion = new Label("");
		illusion.setBackground(Color.WHITE);
		illusion.setBounds(0, 35, 376, 60);
		frame.getContentPane().add(illusion);
		
		JLabel lblScientificCalculator = new JLabel("SCIENTIFIC CALCULATOR");
		lblScientificCalculator.setForeground(new Color(255, 255, 255));
		lblScientificCalculator.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblScientificCalculator.setBounds(140, 9, 102, 14);
		frame.getContentPane().add(lblScientificCalculator);
		
		JLabel lblFxms = new JLabel("fx-1000MS");
		lblFxms.setForeground(new Color(255, 255, 255));
		lblFxms.setFont(new Font("Serif", Font.ITALIC, 11));
		lblFxms.setBounds(284, 7, 81, 14);
		frame.getContentPane().add(lblFxms);
		
		JLabel lblSvpm = new JLabel("S-V.P.A.M");
		lblSvpm.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblSvpm.setForeground(new Color(34, 139, 34));
		lblSvpm.setBounds(139, 21, 61, 11);
		frame.getContentPane().add(lblSvpm);
		
		
//		0
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String zeros = keyEnter.getText() + b0.getText();
				keyEnter.setText(zeros);
				
			}
		});
//		1
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ones = keyEnter.getText() + b1.getText();
				keyEnter.setText(ones);
			}
		});
		

//		2
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String twos = keyEnter.getText() + b2.getText();
				keyEnter.setText(twos);
			}
		});

//		3
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String threes = keyEnter.getText() + b3.getText();
				keyEnter.setText(threes);
			}
		});

//		4
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fours = keyEnter.getText() + b4.getText();
				keyEnter.setText(fours);
			}
		});

//		5
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fives = keyEnter.getText() + b5.getText();
				keyEnter.setText(fives);
			}
		});

//		6
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String six = keyEnter.getText() + b6.getText();
				keyEnter.setText(six);
			}
		});
//		7
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sevens = keyEnter.getText() + b7.getText();
				keyEnter.setText(sevens);
			}
		});

//		8
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Eights = keyEnter.getText() + b8.getText();
				keyEnter.setText(Eights);
			}
		});

//		9
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nines = keyEnter.getText() + b9.getText();
				keyEnter.setText(nines);
			}
		});
//		Addition
		bAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String adds = keyEnter.getText() + bAdd.getText();
				keyEnter.setText(adds);
//				firstNum = Double.parseDouble(keyEnter.getText());
//				keyEnter.setText("");
//				operation = "+";
			}
		});
//		Multiplicatin
		bMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mul = keyEnter.getText() + bMul.getText();
				keyEnter.setText(mul);
//				firstNum = Double.parseDouble(keyEnter.getText());
//				operation = "*";
			}
		});
//		Divide
		bDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String div = keyEnter.getText() + bDiv.getText();
				keyEnter.setText(div);
//				firstNum = Double.parseDouble(keyEnter.getText());
//				operation = "/";
			}
		});
//		Subtraction
		bSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Sub = keyEnter.getText() + bSub.getText();
				keyEnter.setText(Sub);
//				firstNum = Double.parseDouble(keyEnter.getText());
//				operation = "-";
//				keyEnter.setText("");
			}
		});
//		DEL BUTTON
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String infix = keyEnter.getText();
				StringBuilder tokensDeleted = new StringBuilder();
				PostfixConversionAndEvaluations pf = new PostfixConversionAndEvaluations(infix);
				for (int i=0; i<pf.tokens.size()-1; i++ ){
					tokensDeleted.append(pf.tokens.get(i).toString());
				}keyEnter.setText(tokensDeleted.toString());
//				if(keyEnter.getText().length()>0){
//				keyEnter.setText(keyEnter.getText().substring(0, keyEnter.getText().length() - 1));
//				}
			}
		});

//		CLEAR
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText("");
				result.setText("0");
			}
		});
//		EXP
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String expo = keyEnter.getText() + "*10^";
				keyEnter.setText(expo);
			}
		});
//		POINT 
		bPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String isharia;
				if(keyEnter.getText().equals("")){
					isharia = keyEnter.getText()+ bPoint.getText();
					keyEnter.setText(isharia);	
				}else
					isharia = keyEnter.getText() + bPoint.getText();
					keyEnter.setText(isharia);	
						}
		});
//		Equals
		equ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        String answer;
		        try{
		        	expression = keyEnter.getText();
		        	PostfixConversionAndEvaluations calc = new PostfixConversionAndEvaluations(expression);
//		        	answer = Double.toString(calc.result());
		        	ans = Double.toString(calc.result());
		        	
		        	result.setText(ans);
		        	}
		        	catch(Exception e){
		        		keyEnter.setText("Syntax Error");
		        		result.setText("");
		        }
			
				}
			
		});
//		ON button
		onBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setVisible(true);
				keyEnter.setVisible(true);
				result.setText("0");
				keyEnter.setText("");
			
			}
		});
//	power button
		expo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ex = keyEnter.getText() + expo.getText();
				keyEnter.setText(ex);
			}
		});

//		Opening braces
		openBrace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String open = keyEnter.getText() + openBrace.getText();
				keyEnter.setText(open);
			}
		});
//		Closing braces
		closingBrace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String close = keyEnter.getText() + closingBrace.getText();
				keyEnter.setText(close);
			}
		});		
		
// 		X sequar button
		xSequar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String addSequar = keyEnter.getText() + "^2";
				keyEnter.setText(addSequar);
			}
		});
//		Cube button
		xCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String addCube = keyEnter.getText() + "^3";
			keyEnter.setText(addCube);
			}
		});
//		Log button
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String log = keyEnter.getText() + btnLog.getText();
				keyEnter.setText(log);
//					tfield.setText("");
//					tfield.setText(tfield.getText() + a);
				}
			
		});
//		ln button
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String addLn = keyEnter.getText() + btnLn.getText();
				keyEnter.setText(addLn);
			}
		});

//		Sin Button
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String reci = keyEnter.getText() + btnSin.getText();
				keyEnter.setText(reci);
			}
		});
//		cos button
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String addCos = keyEnter.getText() + btnCos.getText();
				keyEnter.setText(addCos);
			}
		});
//		tan button
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String addTan = keyEnter.getText() + btnTan.getText();
				keyEnter.setText(addTan);
			}
		});
//		sinInverse button
		btnSin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText(keyEnter.getText() + "asin");
			}
		});
//		cosInverse button
		btnAcos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText(keyEnter.getText() + "acos");
			}
		});
//		tanInverse button
		btnTan_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText(keyEnter.getText() + "atan");

			}
		});
//		tanh button
		tanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			keyEnter.setText(keyEnter.getText() + "hTan");
			}
		});
//		cosh button
		cosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			keyEnter.setText(keyEnter.getText() + "hCos");
			}
		});
//		Sinh button
		sinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			keyEnter.setText(keyEnter.getText() + "hSin");
			}
		});
		
		
		
		
//	Inverse Button
		inverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String reciprocal = 1 + "/" + keyEnter.getText();
				keyEnter.setText(reciprocal);
			}
		});
//		Sequar root
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sqrt = keyEnter.getText() + "sqrt(";
				keyEnter.setText(sqrt);
			}
		});
//	Combinations button
		btnNcr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String comb = keyEnter.getText() +"C";
				keyEnter.setText(comb);
				}
				
		});
//		permutation button
		btnNpr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String perm = keyEnter.getText() + "P";
				keyEnter.setText(perm);
			}
		});
		
//		Ans button
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	        	keyEnter.setText(keyEnter.getText() + btnAns.getText());
			}
		});
//		10^x button
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tenExp = keyEnter.getText() +"10^";
				keyEnter.setText(tenExp);
			}
		});
//		E^x button
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String addE = keyEnter.getText() + "e^";
				keyEnter.setText(addE);
			}
		});
//		factorial button
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText(keyEnter.getText() + "!");
			}
		});
//		PI button
		btnPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText(keyEnter.getText()+"3.141592654");
			}
		});
//		2 PI
		btnABc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText(keyEnter.getText() + "6.283185307");
			}
		});
		
//		cube root
		btnCubRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText(keyEnter.getText() + "^(1/3)");
			}
		});
//		xth root
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			keyEnter.setText(keyEnter.getText() + btnEx.getText());
			}
		});
		
//		% sign
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				keyEnter.setText(keyEnter.getText()+button_7.getText());
			}
		});
// random number
		Rnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
				if(keyEnter.getText().length() == 0){
					keyEnter.setText(keyEnter.getText() + rnd.nextFloat());
				}else
					keyEnter.setText(keyEnter.getText() +"*"+rnd.nextFloat());
			}
		});
// OFF BUTTON
		OFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setVisible(false);
				keyEnter.setVisible(false);
			}
		});
		
		
		
	}
	
	public static String combination(String comb){
		String n="";
		String r = "";
		int j = 0;
		for(int i = 0 ; i<comb.length(); i++){
			if(comb.charAt(i)!='C'){
				 n = n+comb.substring(i,i+1);
			}
			if(comb.charAt(i) == 'C'){
			  j = i+1;
			  while(j != comb.length()){
			    r = r + comb.substring(j, j+1);
			    j++;}
			  break;
		}
		}
		String nCr =Integer.toString(factorial(n)/(factorial(r)*factorial(Integer.toString(Integer.parseInt(n) - Integer.parseInt(r)))));
		return nCr;
	}
	public static int factorial(String num){
		int i,fact=1;  
		  int number=Integer.parseInt(num);
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }
		  return fact;
	}
}
