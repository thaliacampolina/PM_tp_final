package gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.JOptionPane;

import structures.FinalSearch;
import static javax.swing.SwingUtilities.invokeLater;

public class FirstScreen extends JFrame{
    public FirstScreen(){
        //JFrame declarations section
        super();
        setLayout(new BorderLayout());
        setTitle("Movie Search");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //menubar and related options section
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu search = new JMenu("Search");
        menu.add(file);
        menu.add(search);
        file.setMnemonic('F');
        search.setMnemonic('S');
        JMenuItem exit = new JMenuItem("Exit", 'x');
        JMenuItem doSearch = new JMenuItem("Search movie", 'm');
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        doSearch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        file.add(exit);
        search.add(doSearch);
        setJMenuBar(menu);
        
        //listeners section
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        doSearch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                invokeLater(new Runnable(){
                    public void run() {
                        new SearchWindow().setVisible(true);
                    }
                });   
            }
        });
    }
}
