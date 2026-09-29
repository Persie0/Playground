package p000;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: vi */
/* JADX INFO: loaded from: classes.dex */
public final class C3686vi extends Handler {

    /* JADX INFO: renamed from: a */
    public static final C3686vi f65409a = new C3686vi();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC3649ui.f63956a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int iM21821b = t2d.m21821b(logRecord);
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String strM23375K0 = (String) AbstractC3649ui.f63957b.get(loggerName);
        if (strM23375K0 == null) {
            strM23375K0 = vk9.m23375K0(23, loggerName);
        }
        if (Log.isLoggable(strM23375K0, iM21821b)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i = 0;
            while (i < length) {
                int iM23388k0 = vk9.m23388k0(message, '\n', i, 4);
                if (iM23388k0 == -1) {
                    iM23388k0 = length;
                }
                while (true) {
                    iMin = Math.min(iM23388k0, i + 4000);
                    Log.println(iM21821b, strM23375K0, message.substring(i, iMin));
                    if (iMin >= iM23388k0) {
                        break;
                    } else {
                        i = iMin;
                    }
                }
                i = iMin + 1;
            }
        }
    }
}
