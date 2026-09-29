package androidx.compose.material3;

import androidx.compose.animation.AbstractC0072k;
import androidx.compose.foundation.gestures.AbstractC0104l;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import p000.C0011a9;
import p000.C2951e4;
import p000.C3186kj;
import p000.C3288l7;
import p000.C3386nv;
import p000.C3794yf;
import p000.a82;
import p000.aa1;
import p000.aj3;
import p000.b16;
import p000.b82;
import p000.c82;
import p000.ci8;
import p000.dh9;
import p000.e16;
import p000.e41;
import p000.ec0;
import p000.eh0;
import p000.g7a;
import p000.hl2;
import p000.ht5;
import p000.k73;
import p000.k7a;
import p000.l77;
import p000.l7a;
import p000.mo9;
import p000.nj0;
import p000.nv8;
import p000.o89;
import p000.oha;
import p000.p84;
import p000.pb1;
import p000.qh0;
import p000.se1;
import p000.ss5;
import p000.t17;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.vx9;
import p000.vz1;
import p000.we1;
import p000.wfb;
import p000.x18;
import p000.xfa;
import p000.ye1;
import p000.z72;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0249j {

    /* JADX INFO: renamed from: a */
    public static final C0249j f3538a = new C0249j();

    /* JADX INFO: renamed from: a */
    public final void m1175a(o89 o89Var, ye1 ye1Var, int i) {
        e16 e16VarM891a;
        l7a state;
        e16 e16VarM19025M;
        float f = o89Var.f54010h;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2137486921);
        int i2 = 2;
        int i3 = 4;
        int i4 = i | (tj3Var.m22120g(o89Var) ? 4 : 2);
        if (tj3Var.m22099R(i4 & 1, (i4 & 3) != 2)) {
            g7a g7aVar = o89Var.f54013k;
            k7a k7aVar = o89Var.f54014l;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                C3386nv.m17626m("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zM22120g = tj3Var.m22120g(g7aVar) | tj3Var.m22120g(k7aVar);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1254d(new c82(o89Var, 0));
                tj3Var.m22131l0(objM22097O);
            }
            dh9 dh9VarM785b = AbstractC0072k.m785b(((aa1) ((dh9) objM22097O).getValue()).f414a, ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var), null, tj3Var, 0, 12);
            C0282a c0282aM4703P = ci8.m4703P(-1658896622, new C3186kj(o89Var, i3), tj3Var);
            b16 b16Var = b16.f7762a;
            if (k7aVar == null || k7aVar.mo14945c()) {
                tj3Var.m22111b0(690075377);
                tj3Var.m22139q(false);
                e16VarM891a = b16Var;
            } else {
                tj3Var.m22111b0(689460399);
                Orientation orientation = Orientation.Vertical;
                int i5 = i4 & 14;
                boolean z = i5 == 4;
                Object objM22097O2 = tj3Var.m22097O();
                if (z || objM22097O2 == p84Var) {
                    objM22097O2 = new C0011a9(o89Var, 9);
                    tj3Var.m22131l0(objM22097O2);
                }
                hl2 hl2VarM892b = AbstractC0104l.m892b(tj3Var, (vi3) objM22097O2);
                boolean z2 = i5 == 4;
                Object objM22097O3 = tj3Var.m22097O();
                if (z2 || objM22097O3 == p84Var) {
                    objM22097O3 = new C0209xe04953c5(o89Var, null);
                    tj3Var.m22131l0(objM22097O3);
                }
                e16VarM891a = AbstractC0104l.m891a(hl2VarM892b, orientation, false, null, false, (aj3) objM22097O3, false, 188);
                tj3Var.m22139q(false);
            }
            e16 e16VarMo3161g = o89Var.f54003a.mo3161g(e16VarM891a);
            boolean zM22120g2 = tj3Var.m22120g(dh9VarM785b);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O4 == p84Var) {
                objM22097O4 = new z72(dh9VarM785b, 0);
                tj3Var.m22131l0(objM22097O4);
            }
            e16 e16VarM23654x = vz1.m23654x(e16VarMo3161g, (vi3) objM22097O4);
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = new C2951e4(18);
                tj3Var.m22131l0(objM22097O5);
            }
            e16 e16VarM17643c = nv8.m17643c(e16VarM23654x, false, (vi3) objM22097O5);
            Object objM22097O6 = tj3Var.m22097O();
            if (objM22097O6 == p84Var) {
                objM22097O6 = b82.f8086b;
                tj3Var.m22131l0(objM22097O6);
            }
            e16 e16VarM16957a = mo9.m16957a(e16VarM17643c, xfa.f68157a, (PointerInputEventHandler) objM22097O6);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM16957a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            e16 e16VarM19046p = pb1.m19046p(wfb.m23904F(b16Var, o89Var.f54012j));
            zf1 zf1Var = AbstractC0218a.f3361a;
            if (k7aVar != null && (state = k7aVar.getState()) != null && (e16VarM19025M = pb1.m19025M(e16VarM19046p, new C0011a9(state, i2))) != null) {
                e16VarM19046p = e16VarM19025M;
            }
            boolean z3 = (i4 & 14) == 4;
            Object objM22097O7 = tj3Var.m22097O();
            if (z3 || objM22097O7 == p84Var) {
                objM22097O7 = new a82(o89Var, 0);
                tj3Var.m22131l0(objM22097O7);
            }
            k73 k73Var = (k73) objM22097O7;
            long j = g7aVar.f40362c;
            long j2 = g7aVar.f40363d;
            long j3 = g7aVar.f40364e;
            long j4 = g7aVar.f40365f;
            zi3 zi3Var = o89Var.f54004b;
            vx9 vx9Var = o89Var.f54005c;
            vx9 vx9Var2 = o89Var.f54006d;
            e41 e41Var = eh0.f37240f;
            ec0 ec0Var = o89Var.f54007e;
            e16 e16Var = e16VarM19046p;
            zi3 zi3Var2 = o89Var.f54008f;
            float f2 = o89Var.f54010h;
            t17 t17Var = o89Var.f54011i;
            Object objM22097O8 = tj3Var.m22097O();
            if (objM22097O8 == p84Var) {
                objM22097O8 = new C3288l7(14);
                tj3Var.m22131l0(objM22097O8);
            }
            AbstractC0218a.m1126f(e16Var, k73Var, j, j2, j4, j3, zi3Var, vx9Var, null, vx9Var2, (ui3) objM22097O8, e41Var, ec0Var, 0, false, zi3Var2, c0282aM4703P, f2, t17Var, tj3Var, 0, 1600566);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3794yf(this, i, 4, o89Var);
        }
    }
}
