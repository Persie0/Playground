package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bz6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final bz6 f9199c = new bz6(1, 0, 2);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        int iM19199e = pj3Var.m19199e(0);
        int i = fb9Var.f38821v;
        int iM11719N = fb9Var.m11719N(fb9Var.f38801b, fb9Var.m11743r(i));
        int iM11733g = fb9Var.m11733g(fb9Var.f38801b, fb9Var.m11743r(i + 1));
        for (int iMax = Math.max(iM11719N, iM11733g - iM19199e); iMax < iM11733g; iMax++) {
            Object obj = fb9Var.f38802c[fb9Var.m11734h(iMax)];
            if (obj instanceof xj3) {
                v48Var.m23104g((xj3) obj);
            } else if (obj instanceof x18) {
                ((x18) obj).m24237c();
            }
        }
        if (iM19199e <= 0) {
            cf1.m4605a("Check failed");
        }
        int i2 = fb9Var.f38821v;
        int iM11719N2 = fb9Var.m11719N(fb9Var.f38801b, fb9Var.m11743r(i2));
        int iM11733g2 = fb9Var.m11733g(fb9Var.f38801b, fb9Var.m11743r(i2 + 1)) - iM19199e;
        if (iM11733g2 < iM11719N2) {
            cf1.m4605a("Check failed");
        }
        fb9Var.m11715J(iM11733g2, iM19199e, i2);
        int i3 = fb9Var.f38808i;
        if (i3 >= iM11719N2) {
            fb9Var.f38808i = i3 - iM19199e;
        }
    }
}
