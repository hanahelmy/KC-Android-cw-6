package com.example.people;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Cat> catslist = new ArrayList<>();
    int currentcat = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView catimg = findViewById(R.id.image);
        TextView catname = findViewById(R.id.nametxt);
        TextView catage = findViewById(R.id.agetxt);
        TextView catweight = findViewById(R.id.weighttxt);
        Button nextbtn = findViewById(R.id.next);


        Cat cat1 = new Cat("فتو كعب تندوري", 0.5, 4, R.drawable.fatto);
        Cat cat2 = new Cat("تماضر دعوجي", 0.25, 1, R.drawable.tomador);
        Cat cat3 = new Cat("زكية حسنين افندم", 0.75, 3, R.drawable.zakiya);
        Cat cat4 = new Cat("صفيه سراج زلطه", 1, 4, R.drawable.safiya);
        Cat cat5 = new Cat("درويشة ابهام", 0.5, 2, R.drawable.darwesha);
        Cat cat6 = new Cat("نزيرية نشأت كراملة", 0.75, 2, R.drawable.nazereya);


        catslist.add(cat1);//0
        catslist.add(cat2);//1
        catslist.add(cat3);//2
        catslist.add(cat4);//3
        catslist.add(cat5);//4
        catslist.add(cat6);//5

        catimg.setImageResource(catslist.get(currentcat).getCatimg());
        catname.setText(catslist.get(currentcat).getCatname());
        catage.setText(String.valueOf(catslist.get(currentcat).getCatage()));
        catweight.setText(String.valueOf(catslist.get(currentcat).getCatweight()));


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentcat++;
                if (currentcat == catslist.size())
                {
                  currentcat =0;
                }

                catimg.setImageResource(catslist.get(currentcat).getCatimg());
                catname.setText(catslist.get(currentcat).getCatname());
                catage.setText(String.valueOf(catslist.get(currentcat).getCatage()));
                catweight.setText(String.valueOf(catslist.get(currentcat).getCatweight()));

            }
        });
    }
}