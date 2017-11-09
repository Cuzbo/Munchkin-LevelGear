package com.example.bojan.munchkinlevelcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private int level = 0;
    private int gear = 0;
    private int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button levelPlus = (Button) findViewById(R.id.levelPlus);
        levelPlus.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                TextView levelText = (TextView) findViewById(R.id.levelNumber);
//                String numberInString = levelNumber.getText().toString();
//                int number = (int)Integer.parseInt(numberInString);
//                number++;
//                levelNumber.setText(""+number);
                TextView strenght = (TextView) findViewById(R.id.strenght);
//                String strenghtString = strenght.getText().toString();
//                int overallStrenght = (int) Integer.parseInt(strenghtString) + number;
//                strenght.setText(""+ overallStrenght);
                if(level<10) {
                    level++;
                    levelText.setText("" + level);
                    total = level + gear;
                    strenght.setText("" + total);
                    if(level == 10){
                        strenght.setText("WINNER!");
                    }
                }
            }
        });
        Button levelMinus = (Button) findViewById(R.id.levelMinus);
        levelMinus.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                TextView levelNumber = (TextView) findViewById(R.id.levelNumber);
//                String numberInString = levelNumber.getText().toString();
//                int number = (int)Integer.parseInt(numberInString);
//                number--;
//                levelNumber.setText(""+number);
                TextView strenght = (TextView) findViewById(R.id.strenght);
//                String strenghtString = strenght.getText().toString();
//                int overallStrenght = (int) Integer.parseInt(strenghtString) + number;
//                strenght.setText(""+ overallStrenght);
                if(level>0) {
                    level--;
                    levelNumber.setText("" + level);
                    total = level + gear;
                    strenght.setText("" + total);
                }
            }
        });
        Button gearPlus = (Button) findViewById(R.id.gearPlus);
        gearPlus.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                TextView gearNumber = (TextView) findViewById(R.id.gearNumber);
//                String numberInString = gearNumber.getText().toString();
//                int number = (int)Integer.parseInt(numberInString);
//                number++;
//                gearNumber.setText(""+number);
                TextView strenght = (TextView) findViewById(R.id.strenght);
//                String strenghtString = strenght.getText().toString();
//                int overallStrenght = (int) Integer.parseInt(strenghtString) + number;
//                strenght.setText(""+ overallStrenght);
                gear++;
                gearNumber.setText("" + gear);
                total = level + gear;
                strenght.setText("" + total);
            }
        });
        Button gearMinus = (Button) findViewById(R.id.gearMinus);
        gearMinus.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                TextView gearNumber = (TextView) findViewById(R.id.gearNumber);
//                String numberInString = gearNumber.getText().toString();
//                int number = (int)Integer.parseInt(numberInString);
//                number--;
//                gearNumber.setText(""+number);
                TextView strenght = (TextView) findViewById(R.id.strenght);
//                String strenghtString = strenght.getText().toString();
//                int overallStrenght = (int) Integer.parseInt(strenghtString) + number;
//                strenght.setText(""+ overallStrenght);
                if(gear>0) {
                    gear--;
                    gearNumber.setText("" + gear);
                    total = level + gear;
                    strenght.setText("" + total);
                }
            }
        });



    }
}
