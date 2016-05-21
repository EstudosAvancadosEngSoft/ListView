package com.example.android.listactivity;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();

        String[] cidades = new String[]{"Lavras","Varginha","Eloi mendes", "Três Pontas", "Três corações"};
        String[] descricao = new String[]{"Cidade da UFLA", "Cidade do ET","Mutuca","Cidade do café","Cidade do pelé"};

        for(int i =0;i<cidades.length;i++){
            HashMap<String, String> item = new HashMap<String,String>();
            item.put("cidade", cidades[i]);
            item.put("descricao", descricao[i] );
            list.add(item);
        }

        String[] from = new String[]{"cidade","descricao"};

        int[] to = new int[]{android.R.id.text1, android.R.id.text2};
        int layoutNativo = android.R.layout.two_line_list_item;

        setListAdapter(new SimpleAdapter(this,list,layoutNativo,from,to));
    }
}
