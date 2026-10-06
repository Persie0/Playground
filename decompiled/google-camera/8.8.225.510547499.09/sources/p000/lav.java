package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lav implements kzx {

    /* JADX INFO: renamed from: a */
    public volatile Object f37856a = null;

    /* JADX INFO: renamed from: b */
    public volatile kzy f37857b = null;

    /* JADX INFO: renamed from: c */
    private lar f37858c = null;

    /* JADX INFO: renamed from: d */
    private lar f37859d = null;

    private lav() {
    }

    /* JADX INFO: renamed from: j */
    public static lav m15121j() {
        return new lav();
    }

    /* JADX INFO: renamed from: k */
    public static void m15122k(Object obj, kyz kyzVar, lav lavVar) {
        try {
            lavVar.m15130l(kyzVar.mo8768a(obj));
        } catch (kzy e) {
            lavVar.m15131m(e);
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m15123o(Object obj, lab labVar, Executor executor, lav lavVar) {
        try {
            labVar.mo15098a(obj, executor).mo15104c(not.INSTANCE, new lat(lavVar), new las(lavVar)).mo15109h(kzj.f37771a);
        } catch (kzy e) {
            lavVar.m15131m(e);
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m15124p() {
        lar larVar;
        synchronized (this) {
            this.f37858c = null;
            this.f37859d = null;
            notifyAll();
        }
        for (larVar = this.f37858c; larVar != null; larVar = larVar.f37848a) {
            larVar.m15119a();
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m15125q(Executor executor, Runnable runnable, lav lavVar) {
        synchronized (this) {
            if (mo15108g()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            lar larVar = new lar(executor, runnable, lavVar);
            lar larVar2 = this.f37859d;
            if (larVar2 != null) {
                larVar2.f37848a = larVar;
            } else {
                this.f37858c = larVar;
            }
            this.f37859d = larVar;
        }
    }

    /* JADX INFO: renamed from: r */
    private static void m15126r(kzy kzyVar, kyz kyzVar, Executor executor, lav lavVar) {
        try {
            executor.execute(new lap(kzyVar, kyzVar, lavVar, 0));
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m15127s(Object obj, kyz kyzVar, Executor executor, lav lavVar) {
        try {
            executor.execute(new lap(obj, kyzVar, lavVar, 0));
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    /* JADX INFO: renamed from: t */
    private static void m15128t(kzy kzyVar, lab labVar, Executor executor, lav lavVar, lzd lzdVar) {
        try {
            executor.execute(new laq(kzyVar, labVar, executor, lavVar, lzdVar, null, null, null));
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    /* JADX INFO: renamed from: u */
    private static void m15129u(Object obj, lab labVar, Executor executor, lav lavVar, lzd lzdVar) {
        try {
            executor.execute(new laq(obj, labVar, executor, lavVar, lzdVar, null, null, null));
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: a */
    public final kzx mo15102a(Executor executor, kyz kyzVar) {
        lav lavVarM15121j = m15121j();
        Object obj = this.f37856a;
        if (obj != null) {
            m15127s(obj, kyzVar, executor, lavVarM15121j);
            return lavVarM15121j;
        }
        kzy kzyVar = this.f37857b;
        if (kzyVar != null) {
            lavVarM15121j.m15131m(kzyVar);
            return lavVarM15121j;
        }
        synchronized (this) {
            Object obj2 = this.f37856a;
            if (obj2 == null && (kzyVar = this.f37857b) == null) {
                m15125q(executor, new lcu(this, kyzVar, lavVarM15121j, 1), lavVarM15121j);
                return lavVarM15121j;
            }
            if (obj2 != null) {
                m15127s(obj2, kyzVar, executor, lavVarM15121j);
            } else {
                lavVarM15121j.m15131m(kzyVar);
            }
            return lavVarM15121j;
        }
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: b */
    public final kzx mo15103b(Executor executor, lab labVar) {
        lzd lzdVar = law.f37860a;
        lav lavVarM15121j = m15121j();
        Object obj = this.f37856a;
        if (obj != null) {
            m15129u(obj, labVar, executor, lavVarM15121j, lzdVar);
            return lavVarM15121j;
        }
        kzy kzyVar = this.f37857b;
        if (kzyVar != null) {
            lavVarM15121j.m15131m(kzyVar);
            return lavVarM15121j;
        }
        synchronized (this) {
            Object obj2 = this.f37856a;
            if (obj2 == null && (kzyVar = this.f37857b) == null) {
                m15125q(executor, new lan(this, labVar, executor, lavVarM15121j, lzdVar, null, null, null), lavVarM15121j);
                return lavVarM15121j;
            }
            if (obj2 != null) {
                m15129u(obj2, labVar, executor, lavVarM15121j, lzdVar);
            } else {
                lavVarM15121j.m15131m(kzyVar);
            }
            return lavVarM15121j;
        }
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: c */
    public final kzx mo15104c(Executor executor, kyz kyzVar, kyz kyzVar2) {
        lav lavVarM15121j = m15121j();
        Object obj = this.f37856a;
        if (obj != null) {
            m15127s(obj, kyzVar, executor, lavVarM15121j);
            return lavVarM15121j;
        }
        kzy kzyVar = this.f37857b;
        if (kzyVar != null) {
            m15126r(kzyVar, kyzVar2, executor, lavVarM15121j);
            return lavVarM15121j;
        }
        synchronized (this) {
            Object obj2 = this.f37856a;
            if (obj2 == null && (kzyVar = this.f37857b) == null) {
                m15125q(executor, new lam(this, kyzVar, lavVarM15121j, kyzVar2), lavVarM15121j);
                return lavVarM15121j;
            }
            if (obj2 != null) {
                m15127s(obj2, kyzVar, executor, lavVarM15121j);
            } else {
                m15126r(kzyVar, kyzVar2, executor, lavVarM15121j);
            }
            return lavVarM15121j;
        }
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: d */
    public final kzx mo15105d(Executor executor, lab labVar, lab labVar2) {
        lzd lzdVar = law.f37860a;
        lav lavVarM15121j = m15121j();
        Object obj = this.f37856a;
        if (obj != null) {
            m15129u(obj, labVar, executor, lavVarM15121j, lzdVar);
            return lavVarM15121j;
        }
        kzy kzyVar = this.f37857b;
        if (kzyVar != null) {
            m15128t(kzyVar, labVar2, executor, lavVarM15121j, lzdVar);
            return lavVarM15121j;
        }
        synchronized (this) {
            Object obj2 = this.f37856a;
            if (obj2 == null && (kzyVar = this.f37857b) == null) {
                m15125q(executor, new lao(this, labVar, executor, lavVarM15121j, lzdVar, labVar2, null, null, null), lavVarM15121j);
                return lavVarM15121j;
            }
            if (obj2 != null) {
                m15129u(obj2, labVar, executor, lavVarM15121j, lzdVar);
            } else {
                m15128t(kzyVar, labVar2, executor, lavVarM15121j, lzdVar);
            }
            return lavVarM15121j;
        }
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: e */
    public final nps mo15106e() {
        return new lau(this, 0);
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: f */
    public final Object mo15107f() throws kzy {
        Object obj;
        Object obj2 = this.f37856a;
        if (obj2 != null) {
            return obj2;
        }
        if (this.f37857b != null) {
            throw this.f37857b;
        }
        synchronized (this) {
            while (!mo15108g()) {
                wait();
            }
            obj = this.f37856a;
            if (obj == null) {
                throw this.f37857b;
            }
        }
        return obj;
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: g */
    public final boolean mo15108g() {
        return (this.f37856a == null && this.f37857b == null) ? false : true;
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: h */
    public final void mo15109h(kzj kzjVar) {
        if (this.f37856a != null) {
            return;
        }
        kzy kzyVar = this.f37857b;
        if (kzyVar != null) {
            throw msm.m16866a(kzyVar);
        }
        synchronized (this) {
            Object obj = this.f37856a;
            if (obj == null && (kzyVar = this.f37857b) == null) {
                m15132n(not.INSTANCE, new lae(this, kzjVar, 2));
                return;
            }
            if (obj == null) {
                throw msm.m16866a(kzyVar);
            }
        }
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: i */
    public final kzx mo15110i(Executor executor, lhz lhzVar) {
        return mo15105d(executor, new lak(this, lhzVar, null), new lal(this, lhzVar, null));
    }

    /* JADX INFO: renamed from: l */
    public final void m15130l(Object obj) {
        if (mo15108g()) {
            return;
        }
        synchronized (this) {
            if (mo15108g()) {
                return;
            }
            this.f37856a = obj;
            m15124p();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15131m(kzy kzyVar) {
        if (mo15108g()) {
            return;
        }
        synchronized (this) {
            if (mo15108g()) {
                return;
            }
            this.f37857b = kzyVar;
            m15124p();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15132n(Executor executor, Runnable runnable) {
        synchronized (this) {
            if (mo15108g()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            lar larVar = new lar(executor, runnable);
            lar larVar2 = this.f37859d;
            if (larVar2 != null) {
                larVar2.f37848a = larVar;
            } else {
                this.f37858c = larVar;
            }
            this.f37859d = larVar;
        }
    }
}
