package it.appacademy.convertitoredivalute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

// DONE 1: Dichiarare le View con le quali si lavorerà
    EditText euro;
    TextView dollari;
    double doubDollari=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DONE 2: Collegare le Views
        euro=(EditText) findViewById(R.id.etEuro);
        dollari=(TextView) findViewById(R.id.tvDollariV);

    }



    public void convertiValuta(View view) {

        // DONE 3. Log Button Click
        Log.d("btConverti", "Bottone Converti premuto");

        // DONE 4. Leggere euro e Log
        euro=findViewById(R.id.etEuro);
        dollari=findViewById(R.id.tvDollariV);
        Log.d("convEUR2USD","converto "+euro+"€ in ... ");


        // DONE 5. Trasformare gli euro letti da String a Double
        // DONE 6. Convertire Euro in dollari
        // dollari = euro * 1.18213;
        doubDollari=Double.parseDouble(euro.getText().toString())*1.18213;


        // DONE 7. Scrivere il valore espresso in Dollari nella TextView
        dollari.setText(String.format( "%.2f", doubDollari));

    }
}
