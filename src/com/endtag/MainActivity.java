package com.endtag;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	      Button mBtn1 = (Button) findViewById(R.id.login1);
	        mBtn1.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

        @Override
        public void onClick (View view) {
            // TODO Auto-generated method stub
        	

        	EditText name = (EditText)findViewById(R.id.Username);
		    String strname = name.getText().toString();
		    


              Log.i("clicks","You Clicked Login");
              	Intent i=new Intent(
                 MainActivity.this,
                 MainActivityHomeScreen.class);
              	 i.putExtra("Username", strname);
          startActivity(i);


        }
}