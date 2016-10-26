package com.example.parksecurity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class SecondActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		Button btnCallMain = (Button)findViewById(R.id.CallMainBtn);
		btnCallMain.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v){
				
				Log.i("hwanni", "callmainactivity");
				finish();
			}
		});
		
	}
	
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.park, menu);
		return true;
	}

}
