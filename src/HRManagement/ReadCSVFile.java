package HRManagement;

import HRManagement.csv_library.NTKReadCSV;

public class ReadCSVFile {
    NTKReadCSV ntkReadCSV;

    ReadCSVFile(){
        ntkReadCSV = new NTKReadCSV();
    }
    public char[] readData(String fileUrl) {
        char[] fileContent = ntkReadCSV.readFile(fileUrl);
        return fileContent;
    }
}
