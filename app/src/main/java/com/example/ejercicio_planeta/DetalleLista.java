package com.example.ejercicio_planeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleLista extends AppCompatActivity {
    private TextView tvTitulo, tvDescripcion;
    private ImageView imgFoto;
    private Entidad item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_lista);
        item = (Entidad) getIntent().getSerializableExtra("item");
        if (item != null){
            tvTitulo = findViewById(R.id.tvTitulo);
            tvDescripcion = findViewById(R.id.tvDescripcion);
            imgFoto = findViewById(R.id.imgFoto);

            tvTitulo.setText(item.getTitulo());
            tvDescripcion.setText(item.getContenido());
            imgFoto.setImageResource(item.getImgFoto());
        }
    }
}