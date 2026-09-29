package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;

/* JADX INFO: loaded from: classes.dex */
public final class ej0 implements z1b {

    /* JADX INFO: renamed from: a */
    public Object f37315a = fj0.f39185p;

    /* JADX INFO: renamed from: b */
    public sm0 f37316b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3211a f37317c;

    public ej0(C3211a c3211a) {
        this.f37317c = c3211a;
    }

    @Override // p000.z1b
    /* JADX INFO: renamed from: a */
    public final void mo10138a(au8 au8Var, int i) {
        sm0 sm0Var = this.f37316b;
        if (sm0Var != null) {
            sm0Var.mo10138a(au8Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m11164b(ContinuationImpl continuationImpl) throws Throwable {
        ku0 ku0VarM15476r;
        Object obj = this.f37315a;
        boolean z = true;
        if (obj == fj0.f39185p || obj == fj0.f39181l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3211a.f47789g;
            C3211a c3211a = this.f37317c;
            ku0 ku0Var = (ku0) atomicReferenceFieldUpdater.get(c3211a);
            while (!c3211a.m15456C()) {
                long andIncrement = C3211a.f47785c.getAndIncrement(c3211a);
                long j = fj0.f39171b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (ku0Var.f7522e != j2) {
                    ku0VarM15476r = c3211a.m15476r(j2, ku0Var);
                    if (ku0VarM15476r == null) {
                        continue;
                    }
                } else {
                    ku0VarM15476r = ku0Var;
                }
                Object objM15466Q = c3211a.m15466Q(ku0VarM15476r, i, andIncrement, null);
                C0842cc c0842cc = fj0.f39182m;
                if (objM15466Q == c0842cc) {
                    C3386nv.m17633t("unreachable");
                    return null;
                }
                C0842cc c0842cc2 = fj0.f39184o;
                if (objM15466Q == c0842cc2) {
                    if (andIncrement < c3211a.m15481w()) {
                        ku0VarM15476r.m12572a();
                    }
                    ku0Var = ku0VarM15476r;
                } else {
                    if (objM15466Q == fj0.f39183n) {
                        C3211a c3211a2 = this.f37317c;
                        sm0 sm0VarM17086E = AbstractC3352my.m17086E(AbstractC3584sr.m21600K(continuationImpl));
                        try {
                            this.f37316b = sm0VarM17086E;
                            Object objM15466Q2 = c3211a2.m15466Q(ku0VarM15476r, i, andIncrement, this);
                            if (objM15466Q2 != c0842cc) {
                                if (objM15466Q2 == c0842cc2) {
                                    if (andIncrement < c3211a2.m15481w()) {
                                        ku0VarM15476r.m12572a();
                                    }
                                    ku0 ku0Var2 = (ku0) C3211a.f47789g.get(c3211a2);
                                    while (true) {
                                        if (c3211a2.m15456C()) {
                                            sm0 sm0Var = this.f37316b;
                                            sm0Var.getClass();
                                            this.f37316b = null;
                                            this.f37315a = fj0.f39181l;
                                            Throwable thM15478t = c3211a.m15478t();
                                            if (thM15478t != null) {
                                                sm0Var.resumeWith(new Result.Failure(thM15478t));
                                                break;
                                            }
                                            sm0Var.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = C3211a.f47785c.getAndIncrement(c3211a2);
                                        long j3 = fj0.f39171b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (ku0Var2.f7522e != j4) {
                                            ku0 ku0VarM15476r2 = c3211a2.m15476r(j4, ku0Var2);
                                            if (ku0VarM15476r2 != null) {
                                                ku0Var2 = ku0VarM15476r2;
                                            }
                                        }
                                        Object objM15466Q3 = c3211a2.m15466Q(ku0Var2, i2, andIncrement2, this);
                                        if (objM15466Q3 == fj0.f39182m) {
                                            mo10138a(ku0Var2, i2);
                                            break;
                                        }
                                        if (objM15466Q3 == fj0.f39184o) {
                                            if (andIncrement2 < c3211a2.m15481w()) {
                                                ku0Var2.m12572a();
                                            }
                                        } else {
                                            if (objM15466Q3 == fj0.f39183n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            ku0Var2.m12572a();
                                            this.f37315a = objM15466Q3;
                                            this.f37316b = null;
                                        }
                                    }
                                } else {
                                    ku0VarM15476r.m12572a();
                                    this.f37315a = objM15466Q2;
                                    this.f37316b = null;
                                }
                                sm0VarM17086E.mo10140j(Boolean.TRUE, null);
                                break;
                            }
                            mo10138a(ku0VarM15476r, i);
                            Object objM21466r = sm0VarM17086E.m21466r();
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            return objM21466r;
                        } catch (Throwable th) {
                            sm0VarM17086E.m21455C();
                            throw th;
                        }
                    }
                    ku0VarM15476r.m12572a();
                    this.f37315a = objM15466Q;
                }
            }
            this.f37315a = fj0.f39181l;
            Throwable thM15478t2 = c3211a.m15478t();
            if (thM15478t2 != null) {
                int i3 = ig9.f44092a;
                throw thM15478t2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: c */
    public final Object m11165c() throws Throwable {
        Object obj = this.f37315a;
        C0842cc c0842cc = fj0.f39185p;
        if (obj == c0842cc) {
            C3386nv.m17633t("`hasNext()` has not been invoked");
            return null;
        }
        this.f37315a = c0842cc;
        if (obj != fj0.f39181l) {
            return obj;
        }
        Throwable thM15479u = this.f37317c.m15479u();
        int i = ig9.f44092a;
        throw thM15479u;
    }
}
