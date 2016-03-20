package com.example.rationalert;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
//import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Greencard extends Activity {
	Button b;
	TextView t,t1;

public EditText e1,e2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_greencard);
		e1=(EditText)findViewById(R.id.et8);
		e2=(EditText)findViewById(R.id.a1);
		t=(TextView)findViewById(R.id.tv3);
		t1=(TextView)findViewById(R.id.tv4);
		b=(Button)findViewById(R.id.b9);	
		
	}
	public void green(View arg0) {
		
		 String num=e1.getText().toString();
		   String msg=e2.getText().toString();
		  
		
		SmsManager s=SmsManager.getDefault();
		
		s.sendTextMessage(num, null, msg, null, null);
		Toast.makeText(getApplicationContext(),"Msg sent", Toast.LENGTH_LONG).show();
		
		}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.greencard, menu);
		return true;
	}

}
