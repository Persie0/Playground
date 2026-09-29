package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.chat.TranslationState;
import com.lingq.feature.lessoninfo.SharedByRole;
import com.lingq.feature.onboarding.dailygoal.AbstractC2200a;
import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;
import com.lingq.feature.reader.stats.p019ui.words.AbstractC2572b;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class py0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f56966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f56967c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f56968d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f56969e;

    public /* synthetic */ py0(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f56965a = i;
        this.f56966b = z;
        this.f56967c = obj;
        this.f56968d = obj2;
        this.f56969e = obj3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long jM4216i;
        int i = this.f56965a;
        boolean z = this.f56966b;
        int i2 = 2;
        int i3 = 0;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f56969e;
        Object obj4 = this.f56968d;
        Object obj5 = this.f56967c;
        switch (i) {
            case 0:
                dh9 dh9Var = (dh9) obj5;
                jw0 jw0Var = (jw0) obj4;
                t66 t66Var = (t66) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    p04 p04VarM17861b = o8d.m17861b();
                    String strM23620a0 = vz1.m23620a0(tj3Var, R$string.ui_translate_text);
                    boolean zM22122h = tj3Var.m22122h(z) | tj3Var.m22120g(dh9Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22122h || objM22097O == we1.f66679a) {
                        objM22097O = new cy0(z, dh9Var, i3);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM1406a = AbstractC0309d.m1406a(b16.f7762a, (vi3) objM22097O);
                    if (jw0Var.f46246g == TranslationState.Showing) {
                        tj3Var.m22111b0(-1329342455);
                        jM4216i = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-1329219044);
                        if (((Boolean) t66Var.getValue()).booleanValue()) {
                            tj3Var.m22111b0(-1329165538);
                            jM4216i = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55875s;
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(-1329038469);
                            jM4216i = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4216i();
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(false);
                    }
                    ty3.m22351a(p04VarM17861b, strM23620a0, e16VarM1406a, jM4216i, tj3Var, 0, 0);
                }
                break;
            case 1:
                k87 k87Var = (k87) obj5;
                li3 li3Var = (li3) obj4;
                vi3 vi3Var = (vi3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else if (!z) {
                    tj3Var2.m22111b0(-1777093702);
                    C0282a c0282aM4703P = ci8.m4703P(1878022019, new wz2(li3Var, i2), tj3Var2);
                    C0282a c0282aM4703P2 = ci8.m4703P(-2014790353, new qe0(vi3Var, 15), tj3Var2);
                    x17 x17Var = h7a.f41916a;
                    vh9 vh9Var = ps5.f56764b;
                    AbstractC0218a.m1122b(c0282aM4703P, null, null, c0282aM4703P2, null, 0.0f, 0.0f, null, h7a.m13120g(((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55872p, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55872p, 0L, 0L, tj3Var2, 60), k87Var, tj3Var2, 24582);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(-1775911672);
                    tj3Var2.m22139q(false);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2572b.m9488e((e16) obj5, (LessonWord) obj4, this.f56966b, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                fjd.m11917a((String) obj5, (String) obj4, (SharedByRole) obj3, this.f56966b, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC2200a.m9131a((e16) obj5, (DailyGoal) obj4, this.f56966b, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC2228a.m9182b((String) obj5, (String) obj4, this.f56966b, (e16) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                r1d.m20247b((e16) obj5, (y29) obj4, this.f56966b, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                h4d.m13052a((e16) obj5, (List) obj4, (LocalDate) obj3, this.f56966b, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ py0(Object obj, Object obj2, Object obj3, boolean z, int i, int i2) {
        this.f56965a = i2;
        this.f56967c = obj;
        this.f56968d = obj2;
        this.f56969e = obj3;
        this.f56966b = z;
    }

    public /* synthetic */ py0(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.f56965a = i2;
        this.f56967c = obj;
        this.f56968d = obj2;
        this.f56966b = z;
        this.f56969e = obj3;
    }
}
