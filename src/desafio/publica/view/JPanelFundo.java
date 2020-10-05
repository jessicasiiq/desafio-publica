package desafio.publica.view;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelFundo extends JPanel {

    /*
    Classe feita para a mudança de background do Jframe
     */
    private ImageIcon fundo;

    public JPanelFundo() {
        fundo = new ImageIcon();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fundo.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
    }

    public ImageIcon getFundo() {
        return fundo;
    }

    public void setFundo(ImageIcon fundo) {
        this.fundo = fundo;
    }

}
