package com.mycompany.newproject;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends Activity implements OnClickListener
{
	//проверяем, какая кнопка нажата
	@Override
	public void onClick(View v){
		switch (v.getId()){
            case R.id.button1: Toast.makeText(this, "Нажата кнопка button1", Toast.LENGTH_SHORT).show(); break;
			case R.id.button2: Toast.makeText(this, "Нажата кнопка button2", Toast.LENGTH_SHORT).show(); break;
			case R.id.button3: Toast.makeText(this, "Нажата кнопка button3", Toast.LENGTH_SHORT).show(); break;
			case R.id.button4: Toast.makeText(this, "Нажата кнопка button4", Toast.LENGTH_SHORT).show(); break;
      }
	}

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText ("Next text in TextView");
   
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

