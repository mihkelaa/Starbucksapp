package com.example.mihkel.starbucksapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();

        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(
                this,
                android.R.layout.simple_list_item_1,
                Drinks.drinks
        );
        listDrinks.setAdapter(listAdapter);
    }
    public void onListItemClick(ListView listView,View itemView,int position,long id){
       // intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        if(position==0) {
            Intent intent = new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
            startActivity(intent);
        }
        if(position==1){
            Intent intent=new Intent(DrinkCategoryActivity.this,DrinkActivity2.class);
            startActivity(intent);
        }
        if(position==2){
            Intent intent=new Intent(DrinkCategoryActivity.this,DrinkActivity3.class);
            startActivity(intent);
        }
    }
}