package com.example.ejercicio_planeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<Entidad> arrayEntidad = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = (ListView) findViewById(R.id.lvItems);

        llenarItems();
    }

    private void llenarItems(){
        arrayEntidad.add(new Entidad(R.drawable.dbs_1, "MERCURIO", "Mercucrio es el planeta más próximo al Sol"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_2, "VENUS", "Venus es el planeta cuya órbita se acerca más a la Tierra"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_3, "TIERRA", "La tierra se formó hace aproximadamente 4.600 millones de años"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_4, "MARTE", "Marte es denominado planeta rojo"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_5, "JUPITER", "Jupiter es el gigante de los planetas"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_6, "SATURNO", "Saturno es el segundo más grande del sistema solar"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_7, "URANO", "Urano es conocido como el planeta al revés"));
        arrayEntidad.add(new Entidad(R.drawable.dbs_8, "NEPTUNO", "Neptuno es un gigante gaseoso muy parecido a Urano"));

        adaptador = new Adaptador(this, arrayEntidad);
        lvItems.setAdapter(adaptador);

    }
}