package p389t2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* JADX INFO: renamed from: t2.j */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C9191j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f47731a = 0;

    /* JADX INFO: renamed from: t2.j$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m17531a(String str) {
            Trace.beginSection(str);
        }

        /* JADX INFO: renamed from: b */
        public static void m17532b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }
}
