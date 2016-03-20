package com.example.rationalert;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity {
	EditText e1;String pass="",check="sindhu";
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	e1=(EditText)findViewById(R.id.et2);
	
	
	}	

		public void login(View v) {
			pass=e1.getText().toString();
			//Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();
				// TODO Auto-generated method stub
			if(pass.equals(check))
			{
				Intent i=new Intent(getApplicationContext(),SelectCardType.class);
		        startActivity(i);
			}
			else
				Toast.makeText(getApplicationContext(),"Invalid password ",Toast.LENGTH_LONG).show();
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
