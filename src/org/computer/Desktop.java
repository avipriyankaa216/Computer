package org.computer;

public class Desktop extends Computer{
private void desktopSize() {
	// TODO Auto-generated method stub
	System.out.println("the desktop size is 14 inch");

}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.computerModel();
	d.desktopSize();
}
}
