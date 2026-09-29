package p000;

import androidx.cardview.widget.CardView;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l5d {
    /* JADX INFO: renamed from: a */
    public static final void m15820a(e16 e16Var, float f, final ui3 ui3Var, C0282a c0282a, ye1 ye1Var, int i) {
        e16 e16Var2;
        float f2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1540815001);
        int i2 = i | 54;
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3489q9.m19771a(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            final C0059a c0059a = (C0059a) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1257g(0);
                tj3Var.m22131l0(objM22097O2);
            }
            sc9 sc9Var = (sc9) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new xe2(sc9Var, 2);
                tj3Var.m22131l0(objM22097O3);
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM4429v = c99.m4429v(c99.m4431x(pb1.m19025M(b16Var, (vi3) objM22097O3)));
            boolean zM22124i = tj3Var.m22124i(c0059a);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                objM22097O4 = new cg7(c0059a, 23);
                tj3Var.m22131l0(objM22097O4);
            }
            e16 e16VarM19527w = pvc.m19527w(e16VarM4429v, (vi3) objM22097O4);
            final int iM21222h = sc9Var.m21222h();
            final float f3 = 0.3f;
            e16 e16VarM1320a = AbstractC0287b.m1320a(e16VarM19527w, new aj3() { // from class: vo9
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    e16 e16Var3 = (e16) obj;
                    ((Integer) obj3).getClass();
                    e16Var3.getClass();
                    tj3 tj3Var2 = (tj3) ((ye1) obj2);
                    tj3Var2.m22111b0(853358543);
                    Object objM22097O5 = tj3Var2.m22097O();
                    p84 p84Var2 = we1.f66679a;
                    if (objM22097O5 == p84Var2) {
                        objM22097O5 = d32.m10013K(tj3Var2);
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    un1 un1Var = (un1) objM22097O5;
                    int i3 = iM21222h;
                    Integer numValueOf = Integer.valueOf(i3);
                    float f4 = f3;
                    Float fValueOf = Float.valueOf(f4);
                    boolean zM22116e = tj3Var2.m22116e(i3) | tj3Var2.m22114d(f4);
                    C0059a c0059a2 = c0059a;
                    boolean zM22124i2 = zM22116e | tj3Var2.m22124i(c0059a2) | tj3Var2.m22124i(un1Var);
                    ui3 ui3Var2 = ui3Var;
                    boolean zM22120g = tj3Var2.m22120g(ui3Var2) | zM22124i2;
                    Object objM22097O6 = tj3Var2.m22097O();
                    if (zM22120g || objM22097O6 == p84Var2) {
                        wo9 wo9Var = new wo9(i3, f4, c0059a2, un1Var, ui3Var2);
                        tj3Var2.m22131l0(wo9Var);
                        objM22097O6 = wo9Var;
                    }
                    fg7 fg7Var = mo9.f51649a;
                    e16 e16VarMo3161g = e16Var3.mo3161g(new lo9(numValueOf, fValueOf, null, (PointerInputEventHandler) objM22097O6, 4));
                    tj3Var2.m22139q(false);
                    return e16VarMo3161g;
                }
            });
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM1320a);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            wq1.m24128x((i2 >> 9) & 14, c0282a, tj3Var, true);
            e16Var2 = b16Var;
            f2 = 0.3f;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            f2 = f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fj8(e16Var2, f2, ui3Var, c0282a, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m15821b(C3156jq c3156jq, float f) {
        ni8 ni8Var = (ni8) c3156jq.f45990a;
        CardView cardView = (CardView) c3156jq.f45991b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != ni8Var.f52767e || ni8Var.f52768f != useCompatPadding || ni8Var.f52769g != preventCornerOverlap) {
            ni8Var.f52767e = f;
            ni8Var.f52768f = useCompatPadding;
            ni8Var.f52769g = preventCornerOverlap;
            ni8Var.m17443b(null);
            ni8Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c3156jq.m14604R(0, 0, 0, 0);
            return;
        }
        ni8 ni8Var2 = (ni8) c3156jq.f45990a;
        float f2 = ni8Var2.f52767e;
        float f3 = ni8Var2.f52763a;
        int iCeil = (int) Math.ceil(oi8.m18033a(f2, f3, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(oi8.m18034b(f2, f3, cardView.getPreventCornerOverlap()));
        c3156jq.m14604R(iCeil, iCeil2, iCeil, iCeil2);
    }
}
