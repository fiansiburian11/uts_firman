package com.example.aplikasifragment;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {


    Button btn1, btn2;
    TextView txt1, txt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Create a fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();


        // Create a fragment transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        // Add the first fragment
        Fragment1 fragment1 = new Fragment1();
        fragmentTransaction.add(R.id.fragment_container1, fragment1);


        // Add the second fragment
        Fragment2 fragment2 = new Fragment2();
        fragmentTransaction.add(R.id.fragment_container2, fragment2);


        // Commit the transaction
        fragmentTransaction.commit();


    }


}
