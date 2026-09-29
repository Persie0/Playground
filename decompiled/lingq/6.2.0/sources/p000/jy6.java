package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jy6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final jy6 f46392c = new jy6(0, 1, 1);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        x66 x66Var;
        x18 x18Var = (x18) pj3Var.m19200f(0);
        n66 n66Var = (n66) v48Var.f64853j;
        if (n66Var == null || ((j67) n66Var.m17255g(x18Var)) == null) {
            return;
        }
        ArrayList arrayList = v48Var.f64844a;
        if (arrayList != null && (x66Var = (x66) arrayList.remove(arrayList.size() - 1)) != null) {
            v48Var.f64848e = x66Var;
        }
        n66Var.m17259k(x18Var);
    }
}
