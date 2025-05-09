package resumebuilder;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PDFExporter {
    public void exportToPDF(Resume resume, String filePath) throws PDFExportException {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Define fonts
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 22, BaseColor.DARK_GRAY);
            Font labelFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.BLUE);
            Font textFont = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.BLACK);
            Font referencesFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);

            // Add content
            Paragraph nameTitle = new Paragraph(resume.getName(), titleFont);
            nameTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(nameTitle);
            document.add(new Paragraph("\n"));

            document.add(new Paragraph("Email:", labelFont));
            document.add(new Paragraph(resume.getEmail(), textFont));
            document.add(new Paragraph("Phone:", labelFont));
            document.add(new Paragraph(resume.getPhone(), textFont));
            document.add(new Paragraph("Address:", labelFont));
            document.add(new Paragraph(resume.getAddress(), textFont));
            document.add(new Paragraph("\n"));

            document.add(new Paragraph("Education:", labelFont));
            document.add(new Paragraph(resume.getEducation(), textFont));
            document.add(new Paragraph("\n"));

            document.add(new Paragraph("Experience:", labelFont));
            document.add(new Paragraph(resume.getExperience(), textFont));
            document.add(new Paragraph("\n"));

            document.add(new Paragraph("Skills:", labelFont));
            document.add(new Paragraph(resume.getSkills(), textFont));
            document.add(new Paragraph("\n"));

            document.add(new Paragraph("Awards and Honors:", labelFont));
            document.add(new Paragraph(resume.getAwards(), textFont));
            document.add(new Paragraph("\n"));

            document.add(new Paragraph("References:", referencesFont));
            document.add(new Paragraph(resume.getReferences(), referencesFont));

            document.close();
        } catch (DocumentException | IOException e) {
            throw new PDFExportException("Failed to export PDF: " + e.getMessage());
        }
    }
}