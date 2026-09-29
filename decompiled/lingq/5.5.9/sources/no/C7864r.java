package no;

import ae.C0062b;
import cm.InterfaceC2056p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.selects.InterfaceC7190b;
import kotlinx.coroutines.selects.InterfaceC7191c;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: no.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C7864r<T> extends C7883z0 implements InterfaceC7861q<T>, InterfaceC7190b<T> {
    public C7864r(InterfaceC7875v0 interfaceC7875v0) {
        super(true);
        m15635P(interfaceC7875v0);
    }

    @Override // no.InterfaceC7861q
    /* JADX INFO: renamed from: N0 */
    public final boolean mo15609N0(Throwable th2) {
        return m15637T(new C7870t(th2, false));
    }

    @Override // kotlinx.coroutines.selects.InterfaceC7190b
    /* JADX INFO: renamed from: i */
    public final <R> void mo14358i(InterfaceC7191c<? super R> interfaceC7191c, InterfaceC2056p<? super T, ? super InterfaceC9968c<? super R>, ? extends Object> interfaceC2056p) {
        Object objM15634M;
        do {
            objM15634M = m15634M();
            if (interfaceC7191c.mo14504k()) {
                return;
            }
            if (!(objM15634M instanceof InterfaceC7862q0)) {
                if (interfaceC7191c.mo14503i()) {
                    if (objM15634M instanceof C7870t) {
                        interfaceC7191c.mo14507r(((C7870t) objM15634M).f42969a);
                        return;
                    } else {
                        C0062b.m347f2(interfaceC2056p, C7499b.m14907H0(objM15634M), interfaceC7191c.mo14506o());
                        return;
                    }
                }
            }
        } while (m15641f0(objM15634M) != 0);
        interfaceC7191c.mo14508s(mo15620r1(new C7845k1(interfaceC7191c, interfaceC2056p)));
    }

    /* JADX INFO: renamed from: j0 */
    public final Object m15612j0(InterfaceC9968c<? super T> interfaceC9968c) throws Throwable {
        Object objM15634M;
        Object objM14907H0;
        do {
            objM15634M = m15634M();
            if (!(objM15634M instanceof InterfaceC7862q0)) {
                if (objM15634M instanceof C7870t) {
                    throw ((C7870t) objM15634M).f42969a;
                }
                objM14907H0 = C7499b.m14907H0(objM15634M);
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM14907H0;
        } while (m15641f0(objM15634M) < 0);
        C7883z0.a aVar = new C7883z0.a(C8656b.m16874A(interfaceC9968c), this);
        aVar.m15594r();
        aVar.mo15577R(new C7831g(1, mo15620r1(new C7839i1(aVar))));
        objM14907H0 = aVar.m15593p();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM14907H0;
    }
}
