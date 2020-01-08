package com.shishir.twitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    EditText sn_email, sn_username;
    ImageView sn_Us, sn_Em, back;
    Button btn_next;
    int countUsername = 0;
    int initialbtn = 0;
    String method = "email";
    String Email = "";
    String Username = "";
    boolean chekU=false;
    boolean chekE=false;
    TextView tvChange, sn_em_error, sn_us_error;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //binding
        sn_email = findViewById( R.id.SN_email );
        sn_username = findViewById( R.id.SN_usernmae );
        back=findViewById( R.id.SN_back );
        sn_em_error = findViewById( R.id.SN_pass_error );
        sn_us_error = findViewById( R.id.SN_username_error );
        sn_Us = findViewById( R.id.SN_userP );
        sn_Em = findViewById( R.id.SN_emailP );
        btn_next = findViewById( R.id.btn_FS_signup );
        tvChange = findViewById( R.id.textView9 );
    }
}
