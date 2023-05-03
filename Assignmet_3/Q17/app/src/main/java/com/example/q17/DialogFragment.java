package com.example.q17;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DialogFragment extends androidx.fragment.app.DialogFragment {

    Button bt;
    EditText name,email,pass,age,mob;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        View view = inflater.inflate(R.layout.register_dia, container, false);

        bt = (Button) view.findViewById(R.id.registration_button);
        name = (EditText) view.findViewById(R.id.name);
        email = (EditText) view.findViewById(R.id.email);
        pass = (EditText) view.findViewById(R.id.password);
        age = (EditText) view.findViewById(R.id.age);
        mob = (EditText) view.findViewById(R.id.mobile_no);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty() || email.getText().toString().isEmpty() || pass.getText().toString().isEmpty() || age.getText().toString().isEmpty() || mob.getText().toString().isEmpty())
                    Toast.makeText(getContext(), " Filled all values ", Toast.LENGTH_SHORT).show();
                else
                {
                    Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
                    Matcher matcher = pattern.matcher(email.getText().toString());
                    if (matcher.matches()) {
                        Toast.makeText(getContext(), "Registration is Succesfully Done !! ", Toast.LENGTH_SHORT).show();
                        name.setText("");
                        email.setText("");
                        pass.setText("");
                        age.setText("");
                        mob.setText("");
                    } else{
                        Toast.makeText(getContext(), "Invalid Email", Toast.LENGTH_SHORT).show();
                        email.setText("");
                    }
                }
        }});
        // Do any additional setup for the dialog fragment here
        return view;
    }
}
