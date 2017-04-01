package com.example.betty.ui;

import android.support.v4.util.SimpleArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Listview extends AppCompatActivity {


   private String[] names =new String[]
            {"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[]imagesIds=new int[]
            {R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
   public void onCreate(Bundle savedInstanceState)
   {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.main);
       List<Map<String,Object>> ListItems=new ArrayList<Map<String,Object>>();
       for(int i=0;i<names.length;i++)
       {
           Map<String,Object> ListItem=new HashMap<String,Object>();
          ListItem.put("header",imagesIds[i]);
          ListItem.put("personName",names[i]);
          ListItems.add(ListItem);
           SimpleAdapter simpleAdapter =new SimpleAdapter(this,ListItems,R.layout.simple_item,new String[]{"personName","header"},
                   new int[] {R.id.name,R.id.header});
           ListView list =(ListView)findViewById(R.id.mylist);
           list.setAdapter(simpleAdapter);
       }

   }


}
