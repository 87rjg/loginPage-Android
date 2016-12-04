package com.ram.hwp12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Ram on 6/7/2016.
 */
public class NextActivity extends Activity
{
    TextView et;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_layout);
        et = (TextView) findViewById(R.id.tv3);

        Intent i = getIntent();
         Bundle b = i.getExtras();

         name = b.getString("k1");
        et.setText(""+name);

    }
    public void radioButton(View v)
    {
        RadioButton rb = (RadioButton)v;

        String text = rb.getText().toString();
         Intent i1 = new Intent(this,AdminActivity.class);

        i1.putExtra("k1",name);
        i1.putExtra("k2",text);
        rb.setText("");
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
