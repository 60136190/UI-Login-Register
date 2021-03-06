package com.example.uiloginregister.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.uiloginregister.R;
import com.example.uiloginregister.info.AboutUs;
import com.example.uiloginregister.info.Account;
import com.example.uiloginregister.info.FAQ;
import com.example.uiloginregister.info.Recruiment;
import com.example.uiloginregister.info.TermsAndCondition;


public class InfoFragment extends Fragment {

    private LinearLayout myaccount;
    private LinearLayout recruiment;
    private LinearLayout faq;
    private LinearLayout termsandcondition;
    private LinearLayout aboutus;
    private LinearLayout share;
    private LinearLayout rate;

    public InfoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        // khai bao id
        myaccount = view.findViewById(R.id.my_account);
        recruiment = view.findViewById(R.id.recruiment);
        faq = view.findViewById(R.id.faq);
        termsandcondition = view.findViewById(R.id.terms_and_condition);
        aboutus = view.findViewById(R.id.about_us);
        share = view.findViewById(R.id.share);
        rate = view.findViewById(R.id.rate);

        // open activity Account
        myaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Account.class);
                startActivity(intent);
            }
        });

        // open activity recruiment
        recruiment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Recruiment.class);
                startActivity(intent);
            }
        });

        // open activity faq
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FAQ.class);
                startActivity(intent);
            }
        });

        // open activity termsandcondition
        termsandcondition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TermsAndCondition.class);
                startActivity(intent);
            }
        });

        // open activity aboutus
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AboutUs.class);
                startActivity(intent);
            }
        });

        // share app
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download this App";
                String Sub = "http://play.google.com";
                intent.putExtra(Intent.EXTRA_TEXT,Body);
                intent.putExtra(Intent.EXTRA_TEXT,Sub);
                startActivity(Intent.createChooser(intent,"Share using"));
            }
        });

        // open app tr??n CH Play ????? ng?????i d??ng c?? th??? ????nh gi?? app
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String appPackageName = "com.facebook.katana&hl=vi&gl=US"; // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }
        });
        return view;
    }

}