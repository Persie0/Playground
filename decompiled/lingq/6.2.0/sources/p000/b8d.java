package p000;

import android.os.Parcel;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b8d {
    /* JADX INFO: renamed from: a */
    public static final void m3487a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-516203083);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37240f, nj0.f52792K, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_empty_search, tj3Var, 0), null, c99.m4422o(b16Var, 64.0f), null, null, 0.0f, null, tj3Var, 440, 120);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.search_no_search_results);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jx0(i, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static TokenTransliteration m3488b(Parcel parcel) {
        String string = parcel.readString();
        if (string == null) {
            return null;
        }
        try {
            return (TokenTransliteration) hg4.f42324a.m10321a(string, TokenTransliteration.Companion.serializer());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3489c(TokenTransliteration tokenTransliteration, Parcel parcel) {
        parcel.writeString(tokenTransliteration != null ? hg4.f42324a.m10322b(TokenTransliteration.Companion.serializer(), tokenTransliteration) : null);
    }
}
