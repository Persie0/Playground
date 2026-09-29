package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class gp5 implements ph7 {

    /* JADX INFO: renamed from: a */
    public final m58 f41145a;

    /* JADX INFO: renamed from: b */
    public n84 f41146b;

    /* JADX INFO: renamed from: c */
    public LayoutDirection f41147c;

    /* JADX INFO: renamed from: d */
    public n84 f41148d;

    /* JADX INFO: renamed from: e */
    public f84 f41149e;

    public gp5(m58 m58Var) {
        this.f41145a = m58Var;
    }

    @Override // p000.ph7
    /* JADX INFO: renamed from: f */
    public final long mo12788f(j84 j84Var, long j, LayoutDirection layoutDirection, long j2) {
        f84 f84Var = this.f41149e;
        if (f84Var != null) {
            n84 n84Var = this.f41146b;
            if ((n84Var == null ? false : n84.m17279a(n84Var.f52482a, j)) && this.f41147c == layoutDirection) {
                n84 n84Var2 = this.f41148d;
                if (n84Var2 != null ? n84.m17279a(n84Var2.f52482a, j2) : false) {
                    return f84Var.f38612a;
                }
            }
        }
        long jMo12788f = this.f41145a.mo12788f(j84Var, j, layoutDirection, j2);
        this.f41146b = new n84(j);
        this.f41147c = layoutDirection;
        this.f41148d = new n84(j2);
        this.f41149e = new f84(jMo12788f);
        return jMo12788f;
    }
}
