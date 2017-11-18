package matrices;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luffynando
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dimensionM = new javax.swing.JTextPane();
        DimensionButton = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        IMButton = new javax.swing.JButton();
        im11 = new java.awt.TextField();
        im21 = new java.awt.TextField();
        im31 = new java.awt.TextField();
        im41 = new java.awt.TextField();
        im42 = new java.awt.TextField();
        im32 = new java.awt.TextField();
        im22 = new java.awt.TextField();
        im12 = new java.awt.TextField();
        im24 = new java.awt.TextField();
        im34 = new java.awt.TextField();
        im44 = new java.awt.TextField();
        im14 = new java.awt.TextField();
        im13 = new java.awt.TextField();
        im23 = new java.awt.TextField();
        im33 = new java.awt.TextField();
        im43 = new java.awt.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        val_det = new java.awt.TextField();
        S = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jPanel5 = new javax.swing.JPanel();
        a11t = new java.awt.TextField();
        a31t = new java.awt.TextField();
        a32t = new java.awt.TextField();
        a12t = new java.awt.TextField();
        a21t = new java.awt.TextField();
        a22t = new java.awt.TextField();
        a41t = new java.awt.TextField();
        a42t = new java.awt.TextField();
        a13t = new java.awt.TextField();
        a14t = new java.awt.TextField();
        a33t = new java.awt.TextField();
        a34t = new java.awt.TextField();
        a23t = new java.awt.TextField();
        a24t = new java.awt.TextField();
        a43t = new java.awt.TextField();
        a44t = new java.awt.TextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        jPanel7 = new javax.swing.JPanel();
        a11a = new java.awt.TextField();
        a31a = new java.awt.TextField();
        a32a = new java.awt.TextField();
        a12a = new java.awt.TextField();
        a21a = new java.awt.TextField();
        a22a = new java.awt.TextField();
        a41a = new java.awt.TextField();
        a42a = new java.awt.TextField();
        a13a = new java.awt.TextField();
        a14a = new java.awt.TextField();
        a33a = new java.awt.TextField();
        a34a = new java.awt.TextField();
        a23a = new java.awt.TextField();
        a24a = new java.awt.TextField();
        a43a = new java.awt.TextField();
        a44a = new java.awt.TextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        jPanel9 = new javax.swing.JPanel();
        a11i = new java.awt.TextField();
        a31i = new java.awt.TextField();
        a32i = new java.awt.TextField();
        a12i = new java.awt.TextField();
        a21i = new java.awt.TextField();
        a22i = new java.awt.TextField();
        a41i = new java.awt.TextField();
        a42i = new java.awt.TextField();
        a13i = new java.awt.TextField();
        a14i = new java.awt.TextField();
        a33i = new java.awt.TextField();
        a34i = new java.awt.TextField();
        a23i = new java.awt.TextField();
        a24i = new java.awt.TextField();
        a43i = new java.awt.TextField();
        a44i = new java.awt.TextField();

        jFrame1.setBounds(new java.awt.Rectangle(100, 100, 400, 400));

        jLabel1.setText("Dimension de Matriz");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("1. Matriz de (2 x 2)");

        jLabel3.setText("2. Matriz de (3 x 3)");

        jLabel4.setText("3. Matriz de (4 x 4)");

        jScrollPane1.setViewportView(dimensionM);

        DimensionButton.setText("OK");
        DimensionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DimensionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DimensionButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DimensionButton)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jFrame1.setVisible(true);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jFrame2.setBounds(new java.awt.Rectangle(100, 100, 400, 400));

        jLabel5.setText("Ingrese su matriz");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        IMButton.setText("OK");
        IMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMButtonActionPerformed(evt);
            }
        });

        im11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im11ActionPerformed(evt);
            }
        });

        im31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                im31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(134, 134, 134))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(im11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im41, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(im42, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(im13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im43, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMButton)
                    .addComponent(im24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im44, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(im14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(im11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(im21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(im31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(im41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(im12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(im22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(im32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(im42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(im14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(im24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(im34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(im44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(im13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(im23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(im33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(im43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(IMButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("Valor de la determinante");

        val_det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val_detActionPerformed(evt);
            }
        });

        S.setText("Salir");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(val_det, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(S)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(val_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setText("Matriz trans");

        a11t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11tActionPerformed(evt);
            }
        });

        a31t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31tActionPerformed(evt);
            }
        });

        a32t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32tActionPerformed(evt);
            }
        });

        a12t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12tActionPerformed(evt);
            }
        });

        a21t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21tActionPerformed(evt);
            }
        });

        a22t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22tActionPerformed(evt);
            }
        });

        a41t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a41tActionPerformed(evt);
            }
        });

        a42t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a42tActionPerformed(evt);
            }
        });

        a13t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13tActionPerformed(evt);
            }
        });

        a14t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14tActionPerformed(evt);
            }
        });

        a33t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a33tActionPerformed(evt);
            }
        });

        a34t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34tActionPerformed(evt);
            }
        });

        a23t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23tActionPerformed(evt);
            }
        });

        a24t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24tActionPerformed(evt);
            }
        });

        a43t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a43tActionPerformed(evt);
            }
        });

        a44t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a44tActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(a11t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(a12t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(a41t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a42t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(a31t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a32t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(a21t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(a22t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(a13t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(a14t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(a33t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a34t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(a23t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(a24t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(a43t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a44t, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a14t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a13t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a21t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a22t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a31t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a32t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a41t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a42t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a23t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a24t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a33t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a34t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a43t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a44t, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Matriz trans", jPanel2);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setText("Matriz adj");

        a11a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11aActionPerformed(evt);
            }
        });

        a31a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31aActionPerformed(evt);
            }
        });

        a32a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32aActionPerformed(evt);
            }
        });

        a12a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12aActionPerformed(evt);
            }
        });

        a21a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21aActionPerformed(evt);
            }
        });

        a22a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22aActionPerformed(evt);
            }
        });

        a41a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a41aActionPerformed(evt);
            }
        });

        a42a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a42aActionPerformed(evt);
            }
        });

        a13a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13aActionPerformed(evt);
            }
        });

        a14a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14aActionPerformed(evt);
            }
        });

        a33a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a33aActionPerformed(evt);
            }
        });

        a34a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34aActionPerformed(evt);
            }
        });

        a23a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23aActionPerformed(evt);
            }
        });

        a24a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24aActionPerformed(evt);
            }
        });

        a43a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a43aActionPerformed(evt);
            }
        });

        a44a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a44aActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(a11a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(a12a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(a41a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a42a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(a31a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a32a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(a21a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(a22a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(a13a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(a14a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(a33a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a34a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(a23a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(a24a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(a43a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a44a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a14a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a13a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a21a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a22a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a31a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a32a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a41a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a42a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a23a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a24a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a33a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a34a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a43a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a44a, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Matriz adj", jPanel3);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setText("Matriz inv");

        a11i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11iActionPerformed(evt);
            }
        });

        a31i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31iActionPerformed(evt);
            }
        });

        a32i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32iActionPerformed(evt);
            }
        });

        a12i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12iActionPerformed(evt);
            }
        });

        a21i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21iActionPerformed(evt);
            }
        });

        a22i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22iActionPerformed(evt);
            }
        });

        a41i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a41iActionPerformed(evt);
            }
        });

        a42i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a42iActionPerformed(evt);
            }
        });

        a13i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13iActionPerformed(evt);
            }
        });

        a14i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14iActionPerformed(evt);
            }
        });

        a33i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a33iActionPerformed(evt);
            }
        });

        a34i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34iActionPerformed(evt);
            }
        });

        a23i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23iActionPerformed(evt);
            }
        });

        a24i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24iActionPerformed(evt);
            }
        });

        a43i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a43iActionPerformed(evt);
            }
        });

        a44i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a44iActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(a11i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(a12i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(a41i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a42i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(a31i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a32i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(a21i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(a22i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(a13i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(a14i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(a33i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a34i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(a23i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(a24i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(a43i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a44i, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a14i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a13i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a21i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a22i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a31i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a32i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a41i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a42i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a23i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a24i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a33i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a34i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a43i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a44i, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Matriz inv", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Matriz trans");

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void a11tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11tActionPerformed
      
    }//GEN-LAST:event_a11tActionPerformed

    private void a31tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a31tActionPerformed

    private void a32tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a32tActionPerformed

    private void a12tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a12tActionPerformed

    private void a21tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a21tActionPerformed

    private void a22tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a22tActionPerformed

    private void a41tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a41tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a41tActionPerformed

    private void a42tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a42tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a42tActionPerformed

    private void a13tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a13tActionPerformed

    private void a14tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a14tActionPerformed

    private void a33tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a33tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a33tActionPerformed

    private void a34tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a34tActionPerformed

    private void a23tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a23tActionPerformed

    private void a24tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a24tActionPerformed

    private void a43tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a43tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a43tActionPerformed

    private void a44tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a44tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a44tActionPerformed

    private void a11aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a11aActionPerformed

    private void a31aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a31aActionPerformed

    private void a32aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a32aActionPerformed

    private void a12aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a12aActionPerformed

    private void a21aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a21aActionPerformed

    private void a22aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a22aActionPerformed

    private void a41aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a41aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a41aActionPerformed

    private void a42aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a42aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a42aActionPerformed

    private void a13aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a13aActionPerformed

    private void a14aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a14aActionPerformed

    private void a33aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a33aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a33aActionPerformed

    private void a34aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a34aActionPerformed

    private void a23aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a23aActionPerformed

    private void a24aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a24aActionPerformed

    private void a43aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a43aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a43aActionPerformed

    private void a44aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a44aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a44aActionPerformed

    private void a11iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a11iActionPerformed

    private void a31iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a31iActionPerformed

    private void a32iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a32iActionPerformed

    private void a12iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a12iActionPerformed

    private void a21iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a21iActionPerformed

    private void a22iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a22iActionPerformed

    private void a41iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a41iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a41iActionPerformed

    private void a42iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a42iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a42iActionPerformed

    private void a13iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a13iActionPerformed

    private void a14iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a14iActionPerformed

    private void a33iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a33iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a33iActionPerformed

    private void a34iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a34iActionPerformed

    private void a23iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a23iActionPerformed

    private void a24iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a24iActionPerformed

    private void a43iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a43iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a43iActionPerformed

    private void a44iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a44iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a44iActionPerformed

    private void DimensionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DimensionButtonActionPerformed
       //Aqui es la comparacion de la primer ventana deberas hacer tu verificacion para proceder
        //y capturar lo que el usuario ingreso, tambien deberas poner los textfield que no deban ser visualizados
        try{
            int aux= (int) Integer.parseInt(dimensionM.getText());
            if (aux >0 && aux<4 ){
                //Lleno la lista
                ArrayList<java.awt.TextField> lista = new ArrayList<>();
                lista.add(im11);
                lista.add(im12);
                lista.add(im13);
                lista.add(im14);
                lista.add(im21);
                lista.add(im22);
                lista.add(im23);
                lista.add(im24);
                lista.add(im31);
                lista.add(im32);
                lista.add(im33);
                lista.add(im34);
                lista.add(im41);
                lista.add(im42);
                lista.add(im43);
                lista.add(im44);
                //Exito entonces aux es el numero de opcion
                //aqui estarian los case 1, 2, 3 
                //case 1 2x2 elementos involucrados son im11, im12, im21, im22
                //case 2 3x3 elementos involucrados son im11, im12, im13, im21, im22, im23, im31,im32, im33
                //cas 3 4x4 todos los elementos involucrados im11, im12, im13, im14, im21, im22, im23, im24, etc
                func.setMatrizIngresar(lista, aux);
                    jFrame1.setVisible(false);
                    jFrame2.setVisible(true);
                
            }else{
                Integer.parseInt(JOptionPane.showInputDialog("SOLO PUEDE ESCOJER LAS SIG OPCIONES 1, 2 O 3 :D", S));
            }
        }catch(NumberFormatException e){
            //el usuario ingreso un valor como letra o asi y eso no esta permitido
        }
    }//GEN-LAST:event_DimensionButtonActionPerformed

    private void IMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMButtonActionPerformed
        //Aqui es la comparacion de la segunda ventana deberas hacer tu verificacion para proceder
        //y capturar lo que el usuario ingreso, tambien deberas poner los textfield que no deban ser visualizados
        float a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,opcion,a11,a12,a13,a14,a21,a22,a23,a24,a31,a32,a33,a34,a41,a42,a43,a44,determ,ai,ai11,ai12,ai13,ai14,ai21,ai22,ai23,ai24,ai31,ai32,ai33,ai34,ai41,ai42,ai43,ai44;
        switch (dimensionM.getText()){
            case "1":
                 a = Float.parseFloat(im11.getText());
                 b = Float.parseFloat(im12.getText());
                 c = Float.parseFloat(im21.getText());
                 d = Float.parseFloat(im22.getText());
                 /** Operacion Determinate **/
                determ = (a*d)-((b*c));
                 ai=1/determ;
                 if (determ==0) {
               JOptionPane.showMessageDialog(null,"Esta matriz no tiene Inversa" +
                       "\n"+a + "   " +b+
                       "\n"+c + "   " +d);

               break;
           } else {
                 String det=String.valueOf(determ);
                 val_det.setText(det);
                 /** Operacion Matriz Transpuesta **/
                 
                 String uno =String.valueOf(a);
                 a11t.setText(uno);
                 String dos =String.valueOf(c);
                 a12t.setText(dos);
                 String tres =String.valueOf(b);
                 a21t.setText(tres);
                 String cuatr =String.valueOf(d);
                 a22t.setText(cuatr);
                 
               /** Operacion Matriz adjunta **/
               
               String ad11 =String.valueOf(d);
                 a11a.setText(ad11);
                 String ad12 =String.valueOf(-(b));
                 a12a.setText(ad12);
                 String ad21 =String.valueOf(-(c));
                 a21a.setText(ad21);
                 String ad22 =String.valueOf(a);
                 a22a.setText(ad22);
                 
                 /** Operacion Matriz Inverza **/
               
               String i11 =String.valueOf(d*ai);
                 a11i.setText(i11);
                 String i12 =String.valueOf(-(b)*ai);
                 a12i.setText(i12);
                 String i21 =String.valueOf(-(c)*ai);
                 a21i.setText(i21);
                 String i22 =String.valueOf(a*ai);
                 a22i.setText(i22);
                 
                 
                 
                 
                 jFrame2.setVisible(false);
                 setVisible(true);
                     }
                 break;
            case "2":
                
                 a = Float.parseFloat(im11.getText());
                 b = Float.parseFloat(im12.getText());
                 c = Float.parseFloat(im13.getText());
                 d = Float.parseFloat(im21.getText());
                 e = Float.parseFloat(im22.getText());
                 f = Float.parseFloat(im23.getText());
                 g = Float.parseFloat(im31.getText());
                 h = Float.parseFloat(im32.getText());
                 i = Float.parseFloat(im33.getText());
                 /** Operacion Determinate **/
                determ = (a*e*i)+(d*h*c)+(g*b*f)-((c*e*g)+(h*f*a)+(i*d*b));
                 ai=1/determ;
                 if (determ==0) {
               JOptionPane.showMessageDialog(null,"Esta matriz no tiene Inversa" +
                       "\n"+a + "   " +b+ "   " +c +
                       "\n"+d + "   " +e+ "   " +f +
                       "\n"+g + "   " +h+ "   " +i);

               break;
           } else {
                 String det=String.valueOf(determ);
                 val_det.setText(det);
                 
                 /** Operacion Matriz Transpuesta **/
                 
                 String uno =String.valueOf(a);
                 a11t.setText(uno);
                 String dos =String.valueOf(d);
                 a12t.setText(dos);
                 String tres =String.valueOf(g);
                 a13t.setText(tres);
                 String cuatr =String.valueOf(b);
                 a21t.setText(cuatr);
                 String cin =String.valueOf(e);
                 a22t.setText(cin);
                 String se =String.valueOf(h);
                 a23t.setText(se);
                 String sie =String.valueOf(c);
                 a31t.setText(sie);
                 String oc =String.valueOf(f);
                 a32t.setText(oc);
                 String nine =String.valueOf(i);
                 a33t.setText(nine);
                 
               /** Operacion Matriz adjunta **/
               
               String ad11 =String.valueOf((e*i)-(f*h));
                 a11a.setText(ad11);
                 String ad12 =String.valueOf(-((d*i)-(f*g)));
                 a12a.setText(ad12);
                 String ad13 =String.valueOf((d*h)-(e*g));
                 a13a.setText(ad13);
                 String ad21 =String.valueOf(-((b*i)-(c*h)));
                 a21a.setText(ad21);
                 String ad22 =String.valueOf((a*i)-(c*g));
                 a22a.setText(ad22);
                 String ad23 =String.valueOf(-((a*h)-(b*g)));
                 a23a.setText(ad23);
                 String ad31 =String.valueOf((b*f)-(e*c));
                 a31a.setText(ad31);
                 String ad32 =String.valueOf(-((a*f)-(d*c)));
                 a32a.setText(ad32);
                 String ad33 =String.valueOf((a*e)-(d*b));
                 a33a.setText(ad33);
                 
                 /** Operacion Matriz Inverza **/
               
               String i11 =String.valueOf((e*i)-(f*h));
                 a11i.setText(i11);
                 String i12 =String.valueOf(-((d*i)-(f*g)));
                 a12i.setText(i12);
                 String i13 =String.valueOf((d*h)-(e*g));
                 a13i.setText(i13);
                 String i21 =String.valueOf(-((b*i)-(c*h)));
                 a21i.setText(i21);
                 String i22 =String.valueOf((a*i)-(c*g));
                 a22i.setText(i22);
                 String i23 =String.valueOf(-((a*h)-(b*g)));
                 a23i.setText(i23);
                 String i31 =String.valueOf((b*f)-(e*c));
                 a31i.setText(i31);
                 String i32 =String.valueOf(-((a*f)-(d*c)));
                 a32i.setText(i32);
                 String i33 =String.valueOf((a*e)-(d*b));
                 a33i.setText(i33);
                 
                 jFrame2.setVisible(false);
                 setVisible(true);
                     }
                break;
                
            case "3":
                //4x4 ta hard LOL 
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese ynnuemro de 1 a 3 segun su matriz ");
                break;
        }             
    }//GEN-LAST:event_IMButtonActionPerformed

    private void val_detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val_detActionPerformed
    }//GEN-LAST:event_val_detActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
    System.exit(0);
    }//GEN-LAST:event_SActionPerformed

    private void im31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_im31ActionPerformed

    private void im11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_im11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_im11ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DimensionButton;
    private javax.swing.JButton IMButton;
    private javax.swing.JButton S;
    public static java.awt.TextField a11a;
    public static java.awt.TextField a11i;
    public static java.awt.TextField a11t;
    public static java.awt.TextField a12a;
    public static java.awt.TextField a12i;
    public static java.awt.TextField a12t;
    public static java.awt.TextField a13a;
    public static java.awt.TextField a13i;
    public static java.awt.TextField a13t;
    public static java.awt.TextField a14a;
    public static java.awt.TextField a14i;
    public static java.awt.TextField a14t;
    public static java.awt.TextField a21a;
    public static java.awt.TextField a21i;
    public static java.awt.TextField a21t;
    public static java.awt.TextField a22a;
    public static java.awt.TextField a22i;
    public static java.awt.TextField a22t;
    public static java.awt.TextField a23a;
    public static java.awt.TextField a23i;
    public static java.awt.TextField a23t;
    public static java.awt.TextField a24a;
    public static java.awt.TextField a24i;
    public static java.awt.TextField a24t;
    public static java.awt.TextField a31a;
    public static java.awt.TextField a31i;
    public static java.awt.TextField a31t;
    public static java.awt.TextField a32a;
    public static java.awt.TextField a32i;
    public static java.awt.TextField a32t;
    public static java.awt.TextField a33a;
    public static java.awt.TextField a33i;
    public static java.awt.TextField a33t;
    public static java.awt.TextField a34a;
    public static java.awt.TextField a34i;
    public static java.awt.TextField a34t;
    public static java.awt.TextField a41a;
    public static java.awt.TextField a41i;
    public static java.awt.TextField a41t;
    public static java.awt.TextField a42a;
    public static java.awt.TextField a42i;
    public static java.awt.TextField a42t;
    public static java.awt.TextField a43a;
    public static java.awt.TextField a43i;
    public static java.awt.TextField a43t;
    public static java.awt.TextField a44a;
    public static java.awt.TextField a44i;
    public static java.awt.TextField a44t;
    private javax.swing.JTextPane dimensionM;
    public static java.awt.TextField im11;
    public static java.awt.TextField im12;
    public static java.awt.TextField im13;
    public static java.awt.TextField im14;
    public static java.awt.TextField im21;
    public static java.awt.TextField im22;
    public static java.awt.TextField im23;
    public static java.awt.TextField im24;
    public static java.awt.TextField im31;
    public static java.awt.TextField im32;
    private java.awt.TextField im33;
    public static java.awt.TextField im34;
    public static java.awt.TextField im41;
    public static java.awt.TextField im42;
    public static java.awt.TextField im43;
    public static java.awt.TextField im44;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    public static java.awt.TextField val_det;
    // End of variables declaration//GEN-END:variables
    public static Funciones func= new Funciones();
}
