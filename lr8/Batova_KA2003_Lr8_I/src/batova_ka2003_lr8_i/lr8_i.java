/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batova_ka2003_lr8_i;

/**
 *
 * @author fkb_prog
 */
public class lr8_i extends javax.swing.JFrame {

    /**
     * Creates new form lr8_i
     */
    public lr8_i() {
        initComponents();
        jTable1.setAutoCreateRowSorter (true); //сортировка
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Угрозы экономической безопасности ТЭК");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Падение мирового спроса на уголь", "Угольная промышленность",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0), null},
                {"2", "Закрытие проекта «Северный поток – 2»", "Газпром",  new Integer(1),  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(1),  new Integer(0), null},
                {"3", "Блокировка Суэцкого канала", "Транспортные и нефтяные компании",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(1),  new Integer(0), null},
                {"4", "Соглашение ОПЕК+ о сокращении добычи нефти", "Нефтесервисные компании",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0), null},
                {"5", "Падение цен на нефть", "Нефтесервисные компании",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0), null},
                {"6", "Снижение запасов газа на фоне аномальных холодов", "Газодобывающие компании",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(1),  new Integer(0), null},
                {"7", "Изменение энерготарифов для предприятий", "Предприятия ТЭК России",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(1),  new Integer(0), null},
                {"8", "Колоссальные убытки «Норникеля» после разлива топлива в Норильске", "Норникель",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(1),  new Integer(0), null},
                {"9", "Введение углеродного сбора", "Нефтедобывающие компании России",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(0), null},
                {"10", "Воровство из нефтепроводов", "Нефтепроводы",  new Integer(1),  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(1),  new Integer(0), null},
                {"11", "Изменения порядка проведения конкурсов для поддержки зеленой энергетики", "Альтернативная энергетика",  new Integer(1),  new Integer(0),  new Integer(0),  new Integer(0),  new Integer(1),  new Integer(0), null},
                {"12", "Кризис энергопотребления из-за пандемии", "Нефтесервисные компании",  new Integer(1),  new Integer(0),  new Integer(1),  new Integer(1),  new Integer(1),  new Integer(0), null}
            },
            new String [] {
                "№", "Название", "Объект", "ОвО", "НСД", "УД", "МД", "НФТС", "НИВР", "Сумма"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(1).setMinWidth(430);
            jTable1.getColumnModel().getColumn(2).setMinWidth(200);
        }

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Вычисление суммы");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Угрозы экономической безопасности ТЭК");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Cортировка реализуется при нажатии на название заголовка столбца, по которому нужно выполнить сортировку.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(jLabel1)
                                .addGap(367, 367, 367))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(343, 343, 343))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int sum = 0; //сумме присваиваем значение 0
        for (int i = 0; i<jTable1.getRowCount(); i++) //цикл от 0 до кол-ва строк; jTable1.getRowCount() - метод, возвращающий количество строк в таблице
        {
            for (int k = 3;k<(jTable1.getColumnCount()-1);k++)  //цикл для подсчета суммы значений в строке i 
                sum +=(int)jTable1.getModel().getValueAt(i, k);
                //т.к. значения в ячейках - обьекты, их необходимо преобразовать в целочисл. тип с помощью (int)
            jTable1.setValueAt(sum,i,9);//записываем в отдельный столбец сумму для каждой угрозы
            sum = 0;//обнуляем сумму
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(lr8_i.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lr8_i.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lr8_i.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lr8_i.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lr8_i().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
