import static javax.swing.SwingUtilities.invokeLater;

public class Tp_final {
    
    public static void main(String[] args) {
        FinalSearch f = new FinalSearch();
        f.readDatas();
        //TODO: isso e um exemplo. Depois tem q colocar strings geraizonas
        f.search("nameOfMovie","house");
        new Splash(); 
        Splash.DelayTime(11000);
        invokeLater(new Runnable(){
            public void run() {
                new FirstScreen().setVisible(true);
            }
        });
        
    }
}
