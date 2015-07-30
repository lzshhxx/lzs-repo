package com.example.hellogit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class GitMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		 Button button = new Button(this);
	        button.setText("Call Native");//stringFirst("Button"));
	   
	        button.setOnClickListener(new View.OnClickListener() {
				public void onClick(View button){
					((Button) button).setText(stringSecond("second"));

					}
	        });
	     //   String str = stringSecond("second");
	        setContentView(button);
	}
			    public native String  stringFirst(String str);

			    public native String stringSecond(String str);

			    static {
			        System.loadLibrary("hellogit");
			    }
			

}







