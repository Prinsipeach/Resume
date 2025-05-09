package resumebuilder;

import javax.swing.*;
import java.awt.*;

public class ResumeGUI {
    private JFrame frame;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressField;
    private JTextArea educationArea;
    private JTextArea experienceArea;
    private JTextArea skillsArea;
    private JTextField awardsField;
    private JTextField referencesField;
    private JTextArea resumeArea;
    private JButton generateButton;
    private JButton exportButton;

    public ResumeGUI() {
        frame = new JFrame("Resume Builder");
        frame.setSize(500, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Initialize components
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);
        addressField = new JTextField(20);
        educationArea = new JTextArea(5, 20);
        experienceArea = new JTextArea(5, 20);
        skillsArea = new JTextArea(5, 20);
        awardsField = new JTextField(20);
        referencesField = new JTextField(20);
        resumeArea = new JTextArea(10, 40);
        resumeArea.setEditable(false);
        generateButton = new JButton("Generate Resume");
        exportButton = new JButton("Export as PDF");

        // Add components to frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JLabel("Full Name:"), gbc);
        gbc.gridx = 1;
        frame.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        frame.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(new JLabel("Phone:"), gbc);
        gbc.gridx = 1;
        frame.add(phoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(new JLabel("Address:"), gbc);
        gbc.gridx = 1;
        frame.add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(new JLabel("Education:"), gbc);
        gbc.gridx = 1;
        frame.add(new JScrollPane(educationArea), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        frame.add(new JLabel("Experience:"), gbc);
        gbc.gridx = 1;
        frame.add(new JScrollPane(experienceArea), gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        frame.add(new JLabel("Skills:"), gbc);
        gbc.gridx = 1;
        frame.add(new JScrollPane(skillsArea), gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        frame.add(new JLabel("Awards and Honors:"), gbc);
        gbc.gridx = 1;
        frame.add(awardsField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        frame.add(new JLabel("References:"), gbc);
        gbc.gridx = 1;
        frame.add(referencesField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        frame.add(new JScrollPane(resumeArea), gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        frame.add(generateButton, gbc);

        gbc.gridx = 1;
        frame.add(exportButton, gbc);

        frame.setVisible(true);
    }

    // Getters for components
    public JTextField getNameField() { return nameField; }
    public JTextField getEmailField() { return emailField; }
    public JTextField getPhoneField() { return phoneField; }
    public JTextField getAddressField() { return addressField; }
    public JTextArea getEducationArea() { return educationArea; }
    public JTextArea getExperienceArea() { return experienceArea; }
    public JTextArea getSkillsArea() { return skillsArea; }
    public JTextField getAwardsField() { return awardsField; }
    public JTextField getReferencesField() { return referencesField; }
    public JTextArea getResumeArea() { return resumeArea; }
    public JButton getGenerateButton() { return generateButton; }
    public JButton getExportButton() { return exportButton; }
    public JFrame getFrame() { return frame; }
}