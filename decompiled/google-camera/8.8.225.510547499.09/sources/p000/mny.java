package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mny {

    /* JADX INFO: renamed from: c */
    public final nqf f41147c;

    /* JADX INFO: renamed from: d */
    public final npj f41148d;

    /* JADX INFO: renamed from: a */
    public final AtomicLong f41145a = new AtomicLong(m16667b(Integer.MIN_VALUE, Integer.MIN_VALUE));

    /* JADX INFO: renamed from: b */
    public final AtomicReference f41146b = new AtomicReference(null);

    /* JADX INFO: renamed from: e */
    private final AtomicReference f41149e = new AtomicReference(null);

    /* JADX INFO: renamed from: f */
    private final Executor f41150f = kxk.m14956B(not.INSTANCE);

    public mny(nol nolVar, Executor executor) {
        nqf nqfVarM17621g = nqf.m17621g();
        this.f41147c = nqfVarM17621g;
        npj npjVar = new npj(nolVar, executor, 1);
        this.f41148d = npjVar;
        nqfVarM17621g.mo2282d(npjVar, not.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static int m16666a(long j) {
        return (int) (j >>> 32);
    }

    /* JADX INFO: renamed from: b */
    public static long m16667b(int i, int i2) {
        return (((long) i2) & 4294967295L) | (i << 32);
    }

    /* JADX INFO: renamed from: c */
    public final nps m16668c() {
        long j;
        final int iM16666a;
        if (this.f41147c.isDone()) {
            return this.f41147c;
        }
        do {
            j = this.f41145a.get();
            iM16666a = m16666a(j);
        } while (!this.f41145a.compareAndSet(j, m16667b(iM16666a, ((int) j) + 1)));
        final nqf nqfVarM17621g = nqf.m17621g();
        nps npsVar = (nps) this.f41149e.getAndSet(nqfVarM17621g);
        nqfVarM17621g.mo16665f(npsVar == null ? kxk.m14970P(mov.m16715a(new nol() { // from class: mnu
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                return this.f41138a.m16669d(iM16666a);
            }
        }), not.INSTANCE) : nnj.m17524j(npsVar, Throwable.class, mov.m16716b(new nom() { // from class: mnv
            @Override // p000.nom
            /* JADX INFO: renamed from: a */
            public final nps mo3942a(Object obj) {
                return this.f41140a.m16669d(iM16666a);
            }
        }), this.f41150f));
        final mnw mnwVar = new mnw(this, iM16666a);
        nqfVarM17621g.mo2282d(new Runnable() { // from class: mnt
            @Override // java.lang.Runnable
            public final void run() {
                mny mnyVar = this.f41135a;
                nqf nqfVar = nqfVarM17621g;
                mnw mnwVar2 = mnwVar;
                try {
                    mnyVar.f41147c.mo14894e(kxk.m14973S(nqfVar));
                    mnwVar2.mo16665f(mnyVar.f41147c);
                } catch (Throwable th) {
                    mnwVar2.mo16665f(nqfVar);
                }
            }
        }, not.INSTANCE);
        return mnwVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, nol] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: d */
    public final nps m16669d(int i) {
        mnx mnxVar;
        if (m16666a(this.f41145a.get()) > i) {
            return kxk.m14963I();
        }
        mnx mnxVar2 = new mnx(i);
        do {
            mnxVar = (mnx) this.f41146b.get();
            if (mnxVar != null && mnxVar.f41144a > i) {
                return kxk.m14963I();
            }
        } while (!lkm.m15581h(this.f41146b, mnxVar, mnxVar2));
        if (m16666a(this.f41145a.get()) > i) {
            mnxVar2.cancel(true);
            lkm.m15581h(this.f41146b, mnxVar2, null);
            return mnxVar2;
        }
        npj npjVar = this.f41148d;
        ?? r1 = npjVar.f44024a;
        ?? r4 = npjVar.f44025b;
        if (r1 == 0 || r4 == 0) {
            mnxVar2.mo16665f(this.f41147c);
        } else {
            mnxVar2.mo16665f(kxk.m14970P(mov.m16715a(r1), r4));
        }
        return mnxVar2;
    }
}
