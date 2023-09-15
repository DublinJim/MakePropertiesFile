package com.example.makepropertiesfile;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Text txt0;
    public Text txt1;
    public Text txt2;
    public Text txt3;
    public Text txt4;
    public Text txt5;
    public Label Lbl1;
    public AnchorPane rootPaneMain;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Properties properties = new Properties();
String fileName ="C:\\Users\\james.keogh\\IdeaProjects\\MakePropertiesFile\\src\\main\\java\\com\\example\\makepropertiesfile\\app.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String title = properties.getProperty("title");
        String version = properties.getProperty("version");
        String author = properties.getProperty("author");
        String controller = properties.getProperty("controller");
        String company= properties.getProperty("company");
        String timeMade= properties.getProperty("timeMade");



        txt0.setText(author);
        txt1.setText(version);
        txt2.setText(title);
        txt3.setText(controller);
        txt4.setText(company);
        txt5.setText(timeMade);

    }
}
