/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.beingZero.MineSweeper1;


//import in.beingZero.MineSweeper1.Model1;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author karthik-pc
 */
public class MineSweeperGUI1 extends javax.swing.JFrame {
    /**
     * Creates new form MineSweeperGUI1
     */
    
    
    public MineSweeperGUI1()
    {
        initComponents();
        initGame();
        
       
    }
    
    JPanel pnl1=new JPanel();
    int rows=9,cols=9,mines=10;
     JButton[][] buttons = new JButton[rows][cols];
     ImageIcon CLOSED = new ImageIcon("images\\closed.gif");
     ImageIcon MINE = new ImageIcon("images\\mine.gif");
     ImageIcon FLAG = new ImageIcon("images\\Flag.gif");
     int Image_Size = 40;
    Model1 mod;
    
    
    
    
    
    

     void initGame() {
            
        mod = new Model1(rows, cols, mines);
        if(pnl1!=null)
            this.remove(pnl1);
        pnl1 = new JPanel();
        pnl1.setLayout(new GridLayout(rows, cols));
        pnl1.setSize(cols * Image_Size, rows * Image_Size);
        
       


         
        
            for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
 
                buttons[i][j] = new JButton(CLOSED);
                buttons[i][j].addMouseListener(new buttonClickListener(i, j));
                pnl1.add(buttons[i][j]);
                buttons[i][j].setSize(40, 40);
                
            }
        }
            this.getContentPane().add(pnl1);
            this.setSize(cols * Image_Size+50, rows * Image_Size+70);
            this.setVisible(false);
            this.setVisible(true);
            
           
    
    }
     
     
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGame = new javax.swing.JMenu();
        mnuiNewGame = new javax.swing.JCheckBoxMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuiAbout = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuGame.setText("Game");

        mnuiNewGame.setSelected(true);
        mnuiNewGame.setText("NEWGAME");
        mnuiNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiNewGameActionPerformed(evt);
            }
        });
        mnuGame.add(mnuiNewGame);

        jMenuBar1.add(mnuGame);

        mnuHelp.setText("Help");

        mnuiAbout.setSelected(true);
        mnuiAbout.setText("About");
        mnuiAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiAboutActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuiAbout);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuiAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiAboutActionPerformed
        JOptionPane.showMessageDialog(this, "Author:Karthik \n Version 2.0");

    }//GEN-LAST:event_mnuiAboutActionPerformed

    private void mnuiNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiNewGameActionPerformed
                    // TODO add your handling code here:
if(mnuiNewGame.isSelected())
{
    initGame();
}

    }//GEN-LAST:event_mnuiNewGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MineSweeperGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MineSweeperGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MineSweeperGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MineSweeperGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MineSweeperGUI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuGame;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JCheckBoxMenuItem mnuiAbout;
    private javax.swing.JCheckBoxMenuItem mnuiNewGame;
    // End of variables declaration//GEN-END:variables

    private class buttonClickListener implements MouseListener {
        int i,j;

        public buttonClickListener(int i, int j) {
            this.i=i;
            this.j=j;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if(mod.getState()!=Model1.INPROGRESS)
                return;
            if(SwingUtilities.isLeftMouseButton(e))
            {
                int gameState=mod.click(i, j);
                switch(gameState)
                {
                    case Model1.OVER :
                        updateGUIForOver();
                            break;
                    case Model1.INPROGRESS:
                        updateGUIForClick();
                        break;
                    case Model1.WON:
                        JOptionPane.showMessageDialog(null, "YOU WON", "CONGRATS", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
            else
            {
                if(mod.isOpen(i, j))
                    return;
                mod.toggleFlag(i,j);
                if(mod.isFlagged(i, j))
                   buttons[i][j].setIcon(FLAG);
                else
                     buttons[i][j].setIcon(CLOSED);
            
            }
            
        
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        private void updateGUIForClick() {
            ImageIcon NEIGHBOURCOUNT;
            for(int i=0;i<rows;i++)
                for(int j=0;j<cols;j++)
                    if(mod.isOpen(i, j))
                    {
                        NEIGHBOURCOUNT= new ImageIcon("images\\"+mod.newNeighbourCount(i, j)+".gif");
                        buttons[i][j].setIcon(NEIGHBOURCOUNT);
                    }
        }

        private void updateGUIForOver() {
            ImageIcon NEIGHBOURCOUNT;
            for(int i=0;i<rows;i++)
                for(int j=0;j<cols;j++)
                    if(mod.isMine(i,j))
                    {
                        buttons[i][j].setIcon(MINE);
                    }
                    else
                    {
                       NEIGHBOURCOUNT = new ImageIcon("images\\"+mod.newNeighbourCount(i, j)+".gif"); 
                       buttons[i][j].setIcon(NEIGHBOURCOUNT);
                    }
        
        
        }
        
         
    
    
    }
}
