package p000;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class abb {

    /* JADX INFO: renamed from: a */
    public final Handler f477a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f478b = new ConcurrentHashMap();

    public abb() {
        new AtomicLong(0L);
    }

    @JavascriptInterface
    public final void sendBooleanValue(long j, boolean z) {
        this.f477a.post(new RunnableC3019fz(this, j, z));
    }
}
