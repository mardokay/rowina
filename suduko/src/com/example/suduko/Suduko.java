package com.example.suduko;
import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
public class Suduko extends Activity implements OnClickListener {
	@Override
public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	
	View continueButton = findViewById(R.id.continue_button);
	continueButton.setOnClickListener(this);
	View newButton = findViewById(R.id.new_button);
	newButton.setOnClickListener(this);
	View aboutButton = findViewById(R.id.about_button);
	aboutButton.setOnClickListener(this);
	View exitButton = findViewById(R.id.exit_button);
	exitButton.setOnClickListener(this);
}
public void onClick(View v){
switch (v.getId()){
case R.id.about_button:
	Intent i=new Intent(this,About.Class);
	startActivity(i);
	break;
}
}
}
