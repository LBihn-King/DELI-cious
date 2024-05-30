package com.pluralsite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class ReceiptFileManager {
    //private String currentDateTime;
    private Order order;

    public ReceiptFileManager(Order order){
        //this.currentDateTime=getDateTime();
        this.order=order;
    }

    private String getDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(formatter);
    }

    public void saveReceipt() {
        try {
            String filename = getDateTime()+".txt";
            String filepath = "receipts";
            File file = new File(filepath, filename);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            Iterator<String> orderIterator = order.getItems().iterator();
            String output;
            while (orderIterator.hasNext()) {
                output = String.valueOf(orderIterator.next());
                bufferedWriter.write(output);
            }
            String total = "\nTotal: $%.2f".formatted(order.getTotal());
            bufferedWriter.write(total);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}