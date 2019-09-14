package jose.cruz.tarea_suma_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaración de variables
    EditText sumando1, sumando2;
    Button b_sumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // equiparación de varables
        sumando1 = findViewById(R.id.et_sumando1);
        sumando2 = findViewById(R.id.ed_sumando2);
        b_sumar = findViewById(R.id.b_sumar);

        // acción del botón
        b_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // lectura de datos
                String n1 = sumando1.getText().toString();
                String n2 = sumando2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()){
                    mensajito("Debes ingresar un valor en cada campo.");
                } else {
                    float s1 = Float.parseFloat(n1);
                    float s2 = Float.parseFloat(n2);
                    float suma = s1 + s2;
                    ((TextView)findViewById(R.id.tv_suma)).setText(Float.toString(suma));
                } // else

            } // onClick

        }); // b_sumar.setOnClickListener


    } // protected void onCreate


    public void mensajito(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    } // public void  mesajito


} // public class MainActivity
