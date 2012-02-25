package sample.nativedriver;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SimpleListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		adapter.add("java");
		adapter.add("javascript");
		adapter.add("python");
		adapter.add("ruby");
		adapter.add("perl");
		adapter.add("scala");
		final TextView selectedView = (TextView) findViewById(R.id.selected);
		ListView list = (ListView) findViewById(R.id.list);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
				// 選択されたアイテムを表示
				selectedView.setText(adapter.getItemAtPosition(position).toString());
			}
		});
	}

}
