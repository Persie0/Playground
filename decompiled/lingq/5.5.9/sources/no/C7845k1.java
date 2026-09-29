package no;

import ae.C0062b;
import cm.InterfaceC2056p;
import kotlinx.coroutines.selects.C7189a;
import kotlinx.coroutines.selects.InterfaceC7191c;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: no.k1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7845k1<T, R> extends AbstractC7881y0 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7191c<R> f42943e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2056p<T, InterfaceC9968c<? super R>, Object> f42944f;

    /* JADX WARN: Multi-variable type inference failed */
    public C7845k1(InterfaceC7191c<? super R> interfaceC7191c, InterfaceC2056p<? super T, ? super InterfaceC9968c<? super R>, ? extends Object> interfaceC2056p) {
        this.f42943e = interfaceC7191c;
        this.f42944f = interfaceC2056p;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // no.AbstractC7874v
    /* JADX INFO: renamed from: K */
    public final void mo14509K(Throwable th2) {
        InterfaceC7191c<R> interfaceC7191c = this.f42943e;
        if (interfaceC7191c.mo14503i()) {
            C7883z0 c7883z0M15626L = m15626L();
            InterfaceC2056p<T, InterfaceC9968c<? super R>, Object> interfaceC2056p = this.f42944f;
            Object objM15634M = c7883z0M15626L.m15634M();
            if (objM15634M instanceof C7870t) {
                interfaceC7191c.mo14507r(((C7870t) objM15634M).f42969a);
                return;
            }
            Object objM14907H0 = C7499b.m14907H0(objM15634M);
            C7189a c7189aMo14506o = interfaceC7191c.mo14506o();
            try {
                C0062b.m308S1(C8656b.m16874A(C8656b.m16908p(interfaceC2056p, objM14907H0, c7189aMo14506o)), C9072e.f47360a, null);
            } catch (Throwable th3) {
                c7189aMo14506o.mo2031y(C7499b.m14967u(th3));
                throw th3;
            }
        }
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
        mo14509K(th2);
        return C9072e.f47360a;
    }
}
