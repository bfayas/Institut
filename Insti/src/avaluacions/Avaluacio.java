package avaluacions;


import javax.swing.*;

import java.awt.event.*;

public class Avaluacio extends JFrame implements ActionListener {
	private JButton botongo;
	private JTextField textfield1, textfield2;
	private JLabel label1, label2, msg;
	
	public void introduirdades() {
		setLayout(null);
		/*label1 = new JLabel("Codi del mòdul:");
		label1.setBounds(10, 10, 350, 30);
		add(label1);
		textfield1 = new JTextField();
		textfield1.setBounds(370, 15, 70, 25);
		add(textfield1);*/
		label2 = new JLabel("Codi de la UF");
		label2.setBounds(10, 40, 350, 30);
		add(label2);
		textfield2 = new JTextField();
		textfield2.setBounds(370, 45, 70, 25);
		add(textfield2);
		botongo = new JButton("Notes");
		botongo.setBounds(375, 70, 100, 25);
		add(botongo);
		botongo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		//String modul = textfield1.getText();
		String modul="M5";
		//long num = Integer.parseInt(cad);
		String uefe = textfield2.getText();
		System.out.println("La uefe es "+uefe);
		int enes[]= {9,5,8,9,9};
		if (e.getSource() == botongo) {
			int n=CalculNota.calculaNota(modul,uefe,enes);
			if (n>0){
				String m = "La nota de la "+uefe+" és "+n;
			    this.info(m);
				//msg	= new JLabel(m);
			    //msg.setBounds(10, 100, 350, 30);
			    //add(msg);
			}
			
		}
	}
	
	public void info(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public static void main(String[] args) {
		int n;
		int enes[]= {9,5,8,9,9};
		String modul="M5";
		String uefe="UF3";
		n=CalculNota.calculaNota(modul,uefe,enes);
		if (n>0)
			System.out.println("La nota de la "+uefe+" és "+n);
		else
			System.out.println("Error");
		
			
		/*Avaluacio f = new Avaluacio();
		f.introduirdades();
		f.setBounds(0, 0, 500, 160);
		f.setVisible(true);*/	
		}
}
