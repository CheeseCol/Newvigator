package NewvigatorProject.MainMenuUserInterface;

import NewvigatorProject.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuUserInterface {
    public JPanel MainPanel;
    private JButton mapButton;
    private JButton settingsButton;
    private JRadioButton resButton1;
    private JRadioButton resButton2;
    private JRadioButton resButton3;
    private JRadioButton voiceOnButton;
    private JRadioButton voiceOffButton;
    private JButton returnButton;
    private JButton resolutionButton;
    private JButton accessibilityButton;
    private JPanel mainMenuPanel;
    private JPanel settingsMenuPanel;
    private JPanel corePanel;
    private JPanel buttonsPanel;
    private JPanel settingsContentPanel;
    private JPanel accessibilityPanel;
    private JPanel resolutionPanel;

    public MainMenuUserInterface() {
    returnButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            corePanel.removeAll();
            corePanel.add(mainMenuPanel);
            corePanel.repaint();
            corePanel.revalidate();

        }
    });
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                corePanel.removeAll();
                corePanel.add(settingsMenuPanel);
                corePanel.repaint();
                corePanel.revalidate();
            }
        });
        resolutionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsContentPanel.removeAll();
                settingsContentPanel.add(resolutionPanel);
                settingsContentPanel.repaint();
                settingsContentPanel.revalidate();
            }
        });
        accessibilityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsContentPanel.removeAll();
                settingsContentPanel.add(accessibilityPanel);
                settingsContentPanel.repaint();
                settingsContentPanel.revalidate();
            }
        });
        voiceOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.accessibilityValue = 1;
            }
        });
        voiceOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.accessibilityValue = 0;
            }
        });
        resButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.resolutionSetting = -1;
            }
        });
        resButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.resolutionSetting = 0;
            }
        });
        resButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.resolutionSetting = 1;
            }
        });
    }
}
