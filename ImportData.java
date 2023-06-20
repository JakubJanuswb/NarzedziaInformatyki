import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ImportData {
    public List<IqCountry> rankingIQ;

    public ImportData(String filePath) {
        rankingIQ = new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 3) {
                    IqCountry iqCountry = new IqCountry();
                    iqCountry.country = data[1].trim();
                    iqCountry.iq = Integer.parseInt(data[2].trim());
                    iqCountry.place = Integer.parseInt(data[0].trim());
                    rankingIQ.add(iqCountry);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}