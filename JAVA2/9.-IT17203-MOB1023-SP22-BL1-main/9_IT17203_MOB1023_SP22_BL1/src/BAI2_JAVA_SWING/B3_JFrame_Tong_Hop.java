/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_JAVA_SWING;

import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dungna89 2 Kiểu người học lập trình
 */
public class B3_JFrame_Tong_Hop extends javax.swing.JFrame {

  /**
   * Creates new form B3_JFrame_Tong_Hop
   */
  //Biến toàn cục luôn khai báo trên đầu
  Vector _vtcHeader;
  Vector _vtcData;

  public B3_JFrame_Tong_Hop() {
    initComponents();
    radioButton();
    cbcNamSinh();
    cbcGioiTinh();
    _vtcHeader = new Vector();
    _vtcData = new Vector();
    setHeaderTable();
    setcbctest();
  }

  void setHeaderTable() {
    _vtcHeader.add("Tên");
    _vtcHeader.add("Giới tính");
    _vtcHeader.add("Năm sinh");
    _vtcHeader.add("Tuổi");
    tbl_banBe.setModel(new DefaultTableModel(_vtcHeader, 0));
  }
  
  public void setcbctest(){
      DefaultComboBoxModel testcbc = new DefaultComboBoxModel();
      testcbc.addElement("it");
      testcbc.addElement("mob");
      testcbc.addElement("web");
      cbcNganh.setModel(testcbc);
      
  }

  void cbcGioiTinh() {
    DefaultComboBoxModel dcbb = new DefaultComboBoxModel();
    dcbb.addElement("Nam");
    dcbb.addElement("Nữ");
    dcbb.addElement("Không xác định");
    cbcGioiTinh.setModel(dcbb);
  }

  void cbcNamSinh() {
    cbcNamSinh.setModel(new DefaultComboBoxModel(getYears1800()));
//    cbcNamSinh.setSelectedIndex(2);//Lấy giá trị tại index mong muốn gán cho cbc
    cbcNamSinh.setSelectedItem("2001");//Lấy giá trị theo giá trị cần tìm gán cho cbc
  }

  String[] getYears1800() {
    String[] arrY = new String[2023 - 1800];
    int temp = 1800;
    for (int i = 0; i < arrY.length; i++) {
      arrY[i] = String.valueOf(temp);
      temp++;
    }
    return arrY;
  }

  void radioButton() {
    //Hành động code dưới đây giúp cho người dùng chỉ có thể chọn 1 trong 3
    ButtonGroup groupGioiTinh = new ButtonGroup();
    groupGioiTinh.add(rdb_Nam);
    groupGioiTinh.add(rdb_Nu);
    groupGioiTinh.add(rdb_KhongXacDinh);
    rdb_KhongXacDinh.setSelected(true);

  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
   * code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ChaoBan = new javax.swing.JLabel();
        txt_InputTen = new javax.swing.JTextField();
        btn_OK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rdb_Nam = new javax.swing.JRadioButton();
        rdb_Nu = new javax.swing.JRadioButton();
        rdb_KhongXacDinh = new javax.swing.JRadioButton();
        cbcNamSinh = new javax.swing.JComboBox<>();
        cbcGioiTinh = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_banBe = new javax.swing.JTable();
        txt_Tuoi = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_GioiTinh = new javax.swing.JTextField();
        txt_NS = new javax.swing.JTextField();
        btn_Logout = new javax.swing.JButton();
        cbcNganh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_ChaoBan.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_ChaoBan.setText("Chào bạn.....");
        lbl_ChaoBan.setToolTipText("");

        txt_InputTen.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        btn_OK.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Nhập tên:");
        jLabel2.setToolTipText("");

        rdb_Nam.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rdb_Nam.setText("NAM");

        rdb_Nu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rdb_Nu.setText("NỮ");

        rdb_KhongXacDinh.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        rdb_KhongXacDinh.setText("Không xác định");

        cbcNamSinh.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cbcNamSinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbcGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cbcGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbl_banBe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_banBe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_banBe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_banBeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_banBe);

        txt_Tuoi.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        txt_Name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        txt_GioiTinh.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        txt_NS.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        btn_Logout.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_Logout.setText("LOGOUT");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        cbcNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbcNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcNganhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_InputTen, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_OK))
                                    .addComponent(lbl_ChaoBan)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_NS, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdb_Nam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdb_Nu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdb_KhongXacDinh))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(cbcNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbcNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(cbcGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Logout)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdb_Nam)
                        .addComponent(rdb_Nu)
                        .addComponent(rdb_KhongXacDinh)
                        .addComponent(cbcNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbcGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_InputTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_OK)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ChaoBan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cbcNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txt_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txt_NS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btn_Logout)))
                        .addGap(18, 18, 18)
                        .addComponent(txt_Tuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed

    String name = txt_InputTen.getText();///Lấy value do người dùng nhập
    if (name.isBlank()) {
      JOptionPane.showMessageDialog(this, "Bạn không đc để trống và khoảng trắng");
      txt_InputTen.setText("");//Gán lại giá trị mặc định cho textfield
      return;
    }
    lbl_ChaoBan.setText("Chào bạn " + name + " học môn JAVA2");
    Vector vtc = new Vector();
    vtc.add(name);
    vtc.add(rdb_Nam.isSelected()?"Nam":rdb_Nu.isSelected()?"Nữ":"Không xác định");
    vtc.add(String.valueOf(cbcNamSinh.getSelectedItem()));
    vtc.add(2022 - Integer.parseInt(cbcNamSinh.getSelectedItem().toString()));
    _vtcData.add(vtc);//Gói data thành 1 đối tượng
    tbl_banBe.setModel(new DefaultTableModel(_vtcData, _vtcHeader));
  }//GEN-LAST:event_btn_OKActionPerformed

  private void tbl_banBeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_banBeMouseClicked
    int index = tbl_banBe.getSelectedRow();//Lấy đc vị trí người dùng bấm
    Vector vtc = (Vector) _vtcData.get(index);
    txt_Name.setText(String.valueOf(vtc.get(0)));//Lấy giá trị ở cột 0
    txt_GioiTinh.setText(String.valueOf(vtc.get(1)));
    txt_NS.setText(String.valueOf(vtc.get(2)));
    
  }//GEN-LAST:event_tbl_banBeMouseClicked

  private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
    new B4_Login().setVisible(true);//Mở được form bạn muốn
    this.dispose();//Đóng form hiện tại
  }//GEN-LAST:event_btn_LogoutActionPerformed

    private void cbcNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbcNganhActionPerformed

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
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(B3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new B3_JFrame_Tong_Hop().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_OK;
    private javax.swing.JComboBox<String> cbcGioiTinh;
    private javax.swing.JComboBox<String> cbcNamSinh;
    private javax.swing.JComboBox<String> cbcNganh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ChaoBan;
    private javax.swing.JRadioButton rdb_KhongXacDinh;
    private javax.swing.JRadioButton rdb_Nam;
    private javax.swing.JRadioButton rdb_Nu;
    private javax.swing.JTable tbl_banBe;
    private javax.swing.JTextField txt_GioiTinh;
    private javax.swing.JTextField txt_InputTen;
    private javax.swing.JTextField txt_NS;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Tuoi;
    // End of variables declaration//GEN-END:variables
}
