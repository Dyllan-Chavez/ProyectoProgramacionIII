
package g5_6001066_6001063.interfacesG;

import javax.swing.JPanel;

public class InicioJF extends MetodosInterfaces{

    public InicioJF() {
        initComponents();
        
        setImageLabel(tituloInicio,"src/Icons/TituloInicio.png");
        
        setImageBtn(botonJugar, "src/Icons/Botonjugar.png");
        botonJugar.setPressedIcon(setImageBtn(botonJugar, "src/Icons/Botonjugar.png"));
        setImageBtnRollover(botonJugar, "src/Icons/BotonJugar2.png");
        
        setImageBtn(botonCromos, "src/Icons/Botoncromos.png");
        botonCromos.setPressedIcon(setImageBtn(botonCromos, "src/Icons/Botoncromos.png"));
        setImageBtnRollover(botonCromos, "src/Icons/Botoncromos2.png");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoJP = new javax.swing.JPanel();
        botonCromos = new javax.swing.JButton();
        botonJugar = new javax.swing.JButton();
        tituloInicio = new javax.swing.JLabel();
        fondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoJP.setMaximumSize(new java.awt.Dimension(1152, 648));
        fondoJP.setMinimumSize(new java.awt.Dimension(1152, 648));
        fondoJP.setPreferredSize(new java.awt.Dimension(1152, 648));
        fondoJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCromos.setForeground(new java.awt.Color(255, 255, 255));
        botonCromos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Botoncromos.png"))); // NOI18N
        botonCromos.setBorder(null);
        botonCromos.setBorderPainted(false);
        botonCromos.setPreferredSize(new java.awt.Dimension(179, 378));
        botonCromos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCromosActionPerformed(evt);
            }
        });
        fondoJP.add(botonCromos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 279, 58));

        botonJugar.setBackground(new java.awt.Color(153, 204, 0));
        botonJugar.setForeground(new java.awt.Color(255, 255, 255));
        botonJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Botonjugar.png"))); // NOI18N
        botonJugar.setBorder(null);
        botonJugar.setBorderPainted(false);
        botonJugar.setContentAreaFilled(false);
        botonJugar.setPreferredSize(new java.awt.Dimension(179, 378));
        botonJugar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BotonJugar2.png"))); // NOI18N
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });
        fondoJP.add(botonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 279, 58));

        tituloInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/TituloInicio.png"))); // NOI18N
        fondoJP.add(tituloInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 690, 207));

        fondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fondo_Inicio.gif"))); // NOI18N
        fondoJP.add(fondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(fondoJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCromosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCromosActionPerformed
        CromosJF cromos = new CromosJF();
        cambiarPanel(fondoJP, cromos.getFondoJP());
    }//GEN-LAST:event_botonCromosActionPerformed

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        ElegirCategoriaJF elegirCategoria = new ElegirCategoriaJF();
        cambiarPanel(fondoJP, elegirCategoria.getFondoJP());
    }//GEN-LAST:event_botonJugarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCromos;
    private javax.swing.JButton botonJugar;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JPanel fondoJP;
    private javax.swing.JLabel tituloInicio;
    // End of variables declaration//GEN-END:variables

    public JPanel getFondoJP() {
        return fondoJP;
    }
    
}
