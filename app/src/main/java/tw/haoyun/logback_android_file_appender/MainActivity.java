package tw.haoyun.logback_android_file_appender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainActivity extends AppCompatActivity {
    private final static Logger LOG = LoggerFactory.getLogger(MainActivity.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LOG.error("Error Hello World");
        LOG.warn("Warn Hello World");
        LOG.debug("Debug Hello World");
        LOG.info("Info Hello World");
        LOG.trace("Trace Hello World");
    }
}
