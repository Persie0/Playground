package p000;

import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.settings.R$string;
import com.lingq.core.settings.ViewKeys;
import com.lingq.core.settings.review.C1880a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cxc {

    /* JADX INFO: renamed from: a */
    public static final C2953e6 f34697a = new C2953e6("android.widget.extra.CHECKED");

    /* JADX INFO: renamed from: a */
    public static final void m9928a(int i, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1893260356);
        int i2 = 4;
        int i3 = (tj3Var2.m22124i(vi3Var) ? 4 : 2) | i | (tj3Var2.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var2.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var, ci8.m4703P(-1347869044, new yy0(vi3Var, t66Var, i2), tj3Var2), null, ci8.m4703P(-984402546, new he7(22, ui3Var), tj3Var2), null, vjc.f65522f, ci8.m4703P(-439202799, new C0812bj(10, t66Var), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, ((i3 >> 3) & 14) | 1772592, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ju6(vi3Var, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9929b(C1880a c1880a, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1493673033);
        int i2 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1880a = (C1880a) pfa.m19114d(y38.m24933a(C1880a.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-15);
            tj3Var.m22140r();
            yf8 yf8Var = (yf8) AbstractC0711a.m2513c(c1880a.f23193q, tj3Var).getValue();
            Integer num = c1880a.f23186j;
            String strMo4589b2 = c1880a.f23178b.mo4589b2();
            int i4 = i3 & 112;
            boolean zM22124i = (i4 == 32) | tj3Var.m22124i(c1880a);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new sx7(14, vi3Var, c1880a);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var2 = (vi3) objM22097O;
            boolean z = i4 == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new nc8(vi3Var, 11);
                tj3Var.m22131l0(objM22097O2);
            }
            m9930c(yf8Var, num, strMo4589b2, vi3Var2, (ui3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(c1880a, i, 25, vi3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m9930c(yf8 yf8Var, Integer num, String str, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i) {
        boolean z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(995927527);
        int i2 = i | (tj3Var.m22124i(yf8Var) ? 4 : 2) | (tj3Var.m22120g(num) ? 32 : 16) | (tj3Var.m22120g(str) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192);
        boolean z2 = false;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            ViewKeys viewKeys = yf8Var.f69772b;
            int i3 = 12;
            p84 p84Var = we1.f66679a;
            if (viewKeys == null) {
                tj3Var.m22111b0(43084534);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(43084535);
                boolean z3 = (i2 & 7168) == 2048;
                Object objM22097O = tj3Var.m22097O();
                if (z3 || objM22097O == p84Var) {
                    objM22097O = new nc8(vi3Var, i3);
                    tj3Var.m22131l0(objM22097O);
                }
                m9931d(0, tj3Var, (ui3) objM22097O);
                tj3Var.m22139q(false);
            }
            if (yf8Var.f69775e) {
                tj3Var.m22111b0(43230297);
                int i4 = i2 & 7168;
                boolean z4 = i4 == 2048;
                Object objM22097O2 = tj3Var.m22097O();
                if (z4 || objM22097O2 == p84Var) {
                    objM22097O2 = new wh7(vi3Var, 22);
                    tj3Var.m22131l0(objM22097O2);
                }
                vi3 vi3Var2 = (vi3) objM22097O2;
                boolean z5 = i4 == 2048;
                Object objM22097O3 = tj3Var.m22097O();
                if (z5 || objM22097O3 == p84Var) {
                    objM22097O3 = new nc8(vi3Var, 13);
                    tj3Var.m22131l0(objM22097O3);
                }
                m9928a(0, tj3Var, (ui3) objM22097O3, vi3Var2);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(43447483);
                tj3Var.m22139q(false);
            }
            ViewKeys viewKeys2 = yf8Var.f69773c;
            if (viewKeys2 == null) {
                tj3Var.m22111b0(43521386);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(43521387);
                List listM21155a = s8d.m21155a(str);
                Integer numValueOf = Integer.valueOf(R$string.settings_transliteration_style);
                tj3Var.m22111b0(-691325677);
                List<aba> list = listM21155a;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
                for (aba abaVar : list) {
                    String strM23620a0 = vz1.m23620a0(tj3Var, abaVar.f475a);
                    String str2 = abaVar.f476b;
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new y29(0, 112, viewKeys2, strM23620a0, str2, e65.m10891w(yf8Var.f69774d, lowerCase, locale), false, false));
                    numValueOf = numValueOf;
                    arrayList = arrayList2;
                    z2 = false;
                }
                boolean z6 = z2;
                tj3Var.m22139q(z6);
                xu8 xu8Var = new xu8(numValueOf, arrayList, z6, 8);
                boolean zM22116e = ((i2 & 7168) == 2048) | tj3Var.m22116e(viewKeys2.ordinal());
                Object objM22097O4 = tj3Var.m22097O();
                if (zM22116e || objM22097O4 == p84Var) {
                    z = false;
                    objM22097O4 = new wf8(vi3Var, viewKeys2, 0 == true ? 1 : 0);
                    tj3Var.m22131l0(objM22097O4);
                } else {
                    z = false;
                }
                r1d.m20246a(xu8Var, (vi3) objM22097O4, null, tj3Var, 0, 4);
                tj3Var.m22139q(z);
            }
            b34.m3232b(b16.f7762a, ci8.m4703P(1399697571, new wa5(26, num, ui3Var), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(-961150344, new iz4(12, yf8Var, vi3Var), tj3Var), tj3Var, 805306422, 508);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(yf8Var, num, str, vi3Var, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9931d(int i, ye1 ye1Var, ui3 ui3Var) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(900921478);
        int i2 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var, ci8.m4703P(-450213058, new he7(20, ui3Var), tj3Var2), null, null, null, null, vjc.f65519c, null, 0L, 0L, 0L, 0L, null, tj3Var, (i2 & 14) | 1572912, 16316);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new he7(i, 21, ui3Var);
        }
    }
}
