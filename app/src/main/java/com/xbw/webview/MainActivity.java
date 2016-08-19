package com.xbw.webview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btn;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent=new Intent();
                mIntent.setClass(MainActivity.this,WebActivity.class);
                mIntent.putExtra("url","http://www.baidu.com");
                startActivity(mIntent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent=new Intent();
                mIntent.setClass(MainActivity.this,WebActivity.class);
                mIntent.putExtra("url","http://blog.csdn.net/xbw12138");
                startActivity(mIntent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent=new Intent();
                mIntent.setClass(MainActivity.this,WebActivity.class);
                mIntent.putExtra("url","https://github.com/xbw12138");
                startActivity(mIntent);
            }
        });
    }
}
