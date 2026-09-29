package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bf5 {
    /* JADX INFO: renamed from: a */
    public static n94 m3683a(Object obj, long j) {
        n94 n94Var = (n94) aha.f677c.m24507i(obj, j);
        if (((AbstractC3356n1) n94Var).f52152a) {
            return n94Var;
        }
        int size = n94Var.size();
        n94 n94VarMutableCopyWithCapacity = n94Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        aha.m420p(obj, j, n94VarMutableCopyWithCapacity);
        return n94VarMutableCopyWithCapacity;
    }
}
