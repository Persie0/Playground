package p346ql;

import p371rl.InterfaceC8825a;

/* JADX INFO: renamed from: ql.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8642a<T> implements InterfaceC8825a<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f46193c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC8825a<T> f46194a;

    /* JADX INFO: renamed from: b */
    public volatile Object f46195b = f46193c;

    public C8642a(InterfaceC8825a<T> interfaceC8825a) {
        this.f46194a = interfaceC8825a;
    }

    /* JADX INFO: renamed from: a */
    public static <P extends InterfaceC8825a<T>, T> InterfaceC8825a<T> m16861a(P p10) {
        return p10 instanceof C8642a ? p10 : new C8642a(p10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p371rl.InterfaceC8825a
    public final T get() {
        T t10 = (T) this.f46195b;
        Object obj = f46193c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f46195b;
                if (t10 == obj) {
                    t10 = this.f46194a.get();
                    Object obj2 = this.f46195b;
                    if ((obj2 != obj) && obj2 != t10) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t10 + ". This is likely due to a circular dependency.");
                    }
                    this.f46195b = t10;
                    this.f46194a = null;
                }
            }
        }
        return t10;
    }
}
