package demo.io;

import java.io.File;

import javax.swing.JFileChooser;

public class ShowFile {

	public static void main(String[] args) {
		JFileChooser jf = new JFileChooser();
		jf.showOpenDialog(null);
//		jf.showSaveDialog(null);
		File f=jf.getSelectedFile();
		System.out.println(f);
	}
}
