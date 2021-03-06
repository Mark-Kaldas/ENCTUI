package enct.enctui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


/**
 * Created by MarkK on 5/4/2018.
 */

public class SentMessageHolder extends RecyclerView.ViewHolder {
    TextView messageText, timeText, nameText;


    SentMessageHolder (View itemView) {
        super(itemView);
        messageText = (TextView) itemView.findViewById(R.id.text_message_body);
        timeText = (TextView) itemView.findViewById(R.id.text_message_time);

    }

    void bind(UserMessage message) {
        messageText.setText(message.getMessage());

        // Format the stored timestamp into a readable String using method.
        timeText.setText(Utils.formatDateTime(message.getCreatedAt()));

    }
}
