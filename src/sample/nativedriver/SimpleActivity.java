package sample.nativedriver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
 
public class SimpleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);
    }

    public void transitNext(View v) {
    	String name = ((EditText) findViewById(R.id.edit_name)).getText().toString();
    	String age = ((EditText) findViewById(R.id.edit_age)).getText().toString();
    	Intent intent = new Intent(this, SubActivity.class);
    	intent.putExtra(SubActivity.KEY_NAME, name);
    	intent.putExtra(SubActivity.KEY_AGE, Integer.parseInt(age));
    	startActivity(intent);
    }
}