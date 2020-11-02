package com.example.boekenkast;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link main#newInstance} factory method to
 * create an instance of this fragment.
 */
public class main extends Fragment {

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

    public main() {
        // Required empty public constructor
    }


    public static main newInstance() {
        main fragment = new main();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);
        mAddFab = root.findViewById(R.id.fab);
        RecyclerView recyclerView = root.findViewById(R.id.book_gallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity().getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<CreateList> createLists = prepareData();
        MyAdapter adapter = new MyAdapter(getActivity().getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);

        return root;
    }

    private ArrayList<CreateList> prepareData(){

        ArrayList<CreateList> TheImage = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < image_titles.length; i++) {
                CreateList createList = new CreateList();
                createList.setImage_title(image_titles[i]);
                createList.setImage_ID(image_ids[i]);
                TheImage.add(createList);
            }
        }
        return TheImage;
    }
}