package sample.nativedriver;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends Activity {
	public static final String KEY_NAME = "key_name";
	public static final String KEY_AGE = "key_AGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sub);

		TextView profile = (TextView) findViewById(R.id.profile);
		Bundle bundle = getIntent().getExtras();
		String name = bundle.getString(KEY_NAME);
		int age = bundle.getInt(KEY_AGE);
		if (age < 20) {
			profile.setText(name + "さんは未成年です。");
		} else {
			profile.setText(name + "さんは成人です。");
		}
	}
}
