package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfz implements lgb {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f38169a;

    /* JADX INFO: renamed from: b */
    private final lav f38170b;

    /* JADX INFO: renamed from: c */
    private final laa f38171c;

    public lfz(Object obj) {
        lav lavVarM15121j = lav.m15121j();
        this.f38170b = lavVarM15121j;
        this.f38171c = laa.m15114j(lavVarM15121j);
        obj.getClass();
        this.f38169a = new AtomicReference(obj);
    }

    @Override // p000.lgb, p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        Object objM15296d = m15296d();
        if (objM15296d != null) {
            lav lavVar = this.f38170b;
            ((kyx) objM15296d).mo15079a().mo15104c(not.INSTANCE, new lag(lavVar), new laf(lavVar)).mo15109h(kzj.f37771a);
        }
        return this.f38171c;
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: c */
    public final Object mo15294c() {
        Object obj = this.f38169a.get();
        if (obj != null) {
            return obj;
        }
        throw new lgd();
    }

    @Override // p000.lgb, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lqi.m15868m(mo15079a());
    }

    @Override // p000.lgb
    /* JADX INFO: renamed from: cm */
    public final Object mo15295cm() {
        Object objM15296d = m15296d();
        if (objM15296d == null) {
            throw new lgd();
        }
        this.f38170b.m15130l(kyy.f37751a);
        lqi.m15868m(this.f38171c);
        return objM15296d;
    }

    /* JADX INFO: renamed from: d */
    protected final Object m15296d() {
        return this.f38169a.getAndSet(null);
    }

    public final String toString() {
        return "single-owner[" + String.valueOf(this.f38169a.get()) + "]";
    }
}
