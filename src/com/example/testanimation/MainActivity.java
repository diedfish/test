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

public class MainActivity extends Activity {
	private AnimationDrawable anim;
	private AnimationDrawable anim2;
	private ImageView imageView;
	private ImageButton button;
	private boolean b = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}

		// imageView = (ImageView) findViewById(R.id.imageView1);
		// imageView.setBackgroundResource(R.drawable.drawable_anim);
		// anim = (AnimationDrawable) imageView.getBackground();

		button = (ImageButton) findViewById(R.id.ImageButton);
		// button.setBackgroundResource(R.drawable.drawable_anim);
		button.setImageResource(R.drawable.drawable_anim);
		// anim2 = (AnimationDrawable) button.getBackground();
		anim2 = (AnimationDrawable) button.getDrawable();
		// anim2 = (AnimationDrawable) button.getCompoundDrawables()[0];

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				Toast.makeText(getApplicationContext(), "aaaa", 1).show();
				if (b) {
					anim2.stop();
				} else
					anim2.start();
				b = !b;
			}
		});

	}

	/*
	 * public boolean onTouchEvent(MotionEvent event) { if (event.getAction() ==
	 * MotionEvent.ACTION_DOWN) { anim.stop(); anim.start(); return true; }
	 * return super.onTouchEvent(event); }
	 */

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			return rootView;
		}
	}

}
