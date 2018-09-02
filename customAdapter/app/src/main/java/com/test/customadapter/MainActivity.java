package com.test.customadapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    ListView listView;
    String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String[] activity={"Selfstudy","Selfstudy","selfstudy","gym","gym","sleep","outing"};
    int[] images={R.drawable.abc,R.drawable.abc,R.drawable.abc,R.drawable.abc,R.drawable.abc,R.drawable.abc,R.drawable.abc,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.listView);
        customAdapter custom=new customAdapter();
        listView.setAdapter(custom);
    }
    public class customAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int i, View convertView, ViewGroup parent) {

            convertView=getLayoutInflater().inflate(R.layout.custom_row,null);
            ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
            TextView text1=(TextView)convertView.findViewById(R.id.textView1);
            TextView text21=(TextView)convertView.findViewById(R.id.textView1);
            imageView.setImageResource(images[i]);
            text1.setText(days[i]);
            text21.setText(activity[i]);
            return convertView;
        }
    }

}
