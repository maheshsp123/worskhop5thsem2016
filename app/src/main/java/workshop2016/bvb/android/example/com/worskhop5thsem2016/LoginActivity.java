package workshop2016.bvb.android.example.com.worskhop5thsem2016;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText userNameET_ref;
    EditText passwordET_ref;
    Button loginSubmitButton_ref;
    String userNameDummy="aaa";
    String passwoerDummy="aaa123";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String myPreferenceName="myPreferences";
    String userNameKey="userName";
    String passwordKey="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userNameET_ref=
                (EditText) findViewById(R.id.userNameEditTextId);
        passwordET_ref=
                (EditText)findViewById(R.id.passwordEditTextId);
        loginSubmitButton_ref=
                (Button)findViewById(R.id.loginSubmitButtonId);
        loginSubmitButton_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u=
                        userNameET_ref.getText().toString();
                String p=
                        passwordET_ref.getText().toString();
                if(u.equals(userNameDummy) && p.equals(passwoerDummy))
                {
                    Toast.makeText
                            (LoginActivity.this, "successfull login",
                                    Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText
                            (LoginActivity.this, "login failed",
                                    Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
