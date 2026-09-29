package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class czc {
    /* JADX INFO: renamed from: a */
    public static final void m9945a(int i, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var, e16 e16Var, String str, String str2, boolean z) {
        e16 e16Var2;
        str.getClass();
        str2.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1069470347);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192) | 196608;
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            List listM18280t = AbstractC3423or.m18280t(str);
            gxb.m12968d(vz1.m23620a0(tj3Var, R$string.onboarding_v2_accent_title), z, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue), ui3Var, vz1.m23620a0(tj3Var, R$string.onboarding_v2_accent_subtitle), ci8.m4703P(451891409, new C3357n2((Object) listM18280t, (Object) str, (Object) str2, (Object) vi3Var, 0), tj3Var), tj3Var, ((i2 >> 3) & 7168) | ((i2 >> 6) & 112) | 1572864 | 24576, 0);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3394o2(str, i, str2, vi3Var, z, ui3Var, e16Var2, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9946b(pq8 pq8Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        int iIntValue;
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1470668149);
        int i2 = (tj3Var.m22124i(pq8Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            LibraryItemCounter libraryItemCounter = pq8Var.f56683b;
            if (libraryItemCounter != null) {
                iIntValue = libraryItemCounter.f19463i;
            } else {
                Integer num = pq8Var.f56682a.f19419T;
                iIntValue = num != null ? num.intValue() : 0;
            }
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            boolean zM22124i = tj3Var.m22124i(pq8Var) | ((i2 & 896) == 256);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new a45(21, vi3Var2, pq8Var);
                tj3Var.m22131l0(objM22097O2);
            }
            r46.m20380e(e16VarM4412e, null, null, null, (ui3) objM22097O2, ci8.m4703P(-1527117826, new ly0(pq8Var, iIntValue, vi3Var2, vi3Var, t66Var, 1), tj3Var), tj3Var, 196614, 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 11, pq8Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9947c(int i, long j, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-863525718);
        int i3 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22118f(j) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            zf1 zf1Var = ge9.f40637a;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM4426s = c99.m4426s(b16Var, 20.0f);
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM4414g = c99.m4414g(e16VarM4426s, 12.0f);
            vh9 vh9Var = ps5.f56764b;
            ho9.m13414a(e16VarM4414g, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64859e, j, 0L, 0.0f, 0.0f, null, nkc.f52898b, tj3Var, ((i3 << 3) & 896) | 12582912, 120);
            lw9.m16554b(String.valueOf(i), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71408l, tj3Var, 0, 0, 131070);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new b81(i, i2, 1, j);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m9948d(Accent accent) {
        switch (AbstractC3596t2.f61760a[accent.ordinal()]) {
            case 1:
                return R$drawable.ic_accent_standard_arabic;
            case 2:
                return R$drawable.ic_accent_egyptian_arabic;
            case 3:
                return R$drawable.ic_accent_levantine_arabic;
            case 4:
                return R$drawable.ic_accent_formal_persian;
            case 5:
                return R$drawable.ic_accent_spoken_persian;
            case 6:
                return R$drawable.ic_accent_european_portuguese;
            case 7:
                return R$drawable.ic_accent_brazilian_portuguese;
            case 8:
                return R$drawable.ic_accent_european_spanish;
            case 9:
                return R$drawable.ic_accent_latin_american;
            case 10:
                return R$drawable.ic_accent_canadian;
            case 11:
                return R$drawable.ic_accent_british_english;
            case 12:
                return R$drawable.ic_accent_american_english;
            case 13:
                return R$drawable.ic_accent_france_french;
            case 14:
                return R$drawable.ic_accent_canadian;
            default:
                gm5.m12750e();
                return 0;
        }
    }
}
