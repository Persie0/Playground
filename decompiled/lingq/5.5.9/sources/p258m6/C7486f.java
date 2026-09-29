package p258m6;

import ae.C0062b;

/* JADX INFO: renamed from: m6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7486f implements InterfaceC7487g<Object> {

    /* JADX INFO: renamed from: a */
    public volatile Object f41370a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC7487g f41371b;

    public C7486f(InterfaceC7487g interfaceC7487g) {
        this.f41371b = interfaceC7487g;
    }

    @Override // p258m6.InterfaceC7487g
    public final Object get() {
        if (this.f41370a == null) {
            synchronized (this) {
                if (this.f41370a == null) {
                    Object obj = this.f41371b.get();
                    C0062b.m345f0(obj);
                    this.f41370a = obj;
                }
            }
        }
        return this.f41370a;
    }
}
