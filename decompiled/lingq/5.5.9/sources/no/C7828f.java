package no;

import ae.C0062b;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C7156f;
import kotlinx.coroutines.internal.C7166p;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.C7178b;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import sl.C9072e;

/* JADX INFO: renamed from: no.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7828f {

    /* JADX INFO: renamed from: a */
    public static final C7168r f42926a = new C7168r("REMOVED_TASK");

    /* JADX INFO: renamed from: b */
    public static final C7168r f42927b = new C7168r("CLOSED_EMPTY");

    /* JADX INFO: renamed from: a */
    public static final Object m15567a(long j10, InterfaceC9968c interfaceC9968c) {
        if (j10 <= 0) {
            return C9072e.f47360a;
        }
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        if (j10 < Long.MAX_VALUE) {
            m15568b(c7843k.f42940e).mo14319q(j10, c7843k);
        }
        Object objM15593p = c7843k.m15593p();
        return objM15593p == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15593p : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC7820c0 m15568b(CoroutineContext coroutineContext) {
        int i10 = InterfaceC9969d.f50691G;
        CoroutineContext.InterfaceC6757a interfaceC6757aMo1474w = coroutineContext.mo1474w(InterfaceC9969d.a.f50692a);
        InterfaceC7820c0 interfaceC7820c0 = interfaceC6757aMo1474w instanceof InterfaceC7820c0 ? (InterfaceC7820c0) interfaceC6757aMo1474w : null;
        if (interfaceC7820c0 == null) {
            interfaceC7820c0 = C7817b0.f42918a;
        }
        return interfaceC7820c0;
    }

    /* JADX INFO: renamed from: c */
    public static final C7843k m15569c(InterfaceC9968c interfaceC9968c) {
        if (!(interfaceC9968c instanceof C7156f)) {
            return new C7843k(1, interfaceC9968c);
        }
        C7843k c7843kM14443j = ((C7156f) interfaceC9968c).m14443j();
        if (c7843kM14443j != null) {
            if (!c7843kM14443j.m15598x()) {
                c7843kM14443j = null;
            }
            if (c7843kM14443j != null) {
                return c7843kM14443j;
            }
        }
        return new C7843k(2, interfaceC9968c);
    }

    /* JADX INFO: renamed from: d */
    public static C7848l1 m15570d(InterfaceC7882z interfaceC7882z, CoroutineContext coroutineContext, CoroutineStart coroutineStart, InterfaceC2056p interfaceC2056p, int i10) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f38093a;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineContext coroutineContextM14307a = CoroutineContextKt.m14307a(interfaceC7882z.getF6528b(), coroutineContext, true);
        C7178b c7178b = C7832g0.f42930a;
        if (coroutineContextM14307a != c7178b && coroutineContextM14307a.mo1474w(InterfaceC9969d.a.f50692a) == null) {
            coroutineContextM14307a = coroutineContextM14307a.mo1471C(c7178b);
        }
        C7848l1 c7818b1 = coroutineStart.isLazy() ? new C7818b1(coroutineContextM14307a, interfaceC2056p) : new C7848l1(coroutineContextM14307a, true);
        coroutineStart.invoke(interfaceC2056p, c7818b1, c7818b1);
        return c7818b1;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m15571e(Object obj) {
        return obj instanceof C7870t ? C7499b.m14967u(((C7870t) obj).f42969a) : obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static final Object m15572f(CoroutineContext coroutineContext, InterfaceC2056p interfaceC2056p) throws Throwable {
        AbstractC7847l0 abstractC7847l0M15607a;
        CoroutineContext coroutineContextM14307a;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC9969d.a aVar = InterfaceC9969d.a.f50692a;
        InterfaceC9969d interfaceC9969d = (InterfaceC9969d) coroutineContext.mo1474w(aVar);
        if (interfaceC9969d == null) {
            abstractC7847l0M15607a = C7857o1.m15607a();
            coroutineContextM14307a = CoroutineContextKt.m14307a(EmptyCoroutineContext.f38093a, coroutineContext.mo1471C(abstractC7847l0M15607a), true);
            C7178b c7178b = C7832g0.f42930a;
            if (coroutineContextM14307a != c7178b && coroutineContextM14307a.mo1474w(aVar) == null) {
                coroutineContextM14307a = coroutineContextM14307a.mo1471C(c7178b);
            }
        } else {
            if (interfaceC9969d instanceof AbstractC7847l0) {
            }
            abstractC7847l0M15607a = C7857o1.f42954a.get();
            coroutineContextM14307a = CoroutineContextKt.m14307a(EmptyCoroutineContext.f38093a, coroutineContext, true);
            C7178b c7178b2 = C7832g0.f42930a;
            if (coroutineContextM14307a != c7178b2 && coroutineContextM14307a.mo1474w(aVar) == null) {
                coroutineContextM14307a = coroutineContextM14307a.mo1471C(c7178b2);
            }
        }
        C7822d c7822d = new C7822d(coroutineContextM14307a, threadCurrentThread, abstractC7847l0M15607a);
        CoroutineStart.DEFAULT.invoke(interfaceC2056p, c7822d, c7822d);
        AbstractC7847l0 abstractC7847l0 = c7822d.f42921d;
        if (abstractC7847l0 != null) {
            int i10 = AbstractC7847l0.f42946f;
            abstractC7847l0.m15602E1(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jMo14325G1 = abstractC7847l0 != null ? abstractC7847l0.mo14325G1() : Long.MAX_VALUE;
                if (!(c7822d.m15634M() instanceof InterfaceC7862q0)) {
                    if (abstractC7847l0 != null) {
                        int i11 = AbstractC7847l0.f42946f;
                        abstractC7847l0.m15600C1(false);
                    }
                    Object objM14907H0 = C7499b.m14907H0(c7822d.m15634M());
                    C7870t c7870t = objM14907H0 instanceof C7870t ? (C7870t) objM14907H0 : null;
                    if (c7870t == null) {
                        return objM14907H0;
                    }
                    throw c7870t.f42969a;
                }
                LockSupport.parkNanos(c7822d, jMo14325G1);
            } catch (Throwable th2) {
                if (abstractC7847l0 != null) {
                    int i12 = AbstractC7847l0.f42946f;
                    abstractC7847l0.m15600C1(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c7822d.m15644p(interruptedException);
        throw interruptedException;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static final Object m15574h(InterfaceC9968c interfaceC9968c, CoroutineContext coroutineContext, InterfaceC2056p interfaceC2056p) {
        Object objM15560l0;
        CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
        CoroutineContext coroutineContextMo1471C = !CoroutineContextKt.m14308b(coroutineContext) ? coroutineContextMo2029e.mo1471C(coroutineContext) : CoroutineContextKt.m14307a(coroutineContextMo2029e, coroutineContext, false);
        C0062b.m286L0(coroutineContextMo1471C);
        if (coroutineContextMo1471C == coroutineContextMo2029e) {
            C7166p c7166p = new C7166p(interfaceC9968c, coroutineContextMo1471C);
            objM15560l0 = C0062b.m350g2(c7166p, c7166p, interfaceC2056p);
        } else {
            InterfaceC9969d.a aVar = InterfaceC9969d.a.f50692a;
            if (C5207g.m11106a(coroutineContextMo1471C.mo1474w(aVar), coroutineContextMo2029e.mo1474w(aVar))) {
                C7863q1 c7863q1 = new C7863q1(interfaceC9968c, coroutineContextMo1471C);
                Object objM14435c = ThreadContextKt.m14435c(coroutineContextMo1471C, null);
                try {
                    Object objM350g2 = C0062b.m350g2(c7863q1, c7863q1, interfaceC2056p);
                    ThreadContextKt.m14433a(coroutineContextMo1471C, objM14435c);
                    objM15560l0 = objM350g2;
                } finally {
                    ThreadContextKt.m14433a(coroutineContextMo1471C, objM14435c);
                }
            } else {
                C7823d0 c7823d0 = new C7823d0(interfaceC9968c, coroutineContextMo1471C);
                try {
                    C0062b.m308S1(C8656b.m16874A(C8656b.m16908p(interfaceC2056p, c7823d0, c7823d0)), C9072e.f47360a, null);
                    objM15560l0 = c7823d0.m15560l0();
                } catch (Throwable th2) {
                    c7823d0.mo2031y(C7499b.m14967u(th2));
                    throw th2;
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM15560l0;
    }
}
