package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC0104l;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import p000.AbstractC3393o1;
import p000.C0011a9;
import p000.C2951e4;
import p000.C3186kj;
import p000.C3305lo;
import p000.C3386nv;
import p000.C3757xf;
import p000.C3794yf;
import p000.InterfaceC3457pe;
import p000.a82;
import p000.ab1;
import p000.aj3;
import p000.b16;
import p000.b82;
import p000.bb1;
import p000.ci8;
import p000.dh9;
import p000.e16;
import p000.e41;
import p000.e5b;
import p000.eh0;
import p000.fb2;
import p000.fc5;
import p000.g7a;
import p000.h7a;
import p000.hl2;
import p000.ht5;
import p000.ida;
import p000.k73;
import p000.k7a;
import p000.k92;
import p000.l77;
import p000.l7a;
import p000.l92;
import p000.m92;
import p000.mo9;
import p000.nj0;
import p000.nv8;
import p000.oha;
import p000.pb1;
import p000.qh0;
import p000.r46;
import p000.se1;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.vx9;
import p000.vz1;
import p000.we1;
import p000.wfb;
import p000.x17;
import p000.x18;
import p000.xfa;
import p000.xj2;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0251k {

    /* JADX INFO: renamed from: a */
    public static final C0251k f3547a = new C0251k();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1176a(ida idaVar, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16VarM891a;
        ida idaVar2;
        int i2;
        l7a state;
        e16 e16VarM19025M;
        ida idaVar3 = idaVar;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1640665680);
        int i3 = i | (tj3Var2.m22120g(idaVar3) ? 4 : 2);
        int i4 = 0;
        int i5 = 5;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 3) != 2)) {
            float f = idaVar3.f44000n;
            g7a g7aVar = idaVar3.f44003q;
            e5b e5bVar = idaVar3.f44002p;
            k7a k7aVar = idaVar3.f44004r;
            float f2 = idaVar3.f44001o;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                C3386nv.m17626m("The collapsedHeight is expected to be specified and finite");
                return;
            }
            if (Float.isNaN(f2) || (Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) >= 2139095040) {
                C3386nv.m17626m("The expandedHeight is expected to be specified and finite");
                return;
            }
            if (xj2.m24559a(f2, f) < 0) {
                C3386nv.m17626m("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                return;
            }
            int iMo916w0 = ((fb2) tj3Var2.m22128k(AbstractC0402n.f4816h)).mo916w0(idaVar3.f43990d);
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object objM22097O = tj3Var2.m22097O();
            int i7 = 10;
            Object obj = we1.f66679a;
            if (z || objM22097O == obj) {
                objM22097O = new C3757xf(idaVar3, i7);
                tj3Var2.m22131l0(objM22097O);
            }
            ui3 ui3Var = (ui3) objM22097O;
            boolean zM22120g = (i6 == 4) | tj3Var2.m22120g(ui3Var);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22120g || objM22097O2 == obj) {
                objM22097O2 = new m92(idaVar3, ui3Var);
                tj3Var2.m22131l0(objM22097O2);
            }
            ui3 ui3Var2 = (ui3) objM22097O2;
            C0282a c0282aM4703P = ci8.m4703P(-1333673671, new C3186kj(idaVar3, i5), tj3Var2);
            boolean zM22120g2 = tj3Var2.m22120g(ui3Var);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O3 == obj) {
                objM22097O3 = new k92(i4, ui3Var);
                tj3Var2.m22131l0(objM22097O3);
            }
            ui3 ui3Var3 = (ui3) objM22097O3;
            boolean zM22120g3 = tj3Var2.m22120g(ui3Var);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22120g3 || objM22097O4 == obj) {
                objM22097O4 = new k92(1, ui3Var);
                tj3Var2.m22131l0(objM22097O4);
            }
            ui3 ui3Var4 = (ui3) objM22097O4;
            boolean zM22120g4 = tj3Var2.m22120g(ui3Var);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22120g4 || objM22097O5 == obj) {
                objM22097O5 = AbstractC0278f.m1254d(new k92(2, ui3Var));
                tj3Var2.m22131l0(objM22097O5);
            }
            dh9 dh9Var = (dh9) objM22097O5;
            boolean z2 = !((Boolean) dh9Var.getValue()).booleanValue();
            b16 b16Var = b16.f7762a;
            if (k7aVar == null || k7aVar.mo14945c()) {
                tj3Var2.m22111b0(-340524694);
                tj3Var2.m22139q(false);
                e16VarM891a = b16Var;
            } else {
                tj3Var2.m22111b0(-341139672);
                Orientation orientation = Orientation.Vertical;
                boolean z3 = i6 == 4;
                Object objM22097O6 = tj3Var2.m22097O();
                if (z3 || objM22097O6 == obj) {
                    objM22097O6 = new C0011a9(idaVar3, 10);
                    tj3Var2.m22131l0(objM22097O6);
                }
                hl2 hl2VarM892b = AbstractC0104l.m892b(tj3Var2, (vi3) objM22097O6);
                boolean z4 = i6 == 4;
                Object objM22097O7 = tj3Var2.m22097O();
                if (z4 || objM22097O7 == obj) {
                    objM22097O7 = new C0210xfd8dbae5(idaVar3, null);
                    tj3Var2.m22131l0(objM22097O7);
                }
                e16VarM891a = AbstractC0104l.m891a(hl2VarM892b, orientation, false, null, false, (aj3) objM22097O7, false, 188);
                tj3Var2.m22139q(false);
            }
            e16 e16VarMo3161g = idaVar3.f43987a.mo3161g(e16VarM891a);
            boolean zM22120g5 = tj3Var2.m22120g(ui3Var2);
            Object objM22097O8 = tj3Var2.m22097O();
            if (zM22120g5 || objM22097O8 == obj) {
                objM22097O8 = new C3305lo(2, ui3Var2);
                tj3Var2.m22131l0(objM22097O8);
            }
            e16 e16VarM23654x = vz1.m23654x(e16VarMo3161g, (vi3) objM22097O8);
            Object objM22097O9 = tj3Var2.m22097O();
            if (objM22097O9 == obj) {
                objM22097O9 = new C2951e4(19);
                tj3Var2.m22131l0(objM22097O9);
            }
            e16 e16VarM17643c = nv8.m17643c(e16VarM23654x, false, (vi3) objM22097O9);
            Object objM22097O10 = tj3Var2.m22097O();
            if (objM22097O10 == obj) {
                objM22097O10 = b82.f8087c;
                tj3Var2.m22131l0(objM22097O10);
            }
            e16 e16VarM16957a = mo9.m16957a(e16VarM17643c, xfa.f68157a, (PointerInputEventHandler) objM22097O10);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM16957a);
            se1.f60731q.getClass();
            ui3 ui3Var5 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var5);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, b16Var);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var5);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
            e16 e16VarM19046p = pb1.m19046p(wfb.m23904F(b16Var, e5bVar));
            Object objM22097O11 = tj3Var2.m22097O();
            if (objM22097O11 == obj) {
                objM22097O11 = new l92();
                tj3Var2.m22131l0(objM22097O11);
            }
            long j = g7aVar.f40362c;
            long j2 = g7aVar.f40363d;
            long j3 = g7aVar.f40364e;
            long j4 = g7aVar.f40365f;
            zi3 zi3Var5 = idaVar.f43991e;
            vx9 vx9Var = idaVar.f43992f;
            zi3 zi3Var6 = idaVar.f43995i;
            vx9 vx9Var2 = idaVar.f43996j;
            e41 e41Var = eh0.f37240f;
            InterfaceC3457pe interfaceC3457pe = idaVar.f43997k;
            boolean zBooleanValue = ((Boolean) dh9Var.getValue()).booleanValue();
            zi3 zi3Var7 = idaVar.f43998l;
            float f3 = idaVar.f44000n;
            x17 x17Var = h7a.f41916a;
            AbstractC0218a.m1126f(e16VarM19046p, (k73) objM22097O11, j, j2, j4, j3, zi3Var5, vx9Var, zi3Var6, vx9Var2, ui3Var3, e41Var, interfaceC3457pe, 0, zBooleanValue, zi3Var7, c0282aM4703P, f3, x17Var, tj3Var2, 0, 102239280);
            e16 e16VarM19046p2 = pb1.m19046p(wfb.m23904F(b16Var, new fc5(e5bVar, 15)));
            if (k7aVar != null && (state = k7aVar.getState()) != null && (e16VarM19025M = pb1.m19025M(e16VarM19046p2, new C0011a9(state, 2))) != null) {
                e16VarM19046p2 = e16VarM19025M;
            }
            boolean z5 = i6 == 4;
            Object objM22097O12 = tj3Var2.m22097O();
            if (z5 || objM22097O12 == obj) {
                idaVar2 = idaVar;
                i2 = 1;
                objM22097O12 = new a82(idaVar2, i2);
                tj3Var2.m22131l0(objM22097O12);
            } else {
                idaVar2 = idaVar;
                i2 = 1;
            }
            boolean z6 = i2;
            e16 e16Var = e16VarM19046p2;
            idaVar3 = idaVar2;
            AbstractC0218a.m1126f(e16Var, (k73) objM22097O12, g7aVar.f40362c, g7aVar.f40363d, g7aVar.f40365f, g7aVar.f40364e, idaVar2.f43988b, idaVar2.f43989c, idaVar2.f43993g, idaVar2.f43994h, ui3Var4, eh0.f37239e, idaVar2.f43997k, iMo916w0, z2, r46.f58679i, r46.f58680j, f2 - f, x17Var, tj3Var2, 0, 102432816);
            tj3 tj3Var3 = tj3Var2;
            tj3Var3.m22139q(z6);
            tj3Var3.m22139q(z6);
            tj3Var = tj3Var3;
        } else {
            tj3Var2.m22102U();
            tj3Var = tj3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3794yf(this, i, 5, idaVar3);
        }
    }
}
