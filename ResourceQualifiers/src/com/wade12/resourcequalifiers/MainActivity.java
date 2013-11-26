package com.wade12.resourcequalifiers;

import com.wade12.resourcequalifiers.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView) findViewById(R.id.textView);
		
		String text = this.getResources().getString(R.string.deviceSpec);
		// textView.setText(text);
		int number = this.getResources().getInteger(R.integer.integer);
		textView.setText(text + ": integer = " + number);
		
	} // end method onCreate
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	} // end method onCreateOptionsMenu

} // end Class MainActivity
