package com.test.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
   ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        String[] countryname={"America","Brazil","China","Holland","India","Jamaica","Korea","Laxumberg","Mongolia","Norway","Oman"};
        ArrayAdapter<String> adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_2,countryname);
        listView.setAdapter(adapter);

    }
}
