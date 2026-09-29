package p346ql;

import mk.C7633z0;
import p371rl.InterfaceC8825a;

/* JADX INFO: renamed from: ql.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8643b<T> implements InterfaceC8825a<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f46196c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC8825a<T> f46197a;

    /* JADX INFO: renamed from: b */
    public volatile Object f46198b = f46196c;

    public C8643b(C7633z0.a aVar) {
        this.f46197a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC8825a m16862a(C7633z0.a aVar) {
        if (!(aVar instanceof C8643b) && !(aVar instanceof C8642a)) {
            return new C8643b(aVar);
        }
        return aVar;
    }

    @Override // p371rl.InterfaceC8825a
    public final T get() {
        T t10 = (T) this.f46198b;
        if (t10 != f46196c) {
            return t10;
        }
        InterfaceC8825a<T> interfaceC8825a = this.f46197a;
        if (interfaceC8825a == null) {
            return (T) this.f46198b;
        }
        T t11 = interfaceC8825a.get();
        this.f46198b = t11;
        this.f46197a = null;
        return t11;
    }
}
