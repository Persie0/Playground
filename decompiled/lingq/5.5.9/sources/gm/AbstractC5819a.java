package gm;

import dm.C5207g;
import km.InterfaceC6727j;

/* JADX INFO: renamed from: gm.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5819a<V> {

    /* JADX INFO: renamed from: a */
    public V f35128a;

    public AbstractC5819a(V v10) {
        this.f35128a = v10;
    }

    /* JADX INFO: renamed from: a */
    public void mo12227a(InterfaceC6727j interfaceC6727j) {
        C5207g.m11111f(interfaceC6727j, "property");
    }

    /* JADX INFO: renamed from: b */
    public final V m12228b(Object obj, InterfaceC6727j<?> interfaceC6727j) {
        C5207g.m11111f(interfaceC6727j, "property");
        return this.f35128a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m12229c(Object obj, InterfaceC6727j interfaceC6727j) {
        C5207g.m11111f(interfaceC6727j, "property");
        mo12227a(interfaceC6727j);
        this.f35128a = obj;
    }
}
