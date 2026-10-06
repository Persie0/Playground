package p000;

import android.content.Context;
import android.util.LogPrinter;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izo {

    /* JADX INFO: renamed from: a */
    public static volatile izo f32717a;

    /* JADX INFO: renamed from: b */
    public final Context f32718b;

    /* JADX INFO: renamed from: c */
    public Thread.UncaughtExceptionHandler f32719c;

    /* JADX INFO: renamed from: d */
    public volatile izi f32720d;

    /* JADX INFO: renamed from: e */
    private final izl f32721e;

    public izo(Context context) {
        Context applicationContext = context.getApplicationContext();
        jib.m13205j(applicationContext);
        this.f32718b = applicationContext;
        this.f32721e = new izl(this);
        new CopyOnWriteArrayList();
        int i = izh.f32708a;
        new LogPrinter(4, "GA/LogCatTransport");
    }

    /* JADX INFO: renamed from: a */
    public static void m11916a() {
        if (!(Thread.currentThread() instanceof izn)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11917b(Runnable runnable) {
        jib.m13205j(runnable);
        this.f32721e.submit(runnable);
    }
}
