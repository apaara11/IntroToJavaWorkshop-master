package day3;

import javax.swing.JOptionPane;

import sun.applet.Main;

public class Snooper {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null,"Hello"+ answer);	
}
}
