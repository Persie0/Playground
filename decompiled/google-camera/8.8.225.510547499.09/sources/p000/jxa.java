package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jxa extends jwf {

    /* JADX INFO: renamed from: a */
    public int f34978a;

    /* JADX INFO: renamed from: e */
    public volatile Object f34979e;

    public jxa(Object obj) {
        super(obj);
        this.f34979e = null;
    }

    @Override // p000.jwf
    /* JADX INFO: renamed from: c */
    public final void mo13622c(Object obj) {
        if (this.f34978a > 0) {
            this.f34979e = obj;
        } else {
            if (mpw.m16768g(this.f34942d, obj)) {
                return;
            }
            super.mo13622c(obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public final kba m13647d() {
        this.f34941c.execute(new juz(this, 10));
        return new igy(this, new AtomicBoolean(false), 4);
    }

    public jxa(Object obj, jwx jwxVar) {
        super(obj, jwxVar);
        this.f34979e = null;
    }
}
