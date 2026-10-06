package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ltp {

    /* JADX INFO: renamed from: a */
    public final String f39189a;

    /* JADX INFO: renamed from: b */
    public final ltq f39190b;

    /* JADX INFO: renamed from: c */
    public final mny f39191c;

    /* JADX INFO: renamed from: f */
    private final nps f39194f;

    /* JADX INFO: renamed from: g */
    private final mny f39195g = new mny(new lto(this), not.INSTANCE);

    /* JADX INFO: renamed from: d */
    public final Object f39192d = new Object();

    /* JADX INFO: renamed from: e */
    public List f39193e = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final ote f39196h = ote.m19025d();

    public ltp(ltq ltqVar, nps npsVar) {
        this.f39190b = ltqVar;
        this.f39194f = npsVar;
        this.f39189a = ((ltn) ltqVar).f39178a;
        this.f39191c = new mny(new cnm((ltn) ltqVar, 12), not.INSTANCE);
        m15979c(new cnc(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final nps m15977a() throws IllegalAccessException, InvocationTargetException {
        nps npsVarM15973a;
        if (this.f39195g.f41147c.isDone()) {
            npsVarM15973a = ((ltn) this.f39190b).m15973a();
        } else {
            moj mojVarM15580g = lkm.m15580g("Get ".concat(String.valueOf(this.f39189a)));
            try {
                nps npsVarM17554j = nod.m17554j(this.f39195g.m16668c(), mov.m16716b(new cnc(this, 19)), not.INSTANCE);
                mojVarM15580g.m16709a(npsVarM17554j);
                mojVarM15580g.close();
                npsVarM15973a = npsVarM17554j;
            } catch (Throwable th) {
                try {
                    mojVarM15580g.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        kxk.m14966L(this.f39194f);
        return kxk.m14966L(npsVarM15973a);
    }

    /* JADX INFO: renamed from: b */
    public final nps m15978b(mrf mrfVar, Executor executor) {
        nom nomVarM16716b = mov.m16716b(new ltt(mrfVar, 1));
        moj mojVarM15580g = lkm.m15580g("Update ".concat(String.valueOf(this.f39189a)));
        try {
            nps npsVarM16668c = this.f39195g.m16668c();
            this.f39196h.m19029c(new cnm(npsVarM16668c, 14), not.INSTANCE);
            nps npsVarM19029c = this.f39196h.m19029c(mov.m16715a(new ltl(this, npsVarM16668c, nomVarM16716b, executor, 2)), not.INSTANCE);
            npsVarM19029c.getClass();
            if (!npsVarM16668c.isDone()) {
                if (npsVarM19029c.isDone()) {
                    kxk.m14976V(npsVarM19029c, npsVarM16668c);
                } else {
                    npj npjVar = new npj(npsVarM19029c, npsVarM16668c, 0);
                    npsVarM19029c.mo2282d(npjVar, not.INSTANCE);
                    npsVarM16668c.mo2282d(npjVar, not.INSTANCE);
                }
            }
            kxk.m14966L(this.f39194f);
            mojVarM15580g.m16709a(npsVarM19029c);
            mojVarM15580g.close();
            return npsVarM19029c;
        } catch (Throwable th) {
            try {
                mojVarM15580g.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15979c(nom nomVar) {
        synchronized (this.f39192d) {
            this.f39193e.add(nomVar);
        }
    }
}
