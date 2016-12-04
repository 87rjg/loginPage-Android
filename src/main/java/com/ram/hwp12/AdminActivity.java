package com.ram.hwp12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Ram on 6/7/2016.
 */
public class AdminActivity extends Activity
{
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_layout);
        tv1 =  (TextView)findViewById(R.id.tv4);
        tv2 =  (TextView)findViewById(R.id.tv5);

       /* Intent i = getIntent();

        Bundle b = i.getExtras();

        String name = b.getString("k1");
        String status=b.getString("k2");
        tv1.setText(""+name);
        tv2.setText(""+status);*/
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
