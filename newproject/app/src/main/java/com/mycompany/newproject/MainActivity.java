package com.mycompany.newproject;
import android.app.*;
import android.os.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener
{
    //проверяем, какая кнопка нажата.
    @Override
    public void onClick(View v){
        switch (v.getId()){
            //case R.id.button1: Toast.makeText (This, "Нажата кнопка button 1", Toast.LENGTH_SHORT).show(); break;
            case R.id.button2: Toast.makeText (This, "Нажата кнопка button 2", Toast.LENGTH_SHORT).show(); break;
            case R.id.button3: Toast.makeText (This, "Нажата кнопка button 3", Toast.LENGTH_SHORT).show(); break;
            case R.id.button4: Toast.makeText (This, "Нажата кнопка button 4", Toast.LENGTH_SHORT).show(); break;
        }
    }
    //новое действие
    @Override
    public void onMyClick(View v){
        switch (v.getId()){
            case R.id.button1: Toast.makeText (This, "тест нового метода", Toast.LENGTH_SHORT).show(); break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView1 = (TextView) findViewById(R.id.textView1);

        final Button button1 = (Button)findViewById(R.id.button1);
        final Button button2 = (Button)findViewById(R.id.button2);
        final Button button3 = (Button)findViewById(R.id.button3);
        final Button button4 = (Button)findViewById(R.id.button4);

        //один обработчки для всех кнопок
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }
}
