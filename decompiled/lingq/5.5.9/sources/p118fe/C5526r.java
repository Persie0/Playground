package p118fe;

import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import p290o6.C7946b;
import p291o7.C8002l;

/* JADX INFO: renamed from: fe.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5526r<T> implements InterfaceC2005b<T>, InterfaceC2004a<T> {

    /* JADX INFO: renamed from: c */
    public static final C8002l f34194c = new C8002l(22);

    /* JADX INFO: renamed from: d */
    public static final C5525q f34195d = new C5525q(0);

    /* JADX INFO: renamed from: a */
    public InterfaceC2004a.a<T> f34196a;

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC2005b<T> f34197b;

    public C5526r(C8002l c8002l, InterfaceC2005b interfaceC2005b) {
        this.f34196a = c8002l;
        this.f34197b = interfaceC2005b;
    }

    /* JADX INFO: renamed from: a */
    public final void m11764a(InterfaceC2004a.a<T> aVar) {
        InterfaceC2005b<T> interfaceC2005b;
        InterfaceC2005b<T> interfaceC2005b2;
        InterfaceC2005b<T> interfaceC2005b3 = this.f34197b;
        C5525q c5525q = f34195d;
        if (interfaceC2005b3 != c5525q) {
            aVar.mo5937f(interfaceC2005b3);
            return;
        }
        synchronized (this) {
            try {
                interfaceC2005b = this.f34197b;
                if (interfaceC2005b != c5525q) {
                    interfaceC2005b2 = interfaceC2005b;
                } else {
                    this.f34196a = new C7946b(this.f34196a, 9, aVar);
                    interfaceC2005b2 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC2005b2 != null) {
            aVar.mo5937f(interfaceC2005b);
        }
    }

    @Override // cf.InterfaceC2005b
    public final T get() {
        return this.f34197b.get();
    }
}
