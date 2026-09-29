package p503y8;

import p371rl.InterfaceC8825a;

/* JADX INFO: renamed from: y8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10305a<T> implements InterfaceC8825a<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f51834c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC8825a<T> f51835a;

    /* JADX INFO: renamed from: b */
    public volatile Object f51836b = f51834c;

    public C10305a(InterfaceC10306b interfaceC10306b) {
        this.f51835a = interfaceC10306b;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC8825a m19313a(InterfaceC10306b interfaceC10306b) {
        return interfaceC10306b instanceof C10305a ? interfaceC10306b : new C10305a(interfaceC10306b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p371rl.InterfaceC8825a
    public final T get() {
        T t10 = (T) this.f51836b;
        Object obj = f51834c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f51836b;
                if (t10 == obj) {
                    t10 = this.f51835a.get();
                    Object obj2 = this.f51836b;
                    if ((obj2 != obj) && obj2 != t10) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t10 + ". This is likely due to a circular dependency.");
                    }
                    this.f51836b = t10;
                    this.f51835a = null;
                }
            }
        }
        return t10;
    }
}
