package resumebuilder;

public class ResumeBuilder {
    public static void main(String[] args) {
        // Initialize Model
        Resume model = new Resume("", "", "", "", "", "", "", "", "");

        // Initialize View
        ResumeGUI view = new ResumeGUI();

        // Initialize Validator
        ResumeValidator validator = new ResumeValidator();

        // Initialize Exporter
        PDFExporter exporter = new PDFExporter();

        // Initialize Controller
        ResumeController controller = new ResumeController(model, view, validator, exporter);
    }
}