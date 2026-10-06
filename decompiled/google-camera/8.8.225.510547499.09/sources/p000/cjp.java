package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjp implements kba {

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f5935a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final boolean m3826a() {
        return this.f5935a.get();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f5935a.set(true);
    }
}
