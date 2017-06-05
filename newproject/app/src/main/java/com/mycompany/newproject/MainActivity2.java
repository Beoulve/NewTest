package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity2 extends Activity
{
	final Button OK = (Button)findViewById(R.id.OK);
	final Button Cancel = (Button)findViewById(R.id.Cancel);

	@Override
	Protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		TextView pers_cab = (TextView) findViewById(R.id.pers_cab);
		
	} 	
}
