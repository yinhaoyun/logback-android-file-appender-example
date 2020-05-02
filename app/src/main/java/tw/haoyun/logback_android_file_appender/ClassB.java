package tw.haoyun.logback_android_file_appender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ClassB {
    private final static Logger LOG = LoggerFactory.getLogger(ClassB.class.getSimpleName());

    public static void foo() {
        LOG.trace("foo");
    }
}
