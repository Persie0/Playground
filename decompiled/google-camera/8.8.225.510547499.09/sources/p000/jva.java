package p000;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jva implements kba {

    /* JADX INFO: renamed from: a */
    private final HandlerThread f34872a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f34873b = new AtomicBoolean(false);

    public jva(HandlerThread handlerThread) {
        this.f34872a = handlerThread;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        Looper looper;
        if (this.f34873b.getAndSet(true) || (looper = this.f34872a.getLooper()) == null) {
            return;
        }
        jvh.m13557e(looper).postDelayed(new juz(this.f34872a, 0), 5000L);
    }
}
