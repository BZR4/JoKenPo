package br.com.trajano.jokenpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void iniciarGame(View view){
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("jogador",editText.getText());
        startActivity(intent);
    }
}
