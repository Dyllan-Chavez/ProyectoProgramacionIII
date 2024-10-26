
package g5_6001066_6001063.interfacesG;

import java.awt.Image;
import javax.swing.*;

public class MetodosInterfaces extends javax.swing.JFrame{

    public MetodosInterfaces(){
    }

    //Hace que la imagen se ajuste a el tamaño de un JLabel 
    public Icon setImageLabel(JLabel labelName, String ruta){ 
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
        return icon;
    }
    
    //Hace que la imagen se ajuste a el tamaño de un JButton 
    public Icon setImageBtn(JButton boton, String ruta){
        ImageIcon botonI = new ImageIcon(ruta);
        Icon icon = new ImageIcon(botonI.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setIcon(icon);
        boton.setContentAreaFilled(false);
        return icon;
    }

    //Hace que se ajuste la imagen de un boton al poner el mouse encima
    public void setImageBtnRollover(JButton boton, String ruta){
        ImageIcon botonI = new ImageIcon(ruta);
        Icon icon = new ImageIcon(botonI.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        boton.setRolloverIcon(icon);
    }
    
    //Cambia el panel a otro
    public void cambiarPanel(JPanel panelQuitar, JPanel panelPoner){
        panelPoner.setSize(1152, 648);
        panelPoner.setLocation(0,0);
        
        panelQuitar.revalidate();
        panelQuitar.removeAll();  // Eliminar el contenido actual
        panelQuitar.add(panelPoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1152, 648));  // Añadir el panel con coordenadas
        panelQuitar.revalidate();  // Refrescar la ventana
        panelQuitar.repaint();  // Redibujar los componentes
    }
    
}
