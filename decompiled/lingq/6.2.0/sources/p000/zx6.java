package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zx6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final zx6 f72343c = new zx6(0, 2, 1);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        oj3 oj3Var = (oj3) pj3Var.m19200f(0);
        Object objM19200f = pj3Var.m19200f(1);
        if (objM19200f instanceof xj3) {
            xj3 xj3Var = (xj3) objM19200f;
            ((x66) v48Var.f64848e).m24305c(xj3Var);
            ((o66) v48Var.f64851h).m17811d(xj3Var);
        }
        if (fb9Var.f38813n != 0) {
            cf1.m4605a("Can only append a slot if not current inserting");
        }
        int i = fb9Var.f38808i;
        int i2 = fb9Var.f38809j;
        int iM11729c = fb9Var.m11729c(oj3Var);
        int iM11733g = fb9Var.m11733g(fb9Var.f38801b, fb9Var.m11743r(iM11729c + 1));
        fb9Var.f38808i = iM11733g;
        fb9Var.f38809j = iM11733g;
        fb9Var.m11749x(1, iM11729c);
        if (i >= iM11733g) {
            i++;
            i2++;
        }
        fb9Var.f38802c[iM11733g] = objM19200f;
        fb9Var.f38808i = i;
        fb9Var.f38809j = i2;
    }
}
