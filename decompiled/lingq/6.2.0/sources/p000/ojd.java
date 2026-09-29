package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.vocabulary.C2610a;
import com.lingq.feature.reader.vocabulary.model.VocabularyType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ojd {
    /* JADX INFO: renamed from: a */
    public static final void m18053a(boolean z, C2610a c2610a, ui3 ui3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        C2610a c2610a2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1928963264);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2610a2 = (C2610a) pfa.m19114d(y38.m24933a(C2610a.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i3 = i2 & (-113);
                }
            } else {
                tj3Var.m22102U();
                i3 = i2 & (-113);
                c2610a2 = c2610a;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2610a2.f31670p, tj3Var);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2610a2.f31675u, tj3Var);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2610a2.f31677w, tj3Var);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2610a2.f31655C, tj3Var);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM10007D = d32.m10007D(e16VarM4411d, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55872p, ss5.f61356d);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            if (z) {
                i4 = 2048;
                z2 = true;
                z3 = false;
                tj3Var.m22111b0(150967384);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(150273542);
                e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, 1);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                z2 = true;
                z3 = false;
                omd.m18141c(ui3Var, null, false, null, null, wxb.f67490a, tj3Var, ((i3 >> 6) & 14) | 1572864, 62);
                i4 = 2048;
                lw9.m16554b(vz1.m23620a0(tj3Var, R$string.lesson_lesson_vocabulary), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 131070);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            vs3 vs3Var = (vs3) t66VarM2513c4.getValue();
            List list = (List) t66VarM2513c.getValue();
            boolean zBooleanValue = ((Boolean) t66VarM2513c2.getValue()).booleanValue();
            int iOrdinal = ((VocabularyType) t66VarM2513c3.getValue()).ordinal();
            boolean zM22124i = tj3Var.m22124i(c2610a2);
            Object objM22097O = tj3Var.m22097O();
            int i5 = 7;
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new fy4(c2610a2, 7);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var3 = (vi3) objM22097O;
            int i6 = i3 & 7168;
            boolean z4 = i6 == i4 ? z2 : z3;
            Object objM22097O2 = tj3Var.m22097O();
            if (z4 || objM22097O2 == p84Var) {
                objM22097O2 = new te0(vi3Var, 28);
                tj3Var.m22131l0(objM22097O2);
            }
            vi3 vi3Var4 = (vi3) objM22097O2;
            boolean z5 = i6 == i4 ? z2 : z3;
            Object objM22097O3 = tj3Var.m22097O();
            if (z5 || objM22097O3 == p84Var) {
                objM22097O3 = new ks3(vi3Var, i5);
                tj3Var.m22131l0(objM22097O3);
            }
            zi3 zi3Var5 = (zi3) objM22097O3;
            boolean z6 = i6 == i4 ? true : z3;
            Object objM22097O4 = tj3Var.m22097O();
            if (z6 || objM22097O4 == p84Var) {
                objM22097O4 = new te0(vi3Var, 29);
                tj3Var.m22131l0(objM22097O4);
            }
            vi3 vi3Var5 = (vi3) objM22097O4;
            boolean z7 = i6 == i4 ? true : z3;
            Object objM22097O5 = tj3Var.m22097O();
            if (z7 || objM22097O5 == p84Var) {
                objM22097O5 = new ks3(vi3Var, 8);
                tj3Var.m22131l0(objM22097O5);
            }
            zi3 zi3Var6 = (zi3) objM22097O5;
            boolean z8 = i6 == i4;
            Object objM22097O6 = tj3Var.m22097O();
            if (z8 || objM22097O6 == p84Var) {
                objM22097O6 = new i75(vi3Var, 0);
                tj3Var.m22131l0(objM22097O6);
            }
            tj3 tj3Var2 = tj3Var;
            mjd.m16863a(iOrdinal, list, zBooleanValue, vs3Var, vi3Var3, vi3Var4, zi3Var5, vi3Var5, zi3Var6, (vi3) objM22097O6, tj3Var2, 0);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            c2610a2 = c2610a;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3294ld(z, c2610a2, ui3Var, vi3Var, i, 3);
        }
    }
}
