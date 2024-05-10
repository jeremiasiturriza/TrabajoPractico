import java.util.List;

public interface CsvParser {
    List<String[]> parseCsv(String filepath) throws Exception;

    String[] getHeader(String filepath) throws Exception;
}