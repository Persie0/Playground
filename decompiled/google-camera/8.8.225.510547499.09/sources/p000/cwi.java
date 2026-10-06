package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwi implements kba {

    /* JADX INFO: renamed from: a */
    public final jyx f9877a;

    /* JADX INFO: renamed from: c */
    private final AtomicLong f9879c = new AtomicLong(0);

    /* JADX INFO: renamed from: b */
    public cwh f9878b = cwh.FPS_30;

    public cwi(jyx jyxVar) {
        this.f9877a = jyxVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f9879c.set(0L);
        this.f9878b = cwh.FPS_30;
    }
}
