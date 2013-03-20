package fi.oulu.tol.simplecalculator;

import java.math.BigInteger;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class SimpleCalculatorActivity extends Activity {
	
	BigInteger result = new BigInteger("0");
	EditText resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        
        resultView = (EditText) findViewById(R.id.result);
        resultView.setText(result.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_simple_calculator, menu);
       
        return true;
    }
    
    public void buttonPressed(View v){
    	logState();
    	if(v.getId() == R.id.button1){
    		resultView.setText("1");
    		
    	}else if(v.getId() == R.id.button2){
    		resultView.setText("2");
    		
    	}else if(v.getId() == R.id.button3){
    		resultView.setText("3");
    		
    	}else if(v.getId() == R.id.button4){
    		resultView.setText("4");
    		
    	}else if(v.getId() == R.id.button5){
    		resultView.setText("5");
    		
    	}else if(v.getId() == R.id.button6){
    		resultView.setText("6");
    		
    	}else if(v.getId() == R.id.button7){
    		resultView.setText("7");
    		
    	}else if(v.getId() == R.id.button8){
    		resultView.setText("8");
    		
    	}else if(v.getId() == R.id.button9){
    		resultView.setText("9");
    		
    	}else if(v.getId() == R.id.button10){
    		resultView.setText("0");
    		clearResult();
    		
    	}else if(v.getId() == R.id.buttonPlus){
    		result = result.add(new BigInteger(resultView.getText().toString()));
    		resultView.setText(result.toString());
    	}
    	logState();
    }
    
    public void clearResult(){
    	result = new BigInteger("0");
    }
    
    public void logState(){
    	Log.d("ESDE", result.toString()+ " " + resultView.getText().toString());
    }
}
