package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lnc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f49875a = new C0282a(-836253316, false, new de1(3));

    /* JADX INFO: renamed from: b */
    public static final C0282a f49876b = new C0282a(459735882, false, new be1(28));

    /* JADX INFO: renamed from: a */
    public static final void m16398a(final e16 e16Var, final ArrayList arrayList, final long j, final long j2, final boolean z, float f, ye1 ye1Var, final int i) {
        tj3 tj3Var;
        final float f2;
        Object a87Var;
        boolean z2;
        float f3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1939716625);
        int i2 = i | (tj3Var2.m22124i(arrayList) ? 32 : 16) | (tj3Var2.m22118f(j) ? 256 : 128) | (tj3Var2.m22118f(j2) ? 2048 : 1024) | 196608;
        if (tj3Var2.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            float f4 = 1.0f;
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), 140.0f);
            boolean zM22124i = ((i2 & 896) == 256) | tj3Var2.m22124i(arrayList) | ((i2 & 7168) == 2048);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                a87Var = new a87(arrayList, j2, j);
                tj3Var2.m22131l0(a87Var);
            } else {
                a87Var = objM22097O;
            }
            eh0.m11124d(e16VarM4414g, (vi3) a87Var, tj3Var2, 0);
            if (!z || arrayList.isEmpty()) {
                tj3Var = tj3Var2;
                z2 = true;
                f3 = 140.0f;
                tj3Var.m22111b0(-2113557207);
                tj3Var.m22139q(false);
            } else {
                tj3Var2.m22111b0(-2114143417);
                e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38955d, 0.0f, 0.0f, 13);
                boolean z3 = false;
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var2, 0);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                tj3Var2.m22111b0(749258628);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = ((lc5) it.next()).f49472a;
                    vh9 vh9Var = ps5.f56764b;
                    tj3 tj3Var3 = tj3Var2;
                    lw9.m16554b(str, new as4(f4, true), ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71411o, tj3Var3, 0, 0, 130040);
                    tj3Var2 = tj3Var3;
                    f4 = f4;
                    z3 = false;
                }
                boolean z4 = z3;
                tj3Var = tj3Var2;
                z2 = true;
                f3 = 140.0f;
                AbstractC3393o1.m17723A(tj3Var, z4, true, z4);
            }
            tj3Var.m22139q(z2);
            f2 = f3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            f2 = f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(arrayList, j, j2, z, f2, i) { // from class: s48

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ArrayList f60300b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f60301c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f60302d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f60303e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ float f60304f;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(24583);
                    lnc.m16398a(this.f60299a, this.f60300b, this.f60301c, this.f60302d, this.f60303e, this.f60304f, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
