package com.example.administrador.myapplication3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inicializar Animes
        List items = new ArrayList();

        items.add(new Anime(R.drawable.captura, "Angel Beats", 230));
        items.add(new Anime(R.drawable.captura, "Death Note", 456));
        items.add(new Anime(R.drawable.captura, "Fate Stay Night", 342));
        items.add(new Anime(R.drawable.captura, "Welcome to the NHK", 645));
        items.add(new Anime(R.drawable.captura, "Suzumiya Haruhi", 459));

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
        adapter = new AnimeAdapter(items);
        recycler.setAdapter(adapter);

    }
}
