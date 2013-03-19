package com.endtag;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class MainActivityHomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_home_screen);
        
        Intent intent = getIntent();
        String strname = intent.getExtras().getString("Username");
        
        TextView link = (TextView) findViewById(R.id.textView2);
	    String linkText = strname;
	    link.setText(Html.fromHtml(linkText));
	    link.setMovementMethod(LinkMovementMethod.getInstance());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_activity_home_screen, menu);
        return true;
        
        
        
    }
    
}
