package bp.androidcodingexercises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //This software gathers notion,concept and exercise contained in
    // the following book :"Professional Android 4 Application Development" written by Reto Meier

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //retrieve view from xml file
        TextView title = (TextView) findViewById(R.id.mainTitle);
        ListView exerciseList = (ListView) findViewById(R.id.mainList);

    }
}
