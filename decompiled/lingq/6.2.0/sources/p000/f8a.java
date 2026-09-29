package p000;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f8a {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f38634a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m11599a() {
        if (f38634a.get()) {
            Trace.beginAsyncSection("GlanceAppWidget::update", 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11600b() {
        if (f38634a.get()) {
            Trace.endAsyncSection("GlanceAppWidget::update", 0);
        }
    }
}
