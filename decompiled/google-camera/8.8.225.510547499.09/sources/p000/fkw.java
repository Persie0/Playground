package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fkw implements kba {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f22427a;

    public fkw(fkx fkxVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f22427a = atomicReference;
        atomicReference.set(fkxVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m8529a() {
        this.f22427a.set(null);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        fkx fkxVar = (fkx) this.f22427a.getAndSet(null);
        if (fkxVar != null) {
            fkxVar.m8531b();
        }
    }
}
