package test.linux;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LinuxActivity extends Activity {
	
	//ui item declaration
	private EditText ident;
	private Button go;
	private TextView box;
	
	//global variables need
	String identString;
	String theBox;
	
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //ui item setup
        ident = (EditText)findViewById(R.id.editIdent);
        go = (Button)findViewById(R.id.btnGo);
        box = (TextView)findViewById(R.id.box);
        
        
        //button action
        go.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		identify();
        	}});

        
    }//end on create
    
    //activity for button press - seperate method
    public void identify(){
    	//get input from edit
    	identString = ident.getText().toString().trim();
    	
    	//set box to message
    	box.setText("Hello " + identString + "\nI am Android!");
    	
    	//toast about it
    	Toast.makeText(LinuxActivity.this, "Welcome " + identString, 300).show();
    }
}