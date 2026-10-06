package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ote {

    /* JADX INFO: renamed from: a */
    public Object f46516a;

    /* JADX INFO: renamed from: b */
    public final Object f46517b;

    private ote() {
        this.f46517b = new AtomicReference(npp.f44031a);
        this.f46516a = new npa();
    }

    public ote(otk otkVar) {
        this.f46517b = otkVar;
        this.f46516a = otl.f46530d;
    }

    /* JADX INFO: renamed from: d */
    public static ote m19025d() {
        return new ote();
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m19026e(Object obj) throws Throwable {
        if (!(obj instanceof otw)) {
            return true;
        }
        otw otwVar = (otw) obj;
        if (otwVar.f46551a == null) {
            return false;
        }
        throw oxy.m19157b(otwVar.m19069e());
    }

    /* JADX INFO: renamed from: a */
    public final Object m19027a(ols olsVar) {
        Object obj = this.f46516a;
        if (obj != otl.f46530d) {
            return Boolean.valueOf(m19026e(obj));
        }
        Object objMo19036a = ((otk) this.f46517b).mo19036a();
        this.f46516a = objMo19036a;
        if (objMo19036a != otl.f46530d) {
            return Boolean.valueOf(m19026e(objMo19036a));
        }
        opy opyVarM18771I = ook.m18771I(omn.m18701f(olsVar));
        otg otgVar = new otg(this, opyVarM18771I);
        while (!((otk) this.f46517b).m19041f(otgVar)) {
            Object objMo19036a2 = ((otk) this.f46517b).mo19036a();
            this.f46516a = objMo19036a2;
            if (objMo19036a2 instanceof otw) {
                otw otwVar = (otw) objMo19036a2;
                if (otwVar.f46551a == null) {
                    opyVarM18771I.mo18640e(false);
                } else {
                    opyVarM18771I.mo18640e(lkm.m15591r(otwVar.m19069e()));
                }
            } else if (objMo19036a2 != otl.f46530d) {
                opyVarM18771I.mo18871b(true, null);
            }
            Object objM18887m = opyVarM18771I.m18887m();
            oma omaVar = oma.COROUTINE_SUSPENDED;
            return objM18887m;
        }
        otk.m19035n(opyVarM18771I, otgVar);
        Object objM18887m2 = opyVarM18771I.m18887m();
        oma omaVar2 = oma.COROUTINE_SUSPENDED;
        return objM18887m2;
    }

    /* JADX INFO: renamed from: b */
    public final Object m19028b() throws Throwable {
        Object obj = this.f46516a;
        if (obj instanceof otw) {
            throw oxy.m19157b(((otw) obj).m19069e());
        }
        oxz oxzVar = otl.f46530d;
        if (obj == oxzVar) {
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
        this.f46516a = oxzVar;
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final nps m19029c(nol nolVar, Executor executor) {
        executor.getClass();
        final noz nozVar = new noz(executor, this, null);
        nox noxVar = new nox(nozVar, nolVar, 0);
        final nqf nqfVarM17621g = nqf.m17621g();
        final nps npsVar = (nps) ((AtomicReference) this.f46517b).getAndSet(nqfVarM17621g);
        final nqm nqmVarM17622g = nqm.m17622g(noxVar);
        npsVar.mo2282d(nqmVarM17622g, nozVar);
        final nps npsVarM14966L = kxk.m14966L(nqmVarM17622g);
        Runnable runnable = new Runnable() { // from class: now
            @Override // java.lang.Runnable
            public final void run() {
                nqm nqmVar = nqmVarM17622g;
                nqf nqfVar = nqfVarM17621g;
                nps npsVar2 = npsVar;
                nps npsVar3 = npsVarM14966L;
                noz nozVar2 = nozVar;
                if (nqmVar.isDone()) {
                    nqfVar.mo16665f(npsVar2);
                } else if (npsVar3.isCancelled() && nozVar2.compareAndSet(noy.NOT_RUN, noy.CANCELLED)) {
                    nqmVar.cancel(false);
                }
            }
        };
        npsVarM14966L.mo2282d(runnable, not.INSTANCE);
        nqmVarM17622g.mo2282d(runnable, not.INSTANCE);
        return npsVarM14966L;
    }
}
