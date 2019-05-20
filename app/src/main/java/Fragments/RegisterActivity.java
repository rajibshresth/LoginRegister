package Fragments;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.loginregister.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterActivity extends Fragment {

    private EditText username,password;
    private Button btnregister;
//    private Context mcontext;

    public RegisterActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        
        View view=inflater.inflate(R.layout.activity_register,container,false);
        
        username=view.findViewById(R.id.username);
        password=view.findViewById(R.id.password);
        btnregister=view.findViewById(R.id.btnregister);


        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });
        
        
        return view;
    }

  public void Register(){
    SharedPreferences sharedPreferences=this.getActivity().getSharedPreferences("User",Context.MODE_PRIVATE);

      SharedPreferences.Editor editor = sharedPreferences.edit();

      editor.putString("username", username.getText().toString());
      editor.putString("password", password.getText().toString());

      editor.commit();

      Toast.makeText(this.getActivity(), "Registered", Toast.LENGTH_SHORT).show();

    }

}
