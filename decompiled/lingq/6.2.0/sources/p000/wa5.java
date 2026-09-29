package p000;

import android.os.Bundle;
import android.view.View;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.appwidget.lazy.AbstractC0665a;
import androidx.lifecycle.Lifecycle$Event;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.settings.C1859b;
import com.lingq.core.settings.notifications.AbstractC1875a;
import com.lingq.core.settings.notifications.C1877c;
import com.lingq.core.settings.review.C1880a;
import com.lingq.feature.library.AbstractC2143d;
import com.lingq.feature.notifications.AbstractC2167a;
import com.lingq.feature.notifications.C2168b;
import com.lingq.feature.onboarding.OnboardingEndFragment;
import com.lingq.feature.onboarding.accent.AbstractC2175a;
import com.lingq.feature.onboarding.accent.OnboardingAccentViewModel;
import com.lingq.feature.onboarding.dailygoal.AbstractC2200a;
import com.lingq.feature.onboarding.dailygoal.OnboardingDailyGoalViewModel;
import com.lingq.feature.onboarding.dictionary.C2206a;
import com.lingq.feature.onboarding.languages.C2208a;
import com.lingq.feature.onboarding.level.AbstractC2209a;
import com.lingq.feature.onboarding.level.C2210b;
import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;
import com.lingq.feature.onboarding.topics.AbstractC2211a;
import com.lingq.feature.onboarding.topics.OnboardingTopicsViewModel;
import com.lingq.feature.playlist.AbstractC2253c;
import com.lingq.feature.playlist.C2255e;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.review.AbstractC2752c;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wa5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66562a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f66563b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f66564c;

    public /* synthetic */ wa5(int i, Object obj, Object obj2) {
        this.f66562a = i;
        this.f66563b = obj;
        this.f66564c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long jM4208a;
        int i = this.f66562a;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        Object[] objArr = 0;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f66564c;
        Object obj4 = this.f66563b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2143d.m9057a((List) obj4, (b85) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                mn5 mn5Var = (mn5) obj4;
                dh9 dh9Var = (dh9) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    p04 p04VarM17861b = o8d.m17861b();
                    String strM23620a0 = vz1.m23620a0(tj3Var, R$string.complete_lynx_coach_translate);
                    e16 e16VarM4422o = c99.m4422o(b16Var, 18.0f);
                    boolean zM22124i = tj3Var.m22124i(mn5Var) | tj3Var.m22120g(dh9Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new h85(6, mn5Var, dh9Var);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM1406a = AbstractC0309d.m1406a(e16VarM4422o, (vi3) objM22097O);
                    if (mn5Var.f51562d) {
                        tj3Var.m22111b0(1085500644);
                        jM4208a = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                        tj3Var.m22139q(false);
                    } else if (mn5Var.f51566h) {
                        tj3Var.m22111b0(1085611717);
                        jM4208a = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4208a();
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1085695169);
                        jM4208a = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55875s;
                        tj3Var.m22139q(false);
                    }
                    ty3.m22351a(p04VarM17861b, strM23620a0, e16VarM1406a, jM4208a, tj3Var, 0, 0);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                sz5.m21794e((z4a) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                tpb.m22264a((e16) obj4, (C0282a) obj3, (ye1) obj, pk9.m19383z(49));
                break;
            case 4:
                ((Integer) obj2).getClass();
                cqb.m9853c((v26) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC1875a.m8651b((yn6) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC2167a.m9099c((C2168b) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                wsb.m24148c((C1877c) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                wsb.m24147b((hn6) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC2175a.m9107a((OnboardingAccentViewModel) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 10:
                fe9 fe9Var = (fe9) obj4;
                vi3 vi3Var = (vi3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM15962y = l70.m15962y(b16Var);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM15962y);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), fe9Var.f38960i, 0.0f, 2), 0.0f, fe9Var.f38960i, 1);
                    boolean zM22120g = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new q65(vi3Var, 28);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    ss5.m21710f(e16VarM21609V, null, null, true, (ui3) objM22097O2, n2c.f52246c, tj3Var2, 199680, 6);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    thb.m22044c(tj3Var2, pvc.m19502J(ho5.m13397r(tj3Var2).f49209e));
                    tj3Var2.m22139q(true);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC2200a.m9132b((OnboardingDailyGoalViewModel) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                otb.m18512a((C2206a) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 13:
                View view = (View) obj4;
                OnboardingEndFragment onboardingEndFragment = (OnboardingEndFragment) obj3;
                bh4[] bh4VarArr = OnboardingEndFragment.f26907H0;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                if (view != null) {
                    view.post(new mt6(onboardingEndFragment, objArr == true ? 1 : 0));
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                xtb.m24700a((C2208a) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC2209a.m9142a((C2210b) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC2211a.m9149a((OnboardingTopicsViewModel) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC2231b.m9200m((g4b) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                y0c.m24826a((k66) obj4, (Lifecycle$Event) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC2253c.m9230p((C2255e) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8589e((C1859b) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                fmc.m11946a((TokenRelatedPhrase) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC2752c.m9580c((gd8) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                AbstractC2752c.m9578a((ad8) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ywc.m25369b((we8) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                cxc.m9929b((C1880a) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 26:
                Integer num = (Integer) obj4;
                ui3 ui3Var2 = (ui3) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    AbstractC0218a.m1125e(ci8.m4703P(-1865460889, new ht6(num, 16), tj3Var3), null, ci8.m4703P(1154582761, new he7(19, ui3Var2), tj3Var3), null, 0.0f, null, h7a.m13119f(tj3Var3), null, null, tj3Var3, 390, 442);
                }
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                xp3 xp3Var = (xp3) obj4;
                vi3 vi3Var2 = (vi3) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    AbstractC0665a.m2258c(xp3Var, null, vi3Var2, tj3Var4, 0);
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                gzc.m12982a((jq8) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                mzc.m17161a((sq8) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ wa5(Object obj, int i, int i2, Object obj2) {
        this.f66562a = i2;
        this.f66563b = obj;
        this.f66564c = obj2;
    }
}
