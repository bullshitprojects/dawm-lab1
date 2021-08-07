package Ejercicio1;

import Menu.frmMenu;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class frmCalculadora extends javax.swing.JFrame {

    String pantalla = "";
    double n1 = 0;
    double n2 = 0;
    int opc = 0;
    Operaciones operacion = new Operaciones();

    public frmCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        setPantalla();
        jPanel3.setVisible(false);
        jPanel1.setVisible(true);
    }

    public void setPantalla() {
        txtPantalla.setText(pantalla);
    }

    public void setNumeros(int opc_) {
        if (n1 == 0) {
            n1 = Double.parseDouble(pantalla);
            setPantalla2();
            opc = opc_;
        } else if (n1 != 0) {
            operar();
            lblSigno.setText("=");
            n1 = 0;
        }
    }

    public void operar() {
        try {
            n2 = Double.parseDouble(pantalla);
            switch (opc) {
                case 0:
                    break;
                case 1:
                    //operacion suma
                    pantalla = String.valueOf(operacion.Sumar(n1, n2));
                    setPantalla();
                    lblGuardado.setText(pantalla);
                    break;
                case 2:
                    // operacion resta
                    pantalla = String.valueOf(operacion.Restar(n1, n2));
                    setPantalla();
                    lblGuardado.setText(pantalla);
                    break;
                case 3:
                    // operacion Division
                    pantalla = String.valueOf(operacion.Dividir(n1, n2));
                    setPantalla();
                    lblGuardado.setText(pantalla);
                    break;
                case 4:
                    // operacion resta
                    pantalla = String.valueOf(operacion.Multiplicar(n1, n2));
                    setPantalla();
                    lblGuardado.setText(pantalla);
                    break;
                case 5:
                    // operacion potencia X a la Y
                    pantalla = String.valueOf(operacion.expY(n1, n2));
                    setPantalla();
                    lblGuardado.setText(pantalla);
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException e) {

        }

    }

    public void setPantalla2() {
        if (pantalla.length() > 0) {
            lblGuardado.setText(pantalla);
            pantalla = "";
            setPantalla();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtX2 = new javax.swing.JTextField();
        txtMensaje = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnExp2 = new javax.swing.JButton();
        btnExp3 = new javax.swing.JButton();
        btnExpY = new javax.swing.JButton();
        btnFact = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnSen = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtPantalla = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblGuardado = new javax.swing.JLabel();
        lblSigno = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(516, 541));
        setName("Calculadora"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(516, 541));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel3.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 113, 100, 50));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("A: ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 19, 30));

        txtA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 45, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("B: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 19, 30));

        txtB.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 45, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("C: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 30));

        txtC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 45, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("X1: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, 30));

        txtX1.setEditable(false);
        txtX1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtX1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 60, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("X2: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 30));

        txtX2.setEditable(false);
        txtX2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtX2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 60, -1));

        txtMensaje.setEditable(false);
        txtMensaje.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMensaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 200, 400, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 430, 300));

        btn8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn8.setText("8");
        btn8.setName("btn8"); // NOI18N
        btn8.setPreferredSize(null);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn7.setText("7");
        btn7.setName("btn7"); // NOI18N
        btn7.setPreferredSize(null);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn4.setText("4");
        btn4.setName("btn4"); // NOI18N
        btn4.setPreferredSize(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn5.setText("5");
        btn5.setName("btn5"); // NOI18N
        btn5.setPreferredSize(null);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn6.setText("6");
        btn6.setName("btn6"); // NOI18N
        btn6.setPreferredSize(null);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn2.setText("2");
        btn2.setPreferredSize(null);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn3.setText("3");
        btn3.setPreferredSize(null);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn1.setText("1");
        btn1.setPreferredSize(null);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn0.setText("0");
        btn0.setPreferredSize(null);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPunto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setPreferredSize(null);
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setPreferredSize(null);
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnMultiplicar.setText("X");
        btnMultiplicar.setPreferredSize(null);
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnResta.setText("-");
        btnResta.setPreferredSize(null);
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnSuma.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSuma.setText("+");
        btnSuma.setPreferredSize(null);
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnExp2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnExp2.setText("X²");
        btnExp2.setToolTipText("");
        btnExp2.setPreferredSize(null);
        btnExp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExp2ActionPerformed(evt);
            }
        });

        btnExp3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnExp3.setText("X³");
        btnExp3.setPreferredSize(null);
        btnExp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExp3ActionPerformed(evt);
            }
        });

        btnExpY.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnExpY.setText("Xʸ");
        btnExpY.setPreferredSize(null);
        btnExpY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpYActionPerformed(evt);
            }
        });

        btnFact.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnFact.setText("n!");
        btnFact.setPreferredSize(null);
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnBorrar.setText("C");
        btnBorrar.setPreferredSize(null);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btn9.setText("9");
        btn9.setName("btn9"); // NOI18N
        btn9.setPreferredSize(null);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnSen.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSen.setText("Sen");
        btnSen.setToolTipText("");
        btnSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCos.setText("Cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnTan.setText("Tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnResta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExp2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btnExp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExpY, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnExp2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExpY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExp3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 440, 300));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPantalla.setEditable(false);
        txtPantalla.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(txtPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 380, 42));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton1.setText("Ec Cuadratica");
        jRadioButton1.setToolTipText("");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Estandar");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        lblGuardado.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblGuardado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblGuardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 160, 20));

        lblSigno.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        lblSigno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lblSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 20, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 35, 420, 110));

        btnVolver.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnVolver.setText("Regresar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            Raices cuadratica = new Raices();
            if (txtA.getText() == null ? txtB.getText() == null : txtA.getText().equals(txtB.getText())) {
                txtMensaje.setText("Ecuacion degenerada... No se puede operar");
            } else if (Double.parseDouble(txtA.getText()) == 0 && Double.parseDouble(txtB.getText()) != 0) {
                double raiz = (-1 * Double.parseDouble(txtC.getText())) / Double.parseDouble(txtB.getText());
                txtX1.setText(String.valueOf(raiz));
                txtMensaje.setText("");
            } else if (cuadratica.Prueba(Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText()), Double.parseDouble(txtC.getText()))) {
                ArrayList x = new ArrayList<Double>();
                x = cuadratica.raiz(Double.parseDouble(txtA.getText()), Double.parseDouble(txtB.getText()), Double.parseDouble(txtC.getText()));
                txtX1.setText(String.valueOf(x.get(0)));
                txtX2.setText(String.valueOf(x.get(1)));
                txtMensaje.setText("");
            } else {
                txtMensaje.setText("Raices complejas... No se puede operar");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jPanel3.setVisible(true);
        jPanel1.setVisible(false);
        txtPantalla.setVisible(false);
        txtPantalla.setText("");
        lblGuardado.setText("");
        lblSigno.setText("");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jPanel1.setVisible(true);
        jPanel3.setVisible(false);
        txtPantalla.setVisible(true);
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtX1.setText("");
        txtX2.setText("");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        try {
            pantalla = String.valueOf(operacion.Tangente(Double.parseDouble(txtPantalla.getText())));
            setPantalla();
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        try {
            pantalla = String.valueOf(operacion.Coseno(Double.parseDouble(txtPantalla.getText())));
            setPantalla();
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenActionPerformed
        try {
            pantalla = String.valueOf(operacion.Seno(Double.parseDouble(txtPantalla.getText())));
            setPantalla();
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnSenActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try {
            operar();
            lblSigno.setText("=");
            n1 = 0;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (pantalla == "0") {
            pantalla = "9";
        } else {
            pantalla = pantalla + "9";
        }
        setPantalla();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        pantalla = "";
        n1 = 0;
        n2 = 0;
        lblSigno.setText("");
        lblGuardado.setText("");
        setPantalla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactActionPerformed
        try {
            pantalla = String.valueOf(operacion.Factorial(Double.parseDouble(txtPantalla.getText())));
            setPantalla();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFactActionPerformed

    private void btnExpYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpYActionPerformed
        try {
            setNumeros(5);
            lblSigno.setText("^");
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnExpYActionPerformed

    private void btnExp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExp3ActionPerformed
        try {
            pantalla = String.valueOf(operacion.Cubo(Double.parseDouble(txtPantalla.getText())));
            setPantalla();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExp3ActionPerformed

    private void btnExp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExp2ActionPerformed
        try {
            pantalla = String.valueOf(operacion.Cuadrado(Double.parseDouble(txtPantalla.getText())));
            setPantalla();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExp2ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        try {
            setNumeros(1);
            lblSigno.setText("+");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        try {
            setNumeros(2);
            lblSigno.setText("-");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        try {
            setNumeros(4);
            lblSigno.setText("*");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        try {
            setNumeros(3);
            lblSigno.setText("/");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if (pantalla == "0") {
            pantalla = "0.";
        } else {
            pantalla = pantalla + ".";
        }
        setPantalla();
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (pantalla == "") {
            pantalla = "0";
        } else if (pantalla.length() > 0 && pantalla.substring(0, 1) != "0") {
            pantalla = pantalla + "0";
        }
        setPantalla();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (pantalla == "0") {
            pantalla = "1";
        } else {
            pantalla = pantalla + "1";
        }
        setPantalla();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (pantalla == "0") {
            pantalla = "3";
        } else {
            pantalla = pantalla + "3";
        }
        setPantalla();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (pantalla == "0") {
            pantalla = "2";
        } else {
            pantalla = pantalla + "2";
        }
        setPantalla();        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (pantalla == "0") {
            pantalla = "6";
        } else {
            pantalla = pantalla + "6";
        }
        setPantalla();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (pantalla == "0") {
            pantalla = "5";
        } else {
            pantalla = pantalla + "5";
        }
        setPantalla();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (pantalla == "0") {
            pantalla = "4";
        } else {
            pantalla = pantalla + "4";
        }
        setPantalla();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (pantalla == "0") {
            pantalla = "7";
        } else {
            pantalla = pantalla + "7";
        }
        setPantalla();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (pantalla == "0") {
            pantalla = "8";
        } else {
            pantalla = pantalla + "8";
        }
        setPantalla();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmMenu menu = new frmMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnExp2;
    private javax.swing.JButton btnExp3;
    private javax.swing.JButton btnExpY;
    private javax.swing.JButton btnFact;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSen;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblGuardado;
    private javax.swing.JLabel lblSigno;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    // End of variables declaration//GEN-END:variables
}
