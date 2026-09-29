package p000;

import android.os.Handler;
import android.os.Looper;
import androidx.loader.content.ModernAsyncTask$Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: vw */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3700vw implements Runnable {

    /* JADX INFO: renamed from: f */
    public static Handler f65996f;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ leb f66001e;

    /* JADX INFO: renamed from: b */
    public volatile ModernAsyncTask$Status f65998b = ModernAsyncTask$Status.PENDING;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f65999c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f66000d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final am5 f65997a = new am5(this, new z06(this, 0));

    public RunnableC3700vw(leb lebVar) {
        this.f66001e = lebVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m23561a(Object obj) {
        Handler handler;
        synchronized (RunnableC3700vw.class) {
            try {
                if (f65996f == null) {
                    f65996f = new Handler(Looper.getMainLooper());
                }
                handler = f65996f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new gvb(this, obj, false, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f66001e.m16153b();
    }
}
