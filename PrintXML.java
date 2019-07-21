import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintXML {
    public static void main(String[] args) {
        XMLPrinter printer = new XMLPrinter();

        printer.run();
    }
}

class XMLPrinter {
    private ArrayList<ArrayList<String>> xmlList = new ArrayList<>();

    public void run() {
        readLines();
        printXML();
    }

    private void readLines() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter names...");

        String line;

        while (!(line = kb.nextLine()).equals("exit"))
        {
            ArrayList<String> namesList = new ArrayList<>();
            String [] names = line.split(" ");

            Collections.addAll(namesList, names);

            xmlList.add(namesList);
        }
    }

    private void printXML() {
        System.out.println("<Names>");

        for (Object names : xmlList) {
            System.out.println("\t<Line>");
            for (Object name : (ArrayList) names) {
                System.out.printf("\t\t<Name>%s</Name>\n", name.toString());
            }
            System.out.println("\t</Line>");
        }

        System.out.println("</Names>");
    }
}
