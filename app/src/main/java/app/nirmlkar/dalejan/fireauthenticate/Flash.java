package app.nirmlkar.dalejan.fireauthenticate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Flash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        Timer time=new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),Signup.class));
                finish();
            }
        };
        time.schedule(task,2500);
    }
}
