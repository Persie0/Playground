package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lp5 implements px5 {

    /* JADX INFO: renamed from: a */
    public px5[] f49978a;

    @Override // p000.px5
    public final boolean isSupported(Class cls) {
        for (px5 px5Var : this.f49978a) {
            if (px5Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.px5
    public final dr7 messageInfoFor(Class cls) {
        for (px5 px5Var : this.f49978a) {
            if (px5Var.isSupported(cls)) {
                return px5Var.messageInfoFor(cls);
            }
        }
        C3386nv.m17636w("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
