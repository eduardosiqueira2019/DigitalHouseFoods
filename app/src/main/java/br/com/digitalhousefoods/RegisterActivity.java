package br.com.digitalhousefoods;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.digitalhousefoods.ui.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final Button registerButton = findViewById(R.id.register);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nome = findViewById(R.id.name);
                EditText email = findViewById(R.id.username);
                EditText pass = findViewById(R.id.password);
                EditText newpass = findViewById(R.id.repeatpassword);

                if(nome.getText().toString().equals("")){
                    Toast.makeText(RegisterActivity.this, "Informe o nome.", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(email.getText().toString().equals("")){
                    Toast.makeText(RegisterActivity.this, "Informe o email.", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(pass.getText().toString().equals("")){
                    Toast.makeText(RegisterActivity.this, "Informe o password.", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(newpass.getText().toString().equals("")){
                    Toast.makeText(RegisterActivity.this, "Repita o password.", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!(pass.getText().toString().equals(newpass.getText().toString()))) {
                    Toast.makeText(RegisterActivity.this, "Os passwords não podem ser diferentes.", Toast.LENGTH_SHORT).show();
                    return;
                }


                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}
