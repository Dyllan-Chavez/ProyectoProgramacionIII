
package g5_6001066_6001063.interfacesG;

import javax.swing.JPanel;

public class FrameGenerico extends MetodosInterfaces{

    public FrameGenerico() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoJP.setMaximumSize(new java.awt.Dimension(1152, 648));
        fondoJP.setMinimumSize(new java.awt.Dimension(1152, 648));
        fondoJP.setPreferredSize(new java.awt.Dimension(1152, 648));
        fondoJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(fondoJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondoJP;
    // End of variables declaration//GEN-END:variables

    public JPanel getFondoJP() {
        return fondoJP;
    }
    
}