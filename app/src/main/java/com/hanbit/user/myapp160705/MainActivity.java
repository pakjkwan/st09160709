package com.hanbit.user.myapp160705;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btCalc, btCalendar,btImageView,btKaup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCalc = (Button) findViewById(R.id.btCalc);
        btCalendar = (Button) findViewById(R.id.btCalendar);
        btImageView = (Button) findViewById(R.id.btImageView);
        btKaup = (Button) findViewById(R.id.btKaup);
        btCalc.setOnClickListener(this);
        btCalendar.setOnClickListener(this);
        btImageView.setOnClickListener(this);
        btKaup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btCalc :
                this.startActivity(new Intent(this,CalcActivity.class));
                break;
            case R.id.btCalendar :
                this.startActivity(new Intent(this,CalendarActivity.class));
                break;
            case R.id.btImageView :
                this.startActivity(new Intent(this,ImageActivity.class));
                break;
            case R.id.btKaup :
                this.startActivity(new Intent(this,KaupActivity.class));
                break;
            default : break;
        }
    }
}
