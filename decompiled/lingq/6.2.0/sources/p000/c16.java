package p000;

/* JADX INFO: loaded from: classes.dex */
public interface c16 extends e16 {
    @Override // p000.e16
    /* JADX INFO: renamed from: a */
    default Object mo1318a(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.e16
    /* JADX INFO: renamed from: c */
    default boolean mo1319c(vi3 vi3Var) {
        return ((Boolean) vi3Var.invoke(this)).booleanValue();
    }
}
