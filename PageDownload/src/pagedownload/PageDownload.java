/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagedownload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Stark
 */
public class PageDownload {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int n = 5;
        String url = "";
        for(int i=0;i<n;i++){
            Document doc= Jsoup.connect(url+"/"+i).get();
            String html = doc.html();
            Files.write(Paths.get("D://"+i+".html"), html.getBytes(), StandardOpenOption.WRITE);
        }
    }
    
}
