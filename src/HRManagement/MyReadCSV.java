package HRManagement;

public class MyReadCSV implements IReadCSV{
    @Override
    public String readCSV(String fileURL) {
        System.out.println("MY CUSTOME Read CSV");
        return "MY CONTENT";
    }

    @Override
    public void writeCSV(String fileURL, String content) {

    }
}
