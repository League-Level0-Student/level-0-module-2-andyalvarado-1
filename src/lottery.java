import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	Random rey =new Random();
	int r = rey.nextInt(80);
int t = rey.nextInt(80);
int m = rey.nextInt(80);
int l = rey.nextInt(80);
int u = rey.nextInt(80);
JOptionPane.showMessageDialog(null,""+r+", " +t+", " +m+", " +l+", " +u);
}
}
