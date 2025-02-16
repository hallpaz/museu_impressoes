package hackathon.com.museuimpressoes;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoContextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        String uriPath = "android.resource://"+ getPackageName() + "/" + R.raw.production_context;
        Uri uri = Uri.parse(uriPath);


        VideoView myVideoView = (VideoView)findViewById(R.id.myvideoview);
        myVideoView.setVideoURI(uri);
        myVideoView.start();
    }
}
