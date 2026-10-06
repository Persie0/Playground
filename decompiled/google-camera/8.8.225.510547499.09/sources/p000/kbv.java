package p000;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kbv implements kce {

    /* JADX INFO: renamed from: b */
    private final String f35544b;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f35545c = new AtomicInteger(0);

    public kbv(String str) {
        this.f35544b = str;
    }

    @Override // p000.kce
    /* JADX INFO: renamed from: a */
    public final void mo13953a() {
        Trace.setCounter(this.f35544b, this.f35545c.decrementAndGet());
    }

    @Override // p000.kce
    /* JADX INFO: renamed from: b */
    public final void mo13954b() {
        Trace.setCounter(this.f35544b, this.f35545c.incrementAndGet());
    }

    @Override // p000.kce
    /* JADX INFO: renamed from: c */
    public final void mo13955c(int i) {
        this.f35545c.set(i);
        Trace.setCounter(this.f35544b, this.f35545c.get());
    }
}
