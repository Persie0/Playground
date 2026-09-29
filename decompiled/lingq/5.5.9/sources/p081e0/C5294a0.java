package p081e0;

import cm.InterfaceC2041a;
import dm.C5207g;
import kotlin.C6740a;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: e0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5294a0<T> implements InterfaceC5301c1<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9070c f33566a;

    public C5294a0(InterfaceC2041a<? extends T> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "valueProducer");
        this.f33566a = C6740a.m13372a(interfaceC2041a);
    }

    @Override // p081e0.InterfaceC5301c1
    public final T getValue() {
        return (T) this.f33566a.getValue();
    }
}
