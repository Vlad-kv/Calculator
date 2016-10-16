package com.vlad_kv.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView result;
    private EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        input = (EditText)findViewById(R.id.input);
    }


    public void onClickClear(View view) {
        input.setText("");
    }


    public void onClickAdded(View view) {
        String s = "";
        switch (view.getId()) {
            case R.id.d0:
                s = "0";
                break;
            case R.id.d1:
                s = "1";
                break;
            case R.id.d2:
                s = "2";
                break;
            case R.id.d3:
                s = "3";
                break;
            case R.id.d4:
                s = "4";
                break;
            case R.id.d5:
                s = "5";
                break;
            case R.id.d6:
                s = "6";
                break;
            case R.id.d7:
                s = "7";
                break;
            case R.id.d8:
                s = "8";
                break;
            case R.id.d9:
                s = "9";
                break;
            case R.id.add:
                s = "+";
                break;
            case R.id.sub:
                s = "-";
                break;
            case R.id.mul:
                s = "*";
                break;
            case R.id.div:
                s = "/";
                break;
            case R.id.left_bracket:
                s = "(";
                break;
            case R.id.right_bracket:
                s = ")";
                break;
            case R.id.comma:
                s = ",";
                break;
        }
        input.append(s);
    }

    public void onClickDel(View view) {
        StringBuilder str = new StringBuilder(input.getText());
        if (str.length() > 0) {
            str.deleteCharAt(str.length() - 1);
        }
        input.setText(str);
    }
}
