package p057cp;

import android.util.Log;
import dm.C5207g;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import kotlin.text.C7076b;
import mo.C7662j;

/* JADX INFO: renamed from: cp.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4990d extends Handler {

    /* JADX INFO: renamed from: a */
    public static final C4990d f32570a = new C4990d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i10;
        int iMin;
        C5207g.m11111f(logRecord, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = C4989c.f32568a;
        String loggerName = logRecord.getLoggerName();
        C5207g.m11110e(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i10 = 5;
        } else {
            i10 = logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        C5207g.m11110e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strM15261F3 = C4989c.f32569b.get(loggerName);
        if (strM15261F3 == null) {
            strM15261F3 = C7662j.m15261F3(loggerName, 23);
        }
        if (Log.isLoggable(strM15261F3, i10)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iM14284d3 = C7076b.m14284d3(message, '\n', i11, false, 4);
                if (iM14284d3 == -1) {
                    iM14284d3 = length;
                }
                while (true) {
                    iMin = Math.min(iM14284d3, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strM15261F3, strSubstring);
                    if (iMin >= iM14284d3) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }
}
