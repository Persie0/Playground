package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface vc1 {
    /* JADX INFO: renamed from: a */
    default Object mo4926a(Class cls) {
        return mo4932g(rp7.m20740a(cls));
    }

    /* JADX INFO: renamed from: b */
    default Set mo4927b(rp7 rp7Var) {
        return (Set) mo4929d(rp7Var).get();
    }

    /* JADX INFO: renamed from: c */
    default uo7 mo4928c(Class cls) {
        return mo4931f(rp7.m20740a(cls));
    }

    /* JADX INFO: renamed from: d */
    uo7 mo4929d(rp7 rp7Var);

    /* JADX INFO: renamed from: e */
    qz6 mo4930e(rp7 rp7Var);

    /* JADX INFO: renamed from: f */
    uo7 mo4931f(rp7 rp7Var);

    /* JADX INFO: renamed from: g */
    default Object mo4932g(rp7 rp7Var) {
        uo7 uo7VarMo4931f = mo4931f(rp7Var);
        if (uo7VarMo4931f == null) {
            return null;
        }
        return uo7VarMo4931f.get();
    }
}
