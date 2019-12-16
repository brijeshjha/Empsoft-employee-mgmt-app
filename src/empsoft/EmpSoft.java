package empsoft;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class EmpSoft {
    public static void main(String[] args) {
        // TODO code application logic here
        EmpSoftGui emp=new EmpSoftGui();
        emp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        emp.setVisible(true);
        emp.setSize(799,542); 
        for(int i=0;i<80;i++)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(EmpSoft.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        emp.dispose();
        Login log=new Login();
        log.setVisible(true);
        log.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        log.setSize(790,488);
        for(int i=0;i<100;i++)
        {
            try {
                Thread.sleep(55);
            } catch (InterruptedException ex) {
                Logger.getLogger(EmpSoft.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        log.dispose();
        
        LoginScreen ls=new LoginScreen();
        ls.setVisible(true);
        ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ls.setSize(766,485);
    }   
}
