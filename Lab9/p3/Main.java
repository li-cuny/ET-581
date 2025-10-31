package Lab9.p3;

public class Main {
    public static void main(String[] args) {
        // Printable p1 = new Printable();
        PDFFile pdfFile = new PDFFile();
        TxtFile txtFile = new TxtFile();
        Mp3File mp3File = new Mp3File();
        PDFFile pdfFile2 = new PDFFile();
        pdfFile.print();
        txtFile.print();
        // mp3File.print();

        Printable[] files = new Printable[3];
        files[0] = pdfFile;
        files[1] = txtFile;
        // files[2] = mp3File;
        files[2] = pdfFile2;
        for(Printable f : files){
            f.print();
        }
    }
}
