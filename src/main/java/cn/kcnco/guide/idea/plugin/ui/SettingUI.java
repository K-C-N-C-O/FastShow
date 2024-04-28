package cn.kcnco.guide.idea.plugin.ui;

import javax.swing.*;
import java.io.File;

public class SettingUI {
    private JPanel MainPanel;
    private JPanel settingPanel;
    private JTextField urlTextField;
    private JButton urlBtn;
    private JLabel urlLable;

    public SettingUI() {
        // 给按钮添加一个选择文件的事件
        urlBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.showOpenDialog(settingPanel);
            File file = fileChooser.getSelectedFile();
            urlTextField.setText(file.getPath());
        });
    }

    public JComponent getComponent() {
        return MainPanel;
    }

    public JTextField getUrlTextField() {
        return urlTextField;
    }
}
