import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

public class Ozgecmis {
    public static void main(String[] args) {
        try {
            // PDF dosyası oluştur
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("ozgecmis.pdf"));
            doc.open();

            // Başlık
            Paragraph baslik = new Paragraph("CEYDA AYAZ", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD));
            baslik.setAlignment(Element.ALIGN_CENTER);
            doc.add(baslik);
            doc.add(new Paragraph("YAZILIM MUHENDISLIGI OGRENCISI\n\n"));

            // Fotoğraf ekle
            Image img = Image.getInstance("foto.jpg");
            img.scaleToFit(120, 120);
            img.setAlignment(Element.ALIGN_RIGHT);
            doc.add(img);

            // Kişisel Bilgiler
            doc.add(new Paragraph("KISISEL BILGILER"));
            doc.add(new Paragraph("Telefon: 0530 077 06 04"));
            doc.add(new Paragraph("E-posta: ceydaayaz2024@gmail.com"));
            doc.add(new Paragraph("Konum: Istanbul\n\n"));

            // İş Deneyimleri
            doc.add(new Paragraph("IS DENEYİMLERİ"));
            doc.add(new Paragraph("1. Yazilim Stajyeri - TechSoft (2023)"));
            doc.add(new Paragraph("2. Front-End Gelistirici - CodeLab (2024)"));
            doc.add(new Paragraph("3. Veri Analisti - DataVision (2025)\n\n"));

            // Eğitim
            doc.add(new Paragraph("EGITIM"));
            doc.add(new Paragraph("Kırklareli Universitesi - Yazilim Muhendisligi (2021 - Devam ediyor)"));

            doc.close();
            System.out.println("PDF basarıyla olusturuldu!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
