package ac.ifunpas.prakpem2.ui;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Aji Nuansa Sengarie
 */
public class UiSwing193040046 extends JFrame{
    private JLabel lblHobi;
    private JCheckBox cbHobi1, cbHobi2;
    private JLabel lblGender;
    private JRadioButton rbGender1, rbGender2;
    private JPanel p;
    ButtonGroup grup = new ButtonGroup();
    
    
    public UiSwing193040046(){
    lblHobi = new JLabel();
    cbHobi1 = new JCheckBox("Membaca");
    cbHobi2 = new JCheckBox("Lainnya");
    lblGender = new JLabel();
    rbGender1 = new JRadioButton("L");
    rbGender2 = new JRadioButton("P");
    p = new JPanel();
    
    lblHobi.setText("Hobi : ");
    lblGender.setText("Gender : ");
    
    p.add(lblHobi);
    p.add(cbHobi1);
    p.add(cbHobi2);
    p.add(lblGender);
    p.add(rbGender1);
    grup.add(rbGender1);
    p.add(rbGender2);
    grup.add(rbGender2);
    
    this.add(p);
        
    this.setLayout(new FlowLayout());
    }
    
    public static void main(String[] args) {
        UiSwing193040046 ui = new UiSwing193040046();
        ui.setSize(500, 100);
        ui.setVisible(true);
    }
}
