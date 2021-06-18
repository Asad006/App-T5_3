package org.example.Ex44.Base;

import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class DataProcess {
    private static ArrayList<String> jasonInArrayList = new ArrayList<>();
    private static Product product = new Product();
    private static Boolean isExist = false;


    public String productNameCheck(String productName) {

        readDataFromJsonFile();
        checkProductNameExist(productName);

        return displayProductMessage();
    }

    private String displayProductMessage() {
        if (isExist) {
            return String.format("Name: %s %nPrice: %.2f%nQuantity: %s", product.getName(), product.getPrice(), product.getQuantity());
        } else {
            return "not found";
        }
    }

    private void checkProductNameExist(String productName) {
        int i = 0;
        while (i < jasonInArrayList.size() && !isExist) {
            product = deserializationProduct(jasonInArrayList.get(i));
            if (product.getName().equals(productName)) {
                isExist = true;
            } else {
                isExist = false;
            }
            i++;

        }

    }

    private Product deserializationProduct(String jsonArrayElement) {
        Gson gson = new Gson();
        Product product = gson.fromJson(jsonArrayElement, Product.class);

        return product;
    }

    private void readDataFromJsonFile() {

        JsonParser parser = new JsonParser();

        try {
            Object obj = parser.parse(new FileReader("exercise44_input.json"));
            JsonObject jsonObject = (JsonObject) obj;
            JsonArray productlist = (JsonArray) jsonObject.get("products");

            Gson gson = new Gson();

            Iterator<JsonElement> iterator = productlist.iterator();
            while (iterator.hasNext()) {

                jasonInArrayList.add(gson.toJson(iterator.next()));
            }

        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }

    }


}
