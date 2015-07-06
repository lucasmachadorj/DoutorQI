package com.example.machado.doutorqi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DoctorsListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_list);

        Intent intent = getIntent();
        String especialidade = intent.getStringExtra("especialidade");
        String plano = intent.getStringExtra("plano");
        String uf = intent.getStringExtra("uf");

        TextView exemplo = (TextView) findViewById(R.id.exemplo);
        exemplo.setText(
                "Médico Exemplo:" + "\nEspecialidade: " + especialidade + "\nPlano: " + plano + "\nUF: " + uf);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_doctors_list, menu);
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
