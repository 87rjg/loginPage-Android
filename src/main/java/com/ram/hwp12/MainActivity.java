package com.ram.hwp12;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    String uname[] = {"Ravi","Kumar","Krishna","Mohan","Prasad"};
    String pass[]  = {"ravikumar","12345","krish007","mohanlal","prasadkrish"};
    EditText et1,et2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button)findViewById(R.id.b1);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

    }

    public void loginPage(View v)
    {
       String username = et1.getText().toString().trim();
        String password= et2.getText().toString().trim();

        if(username.equals(""))
        {
           et1.setError("Empty Field");
        }
        else
        {
            if(password.equals(""))
            {
               et2.setError("Enter Password");
            }
            else
            {
                if(username.equals("Sathya"))
                {
                    if(password.equals("tech"))
                    {
                        Intent in = new Intent(this,AdminActivity.class);

                        startActivity(in);
                    }
                    else
                    {
                        et2.setError("Invalid Password");
                    }
                }
                else {
                    for (int i = 0; i < 5; i++) {
                        if (username.equals(uname[i])) {
                            if (password.equals(pass[i])) {
                                Intent i1 = new Intent(this, NextActivity.class);
                                i1.putExtra("k1", uname[i]);
                                et1.setText("");
                                et2.setText("");
                                startActivity(i1);
                            } else {
                                et2.setError("Wrong Password");
                            }
                        }

                    }
                }
            }
        }
    }

}
