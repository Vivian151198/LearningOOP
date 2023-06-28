package HRManagement;

public interface IReadCSV {
    public String readCSV(String fileURL);

    public void writeCSV(String fileURL, String content);
}
