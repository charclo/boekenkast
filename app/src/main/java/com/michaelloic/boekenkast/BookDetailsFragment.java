package com.michaelloic.boekenkast;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class BookDetailsFragment extends Fragment {

    private ImageView mBookImage;

    public BookDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_book_details, container, false);
         mBookImage = root.findViewById(R.id.img_book);
         mBookImage.setImageResource(R.drawable.img1);
        return root;
    }
}