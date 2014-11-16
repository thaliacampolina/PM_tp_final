import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

public class Splash extends JWindow{
    private static JProgressBar progressBar;
    private static int count = 1;
    private static final int TIMER_PAUSE = 100;
    private static final int PROGBAR_MAX = 105;
    private static Timer progressBarTimer;
    
    public Splash(){
        CreatingComponents();
        this.setVisible(true);
    }
    
    private void CreatingComponents(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout()); //default layout for JWindow
        JLabel splashImage = new JLabel(new ImageIcon(getClass().getResource("splash.jpg")));
        panel.add(splashImage);
        
        progressBar = new JProgressBar();
        progressBar.setMaximum(PROGBAR_MAX);
        progressBar.setForeground(new Color(2, 8, 54));
        progressBar.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(progressBar, BorderLayout.SOUTH);
        
        this.setContentPane(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        
        StartProgressBar();
    }
    
    private void StartProgressBar(){
        progressBarTimer = new Timer(TIMER_PAUSE, new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                progressBar.setValue(count);
                if (count == PROGBAR_MAX){
                    Splash.this.dispose();
                    progressBarTimer.stop();
                }
                count++;
            }
        });
        progressBarTimer.start();
    }
    
    public static void DelayTime(int milli){
        try {
            Thread.sleep(milli);
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
