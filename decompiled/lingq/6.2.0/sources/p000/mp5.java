package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mp5 implements qx5 {

    /* JADX INFO: renamed from: a */
    public qx5[] f51701a;

    @Override // p000.qx5
    public final boolean isSupported(Class cls) {
        for (qx5 qx5Var : this.f51701a) {
            if (qx5Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.qx5
    public final er7 messageInfoFor(Class cls) {
        for (qx5 qx5Var : this.f51701a) {
            if (qx5Var.isSupported(cls)) {
                return qx5Var.messageInfoFor(cls);
            }
        }
        C3386nv.m17636w("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
