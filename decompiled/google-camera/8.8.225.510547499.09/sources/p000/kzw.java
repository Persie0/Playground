package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzw implements kzx {

    /* JADX INFO: renamed from: a */
    private final Object f37795a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37796b;

    public kzw(Object obj, int i) {
        this.f37796b = i;
        this.f37795a = obj;
    }

    public kzw(nps npsVar, int i) {
        this.f37796b = i;
        this.f37795a = npsVar;
    }

    /* JADX INFO: renamed from: j */
    private final kzx m15099j(Executor executor, kyz kyzVar) {
        lav lavVarM15121j = lav.m15121j();
        m15101l(executor, new lap(this.f37795a, kyzVar, lavVarM15121j, 1), lavVarM15121j);
        return lavVarM15121j;
    }

    /* JADX INFO: renamed from: k */
    private final kzx m15100k(Executor executor, lab labVar) {
        lav lavVarM15121j = lav.m15121j();
        m15101l(executor, new kzt(this.f37795a, labVar, executor, lavVarM15121j), lavVarM15121j);
        return lavVarM15121j;
    }

    /* JADX INFO: renamed from: l */
    private static void m15101l(Executor executor, Runnable runnable, lav lavVar) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, nps] */
    @Override // p000.kzx
    /* JADX INFO: renamed from: e */
    public final nps mo15106e() {
        switch (this.f37796b) {
            case 0:
                return kxk.m14965K(this.f37795a);
            default:
                return this.f37795a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nps] */
    @Override // p000.kzx
    /* JADX INFO: renamed from: f */
    public final Object mo15107f() throws kzy {
        switch (this.f37796b) {
            case 0:
                return this.f37795a;
            default:
                try {
                    Object obj = this.f37795a.get();
                    if (obj != null) {
                        return obj;
                    }
                    throw kzy.m15111a(new IllegalStateException("Result value was null"));
                } catch (ExecutionException e) {
                    throw kzy.m15111a(e.getCause());
                }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nps] */
    @Override // p000.kzx
    /* JADX INFO: renamed from: g */
    public final boolean mo15108g() {
        switch (this.f37796b) {
            case 0:
                return true;
            default:
                return this.f37795a.isDone();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, nps] */
    @Override // p000.kzx
    /* JADX INFO: renamed from: h */
    public final void mo15109h(kzj kzjVar) {
        switch (this.f37796b) {
            case 0:
                break;
            default:
                ?? r3 = this.f37795a;
                r3.mo2282d(new kzm(r3), not.INSTANCE);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, nps] */
    @Override // p000.kzx
    /* JADX INFO: renamed from: a */
    public final kzx mo15102a(Executor executor, kyz kyzVar) {
        switch (this.f37796b) {
            case 0:
                return m15099j(executor, kyzVar);
            default:
                executor.getClass();
                kyzVar.getClass();
                ?? r9 = this.f37795a;
                kzp kzpVar = new kzp(r9, new kzn(kyzVar, 1), null, executor, law.f37860a, null, null, null);
                r9.mo2282d(kzpVar, not.INSTANCE);
                return kzpVar.f37775a;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, nps] */
    @Override // p000.kzx
    /* JADX INFO: renamed from: b */
    public final kzx mo15103b(Executor executor, lab labVar) {
        switch (this.f37796b) {
            case 0:
                return m15100k(executor, labVar);
            default:
                labVar.getClass();
                ?? r9 = this.f37795a;
                kzp kzpVar = new kzp(r9, new kzn(labVar, 0), null, executor, law.f37860a, null, null, null);
                r9.mo2282d(kzpVar, not.INSTANCE);
                return kzpVar.f37775a;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, nps] */
    @Override // p000.kzx
    /* JADX INFO: renamed from: c */
    public final kzx mo15104c(Executor executor, kyz kyzVar, kyz kyzVar2) {
        switch (this.f37796b) {
            case 0:
                return m15099j(executor, kyzVar);
            default:
                executor.getClass();
                kyzVar.getClass();
                kyzVar2.getClass();
                ?? r9 = this.f37795a;
                kzp kzpVar = new kzp(r9, new kzn(kyzVar, 1), new kzn(kyzVar2, 1), executor, law.f37860a, null, null, null);
                r9.mo2282d(kzpVar, not.INSTANCE);
                return kzpVar.f37775a;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, nps] */
    @Override // p000.kzx
    /* JADX INFO: renamed from: d */
    public final kzx mo15105d(Executor executor, lab labVar, lab labVar2) {
        switch (this.f37796b) {
            case 0:
                return m15100k(executor, labVar);
            default:
                executor.getClass();
                labVar.getClass();
                labVar2.getClass();
                ?? r9 = this.f37795a;
                kzp kzpVar = new kzp(r9, new kzn(labVar, 0), new kzn(labVar2, 0), executor, law.f37860a, null, null, null);
                r9.mo2282d(kzpVar, not.INSTANCE);
                return kzpVar.f37775a;
        }
    }

    @Override // p000.kzx
    /* JADX INFO: renamed from: i */
    public final kzx mo15110i(Executor executor, lhz lhzVar) {
        switch (this.f37796b) {
            case 0:
                return m15100k(executor, new kzs(lhzVar, 0, null));
            default:
                return mo15105d(executor, new kzs(lhzVar, 1, null), new lad(lhzVar, 1, null));
        }
    }
}
