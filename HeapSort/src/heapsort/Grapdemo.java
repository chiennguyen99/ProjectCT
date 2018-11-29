package heapsort;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Grapdemo extends javax.swing.JFrame {

    heapsort HEAP = new heapsort(7);
    int num = 0, numPage = 1;

    Timer TimeNextPage0To3 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            EffectMovedOnPage(numPage);

            if (numPage == 3) {
                TimePage4.start();
                TimeNextPage0To3.stop();
            } else {
                numPage++;
            }

        }

    });
    int count1 = 0;
    Timer TimePage4 = new Timer(10000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count1 == 0) {
                EffectMovedOnPage(4);
                count1++;
            } else if (count1 == 1) {
                EffectMoveOnEachPageShift(4);
                count1++;
            } else if (count1 == 2) {
                EffectMoveOnEachPageDelete(4);
                count1++;
            } else {
                TimePage5.start();
                TimePage4.stop();
            }
        }
    });
    int count2 = 0;
    Timer TimePage5 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count2 == 0) {
                EffectMovedOnPage(5);
                count2++;
            } else if (count2 == 1) {
                EffectMoveOnEachPageShift(5);
                count2++;
            } else if (count2 == 2) {
                EffectMoveOnEachPageDelete(5);
                count2++;
            } else {
                TimePage6.start();
                TimePage5.stop();
            }
        }
    });

    int count3 = 0;
    Timer TimePage6 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count3 == 0) {
                EffectMovedOnPage(6);
                count3++;
            } else if (count3 == 1) {
                EffectMoveOnEachPageShift(6);
                count3++;
            } else if (count3 == 2) {
                EffectMoveOnEachPageDelete(6);
                count3++;
            } else {
                TimePage7.start();
                TimePage6.stop();
            }
        }
    });

    int count4 = 0;
    Timer TimePage7 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count4 == 0) {
                EffectMovedOnPage(7);
                count4++;
            } else if (count4 == 1) {
                EffectMoveOnEachPageShift(7);
                count4++;
            } else if (count4 == 2) {
                EffectMoveOnEachPageDelete(7);
                count4++;
            } else {
                TimePage8.start();
                TimePage7.stop();
            }
        }
    });

    int count5 = 0;
    Timer TimePage8 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count5 == 0) {
                EffectMovedOnPage(8);
                count5++;
            } else if (count5 == 1) {
                EffectMoveOnEachPageShift(8);
                count5++;
            } else if (count5 == 2) {
                EffectMoveOnEachPageDelete(8);
                count5++;
            } else {
                TimePage9.start();
                TimePage8.stop();
            }
        }
    });

    int count6 = 0;
    Timer TimePage9 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count6 == 0) {
                EffectMovedOnPage(9);
                count6++;
            } else if (count6 == 1) {
                EffectMoveOnEachPageShift(9);
                count6++;
            } else if (count6 == 2) {
                EffectMoveOnEachPageDelete(9);
                count6++;
            } else if (count6 == 3) {
                OUTPUTA0.setText(String.valueOf(HEAP.Arr[14].GetIndex(0)));
                setColor(D1_9, 240, 240, 240);
                setColor(OUTPUTA0, 0, 0, 102);
                count6++;
            } else {
                TimePage9.stop();
            }
        }
    });

    Timer t0 = new Timer(2000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            setColorPAN(0, num);
            if (num == 7) {
                setPan6.stop();
                setColor(pt6, 0, 0, 102);
                TimeNextPage0To3.start();
                // cho them hieu ung.
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(pt2, numcl1, numcl2, numcl3);
                        setColor(pt5, numcl1, numcl2, numcl3);
                        setColor(pt6, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                //
                t0.stop();
                
            } else {
                num++;
            }
        }
    });

    public Grapdemo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel11 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        PANPAGE0 = new javax.swing.JPanel();
        pt0 = new javax.swing.JLabel();
        pt1 = new javax.swing.JLabel();
        pt2 = new javax.swing.JLabel();
        pt3 = new javax.swing.JLabel();
        pt4 = new javax.swing.JLabel();
        pt5 = new javax.swing.JLabel();
        pt6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PANPAGE1 = new javax.swing.JPanel();
        La1P1 = new javax.swing.JLabel();
        La2P1 = new javax.swing.JLabel();
        La3P1 = new javax.swing.JLabel();
        La4P1 = new javax.swing.JLabel();
        La5P1 = new javax.swing.JLabel();
        La6P1 = new javax.swing.JLabel();
        La7P1 = new javax.swing.JLabel();
        JL1 = new javax.swing.JLabel();
        PANPAGE2 = new javax.swing.JPanel();
        La1P2 = new javax.swing.JLabel();
        La2P2 = new javax.swing.JLabel();
        La3P2 = new javax.swing.JLabel();
        La4P2 = new javax.swing.JLabel();
        La5P2 = new javax.swing.JLabel();
        La6P2 = new javax.swing.JLabel();
        La7P2 = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();
        PANPAGE3 = new javax.swing.JPanel();
        La1P3 = new javax.swing.JLabel();
        La2P3 = new javax.swing.JLabel();
        La3P3 = new javax.swing.JLabel();
        La4P3 = new javax.swing.JLabel();
        La5P3 = new javax.swing.JLabel();
        La6P3 = new javax.swing.JLabel();
        La7P3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PANPAGE4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PAN4SW = new javax.swing.JPanel();
        SW1_4 = new javax.swing.JLabel();
        SW2_4 = new javax.swing.JLabel();
        SW3_4 = new javax.swing.JLabel();
        SW4_4 = new javax.swing.JLabel();
        SW5_4 = new javax.swing.JLabel();
        SW6_4 = new javax.swing.JLabel();
        SW7_4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PAN4ShiftDown = new javax.swing.JPanel();
        SD1_4 = new javax.swing.JLabel();
        SD2_4 = new javax.swing.JLabel();
        SD3_4 = new javax.swing.JLabel();
        SD4_4 = new javax.swing.JLabel();
        SD5_4 = new javax.swing.JLabel();
        SD6_4 = new javax.swing.JLabel();
        SD7_4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PAN4Delete = new javax.swing.JPanel();
        D1_4 = new javax.swing.JLabel();
        D2_4 = new javax.swing.JLabel();
        D3_4 = new javax.swing.JLabel();
        D4_4 = new javax.swing.JLabel();
        D5_4 = new javax.swing.JLabel();
        D6_4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PANPAGE5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PAN5SW = new javax.swing.JPanel();
        SW1_5 = new javax.swing.JLabel();
        SW2_5 = new javax.swing.JLabel();
        SW3_5 = new javax.swing.JLabel();
        SW4_5 = new javax.swing.JLabel();
        SW5_5 = new javax.swing.JLabel();
        SW6_5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PAN5ShiftDown = new javax.swing.JPanel();
        SD1_5 = new javax.swing.JLabel();
        SD2_5 = new javax.swing.JLabel();
        SD3_5 = new javax.swing.JLabel();
        SD4_5 = new javax.swing.JLabel();
        SD5_5 = new javax.swing.JLabel();
        SD6_5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PAN5Delete = new javax.swing.JPanel();
        D1_5 = new javax.swing.JLabel();
        D2_5 = new javax.swing.JLabel();
        D3_5 = new javax.swing.JLabel();
        D4_5 = new javax.swing.JLabel();
        D5_5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PANPAGE6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PAN6SW = new javax.swing.JPanel();
        SW1_6 = new javax.swing.JLabel();
        SW2_6 = new javax.swing.JLabel();
        SW3_6 = new javax.swing.JLabel();
        SW4_6 = new javax.swing.JLabel();
        SW5_6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PAN6ShiftDown = new javax.swing.JPanel();
        SD1_6 = new javax.swing.JLabel();
        SD2_6 = new javax.swing.JLabel();
        SD3_6 = new javax.swing.JLabel();
        SD4_6 = new javax.swing.JLabel();
        SD5_6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PAN6Delete = new javax.swing.JPanel();
        D1_6 = new javax.swing.JLabel();
        D2_6 = new javax.swing.JLabel();
        D3_6 = new javax.swing.JLabel();
        D4_6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PANPAGE7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PAN7SW = new javax.swing.JPanel();
        SW1_7 = new javax.swing.JLabel();
        SW2_7 = new javax.swing.JLabel();
        SW3_7 = new javax.swing.JLabel();
        SW4_7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PAN7ShiftDown = new javax.swing.JPanel();
        SD1_7 = new javax.swing.JLabel();
        SD2_7 = new javax.swing.JLabel();
        SD3_7 = new javax.swing.JLabel();
        SD4_7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PAN7Delete = new javax.swing.JPanel();
        D1_7 = new javax.swing.JLabel();
        D2_7 = new javax.swing.JLabel();
        D3_7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PANPAGE8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PAN8SW = new javax.swing.JPanel();
        SW1_8 = new javax.swing.JLabel();
        SW2_8 = new javax.swing.JLabel();
        SW3_8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PAN8ShiftDown = new javax.swing.JPanel();
        SD1_8 = new javax.swing.JLabel();
        SD2_8 = new javax.swing.JLabel();
        SD3_8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PAN8Delete = new javax.swing.JPanel();
        D1_8 = new javax.swing.JLabel();
        D2_8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PANPAGE9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        PAN9SW = new javax.swing.JPanel();
        SW1_9 = new javax.swing.JLabel();
        SW2_9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PAN9ShiftDown = new javax.swing.JPanel();
        SD1_9 = new javax.swing.JLabel();
        SD2_9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PAN9Delete = new javax.swing.JPanel();
        D1_9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        ptA6 = new javax.swing.JTextField();
        ptA0 = new javax.swing.JTextField();
        ptA1 = new javax.swing.JTextField();
        ptA2 = new javax.swing.JTextField();
        ptA3 = new javax.swing.JTextField();
        ptA4 = new javax.swing.JTextField();
        ptA5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        OUTPUTA6 = new javax.swing.JLabel();
        OUTPUTA5 = new javax.swing.JLabel();
        OUTPUTA4 = new javax.swing.JLabel();
        OUTPUTA3 = new javax.swing.JLabel();
        OUTPUTA2 = new javax.swing.JLabel();
        OUTPUTA1 = new javax.swing.JLabel();
        OUTPUTA0 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 460));

        jPanel30.setLayout(new java.awt.CardLayout());

        PANPAGE0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pt0.setBackground(new java.awt.Color(238, 238, 238));
        pt0.setForeground(new java.awt.Color(242, 241, 241));
        pt0.setText("La1P0");
        pt0.setOpaque(true);
        PANPAGE0.add(pt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 68, 40, 40));

        pt1.setBackground(new java.awt.Color(238, 238, 238));
        pt1.setForeground(new java.awt.Color(242, 241, 241));
        pt1.setText("La2P0");
        pt1.setOpaque(true);
        PANPAGE0.add(pt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 40, 40));

        pt2.setBackground(new java.awt.Color(238, 238, 238));
        pt2.setForeground(new java.awt.Color(242, 241, 241));
        pt2.setText("La3P0");
        pt2.setOpaque(true);
        PANPAGE0.add(pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 156, 40, 40));

        pt3.setBackground(new java.awt.Color(238, 238, 238));
        pt3.setForeground(new java.awt.Color(242, 241, 241));
        pt3.setText("La4P0");
        pt3.setOpaque(true);
        PANPAGE0.add(pt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 40, 40));

        pt4.setBackground(new java.awt.Color(238, 238, 238));
        pt4.setForeground(new java.awt.Color(242, 241, 241));
        pt4.setText("La5P0");
        pt4.setOpaque(true);
        PANPAGE0.add(pt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 244, 40, 40));

        pt5.setBackground(new java.awt.Color(238, 238, 238));
        pt5.setForeground(new java.awt.Color(242, 241, 241));
        pt5.setText("La6P0");
        pt5.setOpaque(true);
        PANPAGE0.add(pt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 244, 40, 40));

        pt6.setBackground(new java.awt.Color(238, 238, 238));
        pt6.setForeground(new java.awt.Color(242, 241, 241));
        pt6.setText("La7P0");
        pt6.setOpaque(true);
        PANPAGE0.add(pt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 244, 40, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("=> Cây. ");
        PANPAGE0.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jPanel30.add(PANPAGE0, "card2");

        PANPAGE1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        La1P1.setBackground(new java.awt.Color(0, 0, 102));
        La1P1.setForeground(new java.awt.Color(255, 255, 255));
        La1P1.setText("La1P1");
        La1P1.setOpaque(true);
        PANPAGE1.add(La1P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 68, 40, 40));

        La2P1.setBackground(new java.awt.Color(0, 0, 102));
        La2P1.setForeground(new java.awt.Color(255, 255, 255));
        La2P1.setText("La2P1");
        La2P1.setOpaque(true);
        PANPAGE1.add(La2P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 40, 40));

        La3P1.setBackground(new java.awt.Color(0, 0, 102));
        La3P1.setForeground(new java.awt.Color(255, 255, 255));
        La3P1.setText("La3P1");
        La3P1.setOpaque(true);
        PANPAGE1.add(La3P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 156, 40, 40));

        La4P1.setBackground(new java.awt.Color(0, 0, 102));
        La4P1.setForeground(new java.awt.Color(255, 255, 255));
        La4P1.setText("La4P1");
        La4P1.setOpaque(true);
        PANPAGE1.add(La4P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 40, 40));

        La5P1.setBackground(new java.awt.Color(0, 0, 102));
        La5P1.setForeground(new java.awt.Color(255, 255, 255));
        La5P1.setText("La5P1");
        La5P1.setOpaque(true);
        PANPAGE1.add(La5P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 244, 40, 40));

        La6P1.setBackground(new java.awt.Color(0, 0, 102));
        La6P1.setForeground(new java.awt.Color(255, 255, 255));
        La6P1.setText("La6P1");
        La6P1.setOpaque(true);
        PANPAGE1.add(La6P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 244, 40, 40));

        La7P1.setBackground(new java.awt.Color(0, 0, 102));
        La7P1.setForeground(new java.awt.Color(255, 255, 255));
        La7P1.setText("La7P1");
        La7P1.setOpaque(true);
        PANPAGE1.add(La7P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 244, 40, 40));

        JL1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JL1.setForeground(new java.awt.Color(255, 0, 0));
        JL1.setText("Bước 1.");
        PANPAGE1.add(JL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jPanel30.add(PANPAGE1, "card2");

        PANPAGE2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        La1P2.setBackground(new java.awt.Color(0, 0, 102));
        La1P2.setForeground(new java.awt.Color(255, 255, 255));
        La1P2.setText("La1P2");
        La1P2.setOpaque(true);
        PANPAGE2.add(La1P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 68, 40, 40));

        La2P2.setBackground(new java.awt.Color(0, 0, 102));
        La2P2.setForeground(new java.awt.Color(255, 255, 255));
        La2P2.setText("La2P2");
        La2P2.setOpaque(true);
        PANPAGE2.add(La2P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 40, 40));

        La3P2.setBackground(new java.awt.Color(0, 0, 102));
        La3P2.setForeground(new java.awt.Color(255, 255, 255));
        La3P2.setText("La3P2");
        La3P2.setOpaque(true);
        PANPAGE2.add(La3P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 156, 40, 40));

        La4P2.setBackground(new java.awt.Color(0, 0, 102));
        La4P2.setForeground(new java.awt.Color(255, 255, 255));
        La4P2.setText("La4P2");
        La4P2.setOpaque(true);
        PANPAGE2.add(La4P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 40, 40));

        La5P2.setBackground(new java.awt.Color(0, 0, 102));
        La5P2.setForeground(new java.awt.Color(255, 255, 255));
        La5P2.setText("La5P2");
        La5P2.setOpaque(true);
        PANPAGE2.add(La5P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 244, 40, 40));

        La6P2.setBackground(new java.awt.Color(0, 0, 102));
        La6P2.setForeground(new java.awt.Color(255, 255, 255));
        La6P2.setText("La6P2");
        La6P2.setOpaque(true);
        PANPAGE2.add(La6P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 244, 40, 40));

        La7P2.setBackground(new java.awt.Color(0, 0, 102));
        La7P2.setForeground(new java.awt.Color(255, 255, 255));
        La7P2.setText("La7P2");
        La7P2.setOpaque(true);
        PANPAGE2.add(La7P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 244, 40, 40));

        JL2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JL2.setForeground(new java.awt.Color(255, 0, 0));
        JL2.setText("Bước 2. ");
        PANPAGE2.add(JL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jPanel30.add(PANPAGE2, "card2");

        PANPAGE3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        La1P3.setBackground(new java.awt.Color(0, 0, 102));
        La1P3.setForeground(new java.awt.Color(255, 255, 255));
        La1P3.setText("La1P3");
        La1P3.setOpaque(true);
        PANPAGE3.add(La1P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 68, 40, 40));

        La2P3.setBackground(new java.awt.Color(0, 0, 102));
        La2P3.setForeground(new java.awt.Color(255, 255, 255));
        La2P3.setText("La2P3");
        La2P3.setOpaque(true);
        PANPAGE3.add(La2P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 40, 40));

        La3P3.setBackground(new java.awt.Color(0, 0, 102));
        La3P3.setForeground(new java.awt.Color(255, 255, 255));
        La3P3.setText("La3P3");
        La3P3.setOpaque(true);
        PANPAGE3.add(La3P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 156, 40, 40));

        La4P3.setBackground(new java.awt.Color(0, 0, 102));
        La4P3.setForeground(new java.awt.Color(255, 255, 255));
        La4P3.setText("La4P3");
        La4P3.setOpaque(true);
        PANPAGE3.add(La4P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 40, 40));

        La5P3.setBackground(new java.awt.Color(0, 0, 102));
        La5P3.setForeground(new java.awt.Color(255, 255, 255));
        La5P3.setText("La5P3");
        La5P3.setOpaque(true);
        PANPAGE3.add(La5P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 244, 40, 40));

        La6P3.setBackground(new java.awt.Color(0, 0, 102));
        La6P3.setForeground(new java.awt.Color(255, 255, 255));
        La6P3.setText("La6P3");
        La6P3.setOpaque(true);
        PANPAGE3.add(La6P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 244, 40, 40));

        La7P3.setBackground(new java.awt.Color(0, 0, 102));
        La7P3.setForeground(new java.awt.Color(255, 255, 255));
        La7P3.setText("La7P3");
        La7P3.setOpaque(true);
        PANPAGE3.add(La7P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 244, 40, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Bước 3.");
        PANPAGE3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jPanel30.add(PANPAGE3, "card2");

        PANPAGE4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.CardLayout());

        PAN4SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_4.setBackground(new java.awt.Color(0, 0, 102));
        SW1_4.setForeground(new java.awt.Color(255, 255, 255));
        SW1_4.setText("W1_4");
        SW1_4.setOpaque(true);
        PAN4SW.add(SW1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_4.setBackground(new java.awt.Color(0, 0, 102));
        SW2_4.setForeground(new java.awt.Color(255, 255, 255));
        SW2_4.setText("W2_4");
        SW2_4.setOpaque(true);
        PAN4SW.add(SW2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_4.setBackground(new java.awt.Color(0, 0, 102));
        SW3_4.setForeground(new java.awt.Color(255, 255, 255));
        SW3_4.setText("W3_4");
        SW3_4.setOpaque(true);
        PAN4SW.add(SW3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SW4_4.setBackground(new java.awt.Color(0, 0, 102));
        SW4_4.setForeground(new java.awt.Color(255, 255, 255));
        SW4_4.setText("W4_4");
        SW4_4.setOpaque(true);
        PAN4SW.add(SW4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SW5_4.setBackground(new java.awt.Color(0, 0, 102));
        SW5_4.setForeground(new java.awt.Color(255, 255, 255));
        SW5_4.setText("W5_4");
        SW5_4.setOpaque(true);
        PAN4SW.add(SW5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        SW6_4.setBackground(new java.awt.Color(0, 0, 102));
        SW6_4.setForeground(new java.awt.Color(255, 255, 255));
        SW6_4.setText("W6_4");
        SW6_4.setOpaque(true);
        PAN4SW.add(SW6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        SW7_4.setBackground(new java.awt.Color(0, 0, 102));
        SW7_4.setForeground(new java.awt.Color(255, 255, 255));
        SW7_4.setText("W7_4");
        SW7_4.setOpaque(true);
        PAN4SW.add(SW7_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 204, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("B4-1");
        PAN4SW.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(PAN4SW, "card2");

        PAN4ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_4.setBackground(new java.awt.Color(0, 0, 102));
        SD1_4.setForeground(new java.awt.Color(255, 255, 255));
        SD1_4.setText("S1_4");
        SD1_4.setOpaque(true);
        PAN4ShiftDown.add(SD1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_4.setBackground(new java.awt.Color(0, 0, 102));
        SD2_4.setForeground(new java.awt.Color(255, 255, 255));
        SD2_4.setText("S2_4");
        SD2_4.setOpaque(true);
        PAN4ShiftDown.add(SD2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_4.setBackground(new java.awt.Color(0, 0, 102));
        SD3_4.setForeground(new java.awt.Color(255, 255, 255));
        SD3_4.setText("S3_4");
        SD3_4.setOpaque(true);
        PAN4ShiftDown.add(SD3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SD4_4.setBackground(new java.awt.Color(0, 0, 102));
        SD4_4.setForeground(new java.awt.Color(255, 255, 255));
        SD4_4.setText("S4_4");
        SD4_4.setOpaque(true);
        PAN4ShiftDown.add(SD4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SD5_4.setBackground(new java.awt.Color(0, 0, 102));
        SD5_4.setForeground(new java.awt.Color(255, 255, 255));
        SD5_4.setText("S5_4");
        SD5_4.setOpaque(true);
        PAN4ShiftDown.add(SD5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        SD6_4.setBackground(new java.awt.Color(0, 0, 102));
        SD6_4.setForeground(new java.awt.Color(255, 255, 255));
        SD6_4.setText("S6_4");
        SD6_4.setOpaque(true);
        PAN4ShiftDown.add(SD6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        SD7_4.setBackground(new java.awt.Color(0, 0, 102));
        SD7_4.setForeground(new java.awt.Color(255, 255, 255));
        SD7_4.setText("S7_4");
        SD7_4.setOpaque(true);
        PAN4ShiftDown.add(SD7_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 204, 40, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("B4-2");
        PAN4ShiftDown.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(PAN4ShiftDown, "card2");

        PAN4Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_4.setBackground(new java.awt.Color(0, 0, 102));
        D1_4.setForeground(new java.awt.Color(255, 255, 255));
        D1_4.setText("D1_4");
        D1_4.setOpaque(true);
        PAN4Delete.add(D1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_4.setBackground(new java.awt.Color(0, 0, 102));
        D2_4.setForeground(new java.awt.Color(255, 255, 255));
        D2_4.setText("D2_4");
        D2_4.setOpaque(true);
        PAN4Delete.add(D2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        D3_4.setBackground(new java.awt.Color(0, 0, 102));
        D3_4.setForeground(new java.awt.Color(255, 255, 255));
        D3_4.setText("D3_4");
        D3_4.setOpaque(true);
        PAN4Delete.add(D3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        D4_4.setBackground(new java.awt.Color(0, 0, 102));
        D4_4.setForeground(new java.awt.Color(255, 255, 255));
        D4_4.setText("D4_4");
        D4_4.setOpaque(true);
        PAN4Delete.add(D4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        D5_4.setBackground(new java.awt.Color(0, 0, 102));
        D5_4.setForeground(new java.awt.Color(255, 255, 255));
        D5_4.setText("D5_4");
        D5_4.setOpaque(true);
        PAN4Delete.add(D5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        D6_4.setBackground(new java.awt.Color(0, 0, 102));
        D6_4.setForeground(new java.awt.Color(255, 255, 255));
        D6_4.setText("D6_4");
        D6_4.setOpaque(true);
        PAN4Delete.add(D6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("B4-3");
        PAN4Delete.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel1.add(PAN4Delete, "card2");

        PANPAGE4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE4, "card2");

        PANPAGE5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.CardLayout());

        PAN5SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_5.setBackground(new java.awt.Color(0, 0, 102));
        SW1_5.setForeground(new java.awt.Color(255, 255, 255));
        SW1_5.setText("W1_5");
        SW1_5.setOpaque(true);
        PAN5SW.add(SW1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_5.setBackground(new java.awt.Color(0, 0, 102));
        SW2_5.setForeground(new java.awt.Color(255, 255, 255));
        SW2_5.setText("W2_5");
        SW2_5.setOpaque(true);
        PAN5SW.add(SW2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_5.setBackground(new java.awt.Color(0, 0, 102));
        SW3_5.setForeground(new java.awt.Color(255, 255, 255));
        SW3_5.setText("W3_5");
        SW3_5.setOpaque(true);
        PAN5SW.add(SW3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SW4_5.setBackground(new java.awt.Color(0, 0, 102));
        SW4_5.setForeground(new java.awt.Color(255, 255, 255));
        SW4_5.setText("W4_5");
        SW4_5.setOpaque(true);
        PAN5SW.add(SW4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SW5_5.setBackground(new java.awt.Color(0, 0, 102));
        SW5_5.setForeground(new java.awt.Color(255, 255, 255));
        SW5_5.setText("W5_5");
        SW5_5.setOpaque(true);
        PAN5SW.add(SW5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        SW6_5.setBackground(new java.awt.Color(0, 0, 102));
        SW6_5.setForeground(new java.awt.Color(255, 255, 255));
        SW6_5.setText("W6_5");
        SW6_5.setOpaque(true);
        PAN5SW.add(SW6_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("5-1");
        PAN5SW.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel2.add(PAN5SW, "card2");

        PAN5ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_5.setBackground(new java.awt.Color(0, 0, 102));
        SD1_5.setForeground(new java.awt.Color(255, 255, 255));
        SD1_5.setText("S1_5");
        SD1_5.setOpaque(true);
        PAN5ShiftDown.add(SD1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_5.setBackground(new java.awt.Color(0, 0, 102));
        SD2_5.setForeground(new java.awt.Color(255, 255, 255));
        SD2_5.setText("S2_5");
        SD2_5.setOpaque(true);
        PAN5ShiftDown.add(SD2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_5.setBackground(new java.awt.Color(0, 0, 102));
        SD3_5.setForeground(new java.awt.Color(255, 255, 255));
        SD3_5.setText("S3_5");
        SD3_5.setOpaque(true);
        PAN5ShiftDown.add(SD3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SD4_5.setBackground(new java.awt.Color(0, 0, 102));
        SD4_5.setForeground(new java.awt.Color(255, 255, 255));
        SD4_5.setText("S4_5");
        SD4_5.setOpaque(true);
        PAN5ShiftDown.add(SD4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SD5_5.setBackground(new java.awt.Color(0, 0, 102));
        SD5_5.setForeground(new java.awt.Color(255, 255, 255));
        SD5_5.setText("S5_5");
        SD5_5.setOpaque(true);
        PAN5ShiftDown.add(SD5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        SD6_5.setBackground(new java.awt.Color(0, 0, 102));
        SD6_5.setForeground(new java.awt.Color(255, 255, 255));
        SD6_5.setText("S6_5");
        SD6_5.setOpaque(true);
        PAN5ShiftDown.add(SD6_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("5-2");
        PAN5ShiftDown.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel2.add(PAN5ShiftDown, "card2");

        PAN5Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_5.setBackground(new java.awt.Color(0, 0, 102));
        D1_5.setForeground(new java.awt.Color(255, 255, 255));
        D1_5.setText("D1_5");
        D1_5.setOpaque(true);
        PAN5Delete.add(D1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_5.setBackground(new java.awt.Color(0, 0, 102));
        D2_5.setForeground(new java.awt.Color(255, 255, 255));
        D2_5.setText("D2_5");
        D2_5.setOpaque(true);
        PAN5Delete.add(D2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        D3_5.setBackground(new java.awt.Color(0, 0, 102));
        D3_5.setForeground(new java.awt.Color(255, 255, 255));
        D3_5.setText("D3_5");
        D3_5.setOpaque(true);
        PAN5Delete.add(D3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        D4_5.setBackground(new java.awt.Color(0, 0, 102));
        D4_5.setForeground(new java.awt.Color(255, 255, 255));
        D4_5.setText("D4_5");
        D4_5.setOpaque(true);
        PAN5Delete.add(D4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        D5_5.setBackground(new java.awt.Color(0, 0, 102));
        D5_5.setForeground(new java.awt.Color(255, 255, 255));
        D5_5.setText("D5_5");
        D5_5.setOpaque(true);
        PAN5Delete.add(D5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("5-3");
        PAN5Delete.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel2.add(PAN5Delete, "card2");

        PANPAGE5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE5, "card2");

        PANPAGE6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new java.awt.CardLayout());

        PAN6SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_6.setBackground(new java.awt.Color(0, 0, 102));
        SW1_6.setForeground(new java.awt.Color(255, 255, 255));
        SW1_6.setText("W1_6");
        SW1_6.setOpaque(true);
        PAN6SW.add(SW1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_6.setBackground(new java.awt.Color(0, 0, 102));
        SW2_6.setForeground(new java.awt.Color(255, 255, 255));
        SW2_6.setText("W2_6");
        SW2_6.setOpaque(true);
        PAN6SW.add(SW2_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_6.setBackground(new java.awt.Color(0, 0, 102));
        SW3_6.setForeground(new java.awt.Color(255, 255, 255));
        SW3_6.setText("W3_6");
        SW3_6.setOpaque(true);
        PAN6SW.add(SW3_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SW4_6.setBackground(new java.awt.Color(0, 0, 102));
        SW4_6.setForeground(new java.awt.Color(255, 255, 255));
        SW4_6.setText("W4_6");
        SW4_6.setOpaque(true);
        PAN6SW.add(SW4_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SW5_6.setBackground(new java.awt.Color(0, 0, 102));
        SW5_6.setForeground(new java.awt.Color(255, 255, 255));
        SW5_6.setText("W5_6");
        SW5_6.setOpaque(true);
        PAN6SW.add(SW5_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("6-1");
        PAN6SW.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel3.add(PAN6SW, "card2");

        PAN6ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_6.setBackground(new java.awt.Color(0, 0, 102));
        SD1_6.setForeground(new java.awt.Color(255, 255, 255));
        SD1_6.setText("S1_6");
        SD1_6.setOpaque(true);
        PAN6ShiftDown.add(SD1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_6.setBackground(new java.awt.Color(0, 0, 102));
        SD2_6.setForeground(new java.awt.Color(255, 255, 255));
        SD2_6.setText("S2_6");
        SD2_6.setOpaque(true);
        PAN6ShiftDown.add(SD2_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_6.setBackground(new java.awt.Color(0, 0, 102));
        SD3_6.setForeground(new java.awt.Color(255, 255, 255));
        SD3_6.setText("S3_6");
        SD3_6.setOpaque(true);
        PAN6ShiftDown.add(SD3_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SD4_6.setBackground(new java.awt.Color(0, 0, 102));
        SD4_6.setForeground(new java.awt.Color(255, 255, 255));
        SD4_6.setText("S4_6");
        SD4_6.setOpaque(true);
        PAN6ShiftDown.add(SD4_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SD5_6.setBackground(new java.awt.Color(0, 0, 102));
        SD5_6.setForeground(new java.awt.Color(255, 255, 255));
        SD5_6.setText("S5_6");
        SD5_6.setOpaque(true);
        PAN6ShiftDown.add(SD5_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("6-2");
        PAN6ShiftDown.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel3.add(PAN6ShiftDown, "card2");

        PAN6Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_6.setBackground(new java.awt.Color(0, 0, 102));
        D1_6.setForeground(new java.awt.Color(255, 255, 255));
        D1_6.setText("D1_6");
        D1_6.setOpaque(true);
        PAN6Delete.add(D1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_6.setBackground(new java.awt.Color(0, 0, 102));
        D2_6.setForeground(new java.awt.Color(255, 255, 255));
        D2_6.setText("D2_6");
        D2_6.setOpaque(true);
        PAN6Delete.add(D2_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        D3_6.setBackground(new java.awt.Color(0, 0, 102));
        D3_6.setForeground(new java.awt.Color(255, 255, 255));
        D3_6.setText("D3_6");
        D3_6.setOpaque(true);
        PAN6Delete.add(D3_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        D4_6.setBackground(new java.awt.Color(0, 0, 102));
        D4_6.setForeground(new java.awt.Color(255, 255, 255));
        D4_6.setText("D4_6");
        D4_6.setOpaque(true);
        PAN6Delete.add(D4_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("6-3");
        PAN6Delete.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel3.add(PAN6Delete, "card2");

        PANPAGE6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE6, "card2");

        PANPAGE7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new java.awt.CardLayout());

        PAN7SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_7.setBackground(new java.awt.Color(0, 0, 102));
        SW1_7.setForeground(new java.awt.Color(255, 255, 255));
        SW1_7.setText("W1_7");
        SW1_7.setOpaque(true);
        PAN7SW.add(SW1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_7.setBackground(new java.awt.Color(0, 0, 102));
        SW2_7.setForeground(new java.awt.Color(255, 255, 255));
        SW2_7.setText("W2_7");
        SW2_7.setOpaque(true);
        PAN7SW.add(SW2_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_7.setBackground(new java.awt.Color(0, 0, 102));
        SW3_7.setForeground(new java.awt.Color(255, 255, 255));
        SW3_7.setText("W3_7");
        SW3_7.setOpaque(true);
        PAN7SW.add(SW3_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SW4_7.setBackground(new java.awt.Color(0, 0, 102));
        SW4_7.setForeground(new java.awt.Color(255, 255, 255));
        SW4_7.setText("W4_7");
        SW4_7.setOpaque(true);
        PAN7SW.add(SW4_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("7-1");
        PAN7SW.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel4.add(PAN7SW, "card2");

        PAN7ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_7.setBackground(new java.awt.Color(0, 0, 102));
        SD1_7.setForeground(new java.awt.Color(255, 255, 255));
        SD1_7.setText("S1_7");
        SD1_7.setOpaque(true);
        PAN7ShiftDown.add(SD1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_7.setBackground(new java.awt.Color(0, 0, 102));
        SD2_7.setForeground(new java.awt.Color(255, 255, 255));
        SD2_7.setText("S2_7");
        SD2_7.setOpaque(true);
        PAN7ShiftDown.add(SD2_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_7.setBackground(new java.awt.Color(0, 0, 102));
        SD3_7.setForeground(new java.awt.Color(255, 255, 255));
        SD3_7.setText("S3_7");
        SD3_7.setOpaque(true);
        PAN7ShiftDown.add(SD3_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SD4_7.setBackground(new java.awt.Color(0, 0, 102));
        SD4_7.setForeground(new java.awt.Color(255, 255, 255));
        SD4_7.setText("S4_7");
        SD4_7.setOpaque(true);
        PAN7ShiftDown.add(SD4_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("7-2");
        PAN7ShiftDown.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel4.add(PAN7ShiftDown, "card2");

        PAN7Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_7.setBackground(new java.awt.Color(0, 0, 102));
        D1_7.setForeground(new java.awt.Color(255, 255, 255));
        D1_7.setText("D1_7");
        D1_7.setOpaque(true);
        PAN7Delete.add(D1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_7.setBackground(new java.awt.Color(0, 0, 102));
        D2_7.setForeground(new java.awt.Color(255, 255, 255));
        D2_7.setText("D2_7");
        D2_7.setOpaque(true);
        PAN7Delete.add(D2_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        D3_7.setBackground(new java.awt.Color(0, 0, 102));
        D3_7.setForeground(new java.awt.Color(255, 255, 255));
        D3_7.setText("D3_7");
        D3_7.setOpaque(true);
        PAN7Delete.add(D3_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("7-3");
        PAN7Delete.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel4.add(PAN7Delete, "card2");

        PANPAGE7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE7, "card2");

        PANPAGE8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new java.awt.CardLayout());

        PAN8SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_8.setBackground(new java.awt.Color(0, 0, 102));
        SW1_8.setForeground(new java.awt.Color(255, 255, 255));
        SW1_8.setText("W1_8");
        SW1_8.setOpaque(true);
        PAN8SW.add(SW1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_8.setBackground(new java.awt.Color(0, 0, 102));
        SW2_8.setForeground(new java.awt.Color(255, 255, 255));
        SW2_8.setText("W2_8");
        SW2_8.setOpaque(true);
        PAN8SW.add(SW2_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_8.setBackground(new java.awt.Color(0, 0, 102));
        SW3_8.setForeground(new java.awt.Color(255, 255, 255));
        SW3_8.setText("W3_8");
        SW3_8.setOpaque(true);
        PAN8SW.add(SW3_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("8-1");
        PAN8SW.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel5.add(PAN8SW, "card2");

        PAN8ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_8.setBackground(new java.awt.Color(0, 0, 102));
        SD1_8.setForeground(new java.awt.Color(255, 255, 255));
        SD1_8.setText("S1_8");
        SD1_8.setOpaque(true);
        PAN8ShiftDown.add(SD1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_8.setBackground(new java.awt.Color(0, 0, 102));
        SD2_8.setForeground(new java.awt.Color(255, 255, 255));
        SD2_8.setText("S2_8");
        SD2_8.setOpaque(true);
        PAN8ShiftDown.add(SD2_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_8.setBackground(new java.awt.Color(0, 0, 102));
        SD3_8.setForeground(new java.awt.Color(255, 255, 255));
        SD3_8.setText("S3_8");
        SD3_8.setOpaque(true);
        PAN8ShiftDown.add(SD3_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("8-2");
        PAN8ShiftDown.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel5.add(PAN8ShiftDown, "card2");

        PAN8Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_8.setBackground(new java.awt.Color(0, 0, 102));
        D1_8.setForeground(new java.awt.Color(255, 255, 255));
        D1_8.setText("D1_8");
        D1_8.setOpaque(true);
        PAN8Delete.add(D1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_8.setBackground(new java.awt.Color(0, 0, 102));
        D2_8.setForeground(new java.awt.Color(255, 255, 255));
        D2_8.setText("D2_8");
        D2_8.setOpaque(true);
        PAN8Delete.add(D2_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("8-3");
        PAN8Delete.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel5.add(PAN8Delete, "card2");

        PANPAGE8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE8, "card2");

        PANPAGE9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new java.awt.CardLayout());

        PAN9SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_9.setBackground(new java.awt.Color(0, 0, 102));
        SW1_9.setForeground(new java.awt.Color(255, 255, 255));
        SW1_9.setText("W1_9");
        SW1_9.setOpaque(true);
        PAN9SW.add(SW1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_9.setBackground(new java.awt.Color(0, 0, 102));
        SW2_9.setForeground(new java.awt.Color(255, 255, 255));
        SW2_9.setText("W2_9");
        SW2_9.setOpaque(true);
        PAN9SW.add(SW2_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("9-1");
        PAN9SW.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel6.add(PAN9SW, "card2");

        PAN9ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_9.setBackground(new java.awt.Color(0, 0, 102));
        SD1_9.setForeground(new java.awt.Color(255, 255, 255));
        SD1_9.setText("S1_9");
        SD1_9.setOpaque(true);
        PAN9ShiftDown.add(SD1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_9.setBackground(new java.awt.Color(0, 0, 102));
        SD2_9.setForeground(new java.awt.Color(255, 255, 255));
        SD2_9.setText("S2_9");
        SD2_9.setOpaque(true);
        PAN9ShiftDown.add(SD2_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("9-2");
        PAN9ShiftDown.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel6.add(PAN9ShiftDown, "card2");

        PAN9Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_9.setBackground(new java.awt.Color(0, 0, 102));
        D1_9.setForeground(new java.awt.Color(255, 255, 255));
        D1_9.setText("D1_9");
        D1_9.setOpaque(true);
        PAN9Delete.add(D1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("9-3");
        PAN9Delete.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jPanel6.add(PAN9Delete, "card2");

        PANPAGE9.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE9, "card2");

        jPanel11.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 700, 340));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(ptA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, 30));
        jPanel9.add(ptA0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 30, 30));
        jPanel9.add(ptA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 30, 30));
        jPanel9.add(ptA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 30, 30));
        jPanel9.add(ptA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 30, 30));
        jPanel9.add(ptA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 30, 30));
        jPanel9.add(ptA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        jLabel1.setText("   A0         A1         A2         A3         A4       A5        A6");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 270, 20));

        jButton1.setText("Sort ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 40));

        OUTPUTA6.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA6.setOpaque(true);
        jPanel9.add(OUTPUTA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 40, 40));

        OUTPUTA5.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA5.setOpaque(true);
        jPanel9.add(OUTPUTA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 40, 40));

        OUTPUTA4.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA4.setOpaque(true);
        jPanel9.add(OUTPUTA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 40, 40));

        OUTPUTA3.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA3.setOpaque(true);
        jPanel9.add(OUTPUTA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 40, 40));

        OUTPUTA2.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA2.setOpaque(true);
        jPanel9.add(OUTPUTA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 40, 40));

        OUTPUTA1.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA1.setOpaque(true);
        jPanel9.add(OUTPUTA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 40, 40));

        OUTPUTA0.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA0.setOpaque(true);
        jPanel9.add(OUTPUTA0, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 40, 40));

        jPanel11.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 700, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String s0 = ptA0.getText(), s1 = ptA1.getText(), s2 = ptA2.getText(), s3 = ptA3.getText(), s4 = ptA4.getText(), s5 = ptA5.getText(), s6 = ptA6.getText();
        if (!s0.isEmpty() && !s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !s4.isEmpty() && !s5.isEmpty() && !s6.isEmpty()) {

            try {
                int num0 = Integer.parseInt(s0);
                HEAP.A.SetIndex(0, num0);
                int num1 = Integer.parseInt(s1);
                HEAP.A.SetIndex(1, num1);
                int num2 = Integer.parseInt(s2);
                HEAP.A.SetIndex(2, num2);
                int num3 = Integer.parseInt(s3);
                HEAP.A.SetIndex(3, num3);
                int num4 = Integer.parseInt(s4);
                HEAP.A.SetIndex(4, num4);
                int num5 = Integer.parseInt(s5);
                HEAP.A.SetIndex(5, num5);
                int num6 = Integer.parseInt(s6);
                HEAP.A.SetIndex(6, num6);

                pt0.setText(s0);
                pt1.setText(s1);
                pt2.setText(s2);
                pt3.setText(s3);
                pt4.setText(s4);
                pt5.setText(s5);
                pt6.setText(s6);
                t0.start();

                HEAP.handling();
                for (int i = 0; i < 3; i++) {

                    settextLabelPage1ToPage3(i + 2, HEAP.Arr[i]);

                }
                settextLabelPage4(HEAP.Arr[3], HEAP.Arr[4]);
                settextLabelPage5(HEAP.Arr[5], HEAP.Arr[6]);
                settextLabelPage6(HEAP.Arr[7], HEAP.Arr[8]);
                settextLabelPage7(HEAP.Arr[9], HEAP.Arr[10]);
                settextLabelPage8(HEAP.Arr[11], HEAP.Arr[12]);
                settextLabelPage9(HEAP.Arr[13], HEAP.Arr[14]);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }

    }//GEN-LAST:event_jButton1MouseClicked

    Timer setPan0, setPan1, setPan2, setPan3, setPan4, setPan5, setPan6;
    int numcl1 = 255, numcl2 = 255, numcl3 = 255;

    void setColorPAN(int numPan, int numLa) {

        if (numPan == 0) {
            switch (numLa) {
                case 0:
                    setPan0 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt0, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan0.start();
                    break;
                case 1:
                    setColor(pt0, 0, 0, 102);
                    setPan0.stop();
                    setPan1 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt1, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan1.start();
                    break;
                case 2:
                    setColor(pt1, 0, 0, 102);
                    setPan1.stop();
                    setPan2 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt2, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan2.start();
                    break;
                case 3:
                    setColor(pt2, 0, 0, 102);
                    setPan2.stop();
                    setPan3 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt3, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan3.start();
                    break;
                case 4:
                    setColor(pt3, 0, 0, 102);
                    setPan3.stop();
                    setPan4 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt4, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan4.start();
                    break;
                case 5:
                    setColor(pt4, 0, 0, 102);
                    setPan4.stop();
                    setPan5 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt5, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan5.start();
                    break;
                case 6:
                    setColor(pt5, 0, 0, 102);
                    setPan5.stop();
                    setPan6 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt6, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan6.start();
                    break;
                default:
                    break;
            }
        }
    }

    Timer TimeEqual;
    // thiet ke tao hieu ung co Page. 
    void EffectMovedOnPage(int numPage) {
        switch (numPage) {
            case 1:
                SwapPanel(jPanel30, PANPAGE1);
                t0.stop();
                TimeEqual.stop();
                // cho hieu ung.
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(La2P1, numcl1, numcl2, numcl3);
                        setColor(La4P1, numcl1, numcl2, numcl3);
                        setColor(La5P1, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 2:
                TimeEqual.stop();                                                  
                SwapPanel(jPanel30, PANPAGE2);
                // Tao hieu ung.
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(La1P2, numcl1, numcl2, numcl3);
                        setColor(La2P2, numcl1, numcl2, numcl3);
                        setColor(La3P2, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 3:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE3);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(La1P3, numcl1, numcl2, numcl3);
                        setColor(La7P3, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 4:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE4);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_4, numcl1, numcl2, numcl3);
                        setColor(SW2_4, numcl1, numcl2, numcl3);
                        setColor(SW3_4, numcl1, numcl2, numcl3);
                        setColor(SW4_4, numcl1, numcl2, numcl3);
                        setColor(SW5_4, numcl1, numcl2, numcl3);
                        setColor(SW6_4, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 5:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE5);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_5, numcl1, numcl2, numcl3);
                        setColor(SW2_5, numcl1, numcl2, numcl3);
                        setColor(SW3_5, numcl1, numcl2, numcl3);
                        setColor(SW4_5, numcl1, numcl2, numcl3);
                        setColor(SW5_5, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 6:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE6);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_6, numcl1, numcl2, numcl3);
                        setColor(SW2_6, numcl1, numcl2, numcl3);
                        setColor(SW3_6, numcl1, numcl2, numcl3);
                        setColor(SW4_6, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 7:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE7);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_7, numcl1, numcl2, numcl3);
                        setColor(SW2_7, numcl1, numcl2, numcl3);
                        setColor(SW3_7, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 8:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE8);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_8, numcl1, numcl2, numcl3);
                        setColor(SW2_8, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 9:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE9);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_9, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 10:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE0);
                break;
            default:
                break;
        }
    }
    
    
    int numclx1 = 255, numclx2 = 0, numclx3 = 0; 
    void EffectMoveOnEachPageShift(int Page) {

        switch (Page) {
            case 4:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA6, jPanel1, PAN4Delete, PAN4ShiftDown, 6);
                // xet hieu ung cho shift. 
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD7_4, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 5:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA5, jPanel2, PAN5Delete, PAN5ShiftDown, 5);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD6_5, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 6:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA4, jPanel3, PAN6Delete, PAN6ShiftDown, 4);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD5_6, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 7:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA3, jPanel4, PAN7Delete, PAN7ShiftDown, 3);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD4_7, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 8:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA2, jPanel5, PAN8Delete, PAN8ShiftDown, 2);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD3_8, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 9:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA1, jPanel6, PAN9Delete, PAN9ShiftDown, 1);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD2_9, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;

            default:
                break;
        }
    }

    void EffectMoveOnEachPageDelete(int Page) {
        switch (Page) {
            case 4:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA6, jPanel1, PAN4Delete, PAN4ShiftDown, 6);
                // them hieu ung. 
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_4, numcl1, numcl2, numcl3);
                        setColor(D6_4, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 5:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA5, jPanel2, PAN5Delete, PAN5ShiftDown, 5);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_5, numcl1, numcl2, numcl3);
                        setColor(D5_5, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 6:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA4, jPanel3, PAN6Delete, PAN6ShiftDown, 4);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_6, numcl1, numcl2, numcl3);
                        setColor(D4_6, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 7:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA3, jPanel4, PAN7Delete, PAN7ShiftDown, 3);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_7, numcl1, numcl2, numcl3);
                        setColor(D3_7, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 8:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA2, jPanel5, PAN8Delete, PAN8ShiftDown, 2);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_8, numcl1, numcl2, numcl3);
                        setColor(D2_8, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 9:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA1, jPanel6, PAN9Delete, PAN9ShiftDown, 1);
                break;
            default:
                break;
        }
    }

    void setElementEachPage(int Page, JLabel LabelUPDate, JPanel PanPlat, JPanel PanDele, JPanel PanShift, int index) {
        switch (Page) {
            case 1:
                SwapPanel(PanPlat, PanDele);
                LabelUPDate.setText(String.valueOf(HEAP.Arr[14].GetIndex(index)));
                setColor(LabelUPDate, 0, 0, 102);
                break;
            case 2:
                SwapPanel(PanPlat, PanShift);
                break;

            default:
                break;
        }
    }

    void settextLabelPage1ToPage3(int numPage, Array A) {
        if (numPage == 2) {
            La1P1.setText(String.valueOf(A.GetIndex(0)));
            La2P1.setText(String.valueOf(A.GetIndex(1)));
            La3P1.setText(String.valueOf(A.GetIndex(2)));
            La4P1.setText(String.valueOf(A.GetIndex(3)));
            La5P1.setText(String.valueOf(A.GetIndex(4)));
            La6P1.setText(String.valueOf(A.GetIndex(5)));
            La7P1.setText(String.valueOf(A.GetIndex(6)));
      
        } else if (numPage == 3) {
            La1P2.setText(String.valueOf(A.GetIndex(0)));
            La2P2.setText(String.valueOf(A.GetIndex(1)));
            La3P2.setText(String.valueOf(A.GetIndex(2)));
            La4P2.setText(String.valueOf(A.GetIndex(3)));
            La5P2.setText(String.valueOf(A.GetIndex(4)));
            La6P2.setText(String.valueOf(A.GetIndex(5)));
            La7P2.setText(String.valueOf(A.GetIndex(6)));
            
        } else if (numPage == 4) {
            La1P3.setText(String.valueOf(A.GetIndex(0)));
            La2P3.setText(String.valueOf(A.GetIndex(1)));
            La3P3.setText(String.valueOf(A.GetIndex(2)));
            La4P3.setText(String.valueOf(A.GetIndex(3)));
            La5P3.setText(String.valueOf(A.GetIndex(4)));
            La6P3.setText(String.valueOf(A.GetIndex(5)));
            La7P3.setText(String.valueOf(A.GetIndex(6)));
           
        }
    }

    void settextLabelPage4(Array A, Array B) {
        SW1_4.setText(String.valueOf(A.GetIndex(0)));
        SW2_4.setText(String.valueOf(A.GetIndex(1)));
        SW3_4.setText(String.valueOf(A.GetIndex(2)));
        SW4_4.setText(String.valueOf(A.GetIndex(3)));
        SW5_4.setText(String.valueOf(A.GetIndex(4)));
        SW6_4.setText(String.valueOf(A.GetIndex(5)));
        SW7_4.setText(String.valueOf(A.GetIndex(6)));
        // xet gia tri Shift.
        SD1_4.setText(String.valueOf(B.GetIndex(0)));
        SD2_4.setText(String.valueOf(B.GetIndex(1)));
        SD3_4.setText(String.valueOf(B.GetIndex(2)));
        SD4_4.setText(String.valueOf(B.GetIndex(3)));
        SD5_4.setText(String.valueOf(B.GetIndex(4)));
        SD6_4.setText(String.valueOf(B.GetIndex(5)));
        SD7_4.setText(String.valueOf(B.GetIndex(6)));
        // xet gia tri delete. 
        D1_4.setText(String.valueOf(B.GetIndex(0)));
        D2_4.setText(String.valueOf(B.GetIndex(1)));
        D3_4.setText(String.valueOf(B.GetIndex(2)));
        D4_4.setText(String.valueOf(B.GetIndex(3)));
        D5_4.setText(String.valueOf(B.GetIndex(4)));
        D6_4.setText(String.valueOf(B.GetIndex(5)));
    }

    void settextLabelPage5(Array A, Array B) {
        SW1_5.setText(String.valueOf(A.GetIndex(0)));
        SW2_5.setText(String.valueOf(A.GetIndex(1)));
        SW3_5.setText(String.valueOf(A.GetIndex(2)));
        SW4_5.setText(String.valueOf(A.GetIndex(3)));
        SW5_5.setText(String.valueOf(A.GetIndex(4)));
        SW6_5.setText(String.valueOf(A.GetIndex(5)));

        // xet gia tri Shift.
        SD1_5.setText(String.valueOf(B.GetIndex(0)));
        SD2_5.setText(String.valueOf(B.GetIndex(1)));
        SD3_5.setText(String.valueOf(B.GetIndex(2)));
        SD4_5.setText(String.valueOf(B.GetIndex(3)));
        SD5_5.setText(String.valueOf(B.GetIndex(4)));
        SD6_5.setText(String.valueOf(B.GetIndex(5)));

        // xet gia tri delete.
        D1_5.setText(String.valueOf(B.GetIndex(0)));
        D2_5.setText(String.valueOf(B.GetIndex(1)));
        D3_5.setText(String.valueOf(B.GetIndex(2)));
        D4_5.setText(String.valueOf(B.GetIndex(3)));
        D5_5.setText(String.valueOf(B.GetIndex(4)));

    }

    void settextLabelPage6(Array A, Array B) {
        SW1_6.setText(String.valueOf(A.GetIndex(0)));
        SW2_6.setText(String.valueOf(A.GetIndex(1)));
        SW3_6.setText(String.valueOf(A.GetIndex(2)));
        SW4_6.setText(String.valueOf(A.GetIndex(3)));
        SW5_6.setText(String.valueOf(A.GetIndex(4)));

        // xet gia tri Shift.
        SD1_6.setText(String.valueOf(B.GetIndex(0)));
        SD2_6.setText(String.valueOf(B.GetIndex(1)));
        SD3_6.setText(String.valueOf(B.GetIndex(2)));
        SD4_6.setText(String.valueOf(B.GetIndex(3)));
        SD5_6.setText(String.valueOf(B.GetIndex(4)));
        // xet gia tri delete.       
        D1_6.setText(String.valueOf(B.GetIndex(0)));
        D2_6.setText(String.valueOf(B.GetIndex(1)));
        D3_6.setText(String.valueOf(B.GetIndex(2)));
        D4_6.setText(String.valueOf(B.GetIndex(3)));

    }

    void settextLabelPage7(Array A, Array B) {
        SW1_7.setText(String.valueOf(A.GetIndex(0)));
        SW2_7.setText(String.valueOf(A.GetIndex(1)));
        SW3_7.setText(String.valueOf(A.GetIndex(2)));
        SW4_7.setText(String.valueOf(A.GetIndex(3)));

        SD1_7.setText(String.valueOf(B.GetIndex(0)));
        SD2_7.setText(String.valueOf(B.GetIndex(1)));
        SD3_7.setText(String.valueOf(B.GetIndex(2)));
        SD4_7.setText(String.valueOf(B.GetIndex(3)));

        // xet gia tri delete.       
        D1_7.setText(String.valueOf(B.GetIndex(0)));
        D2_7.setText(String.valueOf(B.GetIndex(1)));
        D3_7.setText(String.valueOf(B.GetIndex(2)));

    }

    void settextLabelPage8(Array A, Array B) {
        SW1_8.setText(String.valueOf(A.GetIndex(0)));
        SW2_8.setText(String.valueOf(A.GetIndex(1)));
        SW3_8.setText(String.valueOf(A.GetIndex(2)));

        SD1_8.setText(String.valueOf(B.GetIndex(0)));
        SD2_8.setText(String.valueOf(B.GetIndex(1)));
        SD3_8.setText(String.valueOf(B.GetIndex(2)));

        // xet gia tri delete.       
        D1_8.setText(String.valueOf(B.GetIndex(0)));
        D2_8.setText(String.valueOf(B.GetIndex(1)));

    }

    void settextLabelPage9(Array A, Array B) {
        SW1_9.setText(String.valueOf(A.GetIndex(0)));
        SW2_9.setText(String.valueOf(A.GetIndex(1)));

        SD1_9.setText(String.valueOf(B.GetIndex(0)));
        SD2_9.setText(String.valueOf(B.GetIndex(1)));

        // xet gia tri delete.       
        D1_9.setText(String.valueOf(B.GetIndex(0)));

    }
    // xet Panel8. 

    void SwapPanel(javax.swing.JPanel PanMain, javax.swing.JPanel P2) {
        PanMain.removeAll();
        PanMain.repaint();
        PanMain.revalidate();
        PanMain.add(P2);
        PanMain.repaint();
        PanMain.revalidate();
    }

    void setColor(javax.swing.JLabel Label, int m1, int m2, int m3) {
        Label.setBackground(new Color(m1, m2, m3));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grapdemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel D1_4;
    private javax.swing.JLabel D1_5;
    private javax.swing.JLabel D1_6;
    private javax.swing.JLabel D1_7;
    private javax.swing.JLabel D1_8;
    private javax.swing.JLabel D1_9;
    private javax.swing.JLabel D2_4;
    private javax.swing.JLabel D2_5;
    private javax.swing.JLabel D2_6;
    private javax.swing.JLabel D2_7;
    private javax.swing.JLabel D2_8;
    private javax.swing.JLabel D3_4;
    private javax.swing.JLabel D3_5;
    private javax.swing.JLabel D3_6;
    private javax.swing.JLabel D3_7;
    private javax.swing.JLabel D4_4;
    private javax.swing.JLabel D4_5;
    private javax.swing.JLabel D4_6;
    private javax.swing.JLabel D5_4;
    private javax.swing.JLabel D5_5;
    private javax.swing.JLabel D6_4;
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL2;
    private javax.swing.JLabel La1P1;
    private javax.swing.JLabel La1P2;
    private javax.swing.JLabel La1P3;
    private javax.swing.JLabel La2P1;
    private javax.swing.JLabel La2P2;
    private javax.swing.JLabel La2P3;
    private javax.swing.JLabel La3P1;
    private javax.swing.JLabel La3P2;
    private javax.swing.JLabel La3P3;
    private javax.swing.JLabel La4P1;
    private javax.swing.JLabel La4P2;
    private javax.swing.JLabel La4P3;
    private javax.swing.JLabel La5P1;
    private javax.swing.JLabel La5P2;
    private javax.swing.JLabel La5P3;
    private javax.swing.JLabel La6P1;
    private javax.swing.JLabel La6P2;
    private javax.swing.JLabel La6P3;
    private javax.swing.JLabel La7P1;
    private javax.swing.JLabel La7P2;
    private javax.swing.JLabel La7P3;
    private javax.swing.JLabel OUTPUTA0;
    private javax.swing.JLabel OUTPUTA1;
    private javax.swing.JLabel OUTPUTA2;
    private javax.swing.JLabel OUTPUTA3;
    private javax.swing.JLabel OUTPUTA4;
    private javax.swing.JLabel OUTPUTA5;
    private javax.swing.JLabel OUTPUTA6;
    private javax.swing.JPanel PAN4Delete;
    private javax.swing.JPanel PAN4SW;
    private javax.swing.JPanel PAN4ShiftDown;
    private javax.swing.JPanel PAN5Delete;
    private javax.swing.JPanel PAN5SW;
    private javax.swing.JPanel PAN5ShiftDown;
    private javax.swing.JPanel PAN6Delete;
    private javax.swing.JPanel PAN6SW;
    private javax.swing.JPanel PAN6ShiftDown;
    private javax.swing.JPanel PAN7Delete;
    private javax.swing.JPanel PAN7SW;
    private javax.swing.JPanel PAN7ShiftDown;
    private javax.swing.JPanel PAN8Delete;
    private javax.swing.JPanel PAN8SW;
    private javax.swing.JPanel PAN8ShiftDown;
    private javax.swing.JPanel PAN9Delete;
    private javax.swing.JPanel PAN9SW;
    private javax.swing.JPanel PAN9ShiftDown;
    private javax.swing.JPanel PANPAGE0;
    private javax.swing.JPanel PANPAGE1;
    private javax.swing.JPanel PANPAGE2;
    private javax.swing.JPanel PANPAGE3;
    private javax.swing.JPanel PANPAGE4;
    private javax.swing.JPanel PANPAGE5;
    private javax.swing.JPanel PANPAGE6;
    private javax.swing.JPanel PANPAGE7;
    private javax.swing.JPanel PANPAGE8;
    private javax.swing.JPanel PANPAGE9;
    private javax.swing.JLabel SD1_4;
    private javax.swing.JLabel SD1_5;
    private javax.swing.JLabel SD1_6;
    private javax.swing.JLabel SD1_7;
    private javax.swing.JLabel SD1_8;
    private javax.swing.JLabel SD1_9;
    private javax.swing.JLabel SD2_4;
    private javax.swing.JLabel SD2_5;
    private javax.swing.JLabel SD2_6;
    private javax.swing.JLabel SD2_7;
    private javax.swing.JLabel SD2_8;
    private javax.swing.JLabel SD2_9;
    private javax.swing.JLabel SD3_4;
    private javax.swing.JLabel SD3_5;
    private javax.swing.JLabel SD3_6;
    private javax.swing.JLabel SD3_7;
    private javax.swing.JLabel SD3_8;
    private javax.swing.JLabel SD4_4;
    private javax.swing.JLabel SD4_5;
    private javax.swing.JLabel SD4_6;
    private javax.swing.JLabel SD4_7;
    private javax.swing.JLabel SD5_4;
    private javax.swing.JLabel SD5_5;
    private javax.swing.JLabel SD5_6;
    private javax.swing.JLabel SD6_4;
    private javax.swing.JLabel SD6_5;
    private javax.swing.JLabel SD7_4;
    private javax.swing.JLabel SW1_4;
    private javax.swing.JLabel SW1_5;
    private javax.swing.JLabel SW1_6;
    private javax.swing.JLabel SW1_7;
    private javax.swing.JLabel SW1_8;
    private javax.swing.JLabel SW1_9;
    private javax.swing.JLabel SW2_4;
    private javax.swing.JLabel SW2_5;
    private javax.swing.JLabel SW2_6;
    private javax.swing.JLabel SW2_7;
    private javax.swing.JLabel SW2_8;
    private javax.swing.JLabel SW2_9;
    private javax.swing.JLabel SW3_4;
    private javax.swing.JLabel SW3_5;
    private javax.swing.JLabel SW3_6;
    private javax.swing.JLabel SW3_7;
    private javax.swing.JLabel SW3_8;
    private javax.swing.JLabel SW4_4;
    private javax.swing.JLabel SW4_5;
    private javax.swing.JLabel SW4_6;
    private javax.swing.JLabel SW4_7;
    private javax.swing.JLabel SW5_4;
    private javax.swing.JLabel SW5_5;
    private javax.swing.JLabel SW5_6;
    private javax.swing.JLabel SW6_4;
    private javax.swing.JLabel SW6_5;
    private javax.swing.JLabel SW7_4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel pt0;
    private javax.swing.JLabel pt1;
    private javax.swing.JLabel pt2;
    private javax.swing.JLabel pt3;
    private javax.swing.JLabel pt4;
    private javax.swing.JLabel pt5;
    private javax.swing.JLabel pt6;
    private javax.swing.JTextField ptA0;
    private javax.swing.JTextField ptA1;
    private javax.swing.JTextField ptA2;
    private javax.swing.JTextField ptA3;
    private javax.swing.JTextField ptA4;
    private javax.swing.JTextField ptA5;
    private javax.swing.JTextField ptA6;
    // End of variables declaration//GEN-END:variables
}
