package p000;

/* JADX INFO: loaded from: classes.dex */
public final class my6 extends gz6 {

    /* JADX INFO: renamed from: d */
    public static final my6 f52038d;

    /* JADX INFO: renamed from: e */
    public static final my6 f52039e;

    /* JADX INFO: renamed from: f */
    public static final my6 f52040f;

    /* JADX INFO: renamed from: g */
    public static final my6 f52041g;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f52042c;

    static {
        int i = 1;
        f52038d = new my6(i, 2, 0);
        int i2 = 1;
        f52039e = new my6(i2, i2, 1);
        f52040f = new my6(i, 2, 2);
        int i3 = 1;
        f52041g = new my6(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my6(int i, int i2, int i3) {
        super(i, i2);
        this.f52042c = i3;
    }

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        switch (this.f52042c) {
            case 0:
                Object objMo0a = ((ui3) pj3Var.m19200f(0)).mo0a();
                oj3 oj3Var = (oj3) pj3Var.m19200f(1);
                int iM19199e = pj3Var.m19199e(0);
                oj3Var.getClass();
                fb9Var.m11726U(fb9Var.m11729c(oj3Var), objMo0a);
                interfaceC3510qt.mo1306l(iM19199e, objMo0a);
                interfaceC3510qt.mo1300c(objMo0a);
                break;
            case 1:
                oj3 oj3Var2 = (oj3) pj3Var.m19200f(0);
                int iM19199e2 = pj3Var.m19199e(0);
                interfaceC3510qt.mo1305k();
                oj3Var2.getClass();
                interfaceC3510qt.mo1298a(iM19199e2, fb9Var.m11709D(fb9Var.m11729c(oj3Var2)));
                break;
            case 2:
                Object objM19200f = pj3Var.m19200f(0);
                oj3 oj3Var3 = (oj3) pj3Var.m19200f(1);
                int iM19199e3 = pj3Var.m19199e(0);
                if (objM19200f instanceof xj3) {
                    xj3 xj3Var = (xj3) objM19200f;
                    ((x66) v48Var.f64848e).m24305c(xj3Var);
                    ((o66) v48Var.f64851h).m17811d(xj3Var);
                }
                Object objM11716K = fb9Var.m11716K(fb9Var.m11729c(oj3Var3), objM19200f, iM19199e3);
                if (objM11716K instanceof xj3) {
                    v48Var.m23104g((xj3) objM11716K);
                } else if (objM11716K instanceof x18) {
                    ((x18) objM11716K).m24237c();
                }
                break;
            default:
                Object objM19200f2 = pj3Var.m19200f(0);
                int iM19199e4 = pj3Var.m19199e(0);
                if (objM19200f2 instanceof xj3) {
                    xj3 xj3Var2 = (xj3) objM19200f2;
                    ((x66) v48Var.f64848e).m24305c(xj3Var2);
                    ((o66) v48Var.f64851h).m17811d(xj3Var2);
                }
                Object objM11716K2 = fb9Var.m11716K(fb9Var.f38819t, objM19200f2, iM19199e4);
                if (objM11716K2 instanceof xj3) {
                    v48Var.m23104g((xj3) objM11716K2);
                } else if (objM11716K2 instanceof x18) {
                    ((x18) objM11716K2).m24237c();
                }
                break;
        }
    }

    @Override // p000.gz6
    /* JADX INFO: renamed from: b */
    public oj3 mo12972b(pj3 pj3Var) {
        switch (this.f52042c) {
            case 0:
                return (oj3) pj3Var.m19200f(1);
            case 1:
                return (oj3) pj3Var.m19200f(0);
            default:
                return super.mo12972b(pj3Var);
        }
    }
}
