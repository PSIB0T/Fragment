package com.example.arvindo.fragmentexample;

/**
 * Created by arvindo on 8/8/17.
 */

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Fragment1 extends Fragment {

    Button changeFrag1to2;
    EditText inputValue;
    String inputString;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);

        changeFrag1to2 = (Button)view.findViewById(R.id.submit);
        inputValue = (EditText)view.findViewById(R.id.editText);

        changeFrag1to2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                inputString = inputValue.getText().toString();

                ((MainActivity)getActivity()).setText(inputString);
                Fragment2 fragment2 = new Fragment2();
                FragmentManager manager = getActivity().getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                transaction.replace(R.id.mainContainer, fragment2).addToBackStack(null);
                transaction.commit();

            }
        });

        return view;
    }


}

