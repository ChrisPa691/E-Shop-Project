package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddProducts {
    /**
     * Reads products from the products.txt file and returns them as a list of strings.
     * Each string represents one product line from the file.
     *
     * @return List of product strings
     * @throws FileNotFoundException if the products.txt file cannot be found
     */
    public static List<String> readProducts() throws FileNotFoundException {
        List<String> products = new ArrayList<>();
        String projectRoot = System.getProperty("user.dir");
        File product = new File(projectRoot + File.separator + "products.txt");
        
        if (!product.exists()) {
            throw new FileNotFoundException("File not found at: " + product.getAbsolutePath());
        }
        
        try (Scanner myReader = new Scanner(product)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                products.add(data);
            }
        }
        
        return products;
    }

    /**
     * Example of how to use the readProducts method
     */
    public static void main(String[] args) {
        try {
            List<String> products = readProducts();
            for (String product : products) {
                System.out.println(product);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}