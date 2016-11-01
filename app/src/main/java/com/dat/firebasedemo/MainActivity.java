package com.dat.firebasedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.value)
    protected EditText editTextValue;

    private Firebase fbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        fbRef = new Firebase("https://fir-demo-c940a.firebaseio.com/");
        ButterKnife.bind(this);
    }

    @OnClick(R.id.add)
    protected void add() {
        Firebase fbChild = fbRef.child("Name");
        String value = editTextValue.getText().toString();
        fbChild.setValue(value);

    }
}
