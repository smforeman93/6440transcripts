import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class DecodeSRT {
    public static void main(String[] args) {
        BufferedReader br = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the full directory path for your files:");
        File folder = new File(scanner.nextLine());
        File[] listOfFiles = folder.listFiles();
        int video = 1;
        Arrays.sort(listOfFiles);

        try {
            for (File file : listOfFiles) {
                br = new BufferedReader(new FileReader(file.getPath()));
                String line;
                StringBuilder builder = new StringBuilder();
                System.out.println("");
                System.out.println("Video "+video+" - "); // you'll need to fill in the video title manually
                System.out.println("");
                while ((line = br.readLine()) != null) {
                    if (line.isEmpty()) {
                        continue;
                    } else if (Character.isDigit(line.charAt(0))) {
                        continue;
                    } else {
                        builder.append(line);
                        // if last char is a period, add 2 spaces to the end of the sentence
                        if (line.charAt(line.length()-1) == '.') {
                            builder.append("  ");
                        } else {
                            builder.append(" ");
                        }
                    }
                }
                System.out.println(builder.toString());
                video++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
