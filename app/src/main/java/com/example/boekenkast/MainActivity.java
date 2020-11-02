package com.example.boekenkast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String image_titles[] = {
            "Ready Player One",
            "Little Fires Everywhere",
            "The Woman In The Window",
            "The President Is Missing",
            "Harry Potter And The Sorcerer's Stone",
            "The Great Alone",
            "The Outsider",
            "Before We Were Yours",


    };

    private final Integer image_ids[] = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,


    };

    FloatingActionButton mAddFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddFab = findViewById(R.id.fab);

        mAddFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Add book", Toast.LENGTH_SHORT).show();
                    }
                });

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.book_gallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<CreateList> createLists = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<CreateList> prepareData(){

        ArrayList<CreateList> TheImage = new ArrayList<>();
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            TheImage.add(createList);
        }
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            TheImage.add(createList);
        }
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            TheImage.add(createList);
        }
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            TheImage.add(createList);
        }
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            TheImage.add(createList);
        }
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            TheImage.add(createList);
        }
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            TheImage.add(createList);
        }
        return TheImage;
    }
}