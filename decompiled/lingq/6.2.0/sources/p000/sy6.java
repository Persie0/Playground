package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sy6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final sy6 f61628c = new sy6(0, 1, 1);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        x18 x18Var = (x18) pj3Var.m19200f(0);
        Set set = (Set) v48Var.f64845b;
        if (set == null) {
            return;
        }
        j67 j67Var = new j67(set);
        n66 n66Var = (n66) v48Var.f64853j;
        if (n66Var == null) {
            long[] jArr = om8.f54590a;
            n66Var = new n66();
            v48Var.f64853j = n66Var;
        }
        n66Var.m17261m(x18Var, j67Var);
        ((x66) v48Var.f64848e).m24305c(new xj3(j67Var, -1));
    }
}
