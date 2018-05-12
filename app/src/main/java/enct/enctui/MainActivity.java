package enct.enctui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    private Button SendText;


    private RecyclerView mMessageRecycler;
    private MessageListAdapter mMessageAdapter;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);

        mMessageRecycler = (RecyclerView) findViewById(R.id.reyclerview_message_list);
        mMessageAdapter = new MessageListAdapter(this, messageList);
        mMessageRecycler.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendText = (Button) findViewById(R.id.SendText);
        SendText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSendTextScreenActivity();
            }
        });
    }

    public void openSendTextScreenActivity(){
        Intent intent = new Intent(this, SendTextScreenActivity.class);
        startActivity(intent);
    }
}
