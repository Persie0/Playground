package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class np5 implements rx5 {

    /* JADX INFO: renamed from: a */
    public rx5[] f53096a;

    @Override // p000.rx5
    public final boolean isSupported(Class cls) {
        for (rx5 rx5Var : this.f53096a) {
            if (rx5Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.rx5
    public final fr7 messageInfoFor(Class cls) {
        for (rx5 rx5Var : this.f53096a) {
            if (rx5Var.isSupported(cls)) {
                return rx5Var.messageInfoFor(cls);
            }
        }
        C3386nv.m17636w("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
