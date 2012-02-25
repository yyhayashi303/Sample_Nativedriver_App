package sample.nativedriver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

	}

	public void start(View v) {
		try {
			Intent intent = new Intent(this, Class.forName(((Button) v).getText().toString()));
			startActivity(intent);
		} catch (ClassNotFoundException e) {
			Log.e("settag", "", e);
		}
	}
}
