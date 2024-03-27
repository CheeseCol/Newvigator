package NewvigatorProject.SettingsMenuUserInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsMenu {
    private JPanel parentPanel;
    private JPanel buttonsPanel;
    private JButton accessibilityButton;
    private JButton exitButton;
    private JButton resolutionButton;
    public JPanel mainSettingsPanel;
    private JPanel resolutionPanel;
    private JPanel accessibilityPanel;
    private JRadioButton fourEightyButton;
    private JRadioButton sevenTwnetyButton;
    private JRadioButton tenEightyButton;
    private JRadioButton enabledButton;
    private JRadioButton disabledButton;
public SettingsMenu() {
    accessibilityButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            parentPanel.removeAll();
            parentPanel.add(accessibilityPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
        }
    });
    resolutionButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            parentPanel.removeAll();
            parentPanel.add(resolutionPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
        }
    });
    disabledButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.voiceGuideEnabled = false;
            JOptionPane.showMessageDialog(null, "Voice Guide Disabled");
        }
    });
    enabledButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.voiceGuideEnabled = true;
            JOptionPane.showMessageDialog(null, "Voice Guide Enabled");
        }
    });
    fourEightyButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.resolution = 0;
            JOptionPane.showMessageDialog(null, "Resolution set to 640x480p");

        }
    });
    sevenTwnetyButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.resolution = 1;
            JOptionPane.showMessageDialog(null, "Resolution set to 1280x720p");
        }
    });
    tenEightyButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.resolution = 2;
            JOptionPane.showMessageDialog(null, "Resolution set to 1920x1080p");
        }
    });
}
}
