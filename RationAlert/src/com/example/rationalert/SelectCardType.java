package com.example.rationalert;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.Toast;

public class SelectCardType extends Activity {
	SQLiteDatabase ration;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_card_type);
		ration=openOrCreateDatabase("RationAlert.db",MODE_PRIVATE, null);
		ration.execSQL("CREATE TABLE IF NOT EXISTS greendetails(sno,cno,hname,#members,address,phone# NUMBER(10),grplabel");
		ration.execSQL("CREATE TABLE IF NOT EXISTS yellowdetails(sno,cno,hname,#members,address,phone# NUMBER(10),grplabel");
		ration.execSQL("CREATE TABLE IF NOT EXISTS bluedetails(sno,cno,hname,#members,address,phone# NUMBER(10),grplabel");
		ration.execSQL("CREATE TABLE IF NOT EXISTS whitedetails(sno,cno,hname,#members,address,phone# NUMBER(10),grplabel");
		ration.execSQL("CREATE TABLE IF NOT EXISTS saffrondetails(sno,cno,hname,#members,address,phone# NUMBER(10),grplabel");
		
		
		
	}
	public void green(View v) {
		Intent i=new Intent(getApplicationContext(),Greencard.class);
        startActivity(i);
		// TODO Auto-generated method stub
		
	}
	public void yellow(View v) {
		Intent i=new Intent(getApplicationContext(),YellowActivity.class);
        startActivity(i);
		// TODO Auto-generated method stub
		
	}
	public void blue(View v) {
		Intent i=new Intent(getApplicationContext(),BlueActivity.class);
        startActivity(i);
		// TODO Auto-generated method stub
		
	}
	public void saf(View v) {
		Intent i=new Intent(getApplicationContext(),SaffronActivity.class);
        startActivity(i);
		// TODO Auto-generated method stub
		
	}
	public void white(View v) {
		Intent i=new Intent(getApplicationContext(),WhiteActivity.class);
        startActivity(i);
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_card_type, menu);
		return true;
	}

}
