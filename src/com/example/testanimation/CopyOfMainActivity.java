package com.example.testanimation;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class CopyOfMainActivity extends Activity {
	private AnimationDrawable anim2;
	private ImageButton button;
	private boolean b = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		button = (ImageButton) findViewById(R.id.ImageButton_2);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Toast.makeText(getApplicationContext(), "aaaa", 1).show();
				button.setImageResource(R.drawable.drawable_anim);
				anim2 = (AnimationDrawable) button.getDrawable();
				if (b) {
					anim2.stop();
				} else
					anim2.start();
				b = !b;
			}
		});
	}
}
