
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.Timer;
import java.io.*;

import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btn1.setBackground(new java.awt.Color(255, 51, 51));
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("A");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(20, 95, 80, 540);

        btn2.setBackground(new java.awt.Color(255, 51, 51));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("B");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(100, 205, 80, 430);

        btn3.setBackground(new java.awt.Color(255, 51, 51));
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("C");
        getContentPane().add(btn3);
        btn3.setBounds(180, 275, 80, 360);

        btn4.setBackground(new java.awt.Color(255, 51, 51));
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("D");
        getContentPane().add(btn4);
        btn4.setBounds(260, 345, 80, 290);

        btn5.setBackground(new java.awt.Color(255, 51, 51));
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("E");
        getContentPane().add(btn5);
        btn5.setBounds(340, 415, 80, 220);

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1040, 480, 79, 25);

        jButton7.setText("Bubble Sort");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(290, 10, 180, 60);

        btn6.setBackground(new java.awt.Color(255, 51, 51));
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("F");
        getContentPane().add(btn6);
        btn6.setBounds(420, 465, 80, 170);

        btn7.setBackground(new java.awt.Color(255, 51, 51));
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("G");
        getContentPane().add(btn7);
        btn7.setBounds(500, 505, 80, 130);

        btn8.setBackground(new java.awt.Color(255, 51, 51));
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("H");
        getContentPane().add(btn8);
        btn8.setBounds(580, 545, 80, 90);

        btn9.setBackground(new java.awt.Color(255, 51, 51));
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("I");
        getContentPane().add(btn9);
        btn9.setBounds(660, 575, 80, 60);

        btn10.setBackground(new java.awt.Color(255, 51, 51));
        btn10.setForeground(new java.awt.Color(255, 255, 255));
        btn10.setText("J");
        getContentPane().add(btn10);
        btn10.setBounds(740, 595, 80, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(760, 660, 0, 0);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(680, 660, 0, 0);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 660, 0, 0);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 660, 0, 0);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 660, 0, 0);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 660, 0, 0);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 660, 0, 0);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 660, 0, 0);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 660, 0, 0);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 660, 0, 0);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1000, 290, 79, 25);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1020, 620, 79, 25);

        jButton4.setText("Linear Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(510, 10, 200, 60);

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(310, 660, 310, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int z = 1;
    int k = 0;
    int j = 0;
    int m = 0;
    int h = 0;
  
    
    JButton arBt[] = new JButton[10];
    public Timer timer = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int m = 0;m<10;++m)
                arrBtn[m].setBackground(Color.red);
            if(btn1.getLocation().x == posX[9]){
                btn1.setBackground(Color.green);
            }
            
            if(btn2.getLocation().x == posX[8]){
                btn2.setBackground(Color.green);
            }
            
            if(btn3.getLocation().x == posX[7]){
                btn3.setBackground(Color.green);
            }
            
            if(btn4.getLocation().x == posX[6]){
                btn4.setBackground(Color.green);
            }
            
            if(btn5.getLocation().x == posX[5]){
                btn5.setBackground(Color.green);
            }
            
            if(btn6.getLocation().x == posX[4]){
                btn6.setBackground(Color.green);
            }
            
            if(btn7.getLocation().x == posX[3]){
                btn7.setBackground(Color.green);
            }
            
            if(btn8.getLocation().x == posX[2]){
                btn8.setBackground(Color.green);
            }
            
            if(btn9.getLocation().x == posX[1]){
                btn9.setBackground(Color.green);
            }
            
            if(btn10.getLocation().x == posX[0]){
                btn10.setBackground(Color.green);
            }
            
            System.out.println(k);
            if (k >= n - 1) {
                timer.stop();
            }
            jButton6.doClick();
        }
    });
    
    
    
    
    public Timer timerr = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(h>=10){
                timerr.stop();
            }
            for(int g = 0;g<10;++g){
                arBt[g].setBackground(Color.black);
            }
            jButton3.doClick();
        }
    });

    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (j > n - k - 1) {
            ++k;
            j = 0;
        }
        if (k < n - 1) {
            if (j < n - k - 1) {
                arrBtn[j].setBackground(Color.black);
                arrBtn[j + 1].setBackground(Color.black);
                if (heightArr[j] > heightArr[j + 1]) {
                    int posX1 = arrBtn[j].getLocation().x;
                    int posX2 = arrBtn[j + 1].getLocation().x;
                    int posY2 = arrBtn[j].getLocation().y;
                    int posY1 = arrBtn[j + 1].getLocation().y;
                    int temp = heightArr[j];
                    heightArr[j] = heightArr[j + 1];
                    heightArr[j + 1] = temp;

                    arrBtn[j].setLocation(posX2, posY2);
                    arrBtn[j + 1].setLocation(posX1, posY1);

                    for (int i = 0; i < 10; ++i) {
                        if (tmpPosX[i] == btn1.getLocation().x) {
                            arrBtn[i] = btn1;
                        } else if (tmpPosX[i] == btn2.getLocation().x) {
                            arrBtn[i] = btn2;
                        } else if (tmpPosX[i] == btn3.getLocation().x) {
                            arrBtn[i] = btn3;
                        } else if (tmpPosX[i] == btn4.getLocation().x) {
                            arrBtn[i] = btn4;
                        } else if (tmpPosX[i] == btn5.getLocation().x) {
                            arrBtn[i] = btn5;
                        } else if (tmpPosX[i] == btn6.getLocation().x) {
                            arrBtn[i] = btn6;
                        } else if (tmpPosX[i] == btn7.getLocation().x) {
                            arrBtn[i] = btn7;
                        } else if (tmpPosX[i] == btn8.getLocation().x) {
                            arrBtn[i] = btn8;
                        } else if (tmpPosX[i] == btn9.getLocation().x) {
                            arrBtn[i] = btn9;
                        } else if (tmpPosX[i] == btn10.getLocation().x) {
                            arrBtn[i] = btn10;
                        }

                    }
                }

            }
            ++j;
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        timer.start();
    }//GEN-LAST:event_btn2ActionPerformed
    JButton btnArr[] = new JButton[10];
    JButton arrBtn[] = new JButton[10];
    int[] heightArr = new int[10];
    int[] posX = new int[10];
    int[] tmpPosX = new int[10];
    int n = 10;
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        btnArr[0] = btn1;
        btnArr[1] = btn2;
        btnArr[2] = btn3;
        btnArr[3] = btn4;
        btnArr[4] = btn5;
        btnArr[5] = btn6;
        btnArr[6] = btn7;
        btnArr[7] = btn8;
        btnArr[8] = btn9;
        btnArr[9] = btn10;
        for (int i = 0; i < 10; ++i) {
            posX[i] = btnArr[i].getLocation().x;
        }
        for (int i = 0; i < 10; ++i) {
            tmpPosX[i] = posX[i];
        }

        System.out.println(Arrays.toString(tmpPosX));

        int np = tmpPosX.length;
        for (int i = 0; i < np - 1; i++) {
            for (int j = 0; j < np - i - 1; j++) {
                if (tmpPosX[j] > tmpPosX[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = tmpPosX[j];
                    tmpPosX[j] = tmpPosX[j + 1];
                    tmpPosX[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(tmpPosX));

        for (int i = 0; i < 10; ++i) {
            if (tmpPosX[i] == btn1.getLocation().x) {
                arrBtn[i] = btn1;
            } else if (tmpPosX[i] == btn2.getLocation().x) {
                arrBtn[i] = btn2;
            } else if (tmpPosX[i] == btn3.getLocation().x) {
                arrBtn[i] = btn3;
            } else if (tmpPosX[i] == btn4.getLocation().x) {
                arrBtn[i] = btn4;
            } else if (tmpPosX[i] == btn5.getLocation().x) {
                arrBtn[i] = btn5;
            } else if (tmpPosX[i] == btn6.getLocation().x) {
                arrBtn[i] = btn6;
            } else if (tmpPosX[i] == btn7.getLocation().x) {
                arrBtn[i] = btn7;
            } else if (tmpPosX[i] == btn8.getLocation().x) {
                arrBtn[i] = btn8;
            } else if (tmpPosX[i] == btn9.getLocation().x) {
                arrBtn[i] = btn9;
            } else if (tmpPosX[i] == btn10.getLocation().x) {
                arrBtn[i] = btn10;
            }

        }

        for (int i = 0; i < 10; ++i) {
            heightArr[i] = arrBtn[i].getSize().height;
        }
        timer.start();


    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jButton6.setVisible(false);
jButton2.setVisible(false);
jButton3.setVisible(false);
arBt[0] = btn10;
arBt[1] = btn9;
arBt[2] = btn8;
arBt[3] = btn7;
arBt[4] = btn6;
arBt[5] = btn5;
arBt[6] = btn4;
arBt[7] = btn3;
arBt[8] = btn2;
arBt[9] = btn1;

    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed
JButton bt[] = new JButton[10];
String fi;
String s1[] = new String[10];
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

if(h<10){
    if(s1[h].equals(fi)){
        jLabel12.setText("Element Found!!");
        timerr.stop();
    }
    bt[h].setBackground(Color.MAGENTA);
    ++h;
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
bt[0] = btn10;
bt[1] = btn9;
bt[2] = btn8;
bt[3] = btn7;
bt[4] = btn6;
bt[5] = btn5;
bt[6] = btn4;
bt[7] = btn3;
bt[8] = btn2;
bt[9] = btn1;
fi = JOptionPane.showInputDialog(null,"Enter Element to find:- ");
for(int u = 0; u<10; ++u){
    s1[u] = bt[u].getText();
}
        timerr.start();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
