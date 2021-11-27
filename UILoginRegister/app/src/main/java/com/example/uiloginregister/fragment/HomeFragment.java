package com.example.uiloginregister.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.uiloginregister.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class HomeFragment extends Fragment {
     ViewFlipper viewFlipper;
    private RoundedImageView roundedImageView;
    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        roundedImageView = view.findViewById(R.id.pizza);
//        roundedImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext() MainActivity2.class);
//                startActivity(intent);
//            }
//        });
        int images[] = {R.drawable.promotiona, R.drawable.promotionb, R.drawable.promotionc,
                R.drawable.promotiond, R.drawable.promotione, R.drawable.promotionf,R.drawable
        .promotiong};

        viewFlipper = view.findViewById(R.id.viewflipper_hot_this_month);
//
//        for (int i=0 ; i<images.length; i++){
//            flipperImages(images[i]);
//        }

        for (int image: images){
            flipperImages(image);
        }
        return view;
    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3500);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(getContext(), android.R.anim.slide_in_left);

    }
}