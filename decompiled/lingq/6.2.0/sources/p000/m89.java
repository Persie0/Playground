package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m89 implements ro7 {

    /* JADX INFO: renamed from: c */
    public static final Object f50761c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile ro7 f50762a;

    /* JADX INFO: renamed from: b */
    public volatile Object f50763b;

    /* JADX INFO: renamed from: a */
    public static ro7 m16683a(ro7 ro7Var) {
        if ((ro7Var instanceof m89) || (ro7Var instanceof yi2)) {
            return ro7Var;
        }
        m89 m89Var = new m89();
        m89Var.f50763b = f50761c;
        m89Var.f50762a = ro7Var;
        return m89Var;
    }

    @Override // p000.so7
    public final Object get() {
        Object obj = this.f50763b;
        if (obj != f50761c) {
            return obj;
        }
        ro7 ro7Var = this.f50762a;
        if (ro7Var == null) {
            return this.f50763b;
        }
        Object obj2 = ro7Var.get();
        this.f50763b = obj2;
        this.f50762a = null;
        return obj2;
    }
}
