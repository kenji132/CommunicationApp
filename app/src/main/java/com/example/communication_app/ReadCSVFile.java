//package com.example.communication_app;
//
//import android.os.Bundle;
//import android.util.Log;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class ReadCSVFile extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        readQuestionData();
////        readQuestionDataByColumn();
////        choiceQuestionItem();
//    }
//
//    private List questionItem = new ArrayList<>();
//
//
////    private void choiceQuestionItem(){
////        Random r = new Random();
////        QuestionItem.getQuestion_item(int 3);
////       Log.d("MyActivity", );
////    }
//
//    public void readQuestionData() {
//        InputStream is = getResources().openRawResource(R.raw.test_01);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
//
//        String line = "";
//
//        try {
//            reader.readLine();
//
//            while ((line = reader.readLine()) != null) {
//                Log.d("read", "Line: " + line);
//
//                String[] tokens = line.split(",");
//
//                QuestionItem item = new QuestionItem();
//
//                item.setQuestion_id(Integer.parseInt(tokens[0]));
//                item.setQuestion_item(tokens[1]);
//                questionItem.add(item);
//
//                Log.d("read", "Just created: " + item);
//            }
//        } catch (IOException e) {
//            Log.wtf("read", "Error reading data file on line " + line, e);
//
//            e.printStackTrace();
//        }
//
//    }
//
//
//    private void readQuestionDataByColumn() throws IOException {
//        // Read the raw csv file
//        InputStream is = getResources().openRawResource(R.raw.test_01);
//
//        // Reads text from character-input stream, buffering characters for efficient reading
//        BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
//
//        // Initialization
//        String line = "";
//
//        // Handling exceptions
//        // If buffer is not empty
//        while ((line = br.readLine()) != null) {
//            // use comma as separator columns of CSV
//            String[] cols = line.split(",");
//
//            // Print in logcat
//            System.out.println("Coulmn 0 = '" + cols[0] + "', Column 1 = '" + cols[1] + "', Column 2: '" + cols[2] + "'");
//        }
//    }
//}
