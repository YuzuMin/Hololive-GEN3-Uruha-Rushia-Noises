package com.yuzumin.rushianoises;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class ClickerSettings extends AppCompatActivity {

    ImageView back_btn;

    TableRow RushiaIMG0Row;
    TableRow RushiaIMG1Row;
    TableRow RushiaIMG2Row;
    TableRow RushiaIMG3Row;
    TableRow RushiaIMG4Row;
    TableRow RushiaIMG5Row;
    RadioButton RushiaIMG0;
    RadioButton RushiaIMG1;
    RadioButton RushiaIMG2;
    RadioButton RushiaIMG3;
    RadioButton RushiaIMG4;
    RadioButton RushiaIMG5;

    Integer charavalue;

    Switch switch0;
    Switch switch1;
    Switch switch2;


    SharedPreferences SoundSettings;
    SharedPreferences.Editor SoundSettingsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicker_settings);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        RushiaIMG0=findViewById(R.id.rushia0_img);
        RushiaIMG0Row=findViewById(R.id.rushia0_img_row);
        RushiaIMG1=findViewById(R.id.rushia1_img);
        RushiaIMG1Row=findViewById(R.id.rushia1_img_row);
        RushiaIMG2=findViewById(R.id.rushia2_img);
        RushiaIMG2Row=findViewById(R.id.rushia2_img_row);
        RushiaIMG3=findViewById(R.id.rushia3_img);
        RushiaIMG3Row=findViewById(R.id.rushia3_img_row);
        RushiaIMG4=findViewById(R.id.rushia4_img);
        RushiaIMG4Row=findViewById(R.id.rushia4_img_row);
        RushiaIMG5=findViewById(R.id.rushia5_img);
        RushiaIMG5Row=findViewById(R.id.rushia5_img_row);


        RushiaIMG0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(true);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG0Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(true);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(true);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG1Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(true);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(true);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG2Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(true);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(true);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG3Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(true);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=4;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(true);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG4Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=4;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(true);
                RushiaIMG5.setChecked(false);
            }
        });
        RushiaIMG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=5;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(true);
            }
        });
        RushiaIMG5Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=5;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                RushiaIMG0.setChecked(false);
                RushiaIMG1.setChecked(false);
                RushiaIMG2.setChecked(false);
                RushiaIMG3.setChecked(false);
                RushiaIMG4.setChecked(false);
                RushiaIMG5.setChecked(true);
            }
        });



        retrievedata();

        // for switch 0 to activate
        switch0=findViewById(R.id.switch0);
        SoundSettings =getSharedPreferences("save0",MODE_PRIVATE);
        switch0.setChecked(SoundSettings.getBoolean("value0",false));
        switch0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch0.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save0",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value0",true);
                    SoundSettingsEditor.apply();
                    switch0.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save0",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value0",false);
                    SoundSettingsEditor.apply();
                    switch0.setChecked(false);
                }
            }
        });

        // for switch 1 to activate
        switch1=findViewById(R.id.switch1);
        SoundSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1.setChecked(SoundSettings.getBoolean("value1",true));
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch1.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",true);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",false);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(false);
                }
            }
        });

        // for switch 2 to activate
        switch2=findViewById(R.id.switch2);
        SoundSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2.setChecked(SoundSettings.getBoolean("value2",false));
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",true);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",false);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(false);
                }
            }
        });
    }

    private void retrievedata(){
        SoundSettings=getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue=SoundSettings.getInt("CharaValue",0);

        switch (charavalue) {
            case 0:
                RushiaIMG0.setChecked(true);
                break;
            case 1:
                RushiaIMG1.setChecked(true);
                break;
            case 2:
                RushiaIMG2.setChecked(true);
                break;
            case 3:
                RushiaIMG3.setChecked(true);
                break;
            case 4:
                RushiaIMG4.setChecked(true);
                break;
            default:
                RushiaIMG5.setChecked(true);
                break;
        }
    }
}