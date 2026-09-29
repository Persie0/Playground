package p000;

import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dbd {
    /* JADX INFO: renamed from: a */
    public static final void m10273a(zza zzaVar, vi3 vi3Var, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        zzaVar.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-799508977);
        int i2 = i | (tj3Var.m22120g(zzaVar) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | 3072;
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            e16 e16VarM4431x = c99.m4431x(b16Var);
            vh9 vh9Var = ps5.f56764b;
            ho9.m13414a(e16VarM4431x, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r, 0L, 0.0f, 0.0f, null, ci8.m4703P(20225038, new g39(zzaVar, t66Var, vi3Var, 18), tj3Var), tj3Var, 12582918, 120);
            ho9.m13414a(vz1.m23624c0(c99.m4431x(b16Var), "vocabulary:sort_by"), ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r, 0L, 0.0f, 0.0f, null, ci8.m4703P(1670660997, new nya(i3, ui3Var, zzaVar), tj3Var), tj3Var, 12582918, 120);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h39(zzaVar, vi3Var, ui3Var, e16Var2, i, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ri8 m10274b(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C3386nv.m17626m(ux5.m22988k(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new ri8(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX INFO: renamed from: c */
    public static final String m10275c(VocabularyContentFilter vocabularyContentFilter, int i, boolean z, tj3 tj3Var) {
        String strM23620a0;
        int i2 = oya.f55311a[vocabularyContentFilter.ordinal()];
        if (i2 == 1) {
            tj3Var.m22111b0(1247326488);
            strM23620a0 = vz1.m23620a0(tj3Var, R$string.search_all);
            tj3Var.m22139q(false);
        } else if (i2 == 2) {
            tj3Var.m22111b0(1247329247);
            strM23620a0 = vz1.m23620a0(tj3Var, R$string.card_only_phrases);
            tj3Var.m22139q(false);
        } else {
            if (i2 != 3) {
                throw ux5.m23001x(tj3Var, 1247325029, false);
            }
            tj3Var.m22111b0(1247332184);
            strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.feature.vocabulary.R$string.card_srs_due);
            tj3Var.m22139q(false);
        }
        if (!z || i <= 0) {
            return strM23620a0;
        }
        return strM23620a0 + " (" + i + ")";
    }
}
