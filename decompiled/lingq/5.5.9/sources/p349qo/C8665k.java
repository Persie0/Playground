package p349qo;

import kotlin.coroutines.CoroutineContext;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10223b;

/* JADX INFO: renamed from: qo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C8665k<T> implements InterfaceC9968c<T>, InterfaceC10223b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<T> f46244a;

    /* JADX INFO: renamed from: b */
    public final CoroutineContext f46245b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8665k(InterfaceC9968c<? super T> interfaceC9968c, CoroutineContext coroutineContext) {
        this.f46244a = interfaceC9968c;
        this.f46245b = coroutineContext;
    }

    @Override // p490xl.InterfaceC10223b
    /* JADX INFO: renamed from: d */
    public final InterfaceC10223b mo13473d() {
        InterfaceC9968c<T> interfaceC9968c = this.f46244a;
        if (interfaceC9968c instanceof InterfaceC10223b) {
            return (InterfaceC10223b) interfaceC9968c;
        }
        return null;
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        return this.f46245b;
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) {
        this.f46244a.mo2031y(obj);
    }
}
