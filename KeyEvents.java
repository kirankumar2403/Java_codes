import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="KeyEvents" width=500 height=500></applet> */

public class KeyEvents extends Applet implements KeyListener {
    String msg = "u typed";
    int x = 10, y = 20;

    public void init() {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("key down");
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("key up");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }
}
