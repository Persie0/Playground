package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yi2 implements ro7 {

    /* JADX INFO: renamed from: c */
    public static final Object f69863c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile ro7 f69864a;

    /* JADX INFO: renamed from: b */
    public volatile Object f69865b;

    /* JADX INFO: renamed from: a */
    public static ro7 m25153a(ro7 ro7Var) {
        if (ro7Var instanceof yi2) {
            return ro7Var;
        }
        yi2 yi2Var = new yi2();
        yi2Var.f69865b = f69863c;
        yi2Var.f69864a = ro7Var;
        return yi2Var;
    }

    @Override // p000.so7
    public final Object get() {
        Object obj;
        Object obj2 = this.f69865b;
        Object obj3 = f69863c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f69865b;
            if (obj == obj3) {
                obj = this.f69864a.get();
                Object obj4 = this.f69865b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f69865b = obj;
                this.f69864a = null;
            }
        }
        return obj;
    }
}
