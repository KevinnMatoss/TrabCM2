package intro.multiecras.kevin_matos;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView osNumeros = (TextView) findViewById(R.id.numeros);
        osNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent osNumerosIntent = new Intent(MainActivity.this, NumerosActivity.class);
                startActivity(osNumerosIntent);
            }
        });

        TextView asCores = (TextView) findViewById(R.id.cores);
        asCores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asCoresIntent = new Intent(MainActivity.this, CoresActivity.class);
                startActivity(asCoresIntent);
            }
        });

        TextView asFrases = (TextView) findViewById(R.id.frases);
        asFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asFrasesIntent = new Intent(MainActivity.this, FrasesActivity.class);
                startActivity(asFrasesIntent);
            }
        });

        TextView osFamilia = (TextView) findViewById(R.id.familia);
        osFamilia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent osFamiliaIntent = new Intent(MainActivity.this, FamiliaActivity.class);
                startActivity(osFamiliaIntent);
            }
        });

    }
}
