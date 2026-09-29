package p000;

import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.C0115u;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ao8 extends fa2 implements tf1, qp6 {

    /* JADX INFO: renamed from: L */
    public do8 f7293L;

    /* JADX INFO: renamed from: M */
    public Orientation f7294M;

    /* JADX INFO: renamed from: N */
    public boolean f7295N;

    /* JADX INFO: renamed from: O */
    public boolean f7296O;

    /* JADX INFO: renamed from: P */
    public x63 f7297P;

    /* JADX INFO: renamed from: Q */
    public v56 f7298Q;

    /* JADX INFO: renamed from: R */
    public ni0 f7299R;

    /* JADX INFO: renamed from: S */
    public boolean f7300S;

    /* JADX INFO: renamed from: T */
    public C0077c f7301T;

    /* JADX INFO: renamed from: U */
    public C0115u f7302U;

    /* JADX INFO: renamed from: V */
    public ea2 f7303V;

    /* JADX INFO: renamed from: W */
    public C3833zh f7304W;

    /* JADX INFO: renamed from: X */
    public C0077c f7305X;

    /* JADX INFO: renamed from: Y */
    public boolean f7306Y;

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        this.f7306Y = m2957d1();
        m2956c1();
        if (this.f7302U == null) {
            do8 do8Var = this.f7293L;
            C0077c c0077c = this.f7300S ? this.f7305X : this.f7301T;
            C0115u c0115u = new C0115u(this.f7299R, this.f7297P, this.f7298Q, do8Var, c0077c, this.f7294M, this.f7295N, this.f7306Y);
            m11624Z0(c0115u);
            this.f7302U = c0115u;
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        ea2 ea2Var = this.f7303V;
        if (ea2Var != null) {
            m11625a1(ea2Var);
        }
    }

    @Override // p000.ea2
    /* JADX INFO: renamed from: V */
    public final void mo1344V() {
        boolean zM2957d1 = m2957d1();
        if (this.f7306Y != zM2957d1) {
            this.f7306Y = zM2957d1;
            do8 do8Var = this.f7293L;
            Orientation orientation = this.f7294M;
            boolean z = this.f7300S;
            C0077c c0077c = z ? this.f7305X : this.f7301T;
            m2958e1(this.f7299R, this.f7297P, this.f7298Q, do8Var, c0077c, orientation, z, this.f7295N, this.f7296O);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m2956c1() {
        ea2 ea2Var = this.f7303V;
        if (ea2Var != null) {
            if (((d16) ea2Var).f34837a.f34836I) {
                return;
            }
            m11624Z0(ea2Var);
            return;
        }
        if (this.f7300S) {
            AbstractC0356f.m1552b(this, new y47(this, 9));
        }
        C0077c c0077c = this.f7300S ? this.f7305X : this.f7301T;
        if (c0077c != null) {
            fa2 fa2Var = c0077c.f1746i;
            if (fa2Var.f34837a.f34836I) {
                return;
            }
            m11624Z0(fa2Var);
            this.f7303V = fa2Var;
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m2957d1() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (this.f34836I) {
            layoutDirection = te1.m21979L(this).f4328U;
        }
        Orientation orientation = this.f7294M;
        boolean z = this.f7296O;
        return (layoutDirection != LayoutDirection.Rtl || orientation == Orientation.Vertical) ? !z : z;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m2958e1(ni0 ni0Var, x63 x63Var, v56 v56Var, do8 do8Var, C0077c c0077c, Orientation orientation, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.f7293L = do8Var;
        this.f7294M = orientation;
        boolean z5 = true;
        if (this.f7300S != z) {
            this.f7300S = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (fa4.m11650l(this.f7301T, c0077c)) {
            z5 = false;
        } else {
            this.f7301T = c0077c;
        }
        if (z4 || (z5 && !z)) {
            ea2 ea2Var = this.f7303V;
            if (ea2Var != null) {
                m11625a1(ea2Var);
            }
            this.f7303V = null;
            m2956c1();
        }
        this.f7295N = z2;
        this.f7296O = z3;
        this.f7297P = x63Var;
        this.f7298Q = v56Var;
        this.f7299R = ni0Var;
        boolean zM2957d1 = m2957d1();
        this.f7306Y = zM2957d1;
        C0115u c0115u = this.f7302U;
        if (c0115u != null) {
            c0115u.m928u1(ni0Var, x63Var, v56Var, do8Var, this.f7300S ? this.f7305X : this.f7301T, orientation, z2, zM2957d1);
        }
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        C3833zh c3833zh = (C3833zh) thb.m22050i(this, y07.f69056a);
        if (fa4.m11650l(c3833zh, this.f7304W)) {
            return;
        }
        this.f7304W = c3833zh;
        this.f7305X = null;
        ea2 ea2Var = this.f7303V;
        if (ea2Var != null) {
            m11625a1(ea2Var);
        }
        this.f7303V = null;
        m2956c1();
        C0115u c0115u = this.f7302U;
        if (c0115u != null) {
            do8 do8Var = this.f7293L;
            Orientation orientation = this.f7294M;
            C0077c c0077c = this.f7300S ? this.f7305X : this.f7301T;
            c0115u.m928u1(this.f7299R, this.f7297P, this.f7298Q, do8Var, c0077c, orientation, this.f7295N, this.f7306Y);
        }
    }
}
