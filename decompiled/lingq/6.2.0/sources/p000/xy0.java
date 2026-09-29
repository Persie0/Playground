package p000;

import android.content.Context;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.achievements.AbstractC1234a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.util.AbstractC1935a;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.settings.theme.C1883c;
import com.lingq.core.token.C1909e;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.collections.AbstractC2030a;
import com.lingq.feature.collections.C2034d;
import com.lingq.feature.dictionary.AbstractC2059d;
import com.lingq.feature.dictionary.C2061e;
import com.lingq.feature.reader.reader.AbstractC2501g;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.reader.stats.AbstractC2527c;
import com.lingq.feature.reader.stats.C2535j;
import com.lingq.feature.reader.video.AbstractC2592h;
import com.lingq.feature.reader.video.C2583a;
import com.lingq.feature.search.search.AbstractC2776c;
import com.lingq.feature.search.search.C2779e;
import com.lingq.feature.vocabulary.AbstractC2823a;
import com.lingq.feature.vocabulary.C2824b;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xy0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f68948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f68949c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f68950d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f68951e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f68952f;

    public /* synthetic */ xy0(vi3 vi3Var, t66 t66Var, Milestone milestone, Context context, t66 t66Var2) {
        this.f68947a = 8;
        this.f68949c = vi3Var;
        this.f68948b = t66Var;
        this.f68950d = milestone;
        this.f68951e = context;
        this.f68952f = t66Var2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f68947a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f68952f;
        Object obj4 = this.f68951e;
        Object obj5 = this.f68950d;
        Object obj6 = this.f68949c;
        Object obj7 = this.f68948b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                z6d.m25478a((a7d) obj7, (vi3) obj6, (ui3) obj3, (vi3) obj5, (vi3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2030a.m8935b((LqAnalyticsValues$LessonPath) obj7, (ud6) obj6, (w41) obj5, (bia) obj4, (C2034d) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                l8d.m16027a((e16) obj7, (s65) obj6, (qj9) obj5, (uj9) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2059d.m8968d((String) obj7, (String) obj6, (TokenMeaning) obj5, (ui3) obj3, (C2061e) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                pid.m19192c((e16) obj7, (vs3) obj5, (w65) obj4, (zi3) obj3, (vi3) obj6, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC2527c.m9455a((ud6) obj7, (w41) obj6, (bia) obj5, (C2535j) obj4, (C1909e) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                snb.m21494a((qn5) obj7, (vi3) obj6, (vi3) obj5, (ui3) obj3, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC1234a.m7000c((e16) obj7, (Milestone) obj5, (vi3) obj6, (ui3) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 8:
                vi3 vi3Var = (vi3) obj6;
                t66 t66Var = (t66) obj7;
                Milestone milestone = (Milestone) obj5;
                Context context = (Context) obj4;
                t66 t66Var2 = (t66) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM4429v = c99.m4429v(c99.m4412e(b16Var, 1.0f));
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4429v);
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
                    boolean zBooleanValue = ((Boolean) t66Var.getValue()).booleanValue();
                    C0282a c0282aM4703P = ci8.m4703P(372266837, new dz5(i2, context, milestone), tj3Var);
                    Object objM22097O = tj3Var.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = new C0023al(27, t66Var2);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC1935a.m8801a(zBooleanValue, c0282aM4703P, (vi3) objM22097O, tj3Var, 432);
                    e16 e16VarM4414g = c99.m4414g(AbstractC3584sr.m21611X(c99.m4431x(b16Var), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38958g, 7), 40.0f);
                    vh9 vh9Var = ps5.f56764b;
                    si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64856b;
                    vf0 vf0VarM4714a = ci8.m4714a(1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s);
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new wy0(vi3Var, t66Var2, t66Var, 2);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    AbstractC0231g.m1151d((ui3) objM22097O2, e16VarM4414g, false, si8Var, null, vf0VarM4714a, null, ci8.m4703P(-458533560, new vy1(context, 1), tj3Var), tj3Var, 805306368, 436);
                    tj3Var.m22139q(true);
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                k3c.m14790a((tf7) obj7, (vi3) obj6, (vi3) obj5, (vi3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ghc.m12667a((e16) obj7, (fm7) obj5, (ui3) obj3, (ui3) obj4, (vi3) obj6, (ye1) obj, pk9.m19383z(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC2501g.m9403d((C2493a) obj7, (C1909e) obj6, (C1883c) obj5, (ud6) obj4, (w41) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC2592h.m9516a((C2583a) obj7, (C1909e) obj6, (C1883c) obj5, (ud6) obj4, (w41) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                cxc.m9930c((yf8) obj7, (Integer) obj5, (String) obj4, (vi3) obj6, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC2776c.m9701a((String) obj7, (ud6) obj6, (w41) obj5, (bia) obj4, (C2779e) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8592h((e16) obj7, (m19) obj6, (ui3) obj3, (ui3) obj5, (ui3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC1915b.m8791d((c7a) obj7, (String) obj6, (List) obj5, (faa) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(24577));
                break;
            case 17:
                ((Integer) obj2).getClass();
                gbd.m12467a((r0b) obj7, (ui3) obj3, (ui3) obj6, (ui3) obj5, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2823a.m9739f((w41) obj7, (og8) obj6, (bia) obj5, (C2824b) obj4, (C1909e) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ xy0(e16 e16Var, vs3 vs3Var, w65 w65Var, zi3 zi3Var, vi3 vi3Var, int i) {
        this.f68947a = 4;
        this.f68948b = e16Var;
        this.f68950d = vs3Var;
        this.f68951e = w65Var;
        this.f68952f = zi3Var;
        this.f68949c = vi3Var;
    }

    public /* synthetic */ xy0(e16 e16Var, fm7 fm7Var, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, int i) {
        this.f68947a = 10;
        this.f68948b = e16Var;
        this.f68950d = fm7Var;
        this.f68952f = ui3Var;
        this.f68951e = ui3Var2;
        this.f68949c = vi3Var;
    }

    public /* synthetic */ xy0(e16 e16Var, Milestone milestone, vi3 vi3Var, ui3 ui3Var, ui3 ui3Var2, int i) {
        this.f68947a = 7;
        this.f68948b = e16Var;
        this.f68950d = milestone;
        this.f68949c = vi3Var;
        this.f68952f = ui3Var;
        this.f68951e = ui3Var2;
    }

    public /* synthetic */ xy0(yf8 yf8Var, Integer num, String str, vi3 vi3Var, ui3 ui3Var, int i) {
        this.f68947a = 13;
        this.f68948b = yf8Var;
        this.f68950d = num;
        this.f68951e = str;
        this.f68949c = vi3Var;
        this.f68952f = ui3Var;
    }

    public /* synthetic */ xy0(r0b r0bVar, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, e16 e16Var, int i) {
        this.f68947a = 17;
        this.f68948b = r0bVar;
        this.f68952f = ui3Var;
        this.f68949c = ui3Var2;
        this.f68950d = ui3Var3;
        this.f68951e = e16Var;
    }

    public /* synthetic */ xy0(Object obj, Object obj2, ui3 ui3Var, xi3 xi3Var, xi3 xi3Var2, int i, int i2) {
        this.f68947a = i2;
        this.f68948b = obj;
        this.f68949c = obj2;
        this.f68952f = ui3Var;
        this.f68950d = xi3Var;
        this.f68951e = xi3Var2;
    }

    public /* synthetic */ xy0(Object obj, Object obj2, Object obj3, ui3 ui3Var, Object obj4, int i, int i2) {
        this.f68947a = i2;
        this.f68948b = obj;
        this.f68949c = obj2;
        this.f68950d = obj3;
        this.f68952f = ui3Var;
        this.f68951e = obj4;
    }

    public /* synthetic */ xy0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f68947a = i2;
        this.f68948b = obj;
        this.f68949c = obj2;
        this.f68950d = obj3;
        this.f68951e = obj4;
        this.f68952f = obj5;
    }
}
