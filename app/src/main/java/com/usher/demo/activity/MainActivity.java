package com.usher.demo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.usher.demo.R;
import com.usher.demo.callback.PopupWindowCallBack;
import com.usher.demo.view.BottomMenuPopupWindow;

public class MainActivity extends AppCompatActivity implements PopupWindowCallBack {

    private Button btnShowPopupwindow;
    private BottomMenuPopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnShowPopupwindow = (Button) findViewById(R.id.btn_show_popupwindow);
        btnShowPopupwindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.showAsDropDown(LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_home, null));
            }
        });
        popupWindow = new BottomMenuPopupWindow(this, this);
    }

    @Override
    public void item1Opera() {
        Toast.makeText(this, "item 1 clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void item2Opera() {
        Toast.makeText(this, "item 2 clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void item3Opera() {
        Toast.makeText(this, "item 3 clicked", Toast.LENGTH_SHORT).show();
    }
}
