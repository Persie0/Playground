package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ey6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final ey6 f38076c = new ey6(0, 2, 1);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        int i;
        k84 k84Var = (k84) pj3Var.m19200f(0);
        int iM11729c = fb9Var.m11729c((oj3) pj3Var.m19200f(1));
        if (fb9Var.f38819t >= iM11729c) {
            cf1.m4605a("Check failed");
        }
        x74.m24335B(fb9Var, interfaceC3510qt, iM11729c);
        int i2 = fb9Var.f38819t;
        int iM11710E = fb9Var.f38821v;
        while (iM11710E >= 0 && !fb9Var.m11750y(iM11710E)) {
            iM11710E = fb9Var.m11710E(fb9Var.f38801b, iM11710E);
        }
        int iM11746u = iM11710E + 1;
        int iM11717L = 0;
        while (iM11746u < i2) {
            if (fb9Var.m11747v(i2, iM11746u)) {
                if (fb9Var.m11750y(iM11746u)) {
                    iM11717L = 0;
                }
                iM11746u++;
            } else {
                iM11717L += fb9Var.m11750y(iM11746u) ? 1 : fb9Var.f38801b[(fb9Var.m11743r(iM11746u) * 5) + 1] & 67108863;
                iM11746u += fb9Var.m11746u(iM11746u);
            }
        }
        while (true) {
            i = fb9Var.f38819t;
            if (i >= iM11729c) {
                break;
            }
            if (fb9Var.m11747v(iM11729c, i)) {
                int i3 = fb9Var.f38819t;
                if (i3 < fb9Var.f38820u && (fb9Var.f38801b[(fb9Var.m11743r(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC3510qt.mo1300c(fb9Var.m11709D(fb9Var.f38819t));
                    iM11717L = 0;
                }
                fb9Var.m11721P();
            } else {
                iM11717L += fb9Var.m11717L();
            }
        }
        if (i != iM11729c) {
            cf1.m4605a("Check failed");
        }
        k84Var.f46854a = iM11717L;
    }
}
