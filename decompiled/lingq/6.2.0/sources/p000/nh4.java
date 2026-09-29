package p000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.karaoke.AbstractC2117b;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class nh4 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f52729b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f52730c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xi3 f52731d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f52732e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f52733f;

    public nh4(List list, C3633u2 c3633u2, String str, vi3 vi3Var, fe9 fe9Var) {
        this.f52728a = 1;
        this.f52729b = list;
        this.f52732e = c3633u2;
        this.f52730c = str;
        this.f52731d = vi3Var;
        this.f52733f = fe9Var;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        String value;
        long j;
        boolean z;
        xa3 fh5Var;
        long j2;
        int iIntValue;
        int i = this.f52728a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        Object obj5 = this.f52730c;
        List list = this.f52729b;
        Object obj6 = this.f52732e;
        xi3 xi3Var = this.f52731d;
        Object obj7 = this.f52733f;
        switch (i) {
            case 0:
                ft4 ft4Var = (ft4) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                vi3 vi3Var = (vi3) xi3Var;
                int i2 = (iIntValue3 & 6) == 0 ? iIntValue3 | (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i2 |= ((tj3) ye1Var).m22116e(iIntValue2) ? 32 : 16;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
                    tj3Var.m22102U();
                } else {
                    LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) list.get(iIntValue2);
                    tj3Var.m22111b0(-1379727372);
                    boolean zM11650l = fa4.m11650l(lessonTranslationSentence, (LessonTranslationSentence) obj6);
                    Integer num = (Integer) obj7;
                    String str = (String) obj5;
                    boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(lessonTranslationSentence);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new we0(vi3Var, lessonTranslationSentence, 3);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC2117b.m9029i(null, lessonTranslationSentence, zM11650l, num, str, (ui3) objM22097O, tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                break;
            case 1:
                ft4 ft4Var2 = (ft4) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                fe9 fe9Var = (fe9) obj7;
                vi3 vi3Var2 = (vi3) xi3Var;
                int i3 = (iIntValue5 & 6) == 0 ? iIntValue5 | (((tj3) ye1Var2).m22120g(ft4Var2) ? 4 : 2) : iIntValue5;
                if ((iIntValue5 & 48) == 0) {
                    i3 |= ((tj3) ye1Var2).m22116e(iIntValue4) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
                    tj3Var2.m22102U();
                } else {
                    Accent accent = (Accent) list.get(iIntValue4);
                    tj3Var2.m22111b0(-245865079);
                    boolean zM11650l2 = fa4.m11650l(accent.getValue(), ((C3633u2) obj6).f63260b);
                    int iM18253f0 = AbstractC3423or.m18253f0(accent, (String) obj5);
                    if (iM18253f0 != -1) {
                        tj3Var2.m22111b0(-245766376);
                        value = vz1.m23620a0(tj3Var2, iM18253f0);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-245695386);
                        tj3Var2.m22139q(false);
                        value = accent.getValue();
                    }
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM4416i = c99.m4416i(c99.m4412e(b16Var, 1.0f), 48.0f, 0.0f, 2);
                    vh9 vh9Var = ps5.f56764b;
                    e16 e16VarM19045o = pb1.m19045o(e16VarM4416i, ((ms5) tj3Var2.m22128k(vh9Var)).f51801c.f64857c);
                    if (zM11650l2) {
                        tj3Var2.m22111b0(-245354231);
                        j = ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55823H;
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-245236307);
                        j = ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55824I;
                        tj3Var2.m22139q(false);
                    }
                    e16 e16VarM10007D = d32.m10007D(e16VarM19045o, j, ((ms5) tj3Var2.m22128k(vh9Var)).f51801c.f64857c);
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var2) | tj3Var2.m22116e(accent.ordinal());
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new C3482q2(vi3Var2, accent, 1);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM10007D, 15), fe9Var.f38960i, fe9Var.f38952a);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    bq1.m4042R(AbstractC3423or.m18236U(czc.m9948d(accent), tj3Var2, 0), null, pb1.m19045o(AbstractC3584sr.m21607T(c99.m4422o(b16Var, 48.0f), 4.0f), ui8.f63972a), null, hl1.f42564a, 0.0f, null, tj3Var2, 24632, 104);
                    lw9.m16554b(value, AbstractC3393o1.m17728c(1.0f, AbstractC3584sr.m21611X(b16Var, fe9Var.f38956e, 0.0f, 0.0f, 0.0f, 14), true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262140);
                    if (zM11650l2) {
                        tj3Var2.m22111b0(2016696487);
                        z = false;
                        ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_check, tj3Var2, 0), null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var2, 440, 8);
                        tj3Var2.m22139q(false);
                    } else {
                        z = false;
                        tj3Var2.m22111b0(2016995358);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(true);
                    tj3Var2.m22139q(z);
                }
                break;
            default:
                ft4 ft4Var3 = (ft4) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                ye1 ye1Var3 = (ye1) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                zi3 zi3Var = (zi3) xi3Var;
                Context context = (Context) obj6;
                int i4 = (iIntValue7 & 6) == 0 ? iIntValue7 | (((tj3) ye1Var3).m22120g(ft4Var3) ? 4 : 2) : iIntValue7;
                if ((iIntValue7 & 48) == 0) {
                    i4 |= ((tj3) ye1Var3).m22116e(iIntValue6) ? 32 : 16;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(i4 & 1, (i4 & 147) != 146)) {
                    tj3Var3.m22102U();
                } else {
                    ReaderFont readerFont = (ReaderFont) list.get(iIntValue6);
                    tj3Var3.m22111b0(196823719);
                    boolean zM4058i0 = bq1.m4058i0(readerFont);
                    Typeface typefaceM16862d = mjc.m16862d(readerFont, context);
                    boolean z2 = mjc.m16859a(readerFont, context) != null;
                    Pair pair = (Pair) obj7;
                    boolean z3 = pair != null && pair.f47623a == readerFont && 1 <= (iIntValue = ((Number) pair.f47624b).intValue()) && iIntValue < 100;
                    int i5 = 8;
                    if ((z2 || zM4058i0) && typefaceM16862d != null) {
                        fh5Var = new fh5(new m58(typefaceM16862d, i5));
                    } else {
                        Typeface typefaceM16862d2 = mjc.m16862d(ReaderFont.DmSans, context);
                        fh5Var = typefaceM16862d2 != null ? new fh5(new m58(typefaceM16862d2, i5)) : xa3.f67989a;
                    }
                    xa3 xa3Var = fh5Var;
                    boolean zEquals = bq1.m4057h0(readerFont).equals(bq1.m4057h0((ReaderFont) obj5));
                    e16 e16VarM19045o2 = pb1.m19045o(c99.m4416i(b16.f7762a, 40.0f, 0.0f, 2), ui8.m22753b(8.0f));
                    boolean zM22120g3 = tj3Var3.m22120g(zi3Var) | tj3Var3.m22116e(readerFont.ordinal()) | tj3Var3.m22122h(z2) | tj3Var3.m22122h(zM4058i0);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new gz9(zi3Var, readerFont, z2, zM4058i0);
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O3, e16VarM19045o2, 15);
                    if (zEquals) {
                        tj3Var3.m22111b0(-132166314);
                        j2 = ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55846c;
                    } else {
                        tj3Var3.m22111b0(-132164778);
                        j2 = ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55821F;
                    }
                    tj3Var3.m22139q(false);
                    ho9.m13414a(e16VarM815b, ui8.m22753b(8.0f), j2, 0L, 0.0f, 0.0f, null, ci8.m4703P(1718213793, new hz9(zEquals, z3, zM4058i0, z2, readerFont, xa3Var, (Pair) obj7), tj3Var3), tj3Var3, 12582912, 120);
                    tj3Var3.m22139q(false);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ nh4(List list, Object obj, Serializable serializable, Object obj2, xi3 xi3Var, int i) {
        this.f52728a = i;
        this.f52729b = list;
        this.f52732e = obj;
        this.f52733f = serializable;
        this.f52730c = obj2;
        this.f52731d = xi3Var;
    }
}
