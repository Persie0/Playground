package p000;

import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lo3 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49932a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dh9 f49933b;

    public /* synthetic */ lo3(dh9 dh9Var, int i) {
        this.f49932a = i;
        this.f49933b = dh9Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f49932a;
        int i2 = 3;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        int i3 = 1;
        dh9 dh9Var = this.f49933b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    bq1.m4039O(ux5.m22984g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, tj3Var, b16Var, 1.0f), ui8.m22753b(16.0f), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55824I, 0L, tj3Var), te1.m22000n(62, 0.0f), null, ci8.m4703P(-354689318, new lo3(dh9Var, i3), tj3Var), tj3Var, 196614, 16);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
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
                    float fFloatValue = ((Number) dh9Var.getValue()).floatValue();
                    String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_verbal_proficiency);
                    String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_today);
                    String strM23620a2 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_after_12_months);
                    String strM23620a3 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_lingq_members);
                    String strM23620a4 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_other_learners);
                    int i4 = R$drawable.im_onboarding_user_1;
                    int i5 = R$drawable.im_onboarding_user_2;
                    long jM10037f = d32.m10037f(4283215696L);
                    long jM10037f2 = d32.m10037f(4287679225L);
                    long jM10037f3 = d32.m10037f(4292927712L);
                    vh9 vh9Var = ps5.f56764b;
                    kxb.m15719e(fFloatValue, strM23620a0, strM23620a1, strM23620a2, strM23620a3, strM23620a4, i4, i5, null, 0.0f, 0.0f, jM10037f, jM10037f2, 0L, jM10037f3, false, 0.0f, 0.0f, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s, tj3Var2, 0, 25008, 239360);
                    thb.m22044c(tj3Var2, c99.m4414g(b16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a));
                    lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_description), c99.m4412e(b16Var, 1.0f), ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71407k, tj3Var2, 48, 0, 130040);
                    tj3Var2.m22139q(true);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                r46.m20382g(AbstractC3584sr.m21609V(c99.m4430w(b16Var, null, 3), ((fe9) ((tj3) ye1Var3).m22128k(ge9.f40637a)).f38962k, 0.0f, 2), null, null, null, null, null, ci8.m4703P(1494895387, new lo3(dh9Var, i2), ye1Var3), ye1Var3, 1572864, 62);
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var4;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38956e, ge9.m12515a(tj3Var3).f38957f);
                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var3, 48);
                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                    lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.lesson_import_generating), null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 0, 0, 130042);
                    boolean zM22120g = tj3Var3.m22120g(dh9Var);
                    Object objM22097O = tj3Var3.m22097O();
                    if (zM22120g || objM22097O == we1.f66679a) {
                        objM22097O = new eo4(dh9Var, 2);
                        tj3Var3.m22131l0(objM22097O);
                    }
                    dn7.m10494c((ui3) objM22097O, c99.m4414g(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var3).f38957f, 0.0f, 0.0f, 13), 8.0f), cx2.m9917a(tj3Var3).m4212e(), 0L, 0, 2.0f, null, tj3Var3, 196608, 88);
                    tj3Var3.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var5;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tj3Var4.m22102U();
                } else {
                    float fFloatValue2 = ((Number) dh9Var.getValue()).floatValue();
                    String strM23620a5 = vz1.m23620a0(tj3Var4, R$string.onboarding_v2_goals_line_verbal_proficiency);
                    String strM23620a6 = vz1.m23620a0(tj3Var4, R$string.onboarding_v2_goals_line_today);
                    String strM23620a7 = vz1.m23620a0(tj3Var4, R$string.onboarding_v2_goals_line_after_12_months);
                    String strM23620a8 = vz1.m23620a0(tj3Var4, R$string.onboarding_v2_goals_line_lingq_members);
                    String strM23620a9 = vz1.m23620a0(tj3Var4, R$string.onboarding_v2_goals_line_other_learners);
                    int i6 = R$drawable.im_onboarding_paywall_confidence_lingq_member;
                    int i7 = R$drawable.im_onboarding_paywall_confidence_other_learner;
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38952a);
                    vh9 vh9Var2 = ps5.f56764b;
                    kxb.m15719e(fFloatValue2, strM23620a5, strM23620a6, strM23620a7, strM23620a8, strM23620a9, i6, i7, e16VarM21607T2, 220.0f, 44.0f, ((ms5) tj3Var4.m22128k(vh9Var2)).f51799a.f55842a, ((ms5) tj3Var4.m22128k(vh9Var2)).f51799a.f55875s, 0L, ((ms5) tj3Var4.m22128k(vh9Var2)).f51799a.f55817B, false, 0.98f, 0.34f, ((ms5) tj3Var4.m22128k(vh9Var2)).f51799a.f55875s, tj3Var4, 805306368, 14352390, 8192);
                }
                break;
        }
        return xfaVar;
    }
}
