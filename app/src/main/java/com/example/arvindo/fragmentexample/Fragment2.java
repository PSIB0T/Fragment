package com.example.arvindo.fragmentexample;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    Button changeFrag2to1;
    TextView ansText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2, container, false);
        ansText = (TextView)view.findViewById(R.id.ansText);
        ansText.setText(((MainActivity)getActivity()).getText());
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event


}
