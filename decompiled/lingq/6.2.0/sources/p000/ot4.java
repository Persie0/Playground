package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.node.InterfaceC0354d;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class ot4 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: N */
    public static final lt4 f54961N = new lt4();

    /* JADX INFO: renamed from: J */
    public pt4 f54962J;

    /* JADX INFO: renamed from: K */
    public ii0 f54963K;

    /* JADX INFO: renamed from: L */
    public boolean f54964L;

    /* JADX INFO: renamed from: M */
    public Orientation f54965M;

    /* JADX INFO: renamed from: Z0 */
    public final boolean m18476Z0(jt4 jt4Var, int i) {
        if (i == 5 || i == 6) {
            if (this.f54965M == Orientation.Horizontal) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.f54965M == Orientation.Vertical) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            C3386nv.m17633t("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (m18477a1(i)) {
            if (jt4Var.f46128b >= this.f54962J.mo11505a() - 1) {
                return false;
            }
        } else if (jt4Var.f46127a <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m18477a1(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.f54964L;
            }
            if (i == 6) {
                if (this.f54964L) {
                    return false;
                }
            } else if (i == 3) {
                int i2 = mt4.f51825a[te1.m21979L(this).f4328U.ordinal()];
                if (i2 == 1) {
                    return this.f54964L;
                }
                if (i2 != 2) {
                    gm5.m12750e();
                    return false;
                }
                if (this.f54964L) {
                    return false;
                }
            } else {
                if (i != 4) {
                    C3386nv.m17633t("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int i3 = mt4.f51825a[te1.m21979L(this).f4328U.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.f54964L;
                    }
                    gm5.m12750e();
                    return false;
                }
                if (this.f54964L) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        l87 l87VarMo1514r = ct5Var.mo1514r(j);
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 8));
    }
}
