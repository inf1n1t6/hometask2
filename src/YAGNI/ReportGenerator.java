package YAGNI;


public class ReportGenerator {
    public void generatePdfReport() {

    }
}

public interface ReportFormat {
    void generate();
}

public class PdfReportFormat implements ReportFormat {
    @Override
    public void generate() {

    }
}

public class ReportGenerator {
    public void generateReport(ReportFormat format) {
        format.generate();
    }
}

