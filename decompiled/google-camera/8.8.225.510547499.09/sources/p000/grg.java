package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class grg implements grf {

    /* JADX INFO: renamed from: f */
    private final gre f26134f;

    /* JADX INFO: renamed from: g */
    private final hrl f26135g;

    /* JADX INFO: renamed from: e */
    private final Set f26133e = new HashSet();

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f26129a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final nqf f26130b = nqf.m17621g();

    /* JADX INFO: renamed from: c */
    public final Object f26131c = new Object();

    /* JADX INFO: renamed from: d */
    public int f26132d = 1;

    public grg(gre greVar, hrl hrlVar, byte[] bArr) {
        this.f26134f = greVar;
        this.f26135g = hrlVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9666a() {
        Set setUnmodifiableSet;
        lku.m15613H(this.f26132d == 3);
        if (this.f26133e.isEmpty()) {
            this.f26130b.mo14894e(new HashSet());
            return;
        }
        gre greVar = this.f26134f;
        synchronized (((grc) greVar).f26112e) {
            ((grc) greVar).f26114g.retainAll(((grc) greVar).f26112e.keySet());
            setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(((grc) greVar).f26114g));
        }
        HashSet hashSet = new HashSet();
        for (grm grmVar : this.f26133e) {
            kpw kpwVar = grmVar.f26152a;
            if (kpwVar != null && setUnmodifiableSet.contains(kpwVar)) {
                gre greVar2 = this.f26134f;
                kpw kpwVar2 = grmVar.f26152a;
                synchronized (((grc) greVar2).f26112e) {
                    if (((grc) greVar2).f26114g.contains(kpwVar2)) {
                        ((grc) greVar2).f26114g.remove(kpwVar2);
                        if (((grc) greVar2).f26112e.remove(kpwVar2) != null) {
                            ((grc) greVar2).f26115h--;
                        }
                    }
                }
                hashSet.add(grmVar);
            }
        }
        this.f26130b.mo14894e(hashSet);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v0, types: [grk, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final synchronized void m9667b(grm grmVar, gyh gyhVar) {
        synchronized (this.f26131c) {
            lku.m15613H(this.f26132d == 2);
            lku.m15613H(this.f26129a.get() > 0);
            this.f26129a.incrementAndGet();
            this.f26133e.add(grmVar);
            gpn gpnVar = new gpn(this, 11);
            try {
                gre greVar = this.f26134f;
                hrl hrlVar = this.f26135g;
                ?? r8 = hrlVar.f29318d;
                ?? r9 = hrlVar.f29317c;
                Object obj = hrlVar.f29320f;
                Object obj2 = hrlVar.f29319e;
                grw grwVar = new grw(grmVar, r8, r9, (grn) obj, gyhVar, (gro) obj2, (fct) hrlVar.f29316b, hrlVar.f29315a);
                mrm mrmVarM16829i = mrm.m16829i(gpnVar);
                HashSet hashSet = new HashSet(1);
                hashSet.add(grwVar);
                ((grc) greVar).m9663c(grwVar.f26189g, hashSet, false, true, mrmVarM16829i);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new IllegalStateException("Interrupt should NOT happen, because call is non-blocking");
            }
        }
    }

    @Override // p000.grf, p000.kba, java.lang.AutoCloseable
    public synchronized void close() {
        synchronized (this.f26131c) {
            int i = this.f26132d;
            boolean z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
            lku.m15613H(z);
            if (this.f26132d != 3) {
                this.f26132d = 3;
                if (this.f26129a.decrementAndGet() == 0) {
                    m9666a();
                }
            }
        }
    }
}
