package PrimeiroAPPAndroid.pack;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{
    
    private EditText v1,v2;//objeto 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        v1= (EditText) findViewById(R.id.textv1);//objeto 
        v2= (EditText) findViewById(R.id.textv2);//objeto
    }
    
    public void subtrair(View V)

    {
      double valor1=Double.parseDouble(v1.getText().toString());//convertendo de string para double
      double valor2=Double.parseDouble(v2.getText().toString());//convertendo de string para double
      double resultado=valor1-valor2;
      Toast.makeText(this,"O resultado é "+resultado,Toast.LENGTH_LONG).show();
      
    }
    
      public void adicao(View V)

    {
      double valor1=Double.parseDouble(v1.getText().toString());//convertendo de string para double
      double valor2=Double.parseDouble(v2.getText().toString());//convertendo de string para double
      double resultado=valor1+valor2;
      Toast.makeText(this,"O resultado é "+resultado,Toast.LENGTH_LONG).show();
      
    }
      
       public void multiplicacao(View V)

    {
      double valor1=Double.parseDouble(v1.getText().toString());//convertendo de string para double
      double valor2=Double.parseDouble(v2.getText().toString());//convertendo de string para double
      double resultado=valor1*valor2;
      Toast.makeText(this,"O resultado é "+resultado,Toast.LENGTH_LONG).show();
      
    }
        public void dividir(View V)

    {
      double valor1=Double.parseDouble(v1.getText().toString());//convertendo de string para double
      double valor2=Double.parseDouble(v2.getText().toString());//convertendo de string para double
      double resultado=valor1/valor2;
      Toast.makeText(this,"O resultado é "+resultado,Toast.LENGTH_LONG).show();
      
    }
       
    
    
}
