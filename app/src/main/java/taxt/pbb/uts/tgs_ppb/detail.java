package taxt.pbb.uts.tgs_ppb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by ASUS on 16/11/2017.
 */

public class detail extends AppCompatActivity {
    Button tambah, kurang, hasil;
    EditText isi;
    String list[] = {"1", "2", "3", "4", "5"};
    Context context;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.pilih_olahraga);
        final Calendar c = Calendar.getInstance();
        final Button tambah = (Button) findViewById(R.id.tambah);
        Button kurang = (Button) findViewById(R.id.kurang);
        Button hasil = (Button) findViewById(R.id.hasil);
        final EditText isi = (EditText) findViewById(R.id.isi);
        final TextView textView = (TextView) findViewById(R.id.jenis_olahraga);
        Intent i = getIntent();
        textView.setText(i.getStringExtra("pesan"));
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                isi.setText("" + counter);
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                isi.setText("" + counter);
            }
        });
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda melakukan olahraga" + " " + textView.getText() + " " + "dengan waktu" + " " + isi.getText() + " " + "jam", Toast.LENGTH_LONG).show();
            }
        });

    }
}
