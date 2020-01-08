package com.shishir.twitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView twLogin;
    Button createUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding
        twLogin = findViewById( R.id.twLogin );
        createUser = findViewById( R.id.createUser );

        twLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login= new Intent( MainActivity.this,LoginActivity.class );
                startActivity( login );
            }
        } );
        createUser.setOnClickListener( new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent signUP= new Intent( MainActivity.this,SignUpActivity.class );
                                               startActivity( signUP );
                                           }
                                       }
        );
    }
}
