package taxt.pbb.uts.tgs_ppb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ASUS on 14/11/2017.
 */

public class menu_utama extends AppCompatActivity {
    Button list, tentang, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        list = (Button) findViewById(R.id.item_menu);
        tentang = (Button) findViewById(R.id.about);
        exit = (Button) findViewById(R.id.exit);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu_utama.this,list_olahraga.class);
                startActivity(i);
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu_utama.this,about.class);
                startActivity(i);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu_utama.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}