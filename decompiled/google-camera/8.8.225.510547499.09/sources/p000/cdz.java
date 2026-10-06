package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdz {

    /* JADX INFO: renamed from: a */
    public final kmk f5393a;

    /* JADX INFO: renamed from: b */
    public final Object f5394b = new Object();

    /* JADX INFO: renamed from: c */
    public nqf f5395c;

    /* JADX INFO: renamed from: d */
    private final dnm f5396d;

    /* JADX INFO: renamed from: e */
    private final Executor f5397e;

    public cdz(dnm dnmVar, kmk kmkVar, Executor executor) {
        this.f5396d = dnmVar;
        this.f5393a = kmkVar;
        this.f5397e = executor;
    }

    /* JADX INFO: renamed from: a */
    public final nps m3535a() {
        boolean z;
        nqf nqfVar;
        synchronized (this.f5394b) {
            if (this.f5395c == null) {
                this.f5395c = nqf.m17621g();
                z = true;
            } else {
                z = false;
            }
            nqfVar = this.f5395c;
        }
        if (z) {
            nps npsVarM6436b = this.f5396d.m6436b();
            kxk.m14959E(npsVarM6436b).m17607c(new bey(this, npsVarM6436b, 17), this.f5397e);
        }
        return nqfVar;
    }
}
