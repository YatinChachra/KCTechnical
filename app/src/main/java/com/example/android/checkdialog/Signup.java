package com.example.android.checkdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity/* implements View.OnClickListener*/{

    //dated 29th nov 2017

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        /**
         *to set link for Terms and Conditions
         */
        TextView textView =(TextView)findViewById(R.id.tandclink);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://kriger.in/blog/term-conditions/'> Terms & Condtions </a>";
        textView.setText(Html.fromHtml(text));




        Button button= (Button) findViewById(R.id.signupButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CheckBox cb=(CheckBox)findViewById(R.id.notify_me_checkbox);

               // img=(ImageView)findViewById(R.id.checkboxTANDC);
               //img.setOnClickListener(new View.OnClickListener(){
               // public void onClick(View view) {
                 //   Log.i("Signup.java","In onclick");
                  //  checkFlag=true;
                   // img.setImageResource(R.drawable.checkedbox);
                //}});
              // img.setOnClickListener(this);



                EditText e1=(EditText)findViewById(R.id.emailid);
                EditText e2=(EditText)findViewById(R.id.password);
                EditText e3=(EditText)findViewById(R.id.cpassword);
                EditText e4=(EditText)findViewById(R.id.firstname);
               // EditText e5=(EditText)findViewById(R.id.lastname);


                String user_email=e1.getText().toString();
                String user_password=e2.getText().toString();
                String user_confirm_password=e3.getText().toString();
                String user_first_name=e4.getText().toString();
             //   String user_last_name=e5.getText().toString();

                String is_email_valid = user_email.trim();

                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

// onClick of button perform this simplest code.
                //email validation test



                /* if (is_email_valid.matches(emailPattern))
                {
                    //do nothing when valid email
                    // Toast.makeText(getApplicationContext(),"Valid email address",Toast.LENGTH_SHORT).show();
                }*/




                  if(!is_email_valid.matches(emailPattern))
                {//when invalid email
                    Toast.makeText(getApplicationContext(),"Invalid Email Id!", Toast.LENGTH_SHORT).show();
                }
                //check user,password,confirm password empty
                else if(user_email.length()==0||user_password.length()==0||user_confirm_password.length()==0||user_first_name.length()==0/*||user_last_name.length()==0*/)
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter all the details!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }

                //check password, confirm password dont match
                else if(!user_password.equals(user_confirm_password))
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Passwords don't match!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }

                //check checkbox not checked
                else if(cb.isChecked()/*checkFlag*/==false)
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Please accept our Terms and Conditions";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
                else
                {
                    //signup is successful

                }


            }
        });


    }
   /* public void checkBoxClicked(View v)
    {
        Log.i("Signup.java","In onclick");
        checkFlag=true;
        img.setImageResource(R.drawable.checkedbox);

    }*/

}
