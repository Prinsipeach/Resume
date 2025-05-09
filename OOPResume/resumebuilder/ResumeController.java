package resumebuilder;
import javax.swing.*;

import java.awt.event.ActionListener;

public class ResumeController {
    private Resume model;
    private ResumeGUI view;
    private ResumeValidator validator;
    private PDFExporter exporter;

    public ResumeController(Resume model, ResumeGUI view, ResumeValidator validator, PDFExporter exporter) {
        this.model = model;
        this.view = view;
        this.validator = validator;
        this.exporter = exporter;

        // Add event listeners
        view.getGenerateButton().addActionListener(generateResumeListener());
        view.getExportButton().addActionListener(exportPDFListener());
    }

    private ActionListener generateResumeListener() {
        return e -> {
            try {
                // Validate inputs
                validator.validateName(view.getNameField().getText());
                validator.validateEmail(view.getEmailField().getText());

                // Update Model
                model.setName(view.getNameField().getText());
                model.setEmail(view.getEmailField().getText());
                model.setPhone(view.getPhoneField().getText());
                model.setAddress(view.getAddressField().getText());
                model.setEducation(view.getEducationArea().getText());
                model.setExperience(view.getExperienceArea().getText());
                model.setSkills(view.getSkillsArea().getText());
                model.setAwards(view.getAwardsField().getText());
                model.setReferences(view.getReferencesField().getText());

                // Update View
                view.getResumeArea().setText(model.toFormattedString());
            } catch (InvalidResumeException ex) {
                JOptionPane.showMessageDialog(view.getFrame(), ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        };
    }

    private ActionListener exportPDFListener() {
        return e -> {
            try {
                // Validate inputs
                validator.validateName(view.getNameField().getText());
                validator.validateEmail(view.getEmailField().getText());

                // Update Model
                model.setName(view.getNameField().getText());
                model.setEmail(view.getEmailField().getText());
                model.setPhone(view.getPhoneField().getText());
                model.setAddress(view.getAddressField().getText());
                model.setEducation(view.getEducationArea().getText());
                model.setExperience(view.getExperienceArea().getText());
                model.setSkills(view.getSkillsArea().getText());
                model.setAwards(view.getAwardsField().getText());
                model.setReferences(view.getReferencesField().getText());

                // Open file chooser
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Save Resume as PDF");
                if (fileChooser.showSaveDialog(view.getFrame()) == JFileChooser.APPROVE_OPTION) {
                    String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                    if (!filePath.toLowerCase().endsWith(".pdf")) {
                        filePath += ".pdf";
                    }
                    exporter.exportToPDF(model, filePath);
                    JOptionPane.showMessageDialog(view.getFrame(), "PDF saved successfully!");
                }
            } catch (InvalidResumeException | PDFExportException ex) {
                JOptionPane.showMessageDialog(view.getFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        };
    }
}