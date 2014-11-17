import static javax.swing.SwingUtilities.invokeLater;
import structures.FinalSearch;

public class Tp_final {
    
    public static void main(String[] args) {
        new Splash(); 
        Splash.DelayTime(11000);
        invokeLater(new Runnable(){
            public void run() {
                new FirstScreen().setVisible(true);
            }
        });
        
    }
}
