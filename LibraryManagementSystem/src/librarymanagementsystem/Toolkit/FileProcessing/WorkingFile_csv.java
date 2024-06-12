//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package librarymanagementsystem.Toolkit.FileProcessing;

import java.awt.Component;
import java.awt.FileDialog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class WorkingFile_csv {
    private static String csv_file = "";
    FileDialog fx = new FileDialog(new JFrame(), "Đọc file Excel", 1);
    static ArrayList<String> time_series = new ArrayList();
    static ArrayList<Integer> number_series = new ArrayList();

    public WorkingFile_csv() {
    }

    public String WriteFile() {
        this.fx.setFilenameFilter(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".csv");
            }
        });
        this.fx.setFile("untitled.csv");
        this.fx.setVisible(true);
        String var10000 = this.fx.getDirectory();
        String url = var10000 + this.fx.getFile();
        return url.equals("nullnull") ? null : url;
    }

    public void ExportCSV(ArrayList<String> Time, ArrayList<Integer> Number) {
        csv_file = this.WriteFile();

        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(csv_file));

            try {
                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(new String[]{"Time", "Number"}));

                try {
                    int i = 0;

                    while(true) {
                        if (i >= Time.size()) {
                            csvPrinter.flush();
                            System.out.println("Thành Công");
                            JOptionPane.showMessageDialog((Component)null, "Ghi file thành công: " + csv_file);
                            break;
                        }

                        csvPrinter.printRecord(new Object[]{Time.get(i), Number.get(i)});
                        ++i;
                    }
                } catch (Throwable var9) {
                    try {
                        csvPrinter.close();
                    } catch (Throwable var8) {
                        var9.addSuppressed(var8);
                    }

                    throw var9;
                }

                csvPrinter.close();
            } catch (Throwable var10) {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (Throwable var7) {
                        var10.addSuppressed(var7);
                    }
                }

                throw var10;
            }

            if (writer != null) {
                writer.close();
            }
        } catch (IOException var11) {
            IOException e = var11;
            e.printStackTrace();
        }

    }

    public void ImportCSV() {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(csv_file));

            try {
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

                try {
                    int i = 0;
                    Iterator var4 = csvParser.iterator();

                    while(var4.hasNext()) {
                        CSVRecord csvRecord = (CSVRecord)var4.next();
                        String time = csvRecord.get(0);
                        String number = csvRecord.get(1);
                        if (i > 0) {
                            time_series.add(time);
                            number_series.add(Integer.parseInt(number));
                        }

                        ++i;
                        System.out.println("Record No - " + csvRecord.getRecordNumber());
                        System.out.println("---------------");
                        System.out.println("Time : " + time);
                        System.out.println("Number : " + number);
                        System.out.println("---------------\n\n");
                    }
                } catch (Throwable var10) {
                    try {
                        csvParser.close();
                    } catch (Throwable var9) {
                        var10.addSuppressed(var9);
                    }

                    throw var10;
                }

                csvParser.close();
            } catch (Throwable var11) {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (Throwable var8) {
                        var11.addSuppressed(var8);
                    }
                }

                throw var11;
            }

            if (reader != null) {
                reader.close();
            }
        } catch (IOException var12) {
            IOException e = var12;
            e.printStackTrace();
        }

    }

    public ArrayList<String> getTime_series() {
        return time_series;
    }

    public ArrayList<Integer> getNumber_series() {
        return number_series;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> Time = new ArrayList();
        ArrayList<Integer> Number = new ArrayList();
        Time.add("2019-01");
        Time.add("2019-02");
        Time.add("2019-03");
        Time.add("2019-04");
        Time.add("2019-05");
        Time.add("2019-06");
        Time.add("2019-07");
        Time.add("2019-08");
        Time.add("2019-10");
        Time.add("2019-11");
        Time.add("2019-12");
        Time.add("2020-01");
        Time.add("2020-02");
        Time.add("2020-03");
        Time.add("2020-04");
        Time.add("2020-05");
        Time.add("2020-06");
        Number.add(10);
        Number.add(12);
        Number.add(14);
        Number.add(15);
        Number.add(23);
        Number.add(25);
        Number.add(26);
        Number.add(31);
        Number.add(34);
        Number.add(35);
        Number.add(32);
        Number.add(34);
        Number.add(37);
        Number.add(38);
        Number.add(43);
        Number.add(31);
        Number.add(43);
        Number.add(45);
        (new WorkingFile_csv()).ExportCSV(Time, Number);
        (new WorkingFile_csv()).ImportCSV();
    }
}
