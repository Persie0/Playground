package p000;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbf extends amj {

    /* JADX INFO: renamed from: i */
    private final Semaphore f33658i;

    /* JADX INFO: renamed from: j */
    private final Set f33659j;

    public jbf(Context context, Set set) {
        super(context);
        this.f33658i = new Semaphore(0);
        this.f33659j = set;
    }

    @Override // p000.amj
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo948a() {
        Iterator it = this.f33659j.iterator();
        if (it.hasNext()) {
            throw new UnsupportedOperationException();
        }
        try {
            this.f33658i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p000.amk
    /* JADX INFO: renamed from: h */
    public final void mo956h() {
        this.f33658i.drainPermits();
        mo950c();
    }
}
