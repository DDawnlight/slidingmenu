package net.ting.sliding;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	private SlideMenu slideMenu;
    private TextView menu1; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		slideMenu = (SlideMenu) findViewById(R.id.slide_menu);
		ImageView menuImg = (ImageView) findViewById(R.id.title_bar_menu_btn);
		menuImg.setOnClickListener(this);
		
		menu1=(TextView)findViewById(R.id.menu1_tv);
		menu1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.title_bar_menu_btn:
			if (slideMenu.isMainScreenShowing()) {
				slideMenu.openMenu();
			} else {
				slideMenu.closeMenu();
			}
			break;
			
		case R.id.menu1_tv:
			Toast.makeText(getApplicationContext(), "点了第一个",
				     Toast.LENGTH_SHORT).show();
			
			break;
		}
		
	}

}
