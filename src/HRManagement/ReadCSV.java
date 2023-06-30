package HRManagement;

import HRManagement.csv_library.NTKReadCSV;
import HRManagement.csv_to_string.StringReadCSV;

public class ReadCSV implements IReadCSV{
    StringReadCSV stringReadCSV = new StringReadCSV();

    @Override
    public String readCSV(String fileURL) {
        return stringReadCSV.readFile(fileURL);
    }

    @Override
    public void writeCSV(String fileURL, String content) {

    }
}
