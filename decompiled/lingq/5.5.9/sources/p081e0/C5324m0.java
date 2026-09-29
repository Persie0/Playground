package p081e0;

import dm.C5207g;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: e0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5324m0<T> implements InterfaceC5322l0<T>, InterfaceC5312g0<T> {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f33594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5312g0<T> f33595b;

    public C5324m0(InterfaceC5312g0<T> interfaceC5312g0, CoroutineContext coroutineContext) {
        C5207g.m11111f(interfaceC5312g0, "state");
        C5207g.m11111f(coroutineContext, "coroutineContext");
        this.f33594a = coroutineContext;
        this.f33595b = interfaceC5312g0;
    }

    @Override // no.InterfaceC7882z
    /* JADX INFO: renamed from: G0 */
    public final CoroutineContext mo3889G0() {
        return this.f33594a;
    }

    @Override // p081e0.InterfaceC5301c1
    public final T getValue() {
        return this.f33595b.getValue();
    }

    @Override // p081e0.InterfaceC5312g0
    public final void setValue(T t10) {
        this.f33595b.setValue(t10);
    }
}
