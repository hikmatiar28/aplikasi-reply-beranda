package com.hikma.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private String pesan;
    private TextView txtMsgObj;
    private EditText inReplyObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        pesan = intent.getStringExtra("msg");

        txtMsgObj = (TextView) findViewById(R.id.txtReply);
        txtMsgObj.setText(pesan);


    }

    public void reply(View v){
        Intent intent_reply = new Intent ();
        String reply = inReplyObj.getText().toString();
        intent_reply.putExtra("replyMsg", reply);

        setResult(RESULT_OK, intent_reply);
        finish();
    }

}
