package p374s;

import cm.InterfaceC2052l;
import dm.C5207g;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8908g0<T, V extends AbstractC8911i> implements InterfaceC8906f0<T, V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<T, V> f46812a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<V, T> f46813b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8908g0(InterfaceC2052l<? super T, ? extends V> interfaceC2052l, InterfaceC2052l<? super V, ? extends T> interfaceC2052l2) {
        C5207g.m11111f(interfaceC2052l, "convertToVector");
        C5207g.m11111f(interfaceC2052l2, "convertFromVector");
        this.f46812a = interfaceC2052l;
        this.f46813b = interfaceC2052l2;
    }

    @Override // p374s.InterfaceC8906f0
    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<T, V> mo17140a() {
        return this.f46812a;
    }

    @Override // p374s.InterfaceC8906f0
    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<V, T> mo17141b() {
        return this.f46813b;
    }
}
