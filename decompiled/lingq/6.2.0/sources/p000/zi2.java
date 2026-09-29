package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zi2 implements so7 {

    /* JADX INFO: renamed from: c */
    public static final Object f71590c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile xy2 f71591a;

    /* JADX INFO: renamed from: b */
    public volatile Object f71592b;

    /* JADX INFO: renamed from: a */
    public static so7 m25667a(xy2 xy2Var) {
        if (xy2Var instanceof zi2) {
            return xy2Var;
        }
        zi2 zi2Var = new zi2();
        zi2Var.f71592b = f71590c;
        zi2Var.f71591a = xy2Var;
        return zi2Var;
    }

    @Override // p000.so7
    public final Object get() {
        Object obj;
        Object obj2 = this.f71592b;
        Object obj3 = f71590c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f71592b;
                if (obj == obj3) {
                    obj = this.f71591a.get();
                    Object obj4 = this.f71592b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f71592b = obj;
                    this.f71591a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
