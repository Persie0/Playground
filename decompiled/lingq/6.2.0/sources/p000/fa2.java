package p000;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.InterfaceC0354d;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa2 extends d16 {

    /* JADX INFO: renamed from: J */
    public final int f38700J = tl6.m22197e(this);

    /* JADX INFO: renamed from: K */
    public d16 f38701K;

    @Override // p000.d16
    /* JADX INFO: renamed from: P0 */
    public final void mo9972P0() {
        super.mo9972P0();
        for (d16 d16Var = this.f38701K; d16Var != null; d16Var = d16Var.f34842f) {
            d16Var.mo9978Y0(this.f34844h);
            if (!d16Var.f34836I) {
                d16Var.mo9972P0();
            }
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: Q0 */
    public final void mo9973Q0() {
        for (d16 d16Var = this.f38701K; d16Var != null; d16Var = d16Var.f34842f) {
            d16Var.mo9973Q0();
        }
        super.mo9973Q0();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: U0 */
    public final void mo9974U0() {
        super.mo9974U0();
        for (d16 d16Var = this.f38701K; d16Var != null; d16Var = d16Var.f34842f) {
            d16Var.mo9974U0();
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: V0 */
    public final void mo9975V0() {
        for (d16 d16Var = this.f38701K; d16Var != null; d16Var = d16Var.f34842f) {
            d16Var.mo9975V0();
        }
        super.mo9975V0();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: W0 */
    public final void mo9976W0() {
        super.mo9976W0();
        for (d16 d16Var = this.f38701K; d16Var != null; d16Var = d16Var.f34842f) {
            d16Var.mo9976W0();
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: X0 */
    public final void mo9977X0(d16 d16Var) {
        this.f34837a = d16Var;
        for (d16 d16Var2 = this.f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
            d16Var2.mo9977X0(d16Var);
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: Y0 */
    public final void mo9978Y0(AbstractC0362l abstractC0362l) {
        this.f34844h = abstractC0362l;
        for (d16 d16Var = this.f38701K; d16Var != null; d16Var = d16Var.f34842f) {
            d16Var.mo9978Y0(abstractC0362l);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final ea2 m11624Z0(ea2 ea2Var) {
        d16 d16Var = ((d16) ea2Var).f34837a;
        if (d16Var != ea2Var) {
            d16 d16Var2 = ea2Var instanceof d16 ? (d16) ea2Var : null;
            d16 d16Var3 = d16Var2 != null ? d16Var2.f34841e : null;
            if (d16Var != this.f34837a || !fa4.m11650l(d16Var3, this)) {
                C3386nv.m17633t("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (d16Var.f34836I) {
                i54.m13663b("Cannot delegate to an already attached node");
            }
            d16Var.mo9977X0(this.f34837a);
            int i = this.f34839c;
            int iM22198f = tl6.m22198f(d16Var);
            d16Var.f34839c = iM22198f;
            int i2 = this.f34839c;
            int i3 = iM22198f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof InterfaceC0354d)) {
                i54.m13663b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + d16Var);
            }
            d16Var.f34842f = this.f38701K;
            this.f38701K = d16Var;
            d16Var.f34841e = this;
            m11626b1(iM22198f | this.f34839c, false);
            if (this.f34836I) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo9978Y0(this.f34844h);
                } else {
                    k40 k40Var = te1.m21979L(this).f4335a0;
                    this.f34837a.mo9978Y0(null);
                    k40Var.m14802i();
                }
                d16Var.mo9972P0();
                d16Var.mo9975V0();
                if (!d16Var.f34836I) {
                    i54.m13663b("autoInvalidateInsertedNode called on unattached node");
                }
                tl6.m22193a(d16Var, -1, 1);
            }
        }
        return ea2Var;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m11625a1(ea2 ea2Var) {
        d16 d16Var = null;
        for (d16 d16Var2 = this.f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
            if (d16Var2 == ea2Var) {
                boolean z = d16Var2.f34836I;
                if (z) {
                    d66 d66Var = tl6.f62483a;
                    if (!z) {
                        i54.m13663b("autoInvalidateRemovedNode called on unattached node");
                    }
                    tl6.m22193a(d16Var2, -1, 2);
                    d16Var2.mo9976W0();
                    d16Var2.mo9973Q0();
                }
                d16Var2.mo9977X0(d16Var2);
                d16Var2.f34840d = 0;
                d16 d16Var3 = d16Var2.f34842f;
                if (d16Var == null) {
                    this.f38701K = d16Var3;
                } else {
                    d16Var.f34842f = d16Var3;
                }
                d16Var2.f34842f = null;
                d16Var2.f34841e = null;
                int i = this.f34839c;
                int iM22198f = tl6.m22198f(this);
                m11626b1(iM22198f, true);
                if (this.f34836I && (i & 2) != 0 && (iM22198f & 2) == 0) {
                    k40 k40Var = te1.m21979L(this).f4335a0;
                    this.f34837a.mo9978Y0(null);
                    k40Var.m14802i();
                    return;
                }
                return;
            }
            d16Var = d16Var2;
        }
        C3386nv.m17632s(ea2Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d16] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: b1 */
    public final void m11626b1(int i, boolean z) {
        d16 d16Var;
        int i2 = this.f34839c;
        this.f34839c = i;
        if (i2 != i) {
            d16 d16Var2 = this.f34837a;
            if (d16Var2 == this) {
                this.f34840d = i;
            }
            boolean z2 = this.f34836I;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f34839c;
                    r2.f34839c = i;
                    if (r2 == d16Var2) {
                        break;
                    } else {
                        r2 = r2.f34841e;
                    }
                }
                if (z && r2 == d16Var2) {
                    i = tl6.m22198f(d16Var2);
                    d16Var2.f34839c = i;
                }
                int i3 = i | ((r2 == 0 || (d16Var = r2.f34842f) == null) ? 0 : d16Var.f34840d);
                for (?? r3 = r2; r3 != 0; r3 = r3.f34841e) {
                    i3 |= r3.f34839c;
                    r3.f34840d = i3;
                }
            }
        }
    }
}
