package p000;

import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.layout.InterfaceC0338e;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0355e;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.platform.C0403o;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class q70 extends d16 implements InterfaceC0354d, ll2, ov8, ng7, h16, e47, yp4, un3, p93, y93, ba3, c17, lj0 {

    /* JADX INFO: renamed from: J */
    public c16 f57334J;

    @Override // p000.ng7
    /* JADX INFO: renamed from: B0 */
    public final boolean mo17410B0() {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        ((pg7) c16Var).f56188d.getClass();
        return true;
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: D */
    public final void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        ((pg7) c16Var).f56188d.m1465c(fg7Var, pointerEventPass);
    }

    @Override // p000.y93
    /* JADX INFO: renamed from: H */
    public final void mo1893H(w93 w93Var) {
        c16 c16Var = this.f57334J;
        i54.m13663b("applyFocusProperties called on wrong node");
        c16Var.getClass();
        throw new ClassCastException();
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        kv8 kv8VarMo12308k = ((mv8) c16Var).mo12308k();
        tv8Var.getClass();
        kv8 kv8Var = (kv8) tv8Var;
        n66 n66Var = kv8Var.f48471a;
        if (kv8VarMo12308k.f48473c) {
            kv8Var.f48473c = true;
        }
        if (kv8VarMo12308k.f48474d) {
            kv8Var.f48474d = true;
        }
        n66 n66Var2 = kv8VarMo12308k.f48471a;
        Object[] objArr = n66Var2.f52400b;
        Object[] objArr2 = n66Var2.f52401c;
        long[] jArr = n66Var2.f52399a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C0427g c0427g = (C0427g) obj;
                        if (!n66Var.m17250b(c0427g)) {
                            n66Var.m17261m(c0427g, obj2);
                        } else if (obj2 instanceof C3024g3) {
                            Object objM17255g = n66Var.m17255g(c0427g);
                            objM17255g.getClass();
                            C3024g3 c3024g3 = (C3024g3) objM17255g;
                            String str = c3024g3.f40090a;
                            if (str == null) {
                                str = ((C3024g3) obj2).f40090a;
                            }
                            xi3 xi3Var = c3024g3.f40091b;
                            if (xi3Var == null) {
                                xi3Var = ((C3024g3) obj2).f40091b;
                            }
                            n66Var.m17261m(c0427g, new C3024g3(str, xi3Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p000.un3
    /* JADX INFO: renamed from: J0 */
    public final void mo953J0(AbstractC0362l abstractC0362l) {
        this.f57334J.getClass();
        throw new ClassCastException();
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: K */
    public final void mo818K() {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        ((pg7) c16Var).f56188d.m1464b();
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: Q */
    public final void mo1343Q() {
        AbstractC3489q9.m19789s(this);
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: R */
    public final void mo17411R() {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        ((pg7) c16Var).f56188d.getClass();
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        m19689Z0(true);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        if (!this.f34836I) {
            i54.m13663b("unInitializeModifier called on unattached node");
        }
        if ((this.f34839c & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).m1731G();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m19689Z0(boolean z) {
        if (!this.f34836I) {
            i54.m13663b("initializeModifier called on unattached node");
        }
        c16 c16Var = this.f57334J;
        if ((this.f34839c & 4) != 0 && !z) {
            d32.m10019Q(this);
        }
        if ((this.f34839c & 2) != 0) {
            ir9 ir9Var = (ir9) te1.m21979L(this).f4335a0.f46678f;
            ir9Var.getClass();
            if (ir9Var.f44462J) {
                AbstractC0362l abstractC0362l = this.f34844h;
                abstractC0362l.getClass();
                ((C0355e) abstractC0362l).m1550I1(this);
                b17 b17Var = abstractC0362l.f4455g0;
                if (b17Var != null) {
                    ((C0403o) b17Var).m1808c();
                }
            }
            if (!z) {
                d32.m10019Q(this);
                te1.m21979L(this).m1566I();
            }
        }
        if (c16Var instanceof ct4) {
            ct4 ct4Var = (ct4) c16Var;
            C0357g c0357gM21979L = te1.m21979L(this);
            switch (ct4Var.f34522a) {
                case 0:
                    ((C0129b) ct4Var.f34523b).f2477j = c0357gM21979L;
                    break;
                case 1:
                    ((C0127b) ct4Var.f34523b).f2447l = c0357gM21979L;
                    break;
                case 2:
                    ((C0144d) ct4Var.f34523b).f2605h = c0357gM21979L;
                    break;
                default:
                    ((xc9) ((AbstractC0150d) ct4Var.f34523b).f2695y).setValue(c0357gM21979L);
                    break;
            }
        }
        int i = this.f34839c;
        if ((i & 16) != 0 && (c16Var instanceof pg7)) {
            ((pg7) c16Var).f56188d.f4127a = this.f34844h;
        }
        if ((i & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).m1731G();
        }
    }

    @Override // p000.lj0
    /* JADX INFO: renamed from: a */
    public final fb2 mo1346a() {
        return te1.m21979L(this).f4327T;
    }

    @Override // p000.h16
    /* JADX INFO: renamed from: a0 */
    public final ho5 mo12997a0() {
        return ho5.f42703g;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: b */
    public final int mo967b(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        return ((InterfaceC0338e) c16Var).m1489b(abstractC0359i, ct5Var, i);
    }

    @Override // p000.yp4, p000.mt5
    /* JADX INFO: renamed from: c */
    public final void mo858c(long j) {
    }

    @Override // p000.e47
    /* JADX INFO: renamed from: d */
    public final Object mo4157d(fb2 fb2Var, Object obj) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        return ((d47) c16Var).mo10090d(fb2Var, obj);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: e */
    public final int mo968e(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        return ((InterfaceC0338e) c16Var).m1490e(abstractC0359i, ct5Var, i);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        return ((InterfaceC0338e) c16Var).mo1491f(jt5Var, ct5Var, j);
    }

    @Override // p000.ea2, p000.ng7
    /* JADX INFO: renamed from: g */
    public final void mo840g() {
        if (this.f57334J instanceof pg7) {
            mo818K();
        }
    }

    @Override // p000.lj0
    public final LayoutDirection getLayoutDirection() {
        return te1.m21979L(this).f4328U;
    }

    @Override // p000.lj0
    /* JADX INFO: renamed from: h */
    public final long mo1347h() {
        return omd.m18152h0(te1.m21976I(this, 128).f49303c);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: i */
    public final int mo969i(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        return ((InterfaceC0338e) c16Var).m1492i(abstractC0359i, ct5Var, i);
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        c0358h.m1614b();
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: j */
    public final int mo970j(AbstractC0359i abstractC0359i, ct5 ct5Var, int i) {
        c16 c16Var = this.f57334J;
        c16Var.getClass();
        return ((InterfaceC0338e) c16Var).m1493j(abstractC0359i, ct5Var, i);
    }

    @Override // p000.p93
    /* JADX INFO: renamed from: j0 */
    public final void mo971j0(FocusStateImpl focusStateImpl) {
        c16 c16Var = this.f57334J;
        i54.m13663b("onFocusEvent called on wrong node");
        c16Var.getClass();
        throw new ClassCastException();
    }

    @Override // p000.yp4
    /* JADX INFO: renamed from: q */
    public final void mo1049q(aq4 aq4Var) {
    }

    public final String toString() {
        return this.f57334J.toString();
    }

    @Override // p000.c17
    /* JADX INFO: renamed from: x */
    public final boolean mo1611x() {
        return this.f34836I;
    }
}
