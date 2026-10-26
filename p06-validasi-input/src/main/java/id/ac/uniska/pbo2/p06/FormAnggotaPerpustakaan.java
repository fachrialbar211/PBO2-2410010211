/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p06;

/**
 *
 * @author Admin
 */
public class FormAnggotaPerpustakaan extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormAnggotaPerpustakaan.class.getName());

    public FormAnggotaPerpustakaan() {
        initComponents();
        inisialisasiAksiValidasi();

        tombolPanel.setLayout(new java.awt.BorderLayout(10, 0));
        tombolPanel.add(statusLabel, java.awt.BorderLayout.WEST);

        javax.swing.JPanel panelAksi = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 6, 0));
        panelAksi.add(batalButton);
        panelAksi.add(daftarButton);
        tombolPanel.add(panelAksi, java.awt.BorderLayout.EAST);
        judulLabel.putClientProperty("FlatLaf.styleClass", "h1");
        keteranganLabel.putClientProperty("FlatLaf.styleClass", "muted");
        dataAnggotaLabel.putClientProperty("FlatLaf.styleClass", "h3");
        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 16, 12, 16));
        keteranganLabel.setMaximumSize(new java.awt.Dimension(Short.MAX_VALUE, 28));
        kontakLabel.putClientProperty("FlatLaf.styleClass", "h3");
        emailField.putClientProperty("JTextField.placeholderText", "nama@contoh.com");
        hpField.putClientProperty("JTextField.placeholderText", "08xxxxxxxxxx");
        getRootPane().setDefaultButton(daftarButton);

        java.awt.Color merahError = new java.awt.Color(220, 53, 69);
        namaPesanLabel.setForeground(merahError);
        npmPesanLabel.setForeground(merahError);
        prodiPesanLabel.setForeground(merahError);
        emailPesanLabel.setForeground(merahError);
        hpPesanLabel.setForeground(merahError);
        statusLabel.setForeground(merahError);

        pack();
        setSize(480, getHeight());
        setMinimumSize(new java.awt.Dimension(450, 600));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jenisAnggotaButtonGroup = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        isiPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        kontakLabel = new javax.swing.JLabel();
        setujuCheckBox = new javax.swing.JCheckBox();
        alamatTextArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        alamatLabel = new javax.swing.JLabel();
        hpField = new javax.swing.JTextField();
        hpPesanLabel = new javax.swing.JLabel();
        hpLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailPesanLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        dataAnggotaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        namaPesanLabel = new javax.swing.JLabel();
        namalabel = new javax.swing.JLabel();
        npmField = new javax.swing.JTextField();
        npmPesanLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        prodiComboBox = new javax.swing.JComboBox<>();
        prodiPesanLabel = new javax.swing.JLabel();
        jenisAnggotaLabel = new javax.swing.JLabel();
        jenisAnggotaPanel = new javax.swing.JPanel();
        mahasiswaRadioButton = new javax.swing.JRadioButton();
        umumRadioButton = new javax.swing.JRadioButton();
        dosenRadioButton = new javax.swing.JRadioButton();
        tombolPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        batalButton = new javax.swing.JButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pendaftaran Anggota Perpustakaan");

        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 8, 16));
        headerPanel.setPreferredSize(new java.awt.Dimension(400, 60));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.Y_AXIS));

        judulLabel.setText("Pendaftaran Anggota Perpustakaan");
        headerPanel.add(judulLabel);

        keteranganLabel.setText("Semua isian wajib diisi, kecuali alamat.");
        keteranganLabel.setPreferredSize(new java.awt.Dimension(450, 26));
        headerPanel.add(keteranganLabel);

        getContentPane().add(headerPanel, java.awt.BorderLayout.NORTH);

        isiPanel.setLayout(new java.awt.BorderLayout());

        formPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 16));
        formPanel.setLayout(new java.awt.GridBagLayout());

        kontakLabel.setText("Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 6, 0);
        formPanel.add(kontakLabel, gridBagConstraints);

        setujuCheckBox.setText("Setuju dengan tata tertib perpustakaan");
        setujuCheckBox.addActionListener(this::setujuCheckBoxActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 6, 0);
        formPanel.add(setujuCheckBox, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        alamatTextArea.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(alamatTextArea, gridBagConstraints);

        alamatLabel.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(alamatLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(hpField, gridBagConstraints);

        hpPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(hpPesanLabel, gridBagConstraints);

        hpLabel.setText("Nomor HP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(hpLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(emailField, gridBagConstraints);

        emailPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(emailPesanLabel, gridBagConstraints);

        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(emailLabel, gridBagConstraints);

        dataAnggotaLabel.setText("Data Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        formPanel.add(dataAnggotaLabel, gridBagConstraints);

        npmLabel.setDisplayedMnemonic('P');
        npmLabel.setLabelFor(npmField);
        npmLabel.setText("NPM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(npmLabel, gridBagConstraints);

        namaField.addActionListener(this::namaFieldActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(namaField, gridBagConstraints);

        namaPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(namaPesanLabel, gridBagConstraints);

        namalabel.setDisplayedMnemonic('N');
        namalabel.setLabelFor(namaField);
        namalabel.setText("Nama Lengkap");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(namalabel, gridBagConstraints);

        npmField.setToolTipText("Hanya angka, tepat 10 digit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        formPanel.add(npmField, gridBagConstraints);

        npmPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(npmPesanLabel, gridBagConstraints);

        prodiLabel.setText("Program studi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(prodiLabel, gridBagConstraints);

        prodiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Program Studi", "S1 Teknik Informatika", "S1 Sistem Informasi", "S1 Manajemen Transportasi", "S1 Teknik Sipil", "S1 Teknik Mesin", "S1 Ilmu Komunikasi" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(prodiComboBox, gridBagConstraints);

        prodiPesanLabel.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 2, 0);
        formPanel.add(prodiPesanLabel, gridBagConstraints);

        jenisAnggotaLabel.setText("Jenis anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(jenisAnggotaLabel, gridBagConstraints);

        jenisAnggotaPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 0));

        jenisAnggotaButtonGroup.add(mahasiswaRadioButton);
        mahasiswaRadioButton.setText("Mahasiswa");
        jenisAnggotaPanel.add(mahasiswaRadioButton);

        jenisAnggotaButtonGroup.add(umumRadioButton);
        umumRadioButton.setText("Umum");
        jenisAnggotaPanel.add(umumRadioButton);

        jenisAnggotaButtonGroup.add(dosenRadioButton);
        dosenRadioButton.setText("Dosen");
        jenisAnggotaPanel.add(dosenRadioButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        formPanel.add(jenisAnggotaPanel, gridBagConstraints);

        isiPanel.add(formPanel, java.awt.BorderLayout.NORTH);

        tombolPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 16, 16));
        tombolPanel.setPreferredSize(new java.awt.Dimension(400, 50));
        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 8, 0));

        statusLabel.setText(" ");
        tombolPanel.add(statusLabel);

        batalButton.setText("Batal");
        batalButton.addActionListener(this::batalButtonActionPerformed);
        tombolPanel.add(batalButton);

        daftarButton.setText("Daftar");
        daftarButton.setEnabled(false);
        daftarButton.addActionListener(this::daftarButtonActionPerformed);
        tombolPanel.add(daftarButton);

        isiPanel.add(tombolPanel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(isiPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        int jumlahKesalahan = 0;

        if (!periksaNama()) {
            jumlahKesalahan++;
        }
        if (!periksaNpm()) {
            jumlahKesalahan++;
        }
        if (!periksaProdi()) {
            jumlahKesalahan++;
        }
        if (!periksaEmail()) {
            jumlahKesalahan++;
        }
        if (!periksaHp()) {
            jumlahKesalahan++;
        }

        if (jumlahKesalahan > 0) {
            statusLabel.setForeground(new java.awt.Color(220, 53, 69));
            statusLabel.setText(jumlahKesalahan + " isian perlu diperbaiki");
            return;
        }

        statusLabel.setText(" ");
        String jenis = "Umum";
        if (dosenRadioButton.isSelected()) {
            jenis = "Dosen";
        } else if (mahasiswaRadioButton.isSelected()) {
            jenis = "Mahasiswa";
        }

        StringBuilder ringkasan = new StringBuilder();
        ringkasan.append("RINGKASAN PENDAFTARAN ANGGOTA \n\n");
        ringkasan.append("Nama Lengkap : ").append(namaField.getText()).append("\n");
        ringkasan.append("NPM          : ").append(npmField.getText()).append("\n");
        ringkasan.append("Program Studi: ").append(prodiComboBox.getSelectedItem().toString()).append("\n");
        ringkasan.append("Jenis Anggota: ").append(jenis).append("\n");
        ringkasan.append("Email        : ").append(emailField.getText()).append("\n");
        ringkasan.append("No. HP       : ").append(hpField.getText()).append("\n");
        ringkasan.append("Alamat       : ").append(jTextArea1.getText());

        javax.swing.JOptionPane.showMessageDialog(this,
                ringkasan.toString(),
                "Ringkasan Pendaftaran Anggota",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed

        int pilihan = javax.swing.JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin keluar?",
                "Konfirmasi Keluar",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (pilihan == javax.swing.JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_batalButtonActionPerformed

    private void namaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFieldActionPerformed

    }//GEN-LAST:event_namaFieldActionPerformed

    private void setujuCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setujuCheckBoxActionPerformed
        daftarButton.setEnabled(setujuCheckBox.isSelected());
    }//GEN-LAST:event_setujuCheckBoxActionPerformed
    private void inisialisasiAksiValidasi() {

        namaField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (!namaField.getText().isBlank()) {
                    periksaNama();
                }
            }
        });

        npmField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (!npmField.getText().isBlank()) {
                    periksaNpm();
                }
            }
        });

        npmField.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                // Lewatkan karakter kontrol seperti Backspace, Delete
                if (Character.isISOControl(c)) {
                    return;
                }
                boolean penuh = npmField.getText().length() >= 10 && npmField.getSelectedText() == null;
                if (!Character.isDigit(c) || penuh) {
                    evt.consume();
                }
            }
        });

        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (!emailField.getText().isBlank()) {
                    periksaEmail();
                }
            }
        });

        hpField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (!hpField.getText().isBlank()) {
                    periksaHp();
                }
            }
        });

        hpField.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                if (!Character.isDigit(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        });

        prodiComboBox.addItemListener(evt -> {
            if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                periksaProdi();
            }
        });

        setujuCheckBox.addItemListener(evt -> {
            daftarButton.setEnabled(setujuCheckBox.isSelected());
        });
    }

    private boolean periksaNama() {
        return tandai(namaField, namaPesanLabel, Validator.nama(namaField.getText()));
    }

    private boolean periksaNpm() {
        return tandai(npmField, npmPesanLabel, Validator.npm(npmField.getText()));
    }

    private boolean periksaProdi() {
        String kesalahan = null;
        if (prodiComboBox.getSelectedIndex() == 0) {
            kesalahan = "Pilih salah satu program studi";
        }
        return tandai(prodiComboBox, prodiPesanLabel, kesalahan);
    }

    private boolean periksaEmail() {
        return tandai(emailField, emailPesanLabel, Validator.email(emailField.getText()));
    }

    private boolean periksaHp() {
        return tandai(hpField, hpPesanLabel, Validator.nomorHp(hpField.getText()));
    }

    private boolean tandai(javax.swing.JComponent isian, javax.swing.JLabel pesan, String kesalahan) {
        isian.putClientProperty("JComponent.outline", (kesalahan == null) ? null : "error");
        pesan.setText((kesalahan == null) ? " " : kesalahan);
        return kesalahan == null;
    }

    private boolean adaIsian() {
        return !npmField.getText().isBlank() || !namaField.getText().isBlank()
                || !emailField.getText().isBlank() || !hpField.getText().isBlank()
                || !jTextArea1.getText().isBlank();
    }

    private void kosongkan() {
        for (javax.swing.JTextField isian : java.util.List.of(npmField, namaField, emailField, hpField)) {
            isian.setText("");
        }
        jTextArea1.setText("");
        prodiComboBox.setSelectedIndex(0);
        mahasiswaRadioButton.setSelected(true);
        setujuCheckBox.setSelected(false);
        daftarButton.setEnabled(false);

        tandai(namaField, namaPesanLabel, null);
        tandai(npmField, npmPesanLabel, null);
        tandai(prodiComboBox, prodiPesanLabel, null);
        tandai(emailField, emailPesanLabel, null);
        tandai(hpField, hpPesanLabel, null);
        statusLabel.setText(" ");
        namaField.requestFocusInWindow();
    }

    public static void main(String args[]) {
        com.formdev.flatlaf.FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(() -> {
            new FormAnggotaPerpustakaan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JScrollPane alamatTextArea;
    private javax.swing.JButton batalButton;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel dataAnggotaLabel;
    private javax.swing.JRadioButton dosenRadioButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailPesanLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField hpField;
    private javax.swing.JLabel hpLabel;
    private javax.swing.JLabel hpPesanLabel;
    private javax.swing.JPanel isiPanel;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.ButtonGroup jenisAnggotaButtonGroup;
    private javax.swing.JLabel jenisAnggotaLabel;
    private javax.swing.JPanel jenisAnggotaPanel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JLabel kontakLabel;
    private javax.swing.JRadioButton mahasiswaRadioButton;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaPesanLabel;
    private javax.swing.JLabel namalabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JLabel npmPesanLabel;
    private javax.swing.JComboBox<String> prodiComboBox;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JLabel prodiPesanLabel;
    private javax.swing.JCheckBox setujuCheckBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel tombolPanel;
    private javax.swing.JRadioButton umumRadioButton;
    // End of variables declaration//GEN-END:variables
}
