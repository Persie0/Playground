package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yy6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final yy6 f70645c = new yy6(0, 1, 1);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        x18 x18Var = (x18) pj3Var.m19200f(0);
        n66 n66Var = (n66) v48Var.f64853j;
        j67 j67Var = n66Var != null ? (j67) n66Var.m17255g(x18Var) : null;
        if (j67Var != null) {
            ArrayList arrayList = v48Var.f64844a;
            if (arrayList == null) {
                arrayList = new ArrayList();
                v48Var.f64844a = arrayList;
            }
            arrayList.add((x66) v48Var.f64848e);
            v48Var.f64848e = j67Var.f45120b;
        }
    }
}
