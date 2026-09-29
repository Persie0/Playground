package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.feature.chat.AbstractC2008l;
import com.lingq.feature.onboarding.dailygoal.AbstractC2200a;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dw0 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36287c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36288d;

    public /* synthetic */ dw0(Object obj, Object obj2, Object obj3, int i) {
        this.f36285a = i;
        this.f36286b = obj;
        this.f36287c = obj2;
        this.f36288d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        br9 br9Var;
        boolean z;
        boolean z2;
        int i = this.f36285a;
        int i2 = 19;
        int i3 = 18;
        Object supportedEfforts = null;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f36288d;
        Object obj6 = this.f36287c;
        Object obj7 = this.f36286b;
        switch (i) {
            case 0:
                List list = (List) obj7;
                nz9 nz9Var = (nz9) obj6;
                fw0 fw0Var = (fw0) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((ft4) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    jw0 jw0Var = (jw0) list.get(iIntValue);
                    boolean zM11650l = fa4.m11650l(jw0Var.f46240a.f18921b, "user");
                    b16 b16Var = b16.f7762a;
                    if (zM11650l) {
                        tj3Var.m22111b0(2007599902);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37237c, nj0.f52817l, tj3Var, 6);
                        int iHashCode = Long.hashCode(tj3Var.f62385T);
                        l77 l77VarM22132m = tj3Var.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
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
                        AbstractC2008l.m8911b(c99.m4431x(b16Var), nz9Var, 0, jw0Var, false, false, fw0Var, tj3Var, 454, 48);
                        tj3Var.m22139q(true);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(2008189460);
                        AbstractC2008l.m8910a(c99.m4412e(b16Var, 1.0f), nz9Var, 0, jw0Var, null, null, false, false, fw0Var, tj3Var, 454, 240);
                        tj3Var.m22139q(false);
                    }
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a));
                } else {
                    tj3Var.m22102U();
                }
                break;
            case 1:
                List list2 = (List) obj7;
                zh9 zh9Var = (zh9) obj6;
                zi3 zi3Var = (zi3) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((ft4) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    bh9 bh9Var = (bh9) list2.get(iIntValue3);
                    boolean z3 = iIntValue3 == 0;
                    boolean z4 = iIntValue3 == list2.size() - 1;
                    String strM23620a0 = vz1.m23620a0(tj3Var2, bh9Var.f8548b);
                    LanguageProgressPeriod languageProgressPeriod = ((yh9) zh9Var).f69852a;
                    boolean zM22124i = tj3Var2.m22124i(bh9Var) | tj3Var2.m22120g(zi3Var) | tj3Var2.m22124i(zh9Var);
                    Object objM22097O = tj3Var2.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new C3485q5(bh9Var, zi3Var, zh9Var, i2);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    yhd.m25150f(z3, z4, strM23620a0, languageProgressPeriod, bh9Var, null, (vi3) objM22097O, tj3Var2, 0, 32);
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 2:
                ui3 ui3Var2 = (ui3) obj7;
                String str = (String) obj6;
                vi3 vi3Var = (vi3) obj5;
                ui3 ui3Var3 = (ui3) obj2;
                ye1 ye1Var3 = (ye1) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((db1) obj).getClass();
                ui3Var3.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= ((tj3) ye1Var3).m22124i(ui3Var3) ? 32 : 16;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    C0282a c0282aM4703P = ci8.m4703P(499921031, new C3441oz(str, 23), tj3Var3);
                    int i4 = iIntValue5 & 112;
                    boolean zM22120g = tj3Var3.m22120g(ui3Var2) | (i4 == 32);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new pn5(ui3Var2, ui3Var3, 0);
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    AbstractC3003fj.m11886b(c0282aM4703P, (ui3) objM22097O2, null, null, null, false, null, null, tj3Var3, 6, 508);
                    for (LynxChatModel lynxChatModel : LynxChatModel.getEntries()) {
                        C0282a c0282aM4703P2 = ci8.m4703P(1329926986, new wz2(lynxChatModel, i2), tj3Var3);
                        boolean zM22120g2 = tj3Var3.m22120g(vi3Var) | tj3Var3.m22116e(lynxChatModel.ordinal()) | (i4 == 32);
                        Object objM22097O3 = tj3Var3.m22097O();
                        if (zM22120g2 || objM22097O3 == p84Var) {
                            objM22097O3 = new zg0(vi3Var, lynxChatModel, ui3Var3, i3);
                            tj3Var3.m22131l0(objM22097O3);
                        }
                        AbstractC3003fj.m11886b(c0282aM4703P2, (ui3) objM22097O3, null, null, null, false, null, null, tj3Var3, 6, 508);
                    }
                } else {
                    tj3Var3.m22102U();
                }
                break;
            case 3:
                vi3 vi3Var2 = (vi3) obj7;
                qn5 qn5Var = (qn5) obj6;
                String str2 = (String) obj5;
                ui3 ui3Var4 = (ui3) obj2;
                ye1 ye1Var4 = (ye1) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((db1) obj).getClass();
                ui3Var4.getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= ((tj3) ye1Var4).m22124i(ui3Var4) ? 32 : 16;
                }
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    C0282a c0282aM4703P3 = ci8.m4703P(-270854964, new C3441oz(str2, 22), tj3Var4);
                    int i5 = iIntValue6 & 112;
                    boolean zM22120g3 = tj3Var4.m22120g(vi3Var2) | (i5 == 32);
                    Object objM22097O4 = tj3Var4.m22097O();
                    if (zM22120g3 || objM22097O4 == p84Var) {
                        objM22097O4 = new a45(2, vi3Var2, ui3Var4);
                        tj3Var4.m22131l0(objM22097O4);
                    }
                    AbstractC3003fj.m11886b(c0282aM4703P3, (ui3) objM22097O4, null, null, null, false, null, null, tj3Var4, 6, 508);
                    LynxChatModel lynxChatModel2 = qn5Var.f57987a;
                    supportedEfforts = lynxChatModel2 != null ? lynxChatModel2.getSupportedEfforts() : null;
                    if (supportedEfforts == null) {
                        supportedEfforts = EmptyList.f47638a;
                    }
                    for (LynxReasoningEffort lynxReasoningEffort : (Iterable) supportedEfforts) {
                        C0282a c0282aM4703P4 = ci8.m4703P(724548488, new wz2(lynxReasoningEffort, i3), tj3Var4);
                        boolean zM22120g4 = tj3Var4.m22120g(vi3Var2) | tj3Var4.m22116e(lynxReasoningEffort.ordinal()) | (i5 == 32);
                        Object objM22097O5 = tj3Var4.m22097O();
                        if (zM22120g4 || objM22097O5 == p84Var) {
                            objM22097O5 = new zg0(vi3Var2, lynxReasoningEffort, ui3Var4, 17);
                            tj3Var4.m22131l0(objM22097O5);
                        }
                        AbstractC3003fj.m11886b(c0282aM4703P4, (ui3) objM22097O5, null, null, null, false, null, null, tj3Var4, 6, 508);
                    }
                } else {
                    tj3Var4.m22102U();
                }
                break;
            case 4:
                List list3 = (List) obj7;
                zy1 zy1Var = (zy1) obj6;
                vi3 vi3Var3 = (vi3) obj5;
                int iIntValue7 = ((Integer) obj2).intValue();
                ye1 ye1Var5 = (ye1) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((ft4) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= ((tj3) ye1Var5).m22116e(iIntValue7) ? 32 : 16;
                }
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    DailyGoal dailyGoal = (DailyGoal) list3.get(iIntValue7);
                    boolean z5 = zy1Var.f72376d == dailyGoal;
                    boolean zM22120g5 = tj3Var5.m22120g(vi3Var3) | tj3Var5.m22116e(dailyGoal.ordinal());
                    Object objM22097O6 = tj3Var5.m22097O();
                    if (zM22120g5 || objM22097O6 == p84Var) {
                        objM22097O6 = new ct6(vi3Var3, dailyGoal, 0);
                        tj3Var5.m22131l0(objM22097O6);
                    }
                    AbstractC2200a.m9131a(null, dailyGoal, z5, (ui3) objM22097O6, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                break;
            case 5:
                List list4 = (List) obj7;
                w75 w75Var = (w75) obj6;
                vi3 vi3Var4 = (vi3) obj5;
                int iIntValue9 = ((Integer) obj2).intValue();
                ye1 ye1Var6 = (ye1) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((ft4) obj).getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= ((tj3) ye1Var6).m22116e(iIntValue9) ? 32 : 16;
                }
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    r75 r75Var = (r75) list4.get(iIntValue9);
                    String str3 = r75Var.f58853a;
                    r75 r75Var2 = w75Var.f66479b;
                    boolean zM11650l2 = fa4.m11650l(str3, r75Var2 != null ? r75Var2.f58853a : null);
                    int i6 = r75Var.f58855c;
                    int i7 = r75Var.f58854b;
                    boolean zM22120g6 = tj3Var6.m22120g(vi3Var4) | tj3Var6.m22120g(r75Var);
                    Object objM22097O7 = tj3Var6.m22097O();
                    if (zM22120g6 || objM22097O7 == p84Var) {
                        objM22097O7 = new a45(11, vi3Var4, r75Var);
                        tj3Var6.m22131l0(objM22097O7);
                    }
                    xq6.m24644a(i6, i7, zM11650l2, (ui3) objM22097O7, tj3Var6, 0);
                } else {
                    tj3Var6.m22102U();
                }
                break;
            default:
                List list5 = (List) obj7;
                List list6 = (List) obj6;
                vi3 vi3Var5 = (vi3) obj5;
                int iIntValue11 = ((Integer) obj2).intValue();
                ye1 ye1Var7 = (ye1) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((ft4) obj).getClass();
                if ((iIntValue12 & 48) == 0) {
                    iIntValue12 |= ((tj3) ye1Var7).m22116e(iIntValue11) ? 32 : 16;
                }
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue12 & 1, (iIntValue12 & 145) != 144)) {
                    String str4 = (String) list5.get(iIntValue11);
                    for (Object obj8 : list6) {
                        if (cl9.m4834Q(((br9) obj8).f8901a, str4, true)) {
                            supportedEfforts = obj8;
                            br9Var = (br9) supportedEfforts;
                            if (br9Var == null && br9Var.f8902b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z6 = !z;
                            if (br9Var != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            g6d.m12388a(str4, z2, z6, vi3Var5, tj3Var7, 0);
                            break;
                        }
                    }
                    br9Var = (br9) supportedEfforts;
                    if (br9Var == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    boolean z7 = !z;
                    if (br9Var != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    g6d.m12388a(str4, z2, z7, vi3Var5, tj3Var7, 0);
                } else {
                    tj3Var7.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
