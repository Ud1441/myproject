package com.test.date;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends Activity {
     TextView textView;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        //String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        Date cDate = new Date();
        String fDate = new SimpleDateFormat("yyyyMMdd").format(cDate);

// textView is the TextView view that should display it
        textView.setText(fDate);
        int i=Integer.parseInt(textView.getText().toString());
        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG).show();
        //Log.d(TAG, "Value of ",i);
    }
}
