package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pn9 implements on9 {

    /* JADX INFO: renamed from: d */
    public static final p72 f56530d = new p72(2);

    /* JADX INFO: renamed from: a */
    public final Object f56531a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile on9 f56532b;

    /* JADX INFO: renamed from: c */
    public Object f56533c;

    public pn9(on9 on9Var) {
        on9Var.getClass();
        this.f56532b = on9Var;
    }

    @Override // p000.on9
    public final Object get() {
        on9 on9Var = this.f56532b;
        p72 p72Var = f56530d;
        if (on9Var != p72Var) {
            synchronized (this.f56531a) {
                try {
                    if (this.f56532b != p72Var) {
                        Object obj = this.f56532b.get();
                        this.f56533c = obj;
                        this.f56532b = p72Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f56533c;
    }

    public final String toString() {
        Object obj = this.f56532b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f56530d) {
            obj = "<supplier that returned " + this.f56533c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
