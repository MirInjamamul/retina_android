package com.shashank.platform.loginui;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    ImageView imageView;
    TextView textNotifyMusician;
    int count = 0;
    CheckBox checkRealityShow,checkMusician,checkSinger;
    EditText editRealityShowName,editRealityShowPosition;
    Spinner spinnerProfession,spinnerMusicianProfession;
    String strProfession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*
            final Spinner cardStatusSpinner1 = (Spinner) findViewById(R.id.text_interested);
    String cardStatusString;
    cardStatusSpinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent,
                View view, int pos, long id) {
            cardStatusString = parent.getItemAtPosition(pos).toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

        }
    });
        */

        setContentView(R.layout.activity_main);
        changeStatusBarColor();

        checkRealityShow = (CheckBox) findViewById(R.id.checkboxRealityShow);
        checkMusician = (CheckBox)findViewById(R.id.checkboxMusician);

        editRealityShowName = (EditText)findViewById(R.id.editRealityShowName);
        editRealityShowPosition = (EditText)findViewById(R.id.editRealityShowPosition);

        spinnerMusicianProfession = (Spinner)findViewById(R.id.spinnerMusicianProfession);

        textNotifyMusician = (TextView) findViewById(R.id.TextNotifyMusician);

        checkRealityShow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    editRealityShowName.setVisibility(View.VISIBLE);
                    editRealityShowPosition.setVisibility(View.VISIBLE);
                }
                else{
                    editRealityShowName.setVisibility(View.GONE);
                    editRealityShowPosition.setVisibility(View.GONE);
                }
            }
        });

        checkMusician.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textNotifyMusician.setVisibility(View.VISIBLE);
                    spinnerMusicianProfession.setVisibility(View.VISIBLE);
                }else {
                    textNotifyMusician.setVisibility(View.GONE);
                    spinnerMusicianProfession.setVisibility(View.GONE);
                }
            }
        });

    }

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));
        }
    }
}