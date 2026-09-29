package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xi2 implements qo7 {

    /* JADX INFO: renamed from: c */
    public static final Object f68246c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile vy2 f68247a;

    /* JADX INFO: renamed from: b */
    public volatile Object f68248b;

    /* JADX INFO: renamed from: a */
    public static qo7 m24525a(vy2 vy2Var) {
        if (vy2Var instanceof xi2) {
            return vy2Var;
        }
        xi2 xi2Var = new xi2();
        xi2Var.f68248b = f68246c;
        xi2Var.f68247a = vy2Var;
        return xi2Var;
    }

    @Override // p000.so7
    public final Object get() {
        Object obj;
        Object obj2 = this.f68248b;
        Object obj3 = f68246c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f68248b;
            if (obj == obj3) {
                obj = this.f68247a.get();
                Object obj4 = this.f68248b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f68248b = obj;
                this.f68247a = null;
            }
        }
        return obj;
    }
}
