package com.example.q18;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

//18.	Create application to demonstrate alarm

public class MainActivity extends AppCompatActivity {

    Button set_alarm, cancel_alarm;
    TimePicker tp;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp = (TimePicker) findViewById(R.id.clock);
        set_alarm = (Button) findViewById(R.id.setalarm);
        cancel_alarm = (Button) findViewById(R.id.cancelalarm);
        tv = (TextView) findViewById(R.id.text);

        set_alarm.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                cal.set(cal.get(Calendar.YEAR),
                        cal.get(Calendar.MONTH),
                        cal.get(Calendar.DAY_OF_MONTH),
                        tp.getHour(),
                        tp.getMinute(),0);

                /*AlarmManager:
                    - MyAlarmReceiver is a BroadcastReceiver
                    - schedule tasks that should be executed even if the application is not running
                    - uses the system clock to schedule tasks
                    - Two types of alarms:
                         1) one-time alarms = scheduled to trigger once at a specific time in the future
                         2) repeating alarms = scheduled to trigger at regular intervals, such as every hour, every day, or every week
                    - PendingIntent to specify the action to be taken when the alarm is triggered
                 */
                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                Intent intent = new Intent(getApplicationContext(),Alarm.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),0,intent,0);
                /*
                  AlarmManager.RTC_WAKEUP:it is set to RTC_WAKEUP, which means that the alarm will trigger at the specified time even if the device is asleep.
                  cal.getTimeInMillis():in this case, it is set to the time represented by the cal object, which is a Calendar object that specifies the time and date of the alarm.
                  AlarmManager.INTERVAL_DAY:In this case, it is set to INTERVAL_DAY, which means that the alarm will repeat every day at the same time.
                  In this case, it is a PendingIntent object that represents an action to be performed, such as launching a service or starting an activity.
                */
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
                Toast.makeText(MainActivity.this, "Alarm is set", Toast.LENGTH_SHORT).show();
                if(tp.getHour() >= 0 && tp.getHour() < 12)
                    tv.setText("Alarm is set :  \n"+tp.getHour() +":"+tp.getMinute()+" AM");
                else
                    tv.setText("Alarm is set :  \n"+Integer.toString(tp.getHour()-12) +":"+tp.getMinute()+" PM");
            }
        });

        cancel_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                Intent intent = new Intent(getApplicationContext(),Alarm.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),0,intent,0);
                alarmManager.cancel(pendingIntent);
                Toast.makeText(MainActivity.this, "Your Alarm is Cancel", Toast.LENGTH_SHORT).show();
                tv.setText("No Alarm is set");
            }
        });

    }
}