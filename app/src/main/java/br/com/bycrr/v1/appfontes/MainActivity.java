package br.com.bycrr.v1.appfontes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView txtDirtyArmy, txtTerminator;
  Button btnArmy;

  // resource assets
  // nome da pasta com as fontes
  String pasta = "fonts/";
  String fontTTFDirtyArmy = "XXII-DIRTY-ARMY.ttf";
  String fontTTFTerminator = "Terminat.TTF";
  String fontTTFArmy = "XXII-STRAIGHT-ARMY.ttf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDirtyArmy = findViewById(R.id.txtDirtArmy);
        Typeface TTFDirtyArmy = Typeface.createFromAsset(getAssets(), pasta + fontTTFDirtyArmy);
        txtDirtyArmy.setTypeface(TTFDirtyArmy);

        txtTerminator = findViewById(R.id.txtTerminator);
        Typeface TTFTerminator = Typeface.createFromAsset(getAssets(), pasta + fontTTFTerminator);
        txtTerminator.setTypeface(TTFTerminator);

        btnArmy = findViewById(R.id.btnArmy);
        Typeface TTFArmy = Typeface.createFromAsset(getAssets(), pasta + fontTTFArmy);
        btnArmy.setTypeface(TTFArmy);
    }
}
