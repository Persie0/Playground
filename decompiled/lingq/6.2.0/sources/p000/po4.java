package p000;

import android.os.Bundle;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.achievements.RepairStreakFragment;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$StatDetail;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.feature.statistics.C2813d;
import com.lingq.feature.statistics.LanguageStatsUpdateFragment;
import com.lingq.feature.statistics.R$id;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class po4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LanguageStatsUpdateFragment f56586b;

    public /* synthetic */ po4(LanguageStatsUpdateFragment languageStatsUpdateFragment, int i) {
        this.f56585a = i;
        this.f56586b = languageStatsUpdateFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f56585a;
        xfa xfaVar = xfa.f68157a;
        final LanguageStatsUpdateFragment languageStatsUpdateFragment = this.f56586b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final int i2 = 2;
                final int i3 = 1;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33451q, tj3Var);
                    t66 t66VarM2513c2 = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33460z, tj3Var);
                    t66 t66VarM2513c3 = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33453s, tj3Var);
                    t66 t66VarM2513c4 = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33452r, tj3Var);
                    t66 t66VarM2513c5 = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33455u, tj3Var);
                    t66 t66VarM2513c6 = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33459y, tj3Var);
                    t66 t66VarM2513c7 = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33457w, tj3Var);
                    t66 t66VarM2513c8 = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33458x, tj3Var);
                    t66 t66VarM2513c9 = AbstractC0711a.m2513c(languageStatsUpdateFragment.m9717d0().f33456v, tj3Var);
                    String strM17093L = AbstractC3352my.m17093L(languageStatsUpdateFragment.m2090R(), languageStatsUpdateFragment.m9717d0().f33436b.mo4589b2());
                    qj9 qj9Var = (qj9) t66VarM2513c.getValue();
                    z41 z41Var = (z41) t66VarM2513c2.getValue();
                    d4b d4bVar = (d4b) t66VarM2513c3.getValue();
                    uj9 uj9Var = (uj9) t66VarM2513c4.getValue();
                    InterfaceC3066h8 interfaceC3066h8 = (InterfaceC3066h8) t66VarM2513c5.getValue();
                    a85 a85Var = (a85) t66VarM2513c9.getValue();
                    g80 g80Var = (g80) t66VarM2513c6.getValue();
                    dt0 dt0Var = (dt0) t66VarM2513c7.getValue();
                    ws1 ws1Var = (ws1) t66VarM2513c8.getValue();
                    boolean zM22124i = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O = tj3Var.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new ui3() { // from class: ro4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i4 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                switch (i4) {
                                    case 0:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(new u96(false));
                                        return xfaVar2;
                                    case 1:
                                        b34.m3244j(languageStatsUpdateFragment2).m22689f();
                                        return xfaVar2;
                                    case 2:
                                        hm5 hm5Var = languageStatsUpdateFragment2.f33225D0;
                                        if (hm5Var == null) {
                                            fa4.m11636J("analytics");
                                            throw null;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("detail", LqAnalyticsValues$StatDetail.Challenges.getValue());
                                        ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
                                        languageStatsUpdateFragment2.m9716c0().m23737z(q96.f57452b);
                                        return xfaVar2;
                                    case 3:
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToStatsBadges), null);
                                        return xfaVar2;
                                    case 4:
                                        ud6 ud6VarM3244j2 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToStatsShare), null);
                                        return xfaVar2;
                                    case 5:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(ga6.f40462b);
                                        return xfaVar2;
                                    default:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToStatsCalendar), null);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var.m22131l0(objM22097O);
                    }
                    ui3 ui3Var = (ui3) objM22097O;
                    boolean zM22124i2 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        final int i4 = 4;
                        objM22097O2 = new ui3() { // from class: ro4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i5 = i4;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                switch (i5) {
                                    case 0:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(new u96(false));
                                        return xfaVar2;
                                    case 1:
                                        b34.m3244j(languageStatsUpdateFragment2).m22689f();
                                        return xfaVar2;
                                    case 2:
                                        hm5 hm5Var = languageStatsUpdateFragment2.f33225D0;
                                        if (hm5Var == null) {
                                            fa4.m11636J("analytics");
                                            throw null;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("detail", LqAnalyticsValues$StatDetail.Challenges.getValue());
                                        ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
                                        languageStatsUpdateFragment2.m9716c0().m23737z(q96.f57452b);
                                        return xfaVar2;
                                    case 3:
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToStatsBadges), null);
                                        return xfaVar2;
                                    case 4:
                                        ud6 ud6VarM3244j2 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToStatsShare), null);
                                        return xfaVar2;
                                    case 5:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(ga6.f40462b);
                                        return xfaVar2;
                                    default:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToStatsCalendar), null);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var2 = (ui3) objM22097O2;
                    boolean zM22124i3 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        final int i5 = 5;
                        objM22097O3 = new ui3() { // from class: ro4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i6 = i5;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                switch (i6) {
                                    case 0:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(new u96(false));
                                        return xfaVar2;
                                    case 1:
                                        b34.m3244j(languageStatsUpdateFragment2).m22689f();
                                        return xfaVar2;
                                    case 2:
                                        hm5 hm5Var = languageStatsUpdateFragment2.f33225D0;
                                        if (hm5Var == null) {
                                            fa4.m11636J("analytics");
                                            throw null;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("detail", LqAnalyticsValues$StatDetail.Challenges.getValue());
                                        ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
                                        languageStatsUpdateFragment2.m9716c0().m23737z(q96.f57452b);
                                        return xfaVar2;
                                    case 3:
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToStatsBadges), null);
                                        return xfaVar2;
                                    case 4:
                                        ud6 ud6VarM3244j2 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToStatsShare), null);
                                        return xfaVar2;
                                    case 5:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(ga6.f40462b);
                                        return xfaVar2;
                                    default:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToStatsCalendar), null);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var.m22131l0(objM22097O3);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O3;
                    boolean zM22124i4 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O4 = tj3Var.m22097O();
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        final int i6 = 6;
                        objM22097O4 = new ui3() { // from class: ro4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i7 = i6;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                switch (i7) {
                                    case 0:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(new u96(false));
                                        return xfaVar2;
                                    case 1:
                                        b34.m3244j(languageStatsUpdateFragment2).m22689f();
                                        return xfaVar2;
                                    case 2:
                                        hm5 hm5Var = languageStatsUpdateFragment2.f33225D0;
                                        if (hm5Var == null) {
                                            fa4.m11636J("analytics");
                                            throw null;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("detail", LqAnalyticsValues$StatDetail.Challenges.getValue());
                                        ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
                                        languageStatsUpdateFragment2.m9716c0().m23737z(q96.f57452b);
                                        return xfaVar2;
                                    case 3:
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToStatsBadges), null);
                                        return xfaVar2;
                                    case 4:
                                        ud6 ud6VarM3244j2 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToStatsShare), null);
                                        return xfaVar2;
                                    case 5:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(ga6.f40462b);
                                        return xfaVar2;
                                    default:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToStatsCalendar), null);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var.m22131l0(objM22097O4);
                    }
                    ui3 ui3Var4 = (ui3) objM22097O4;
                    boolean zM22124i5 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O5 = tj3Var.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        objM22097O5 = new po4(languageStatsUpdateFragment, i2);
                        tj3Var.m22131l0(objM22097O5);
                    }
                    zi3 zi3Var = (zi3) objM22097O5;
                    boolean zM22124i6 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O6 = tj3Var.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        objM22097O6 = new vi3() { // from class: qo4
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                Object value;
                                int i7 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) obj3;
                                switch (i7) {
                                    case 0:
                                        languageProgressPeriod.getClass();
                                        C3244l c3244l = languageStatsUpdateFragment2.m9717d0().f33454t;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, languageProgressPeriod));
                                        break;
                                    default:
                                        languageProgressPeriod.getClass();
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        uo4 uo4Var = vo4.Companion;
                                        LanguageProgressPeriod languageProgressPeriod2 = LanguageProgressPeriod.Today;
                                        uo4Var.getClass();
                                        languageProgressPeriod2.getClass();
                                        jfa.m14428k(ud6VarM3244j, new so4(languageProgressPeriod2), null);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var.m22131l0(objM22097O6);
                    }
                    vi3 vi3Var = (vi3) objM22097O6;
                    boolean zM22124i7 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O7 = tj3Var.m22097O();
                    if (zM22124i7 || objM22097O7 == p84Var) {
                        objM22097O7 = new C2813d(0, languageStatsUpdateFragment);
                        tj3Var.m22131l0(objM22097O7);
                    }
                    zi3 zi3Var2 = (zi3) objM22097O7;
                    boolean zM22124i8 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O8 = tj3Var.m22097O();
                    if (zM22124i8 || objM22097O8 == p84Var) {
                        objM22097O8 = new po4(languageStatsUpdateFragment, i3);
                        tj3Var.m22131l0(objM22097O8);
                    }
                    zi3 zi3Var3 = (zi3) objM22097O8;
                    boolean zM22124i9 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O9 = tj3Var.m22097O();
                    if (zM22124i9 || objM22097O9 == p84Var) {
                        final int i7 = 0;
                        objM22097O9 = new vi3() { // from class: qo4
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                Object value;
                                int i8 = i7;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) obj3;
                                switch (i8) {
                                    case 0:
                                        languageProgressPeriod.getClass();
                                        C3244l c3244l = languageStatsUpdateFragment2.m9717d0().f33454t;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, languageProgressPeriod));
                                        break;
                                    default:
                                        languageProgressPeriod.getClass();
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        uo4 uo4Var = vo4.Companion;
                                        LanguageProgressPeriod languageProgressPeriod2 = LanguageProgressPeriod.Today;
                                        uo4Var.getClass();
                                        languageProgressPeriod2.getClass();
                                        jfa.m14428k(ud6VarM3244j, new so4(languageProgressPeriod2), null);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var.m22131l0(objM22097O9);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O9;
                    boolean zM22124i10 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O10 = tj3Var.m22097O();
                    if (zM22124i10 || objM22097O10 == p84Var) {
                        final int i8 = 0;
                        objM22097O10 = new ui3() { // from class: ro4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i9 = i8;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                switch (i9) {
                                    case 0:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(new u96(false));
                                        return xfaVar2;
                                    case 1:
                                        b34.m3244j(languageStatsUpdateFragment2).m22689f();
                                        return xfaVar2;
                                    case 2:
                                        hm5 hm5Var = languageStatsUpdateFragment2.f33225D0;
                                        if (hm5Var == null) {
                                            fa4.m11636J("analytics");
                                            throw null;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("detail", LqAnalyticsValues$StatDetail.Challenges.getValue());
                                        ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
                                        languageStatsUpdateFragment2.m9716c0().m23737z(q96.f57452b);
                                        return xfaVar2;
                                    case 3:
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToStatsBadges), null);
                                        return xfaVar2;
                                    case 4:
                                        ud6 ud6VarM3244j2 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToStatsShare), null);
                                        return xfaVar2;
                                    case 5:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(ga6.f40462b);
                                        return xfaVar2;
                                    default:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToStatsCalendar), null);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var.m22131l0(objM22097O10);
                    }
                    ui3 ui3Var5 = (ui3) objM22097O10;
                    boolean zM22124i11 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O11 = tj3Var.m22097O();
                    if (zM22124i11 || objM22097O11 == p84Var) {
                        objM22097O11 = new C2813d(i3, languageStatsUpdateFragment);
                        tj3Var.m22131l0(objM22097O11);
                    }
                    zi3 zi3Var4 = (zi3) objM22097O11;
                    boolean zM22124i12 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O12 = tj3Var.m22097O();
                    if (zM22124i12 || objM22097O12 == p84Var) {
                        objM22097O12 = new ui3() { // from class: ro4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i9 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                switch (i9) {
                                    case 0:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(new u96(false));
                                        return xfaVar2;
                                    case 1:
                                        b34.m3244j(languageStatsUpdateFragment2).m22689f();
                                        return xfaVar2;
                                    case 2:
                                        hm5 hm5Var = languageStatsUpdateFragment2.f33225D0;
                                        if (hm5Var == null) {
                                            fa4.m11636J("analytics");
                                            throw null;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("detail", LqAnalyticsValues$StatDetail.Challenges.getValue());
                                        ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
                                        languageStatsUpdateFragment2.m9716c0().m23737z(q96.f57452b);
                                        return xfaVar2;
                                    case 3:
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToStatsBadges), null);
                                        return xfaVar2;
                                    case 4:
                                        ud6 ud6VarM3244j2 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToStatsShare), null);
                                        return xfaVar2;
                                    case 5:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(ga6.f40462b);
                                        return xfaVar2;
                                    default:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToStatsCalendar), null);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var.m22131l0(objM22097O12);
                    }
                    ui3 ui3Var6 = (ui3) objM22097O12;
                    boolean zM22124i13 = tj3Var.m22124i(languageStatsUpdateFragment);
                    Object objM22097O13 = tj3Var.m22097O();
                    if (zM22124i13 || objM22097O13 == p84Var) {
                        final int i9 = 3;
                        objM22097O13 = new ui3() { // from class: ro4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i10 = i9;
                                xfa xfaVar2 = xfa.f68157a;
                                LanguageStatsUpdateFragment languageStatsUpdateFragment2 = languageStatsUpdateFragment;
                                switch (i10) {
                                    case 0:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(new u96(false));
                                        return xfaVar2;
                                    case 1:
                                        b34.m3244j(languageStatsUpdateFragment2).m22689f();
                                        return xfaVar2;
                                    case 2:
                                        hm5 hm5Var = languageStatsUpdateFragment2.f33225D0;
                                        if (hm5Var == null) {
                                            fa4.m11636J("analytics");
                                            throw null;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("detail", LqAnalyticsValues$StatDetail.Challenges.getValue());
                                        ((C1240a) hm5Var).m7025f("stat detail viewed", bundle);
                                        languageStatsUpdateFragment2.m9716c0().m23737z(q96.f57452b);
                                        return xfaVar2;
                                    case 3:
                                        ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToStatsBadges), null);
                                        return xfaVar2;
                                    case 4:
                                        ud6 ud6VarM3244j2 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToStatsShare), null);
                                        return xfaVar2;
                                    case 5:
                                        languageStatsUpdateFragment2.m9716c0().m23737z(ga6.f40462b);
                                        return xfaVar2;
                                    default:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageStatsUpdateFragment2);
                                        vo4.Companion.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToStatsCalendar), null);
                                        return xfaVar2;
                                }
                            }
                        };
                        tj3Var.m22131l0(objM22097O13);
                    }
                    cid.m4753d(strM17093L, qj9Var, d4bVar, z41Var, uj9Var, interfaceC3066h8, a85Var, dt0Var, g80Var, ui3Var, ui3Var2, ui3Var3, ui3Var4, zi3Var, vi3Var, zi3Var2, zi3Var3, vi3Var2, ws1Var, ui3Var5, zi3Var4, ui3Var6, (ui3) objM22097O13, tj3Var, 0, 0, 0);
                }
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                RepairStreakFragment repairStreakFragment = new RepairStreakFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("streak", iIntValue2);
                bundle.putString("brokenStreakDate", (String) obj2);
                repairStreakFragment.m2095W(bundle);
                repairStreakFragment.m3665k0(languageStatsUpdateFragment.m2106h(), "repairStreakFragment");
                break;
            default:
                LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) obj;
                LanguageProgressMetric languageProgressMetric = (LanguageProgressMetric) obj2;
                languageProgressPeriod.getClass();
                languageProgressMetric.getClass();
                ud6 ud6VarM3244j = b34.m3244j(languageStatsUpdateFragment);
                uo4 uo4Var = vo4.Companion;
                if (languageProgressPeriod == LanguageProgressPeriod.Today) {
                    languageProgressPeriod = LanguageProgressPeriod.Last7Days;
                }
                uo4Var.getClass();
                languageProgressPeriod.getClass();
                jfa.m14428k(ud6VarM3244j, new to4(languageProgressPeriod, languageProgressMetric), null);
                break;
        }
        return xfaVar;
    }
}
