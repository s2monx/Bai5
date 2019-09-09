package com.example.bai5;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTen;
    TextView txtHo;
    TextView txtDem;
    EditText etxtNhap;
    Button btnTach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        txtTen = (TextView)findViewById(R.id.txtTen);
        txtHo = (TextView)findViewById(R.id.txtHo);
        txtDem = (TextView)findViewById(R.id.txtDem);
        etxtNhap = (EditText)findViewById(R.id.etxtNhap);
        btnTach = (Button)findViewById(R.id.btnTach);

        btnTach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = etxtNhap.getText().toString().trim();
                String s1;
                int k;
                for(k=s.length()-1;k>=0;k--)
                {
                    s1=s.substring(k,k+1);
                    if(s1.equals(" ")) break;
                }
                txtTen.setText("Ten: "+ s.substring(k+1));

                int i;
                for(i=0;i<=s.length();i++)
                {
                    s1=s.substring(i,i+1);
                    if(s1.equals(" ")) break;
                }
                txtHo.setText("Ho: "+ s.substring(0,i));

                int j = 0;
                if(j>i&&j<k)
                {
                    s1=s.substring(j,j+1);
                }
                txtDem.setText("Ten Dem: "+s.substring(i+1,k).trim());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
