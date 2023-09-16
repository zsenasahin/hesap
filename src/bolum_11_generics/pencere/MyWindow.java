package bolum_11_generics.pencere;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event .WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title){
        super(title);
        setSize(500,300);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font sansSerif = new Font("SanSerif", Font.BOLD,10);
        g.setFont(sansSerif);
        g.drawString("JAVA DERSLERİ", 100,150);

        Font sansSerifKucuk = new Font("SanSerif", Font.BOLD, 12);
        g.setFont(sansSerifKucuk);
        g.drawString("by Emre Altunbilek", 100, 120);
    }
}
