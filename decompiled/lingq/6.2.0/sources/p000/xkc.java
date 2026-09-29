package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.reader.shared.p018ui.components.AbstractC2508a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xkc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68322a = new C0282a(733150804, false, new be1(9));

    /* JADX INFO: renamed from: a */
    public static final void m24603a(final int i, final int i2, final int i3, final int i4, final boolean z, boolean z2, final boolean z3, final ui3 ui3Var, final ui3 ui3Var2, final ui3 ui3Var3, final ui3 ui3Var4, final vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var5, e16 e16Var, ye1 ye1Var, final int i5, final int i6) {
        vi3 vi3Var3;
        int i7;
        int i8;
        tj3 tj3Var;
        boolean z4;
        final ui3 ui3Var6;
        final e16 e16Var2;
        vi3 vi3Var4;
        ui3 ui3Var7;
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        ui3Var4.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1165270039);
        int i9 = i5 | (tj3Var2.m22116e(i) ? 4 : 2) | (tj3Var2.m22116e(i2) ? 32 : 16) | (tj3Var2.m22116e(i3) ? 256 : 128) | (tj3Var2.m22116e(i4) ? 2048 : 1024) | (tj3Var2.m22122h(z) ? 16384 : 8192) | (tj3Var2.m22122h(z2) ? 131072 : 65536);
        if ((i5 & 1572864) == 0) {
            i9 |= tj3Var2.m22122h(z3) ? 1048576 : 524288;
        }
        int i10 = i9 | (tj3Var2.m22124i(ui3Var) ? 8388608 : 4194304) | (tj3Var2.m22124i(ui3Var2) ? 67108864 : 33554432) | (tj3Var2.m22124i(ui3Var3) ? 536870912 : 268435456);
        int i11 = (tj3Var2.m22124i(ui3Var4) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 32 : 16);
        int i12 = i6 & 4096;
        if (i12 != 0) {
            i7 = i11 | 384;
            vi3Var3 = vi3Var2;
        } else {
            vi3Var3 = vi3Var2;
            i7 = i11 | (tj3Var2.m22124i(vi3Var3) ? 256 : 128);
        }
        int i13 = i6 & 8192;
        if (i13 != 0) {
            i8 = i7 | 3072;
        } else {
            i8 = i7 | (tj3Var2.m22124i(ui3Var5) ? 2048 : 1024);
        }
        int i14 = i8 | 24576;
        if (tj3Var2.m22099R(i10 & 1, ((i10 & 306783379) == 306783378 && (i14 & 9363) == 9362) ? false : true)) {
            p84 p84Var = we1.f66679a;
            if (i12 != 0) {
                Object objM22097O = tj3Var2.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new qv7(4);
                    tj3Var2.m22131l0(objM22097O);
                }
                vi3Var4 = (vi3) objM22097O;
            } else {
                vi3Var4 = vi3Var3;
            }
            if (i13 != 0) {
                Object objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new C3288l7(7);
                    tj3Var2.m22131l0(objM22097O2);
                }
                ui3Var7 = (ui3) objM22097O2;
            } else {
                ui3Var7 = ui3Var5;
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(vz1.m23624c0(b16Var, "reader_top_bar"), 1.0f), 56.0f);
            zf1 zf1Var = ge9.f40637a;
            ui3 ui3Var8 = ui3Var7;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4414g, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a, 0.0f, 2);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var9 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var9);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
            vi3 vi3Var5 = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var5);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
            vi3 vi3Var6 = vi3Var4;
            omd.m18141c(z3 ? ui3Var2 : ui3Var, vz1.m23624c0(b16Var, "reader_top_bar_close"), false, null, null, ci8.m4703P(-1438557799, new c81(9, z3), tj3Var2), tj3Var2, 1572912, 60);
            e16 e16VarM21608U = AbstractC3584sr.m21608U(new as4(1.0f, true), ((fe9) tj3Var2.m22128k(zf1Var)).f38952a, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21608U);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var9);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var5);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
            du7 cu7Var = i2 > 0 ? new cu7(i2, i + 1, i3) : bu7.f9026a;
            boolean z5 = (i14 & 112) == 32;
            Object objM22097O3 = tj3Var2.m22097O();
            if (z5 || objM22097O3 == p84Var) {
                objM22097O3 = new wh7(vi3Var, 16);
                tj3Var2.m22131l0(objM22097O3);
            }
            vi3 vi3Var7 = (vi3) objM22097O3;
            boolean z6 = (i14 & 896) == 256;
            Object objM22097O4 = tj3Var2.m22097O();
            if (z6 || objM22097O4 == p84Var) {
                vi3Var3 = vi3Var6;
                objM22097O4 = new wh7(vi3Var3, 17);
                tj3Var2.m22131l0(objM22097O4);
            } else {
                vi3Var3 = vi3Var6;
            }
            AbstractC2508a.m9431a(null, cu7Var, z, i4, vi3Var7, (vi3) objM22097O4, ui3Var8, tj3Var2, ((i10 >> 6) & 896) | (i10 & 7168) | ((i14 << 9) & 3670016));
            tj3Var2.m22139q(true);
            boolean z7 = !z2;
            z4 = z2;
            omd.m18141c(ui3Var3, vz1.m23624c0(b16Var, "reader_top_bar_theme"), z7, null, null, ci8.m4703P(-1399576624, new c81(10, z4), tj3Var2), tj3Var2, ((i10 >> 27) & 14) | 1572912, 56);
            omd.m18141c(ui3Var4, vz1.m23624c0(b16Var, "reader_top_bar_menu"), z7, null, null, ci8.m4703P(1830423441, new c81(11, z4), tj3Var2), tj3Var2, (i14 & 14) | 1572912, 56);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
            ui3Var6 = ui3Var8;
        } else {
            tj3Var = tj3Var2;
            z4 = z2;
            tj3Var.m22102U();
            ui3Var6 = ui3Var5;
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final boolean z8 = z4;
            final vi3 vi3Var8 = vi3Var3;
            x18VarM22143u.f67642d = new zi3() { // from class: c08
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i5 | 1);
                    xkc.m24603a(i, i2, i3, i4, z, z8, z3, ui3Var, ui3Var2, ui3Var3, ui3Var4, vi3Var, vi3Var8, ui3Var6, e16Var2, (ye1) obj, iM19383z, i6);
                    return xfa.f68157a;
                }
            };
        }
    }
}
