package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class lga implements lgb {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f38198a;

    public lga(Object obj) {
        obj.getClass();
        this.f38198a = new AtomicReference(obj);
    }

    @Override // p000.lgb, p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        close();
        return kzz.f37797a;
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo15247b(Object obj);

    @Override // p000.lgb
    /* JADX INFO: renamed from: c */
    public final Object mo15294c() {
        Object obj = this.f38198a.get();
        if (obj != null) {
            return obj;
        }
        throw new lgd();
    }

    @Override // p000.lgb, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object andSet = this.f38198a.getAndSet(null);
        if (andSet != null) {
            mo15247b(andSet);
        }
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: cm */
    public final Object mo15295cm() {
        throw null;
    }

    public final String toString() {
        return "single-owner[" + String.valueOf(this.f38198a.get()) + "]";
    }
}
