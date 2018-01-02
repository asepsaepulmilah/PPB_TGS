package taxt.pbb.uts.tgs_ppb;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text_user, text_pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_user= (EditText) findViewById(R.id.text_user);
        text_pass= (EditText) findViewById(R.id.text_pass);
        button= (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = text_user.getText().toString();
                String pass = text_pass.getText().toString();

                if (user.equals("admin")&& pass.equals("admin123")){
                    Toast. makeText(getApplicationContext(),"Login Anda Berhasil",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,menu_utama.class);
                    MainActivity.this.startActivity(i);
                    finish();
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password anda salah !").setNegativeButton("Retry", null).create().show();
                }
            }
        });

    }
}
