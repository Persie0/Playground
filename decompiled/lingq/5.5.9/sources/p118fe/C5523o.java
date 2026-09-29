package p118fe;

import cf.InterfaceC2005b;

/* JADX INFO: renamed from: fe.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5523o<T> implements InterfaceC2005b<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f34188c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f34189a = f34188c;

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC2005b<T> f34190b;

    public C5523o(InterfaceC2005b<T> interfaceC2005b) {
        this.f34190b = interfaceC2005b;
    }

    @Override // cf.InterfaceC2005b
    public final T get() {
        T t10 = (T) this.f34189a;
        Object obj = f34188c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f34189a;
                if (t10 == obj) {
                    t10 = this.f34190b.get();
                    this.f34189a = t10;
                    this.f34190b = null;
                }
            }
        }
        return t10;
    }
}
