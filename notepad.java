import javax.swing.*;
import java.awt.event.*;


public class notepad implements ActionListener
{
	JFrame f;    
	JMenuBar mb;    
	JMenu file,edit,format,help;    
	JMenuItem New,open,save,saveas,exit,cut,copy,paste,selectAll,wordwrap,font,about;    
	JTextArea ta; 
	
	notepad()
	{
		f = new JFrame("JetNotepad");
		ta = new JTextArea();
		ta.setBounds(5,2,2000,2000);
		mb = new JMenuBar();
		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		help = new JMenu("Help");
		mb.add(file);
		mb.add(edit);
		mb.add(format);
		mb.add(help);
		
		New = new JMenuItem("new");
		open = new JMenuItem("open  ctrl+O");
		save = new JMenuItem("save  ctrl+s");
		saveas = new JMenuItem("save as");
		exit = new JMenuItem("exit");
		cut = new JMenuItem("cut  ctrl+x");
		copy = new JMenuItem("copy  ctrl+c");
		paste = new JMenuItem("paste  ctrl+p");
		selectAll = new JMenuItem("select all  ctrl+a");
		wordwrap = new JMenuItem("word wrap");
		font = new JMenuItem("font");
		about = new JMenuItem("help");
	    file.add(New);
	    file.add(open);
	    file.add(save);
	    file.add(saveas);
	    edit.add(cut);
	    edit.add(copy);
	    edit.add(paste);
	    edit.add(selectAll);
	    format.add(wordwrap);
	    format.add(font);
	    help.add(about);
	    
	    f.add(mb);
	    f.add(ta);
	    f.setJMenuBar(mb);
	    f.setLayout(null);
	    f.setSize(600,600);
	    f.setVisible(true);
	    
	    New.addActionListener(this);
	    open.addActionListener(this);
	    save.addActionListener(this);
	    saveas.addActionListener(this);
	    cut.addActionListener(this);
	    copy.addActionListener(this);
	    paste.addActionListener(this);
	    selectAll.addActionListener(this); 
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==save)
			JOptionPane.showMessageDialog(f,"File saved successfully");
		
		if(e.getSource()==cut)    
			ta.cut();    
			if(e.getSource()==paste)    
			ta.paste();    
			if(e.getSource()==copy)    
			ta.copy();    
			if(e.getSource()==selectAll)    
			ta.selectAll();    
	}
	
	
	public static void main(String[] args) 
	{
		new notepad();
	}

}
