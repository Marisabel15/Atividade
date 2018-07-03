package com.example.srtal.atividade04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Produtos> lstProdutos ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstProdutos = new ArrayList<>();
        lstProdutos.add(new Produtos("Brown Eggs","Category Produtos","Description produtos",R.drawable.browneggs));
        lstProdutos.add(new Produtos("Sweet Fresh Strawberries","Category Produtos","Description produtos",R.drawable.strawberries));
        lstProdutos.add(new Produtos("Green Smoothie","Category Produtos","Description produtos",R.drawable.smoothie));
        lstProdutos.add(new Produtos("Aspargus","Category Produtos","Description produtos",R.drawable.aspargus));
        lstProdutos.add(new Produtos("Fresh Pasta","Category Produtos","Description produtos",R.drawable.freshpasta));
        lstProdutos.add(new Produtos("Wines","Category Produtos","Description produtos",R.drawable.wines));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProdutos);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);


    }
}
