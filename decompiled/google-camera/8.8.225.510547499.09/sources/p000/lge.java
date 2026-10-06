package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lge implements lgb {

    /* JADX INFO: renamed from: a */
    public final Object f38202a;

    public lge(Object obj) {
        this.f38202a = obj;
    }

    @Override // p000.lgb, p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        return kzz.f37797a;
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: c */
    public final Object mo15294c() {
        return this.f38202a;
    }

    @Override // p000.lgb, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: cm */
    public final Object mo15295cm() {
        throw null;
    }

    public final String toString() {
        return "non-owning[" + String.valueOf(this.f38202a) + "]";
    }
}
