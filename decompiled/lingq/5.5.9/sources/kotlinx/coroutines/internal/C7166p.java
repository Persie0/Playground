package kotlinx.coroutines.internal;

import ae.C0062b;
import kotlin.coroutines.CoroutineContext;
import no.AbstractC7813a;
import no.C7828f;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10223b;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.p */
/* JADX INFO: loaded from: classes2.dex */
public class C7166p<T> extends AbstractC7813a<T> implements InterfaceC10223b {

    /* JADX INFO: renamed from: c */
    public final InterfaceC9968c<T> f40440c;

    public C7166p(InterfaceC9968c interfaceC9968c, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f40440c = interfaceC9968c;
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: S */
    public final boolean mo14465S() {
        return true;
    }

    @Override // p490xl.InterfaceC10223b
    /* JADX INFO: renamed from: d */
    public final InterfaceC10223b mo13473d() {
        InterfaceC9968c<T> interfaceC9968c = this.f40440c;
        if (interfaceC9968c instanceof InterfaceC10223b) {
            return (InterfaceC10223b) interfaceC9968c;
        }
        return null;
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: n */
    public void mo14466n(Object obj) {
        C0062b.m308S1(C8656b.m16874A(this.f40440c), C7828f.m15571e(obj), null);
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: o */
    public void mo14467o(Object obj) {
        this.f40440c.mo2031y(C7828f.m15571e(obj));
    }
}
