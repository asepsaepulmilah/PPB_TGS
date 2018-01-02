package taxt.pbb.uts.tgs_ppb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by ASUS on 15/11/2017.
 */

public class about extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData(""+
                "<html>"+
                "<body>"+
                "<title>About Aplikasi </title>"+
                "<p>"+"About Aplikasi"+"<br/>"+
                "Aplikasi ini aplikasi pencatatan waktu olahraga"+
                "<br/>"+
                "Aplikasi ini dibuat oleh :<br/>"+
                "1406022_Asep Saepul Milah<br/>"+
                "1406020_Aprizal Pratama<br/>"+
                "</p>"+
                "</body>"+
                "</html>","text/html","UTF-8");
    }
}
