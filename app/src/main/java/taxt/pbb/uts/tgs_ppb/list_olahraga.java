package taxt.pbb.uts.tgs_ppb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ASUS on 14/11/2017.
 */

public class list_olahraga extends AppCompatActivity {
    ArrayAdapter adapter;
    private String items[] = {"Lari", "Fustal", "Basket", "Bulu Tangkis", "Tenis"};

    protected void onCreate(Bundle savedInstanceSate) {
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.list_olahraga);

        ListView list_data = (ListView) findViewById(R.id.list_item);

        adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, items);
        list_data.setAdapter(adapter);


        list_data.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi, long arg3) {
                if (posisi == 0) {
                    Intent i = new Intent(list_olahraga.this, detail.class);
                    String hasil = "Lari";
                    i.putExtra("pesan", hasil);
                    startActivity(i);
                }
                if (posisi == 1) {
                    Intent i = new Intent(list_olahraga.this, detail.class);
                    String hasil = "Futsal";
                    i.putExtra("pesan", hasil);
                    startActivity(i);
                }
                if (posisi == 2) {
                    Intent i = new Intent(list_olahraga.this, detail.class);
                    String hasil = "Basket";
                    i.putExtra("pesan", hasil);
                    startActivity(i);
                }
                if (posisi == 3) {
                    Intent i = new Intent(list_olahraga.this, detail.class);
                    String hasil = "Bulu Tangkis";
                    i.putExtra("pesan", hasil);
                    startActivity(i);
                }
                if (posisi == 4) {
                    Intent i = new Intent(list_olahraga.this, detail.class);
                    String hasil = "Tenis";
                    i.putExtra("pesan", hasil);
                    startActivity(i);
                }


            }
        });




    }

}


