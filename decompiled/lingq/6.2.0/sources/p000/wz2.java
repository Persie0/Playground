package p000;

import android.os.Bundle;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.premium.FreeTrialFragment;
import com.lingq.core.premium.R$string;
import com.lingq.core.settings.notifications.AbstractC1875a;
import com.lingq.core.settings.notifications.C1876b;
import com.lingq.core.settings.notifications.NotificationsSettingsFragment;
import com.lingq.feature.edit.AbstractC2076b;
import com.lingq.feature.edit.LessonEditParentFragment;
import com.lingq.feature.karaoke.AbstractC2117b;
import com.lingq.feature.karaoke.KaraokeFragment;
import com.lingq.feature.language.AbstractC2119a;
import com.lingq.feature.language.LanguageSelectorFragment;
import com.lingq.feature.lessoninfo.AbstractC2131b;
import com.lingq.feature.lessoninfo.LessonInfoFragment;
import com.lingq.feature.more.HelpFragment;
import com.lingq.feature.more.InviteFriendsFragment;
import com.lingq.feature.notifications.AbstractC2167a;
import com.lingq.feature.notifications.NotificationsFragment;
import com.lingq.feature.onboarding.accent.AbstractC2175a;
import com.lingq.feature.onboarding.accent.OnboardingAccentFragment;
import com.lingq.feature.onboarding.accent.OnboardingAccentViewModel;
import com.lingq.feature.onboarding.achieve.OnboardingAchieveFragment;
import com.lingq.feature.onboarding.dailygoal.AbstractC2200a;
import com.lingq.feature.onboarding.dailygoal.OnboardingDailyGoalFragment;
import com.lingq.feature.reader.stats.AbstractC2527c;
import com.lingq.feature.reader.stats.LessonCompleteFragment;
import com.lingq.feature.reader.stats.p019ui.lingqs.LessonCompleteVocabularyFragment;
import com.lingq.feature.reader.stats.p019ui.words.AbstractC2572b;
import com.lingq.feature.reader.stats.p019ui.words.LessonCompleteDealBlueFragment;
import com.lingq.feature.reader.vocabulary.model.VocabularyType;
import com.lingq.feature.search.fastsearch.AbstractC2767a;
import com.lingq.feature.search.fastsearch.FastSearchFragment;
import com.lingq.feature.statistics.C2811b;
import com.lingq.feature.statistics.C2812c;
import com.lingq.feature.statistics.C2813d;
import com.lingq.feature.statistics.LanguageStatsBadgesFragment;
import com.lingq.feature.statistics.LanguageStatsDetailsFragment;
import com.lingq.feature.statistics.LingQMethodFragment;
import java.util.Set;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wz2 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67545b;

    public /* synthetic */ wz2(Object obj, int i) {
        this.f67544a = i;
        this.f67545b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x03f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x03f3 A[Catch: all -> 0x03e9, LOOP:2: B:123:0x03c1->B:135:0x03f3, LOOP_END, TryCatch #0 {all -> 0x03e9, blocks: (B:101:0x0353, B:104:0x0372, B:106:0x037e, B:108:0x0388, B:110:0x038e, B:112:0x039c, B:118:0x03ab, B:120:0x03b6, B:123:0x03c1, B:125:0x03cc, B:127:0x03d6, B:129:0x03dc, B:132:0x03eb, B:135:0x03f3, B:136:0x03f6), top: B:447:0x0353 }] */
    /* JADX WARN: Code duplicated, block: B:455:0x03f6 A[SYNTHETIC] */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i;
        long j;
        long j2;
        long j3;
        int i2 = 26;
        int i3 = 7;
        int i4 = 25;
        int i5 = 17;
        int i6 = 3;
        final int i7 = 2;
        switch (this.f67544a) {
            case 0:
                FastSearchFragment fastSearchFragment = (FastSearchFragment) this.f67545b;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ud6 ud6VarM3244j = b34.m3244j(fastSearchFragment);
                    w41 w41Var = fastSearchFragment.f32832B0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    bia biaVar = fastSearchFragment.f32833C0;
                    if (biaVar == null) {
                        fa4.m11636J("upgradePopupDelegate");
                        throw null;
                    }
                    AbstractC2767a.m9677a(ud6VarM3244j, w41Var, biaVar, null, tj3Var, 0);
                } else {
                    tj3Var.m22102U();
                }
                return xfa.f68157a;
            case 1:
                FreeTrialFragment freeTrialFragment = (FreeTrialFragment) this.f67545b;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rh3 rh3Var = (rh3) freeTrialFragment.f22319w0.getValue();
                    ud6 ud6VarM3244j2 = b34.m3244j(freeTrialFragment);
                    boolean zM22124i = tj3Var2.m22124i(freeTrialFragment);
                    Object objM22097O = tj3Var2.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new C3539rk(freeTrialFragment, i5);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    AbstractC1839a.m8527e(null, rh3Var, ud6VarM3244j2, (ui3) objM22097O, tj3Var2, 0);
                } else {
                    tj3Var2.m22102U();
                }
                return xfa.f68157a;
            case 2:
                li3 li3Var = (li3) this.f67545b;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else if (li3Var.f49706i) {
                    tj3Var3.m22111b0(1910187583);
                    tj3Var3.m22139q(false);
                } else {
                    tj3Var3.m22111b0(1910021330);
                    lw9.m16554b(vz1.m23620a0(tj3Var3, R$string.free_trial_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                    tj3Var3.m22139q(false);
                }
                return xfa.f68157a;
            case 3:
                HelpFragment helpFragment = (HelpFragment) this.f67545b;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zM22124i2 = tj3Var4.m22124i(helpFragment);
                    Object objM22097O2 = tj3Var4.m22097O();
                    if (zM22124i2 || objM22097O2 == we1.f66679a) {
                        objM22097O2 = new C3741x(helpFragment, 21);
                        tj3Var4.m22131l0(objM22097O2);
                    }
                    ls3.m16525c((vi3) objM22097O2, tj3Var4, 0);
                } else {
                    tj3Var4.m22102U();
                }
                return xfa.f68157a;
            case 4:
                InviteFriendsFragment inviteFriendsFragment = (InviteFriendsFragment) this.f67545b;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zM22124i3 = tj3Var5.m22124i(inviteFriendsFragment);
                    Object objM22097O3 = tj3Var5.m22097O();
                    if (zM22124i3 || objM22097O3 == we1.f66679a) {
                        objM22097O3 = new C3741x(inviteFriendsFragment, i2);
                        tj3Var5.m22131l0(objM22097O3);
                    }
                    igd.m13903b(null, (vi3) objM22097O3, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfa.f68157a;
            case 5:
                KaraokeFragment karaokeFragment = (KaraokeFragment) this.f67545b;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zM22124i4 = tj3Var6.m22124i(karaokeFragment);
                    Object objM22097O4 = tj3Var6.m22097O();
                    if (zM22124i4 || objM22097O4 == we1.f66679a) {
                        objM22097O4 = new dh4(karaokeFragment, 1);
                        tj3Var6.m22131l0(objM22097O4);
                    }
                    AbstractC2117b.m9023c(null, (vi3) objM22097O4, tj3Var6, 0);
                } else {
                    tj3Var6.m22102U();
                }
                return xfa.f68157a;
            case 6:
                final LanguageSelectorFragment languageSelectorFragment = (LanguageSelectorFragment) this.f67545b;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                p84 p84Var = we1.f66679a;
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zM22124i5 = tj3Var7.m22124i(languageSelectorFragment);
                    Object objM22097O5 = tj3Var7.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        final int i8 = 0;
                        objM22097O5 = new ui3() { // from class: um4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i9 = i8;
                                xfa xfaVar = xfa.f68157a;
                                LanguageSelectorFragment languageSelectorFragment2 = languageSelectorFragment;
                                switch (i9) {
                                    case 0:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageSelectorFragment2);
                                        ud6VarM3244j3.getClass();
                                        try {
                                            ud6VarM3244j3.m22689f();
                                        } catch (IllegalStateException e) {
                                            rm5 rm5Var = sm5.Companion;
                                            String str = "safeNavigateUp failed: " + e.getMessage();
                                            rm5Var.getClass();
                                            h0a.f41641a.mo11431b(str, new Object[0]);
                                            r43.m20289a().m20290b(e);
                                        }
                                        break;
                                    default:
                                        x74.m24338E(languageSelectorFragment2, "languageSelector", new Bundle());
                                        break;
                                }
                                return xfaVar;
                                return xfaVar;
                            }
                        };
                        tj3Var7.m22131l0(objM22097O5);
                    }
                    ui3 ui3Var = (ui3) objM22097O5;
                    boolean zM22124i6 = tj3Var7.m22124i(languageSelectorFragment);
                    Object objM22097O6 = tj3Var7.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        final int i9 = 1;
                        objM22097O6 = new ui3() { // from class: um4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i10 = i9;
                                xfa xfaVar = xfa.f68157a;
                                LanguageSelectorFragment languageSelectorFragment2 = languageSelectorFragment;
                                switch (i10) {
                                    case 0:
                                        ud6 ud6VarM3244j3 = b34.m3244j(languageSelectorFragment2);
                                        ud6VarM3244j3.getClass();
                                        try {
                                            ud6VarM3244j3.m22689f();
                                        } catch (IllegalStateException e) {
                                            rm5 rm5Var = sm5.Companion;
                                            String str = "safeNavigateUp failed: " + e.getMessage();
                                            rm5Var.getClass();
                                            h0a.f41641a.mo11431b(str, new Object[0]);
                                            r43.m20289a().m20290b(e);
                                        }
                                        break;
                                    default:
                                        x74.m24338E(languageSelectorFragment2, "languageSelector", new Bundle());
                                        break;
                                }
                                return xfaVar;
                                return xfaVar;
                            }
                        };
                        tj3Var7.m22131l0(objM22097O6);
                    }
                    AbstractC2119a.m9038c(null, ui3Var, (ui3) objM22097O6, tj3Var7, 0);
                } else {
                    tj3Var7.m22102U();
                }
                return xfa.f68157a;
            case 7:
                LanguageStatsBadgesFragment languageStatsBadgesFragment = (LanguageStatsBadgesFragment) this.f67545b;
                w41 w41Var2 = languageStatsBadgesFragment.f33149B0;
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(((C2811b) w41Var2.getValue()).f33386e, tj3Var8);
                    String strM17093L = AbstractC3352my.m17093L(languageStatsBadgesFragment.m2090R(), ((C2811b) w41Var2.getValue()).f33383b.mo4589b2());
                    g80 g80Var = (g80) t66VarM2513c.getValue();
                    boolean zM22124i7 = tj3Var8.m22124i(languageStatsBadgesFragment);
                    Object objM22097O7 = tj3Var8.m22097O();
                    if (zM22124i7 || objM22097O7 == we1.f66679a) {
                        objM22097O7 = new C3539rk(languageStatsBadgesFragment, i4);
                        tj3Var8.m22131l0(objM22097O7);
                    }
                    zhd.m25663a(strM17093L, g80Var, (ui3) objM22097O7, tj3Var8, 0, 0);
                } else {
                    tj3Var8.m22102U();
                }
                return xfa.f68157a;
            case 8:
                final LanguageStatsDetailsFragment languageStatsDetailsFragment = (LanguageStatsDetailsFragment) this.f67545b;
                w41 w41Var3 = languageStatsDetailsFragment.f33170B0;
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                p84 p84Var2 = we1.f66679a;
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    t66 t66VarM2513c2 = AbstractC0711a.m2513c(((C2812c) w41Var3.getValue()).f33396k, tj3Var9);
                    String strM17093L2 = AbstractC3352my.m17093L(languageStatsDetailsFragment.m2090R(), ((C2812c) w41Var3.getValue()).f33387b.mo4589b2());
                    ko4 ko4Var = (ko4) t66VarM2513c2.getValue();
                    boolean zM22124i8 = tj3Var9.m22124i(languageStatsDetailsFragment);
                    Object objM22097O8 = tj3Var9.m22097O();
                    if (zM22124i8 || objM22097O8 == p84Var2) {
                        objM22097O8 = new C3539rk(languageStatsDetailsFragment, i2);
                        tj3Var9.m22131l0(objM22097O8);
                    }
                    ui3 ui3Var2 = (ui3) objM22097O8;
                    boolean zM22124i9 = tj3Var9.m22124i(languageStatsDetailsFragment);
                    Object objM22097O9 = tj3Var9.m22097O();
                    if (zM22124i9 || objM22097O9 == p84Var2) {
                        final int i10 = 0;
                        objM22097O9 = new vi3() { // from class: xn4
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                Object value;
                                Object value2;
                                int i11 = i10;
                                xfa xfaVar = xfa.f68157a;
                                LanguageStatsDetailsFragment languageStatsDetailsFragment2 = languageStatsDetailsFragment;
                                switch (i11) {
                                    case 0:
                                        LanguageProgressMetric languageProgressMetric = (LanguageProgressMetric) obj3;
                                        languageProgressMetric.getClass();
                                        C3244l c3244l = ((C2812c) languageStatsDetailsFragment2.f33170B0.getValue()).f33394i;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, languageProgressMetric));
                                        return xfaVar;
                                    case 1:
                                        LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) obj3;
                                        languageProgressPeriod.getClass();
                                        C3244l c3244l2 = ((C2812c) languageStatsDetailsFragment2.f33170B0.getValue()).f33393h;
                                        do {
                                            value2 = c3244l2.getValue();
                                        } while (!c3244l2.m15570h(value2, languageProgressPeriod));
                                        return xfaVar;
                                    default:
                                        dn4 dn4Var = (dn4) obj3;
                                        dn4Var.getClass();
                                        if (dn4Var.equals(dn4.f35891a)) {
                                            w41 w41Var4 = languageStatsDetailsFragment2.f33171C0;
                                            if (w41Var4 != null) {
                                                w41Var4.m23737z(new na6(b34.m3244j(languageStatsDetailsFragment2)));
                                                return xfaVar;
                                            }
                                            fa4.m11636J("navGraphController");
                                            throw null;
                                        }
                                        if (dn4Var.equals(dn4.f35892b) || dn4Var.equals(dn4.f35893c) || dn4Var.equals(dn4.f35894d)) {
                                            return xfaVar;
                                        }
                                        if (dn4Var.equals(dn4.f35895e)) {
                                            id3 id3VarM2089Q = languageStatsDetailsFragment2.m2089Q();
                                            b34.m3244j(languageStatsDetailsFragment2);
                                            mbd.m16755c(id3VarM2089Q, "https://www.lingq.com/en/learn/en/web/tutors/search", null, 18);
                                            return xfaVar;
                                        }
                                        if (!dn4Var.equals(dn4.f35896f)) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        id3 id3VarM2089Q2 = languageStatsDetailsFragment2.m2089Q();
                                        b34.m3244j(languageStatsDetailsFragment2);
                                        mbd.m16755c(id3VarM2089Q2, "https://www.lingq.com/en/learn/en/web/community/exchange", null, 18);
                                        return xfaVar;
                                }
                            }
                        };
                        tj3Var9.m22131l0(objM22097O9);
                    }
                    vi3 vi3Var = (vi3) objM22097O9;
                    boolean zM22124i10 = tj3Var9.m22124i(languageStatsDetailsFragment);
                    Object objM22097O10 = tj3Var9.m22097O();
                    if (zM22124i10 || objM22097O10 == p84Var2) {
                        final int i11 = 1;
                        objM22097O10 = new vi3() { // from class: xn4
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                Object value;
                                Object value2;
                                int i12 = i11;
                                xfa xfaVar = xfa.f68157a;
                                LanguageStatsDetailsFragment languageStatsDetailsFragment2 = languageStatsDetailsFragment;
                                switch (i12) {
                                    case 0:
                                        LanguageProgressMetric languageProgressMetric = (LanguageProgressMetric) obj3;
                                        languageProgressMetric.getClass();
                                        C3244l c3244l = ((C2812c) languageStatsDetailsFragment2.f33170B0.getValue()).f33394i;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, languageProgressMetric));
                                        return xfaVar;
                                    case 1:
                                        LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) obj3;
                                        languageProgressPeriod.getClass();
                                        C3244l c3244l2 = ((C2812c) languageStatsDetailsFragment2.f33170B0.getValue()).f33393h;
                                        do {
                                            value2 = c3244l2.getValue();
                                        } while (!c3244l2.m15570h(value2, languageProgressPeriod));
                                        return xfaVar;
                                    default:
                                        dn4 dn4Var = (dn4) obj3;
                                        dn4Var.getClass();
                                        if (dn4Var.equals(dn4.f35891a)) {
                                            w41 w41Var4 = languageStatsDetailsFragment2.f33171C0;
                                            if (w41Var4 != null) {
                                                w41Var4.m23737z(new na6(b34.m3244j(languageStatsDetailsFragment2)));
                                                return xfaVar;
                                            }
                                            fa4.m11636J("navGraphController");
                                            throw null;
                                        }
                                        if (dn4Var.equals(dn4.f35892b) || dn4Var.equals(dn4.f35893c) || dn4Var.equals(dn4.f35894d)) {
                                            return xfaVar;
                                        }
                                        if (dn4Var.equals(dn4.f35895e)) {
                                            id3 id3VarM2089Q = languageStatsDetailsFragment2.m2089Q();
                                            b34.m3244j(languageStatsDetailsFragment2);
                                            mbd.m16755c(id3VarM2089Q, "https://www.lingq.com/en/learn/en/web/tutors/search", null, 18);
                                            return xfaVar;
                                        }
                                        if (!dn4Var.equals(dn4.f35896f)) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        id3 id3VarM2089Q2 = languageStatsDetailsFragment2.m2089Q();
                                        b34.m3244j(languageStatsDetailsFragment2);
                                        mbd.m16755c(id3VarM2089Q2, "https://www.lingq.com/en/learn/en/web/community/exchange", null, 18);
                                        return xfaVar;
                                }
                            }
                        };
                        tj3Var9.m22131l0(objM22097O10);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O10;
                    boolean zM22124i11 = tj3Var9.m22124i(languageStatsDetailsFragment);
                    Object objM22097O11 = tj3Var9.m22097O();
                    if (zM22124i11 || objM22097O11 == p84Var2) {
                        objM22097O11 = new C2813d(i7, languageStatsDetailsFragment);
                        tj3Var9.m22131l0(objM22097O11);
                    }
                    zi3 zi3Var = (zi3) objM22097O11;
                    boolean zM22124i12 = tj3Var9.m22124i(languageStatsDetailsFragment);
                    Object objM22097O12 = tj3Var9.m22097O();
                    if (zM22124i12 || objM22097O12 == p84Var2) {
                        objM22097O12 = new vi3() { // from class: xn4
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                Object value;
                                Object value2;
                                int i12 = i7;
                                xfa xfaVar = xfa.f68157a;
                                LanguageStatsDetailsFragment languageStatsDetailsFragment2 = languageStatsDetailsFragment;
                                switch (i12) {
                                    case 0:
                                        LanguageProgressMetric languageProgressMetric = (LanguageProgressMetric) obj3;
                                        languageProgressMetric.getClass();
                                        C3244l c3244l = ((C2812c) languageStatsDetailsFragment2.f33170B0.getValue()).f33394i;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, languageProgressMetric));
                                        return xfaVar;
                                    case 1:
                                        LanguageProgressPeriod languageProgressPeriod = (LanguageProgressPeriod) obj3;
                                        languageProgressPeriod.getClass();
                                        C3244l c3244l2 = ((C2812c) languageStatsDetailsFragment2.f33170B0.getValue()).f33393h;
                                        do {
                                            value2 = c3244l2.getValue();
                                        } while (!c3244l2.m15570h(value2, languageProgressPeriod));
                                        return xfaVar;
                                    default:
                                        dn4 dn4Var = (dn4) obj3;
                                        dn4Var.getClass();
                                        if (dn4Var.equals(dn4.f35891a)) {
                                            w41 w41Var4 = languageStatsDetailsFragment2.f33171C0;
                                            if (w41Var4 != null) {
                                                w41Var4.m23737z(new na6(b34.m3244j(languageStatsDetailsFragment2)));
                                                return xfaVar;
                                            }
                                            fa4.m11636J("navGraphController");
                                            throw null;
                                        }
                                        if (dn4Var.equals(dn4.f35892b) || dn4Var.equals(dn4.f35893c) || dn4Var.equals(dn4.f35894d)) {
                                            return xfaVar;
                                        }
                                        if (dn4Var.equals(dn4.f35895e)) {
                                            id3 id3VarM2089Q = languageStatsDetailsFragment2.m2089Q();
                                            b34.m3244j(languageStatsDetailsFragment2);
                                            mbd.m16755c(id3VarM2089Q, "https://www.lingq.com/en/learn/en/web/tutors/search", null, 18);
                                            return xfaVar;
                                        }
                                        if (!dn4Var.equals(dn4.f35896f)) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        id3 id3VarM2089Q2 = languageStatsDetailsFragment2.m2089Q();
                                        b34.m3244j(languageStatsDetailsFragment2);
                                        mbd.m16755c(id3VarM2089Q2, "https://www.lingq.com/en/learn/en/web/community/exchange", null, 18);
                                        return xfaVar;
                                }
                            }
                        };
                        tj3Var9.m22131l0(objM22097O12);
                    }
                    bid.m3745a(strM17093L2, ko4Var, ui3Var2, vi3Var, vi3Var2, zi3Var, (vi3) objM22097O12, tj3Var9, 0, 0);
                } else {
                    tj3Var9.m22102U();
                }
                return xfa.f68157a;
            case 9:
                ((Integer) obj2).getClass();
                cid.m4752c((g80) this.f67545b, (ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 10:
                ((Integer) obj2).getClass();
                cid.m4760k((a85) this.f67545b, (ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 11:
                LessonCompleteDealBlueFragment lessonCompleteDealBlueFragment = (LessonCompleteDealBlueFragment) this.f67545b;
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ud6 ud6VarM3244j3 = b34.m3244j(lessonCompleteDealBlueFragment);
                    int i12 = ((xy4) lessonCompleteDealBlueFragment.f31077B0.getValue()).f68959a;
                    bia biaVar2 = lessonCompleteDealBlueFragment.f31078C0;
                    if (biaVar2 == null) {
                        fa4.m11636J("upgradePopupDelegate");
                        throw null;
                    }
                    AbstractC2572b.m9484a(ud6VarM3244j3, i12, null, null, biaVar2, tj3Var10, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfa.f68157a;
            case 12:
                LessonCompleteFragment lessonCompleteFragment = (LessonCompleteFragment) this.f67545b;
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ud6 ud6VarM3244j4 = b34.m3244j(lessonCompleteFragment);
                    w41 w41Var4 = lessonCompleteFragment.f30508B0;
                    if (w41Var4 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    bia biaVar3 = lessonCompleteFragment.f30509C0;
                    if (biaVar3 == null) {
                        fa4.m11636J("upgradePopupDelegate");
                        throw null;
                    }
                    AbstractC2527c.m9455a(ud6VarM3244j4, w41Var4, biaVar3, null, null, tj3Var11, 0);
                } else {
                    tj3Var11.m22102U();
                }
                return xfa.f68157a;
            case 13:
                LessonCompleteVocabularyFragment lessonCompleteVocabularyFragment = (LessonCompleteVocabularyFragment) this.f67545b;
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    xz4.m24793a(b34.m3244j(lessonCompleteVocabularyFragment), ((sz4) lessonCompleteVocabularyFragment.f30993B0.getValue()).f61657a, null, null, tj3Var12, 0);
                } else {
                    tj3Var12.m22102U();
                }
                return xfa.f68157a;
            case 14:
                LessonEditParentFragment lessonEditParentFragment = (LessonEditParentFragment) this.f67545b;
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zM22124i13 = tj3Var13.m22124i(lessonEditParentFragment);
                    Object objM22097O13 = tj3Var13.m22097O();
                    if (zM22124i13 || objM22097O13 == we1.f66679a) {
                        objM22097O13 = new fy4(lessonEditParentFragment, i7);
                        tj3Var13.m22131l0(objM22097O13);
                    }
                    AbstractC2076b.m8984a((vi3) objM22097O13, null, tj3Var13, 0);
                } else {
                    tj3Var13.m22102U();
                }
                return xfa.f68157a;
            case 15:
                LessonInfoFragment lessonInfoFragment = (LessonInfoFragment) this.f67545b;
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    g35 g35Var = new g35(lessonInfoFragment);
                    boolean zM22124i14 = tj3Var14.m22124i(lessonInfoFragment);
                    Object objM22097O14 = tj3Var14.m22097O();
                    if (zM22124i14 || objM22097O14 == we1.f66679a) {
                        objM22097O14 = new hz4(lessonInfoFragment, i6);
                        tj3Var14.m22131l0(objM22097O14);
                    }
                    AbstractC2131b.m9042a(g35Var, (ui3) objM22097O14, tj3Var14, 0);
                } else {
                    tj3Var14.m22102U();
                }
                return xfa.f68157a;
            case 16:
                VocabularyType vocabularyType = (VocabularyType) this.f67545b;
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    vocabularyType.getClass();
                    int i13 = p1b.f55463a[vocabularyType.ordinal()];
                    if (i13 == 1) {
                        i = com.lingq.core.p012ui.R$string.lingq_lingqs;
                    } else if (i13 == 2) {
                        i = com.lingq.core.p012ui.R$string.feed_words_new;
                    } else {
                        if (i13 != 3) {
                            gm5.m12750e();
                            return null;
                        }
                        i = com.lingq.core.p012ui.R$string.search_all;
                    }
                    lw9.m16554b(vz1.m23620a0(tj3Var15, i), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var15, 0, 0, 262142);
                } else {
                    tj3Var15.m22102U();
                }
                return xfa.f68157a;
            case 17:
                LingQMethodFragment lingQMethodFragment = (LingQMethodFragment) this.f67545b;
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    boolean zM22124i15 = tj3Var16.m22124i(lingQMethodFragment);
                    Object objM22097O15 = tj3Var16.m22097O();
                    if (zM22124i15 || objM22097O15 == we1.f66679a) {
                        objM22097O15 = new hz4(lingQMethodFragment, i3);
                        tj3Var16.m22131l0(objM22097O15);
                    }
                    xd5.m24463b((ui3) objM22097O15, tj3Var16, 0, 0);
                } else {
                    tj3Var16.m22102U();
                }
                return xfa.f68157a;
            case 18:
                LynxReasoningEffort lynxReasoningEffort = (LynxReasoningEffort) this.f67545b;
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    lw9.m16554b(lynxReasoningEffort.getDisplayName(), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var17, 0, 0, 262142);
                } else {
                    tj3Var17.m22102U();
                }
                return xfa.f68157a;
            case 19:
                LynxChatModel lynxChatModel = (LynxChatModel) this.f67545b;
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    lw9.m16554b(lynxChatModel.getDisplayName(), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var18, 0, 0, 262142);
                } else {
                    tj3Var18.m22102U();
                }
                return xfa.f68157a;
            case 20:
                ((Integer) obj2).getClass();
                hz5.m13594a((kl1) this.f67545b, (ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 21:
                ((Integer) obj2).getClass();
                ((l06) this.f67545b).mo1707a((ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 22:
                f56 f56Var = (f56) this.f67545b;
                Set set = (Set) obj;
                synchronized (f56Var.f60774a) {
                    try {
                        n66 n66Var = f56Var.f38435b;
                        h85 h85Var = new h85(13, set, f56Var);
                        lda.m16119e(1, h85Var);
                        Object[] objArr = n66Var.f52400b;
                        long[] jArr = n66Var.f52399a;
                        int length = jArr.length - 2;
                        long j4 = -9187201950435737472L;
                        if (length >= 0) {
                            j2 = 128;
                            int i14 = 0;
                            while (true) {
                                long j5 = jArr[i14];
                                j3 = 255;
                                if ((((~j5) << 7) & j5 & j4) != j4) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        if ((j5 & 255) < 128) {
                                            h85Var.invoke(objArr[(i14 << 3) + i16]);
                                        }
                                        j5 >>= 8;
                                        i16++;
                                        j4 = j4;
                                    }
                                    j = j4;
                                    if (i15 == 8) {
                                    }
                                } else {
                                    j = j4;
                                }
                                if (i14 != length) {
                                    i14++;
                                    j4 = j;
                                }
                            }
                        } else {
                            j = -9187201950435737472L;
                            j2 = 128;
                            j3 = 255;
                        }
                        o66 o66Var = f56Var.f38437d;
                        Object[] objArr2 = o66Var.f1303b;
                        long[] jArr2 = o66Var.f1302a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i17 = 0;
                            while (true) {
                                long j6 = jArr2[i17];
                                if ((((~j6) << 7) & j6 & j) != j) {
                                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                    for (int i19 = 0; i19 < i18; i19++) {
                                        if ((j6 & j3) < j2) {
                                            ((yv8) objArr2[(i17 << 3) + i19]).mo4677k(xfa.f68157a);
                                        }
                                        j6 >>= 8;
                                    }
                                    if (i18 == 8) {
                                        if (i17 != length2) {
                                            i17++;
                                        }
                                    }
                                } else if (i17 != length2) {
                                    i17++;
                                }
                            }
                        }
                        f56Var.f38437d.m17812e();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                fl6 fl6Var = (fl6) this.f67545b;
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (tj3Var19.m22099R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var19).f38956e);
                    C3587su c3587su = eh0.f37238d;
                    ec0 ec0Var = nj0.f52791J;
                    bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var19, 0);
                    int iHashCode = Long.hashCode(tj3Var19.f62385T);
                    l77 l77VarM22132m = tj3Var19.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var19, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var19.m22119f0();
                    if (tj3Var19.f62384S) {
                        tj3Var19.m22130l(ui3Var3);
                    } else {
                        tj3Var19.m22137o0();
                    }
                    zi3 zi3Var2 = C0352b.f4303f;
                    oha.m18001g(tj3Var19, zi3Var2, bb1VarM230a);
                    zi3 zi3Var3 = C0352b.f4302e;
                    oha.m18001g(tj3Var19, zi3Var3, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var4 = C0352b.f4304g;
                    oha.m18001g(tj3Var19, zi3Var4, numValueOf);
                    vi3 vi3Var3 = C0352b.f4305h;
                    oha.m18000f(tj3Var19, vi3Var3);
                    zi3 zi3Var5 = C0352b.f4301d;
                    oha.m18001g(tj3Var19, zi3Var5, e16VarM1322c);
                    lw9.m16554b(vz1.m23620a0(tj3Var19, com.lingq.feature.reader.R$string.lesson_next_lesson), c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var19).f71402f, tj3Var19, 1572912, 0, 131004);
                    lw9.m16554b(vz1.m23620a0(tj3Var19, com.lingq.feature.reader.R$string.stats_recommendation_desc), c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var19).f71406j, tj3Var19, 48, 0, 131068);
                    r46.m20381f(c99.m4414g(ux5.m22984g(b16Var, ge9.m12515a(tj3Var19).f38956e, tj3Var19, b16Var, 1.0f), 200.0f), null, null, null, ci8.m4703P(-646809168, new se0(fl6Var, i4), tj3Var19), tj3Var19, 24582, 14);
                    e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var19).f38956e, tj3Var19, b16Var, 1.0f);
                    bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var19, 0);
                    int iHashCode2 = Long.hashCode(tj3Var19.f62385T);
                    l77 l77VarM22132m2 = tj3Var19.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var19, e16VarM22984g);
                    tj3Var19.m22119f0();
                    if (tj3Var19.f62384S) {
                        tj3Var19.m22130l(ui3Var3);
                    } else {
                        tj3Var19.m22137o0();
                    }
                    oha.m18001g(tj3Var19, zi3Var2, bb1VarM230a2);
                    oha.m18001g(tj3Var19, zi3Var3, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var19, zi3Var4, tj3Var19, vi3Var3);
                    oha.m18001g(tj3Var19, zi3Var5, e16VarM1322c2);
                    lw9.m16554b(fl6Var.f39256f, null, 0L, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var19).f71404h, tj3Var19, 1572864, 24960, 110526);
                    lw9.m16554b(fl6Var.f39257g, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var19).f71406j, tj3Var19, 0, 24960, 110590);
                    tj3Var19.m22139q(true);
                    tj3Var19.m22139q(true);
                } else {
                    tj3Var19.m22102U();
                }
                return xfa.f68157a;
            case 24:
                ((Integer) obj2).getClass();
                AbstractC1875a.m8650a((C1876b) this.f67545b, (ye1) obj, pk9.m19383z(1));
                return xfa.f68157a;
            case 25:
                NotificationsFragment notificationsFragment = (NotificationsFragment) this.f67545b;
                ye1 ye1Var20 = (ye1) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                tj3 tj3Var20 = (tj3) ye1Var20;
                if (tj3Var20.m22099R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    boolean zM22124i16 = tj3Var20.m22124i(notificationsFragment);
                    Object objM22097O16 = tj3Var20.m22097O();
                    if (zM22124i16 || objM22097O16 == we1.f66679a) {
                        objM22097O16 = new fy4(notificationsFragment, 14);
                        tj3Var20.m22131l0(objM22097O16);
                    }
                    AbstractC2167a.m9099c(null, (vi3) objM22097O16, tj3Var20, 0);
                } else {
                    tj3Var20.m22102U();
                }
                return xfa.f68157a;
            case 26:
                NotificationsSettingsFragment notificationsSettingsFragment = (NotificationsSettingsFragment) this.f67545b;
                ye1 ye1Var21 = (ye1) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                tj3 tj3Var21 = (tj3) ye1Var21;
                if (tj3Var21.m22099R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    boolean zM22124i17 = tj3Var21.m22124i(notificationsSettingsFragment);
                    Object objM22097O17 = tj3Var21.m22097O();
                    if (zM22124i17 || objM22097O17 == we1.f66679a) {
                        objM22097O17 = new fy4(notificationsSettingsFragment, 15);
                        tj3Var21.m22131l0(objM22097O17);
                    }
                    wsb.m24148c(null, (vi3) objM22097O17, tj3Var21, 0);
                } else {
                    tj3Var21.m22102U();
                }
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                OnboardingAccentFragment onboardingAccentFragment = (OnboardingAccentFragment) this.f67545b;
                ye1 ye1Var22 = (ye1) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                tj3 tj3Var22 = (tj3) ye1Var22;
                if (tj3Var22.m22099R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    OnboardingAccentViewModel onboardingAccentViewModel = (OnboardingAccentViewModel) onboardingAccentFragment.f27000B0.getValue();
                    boolean zM22124i18 = tj3Var22.m22124i(onboardingAccentFragment);
                    Object objM22097O18 = tj3Var22.m22097O();
                    if (zM22124i18 || objM22097O18 == we1.f66679a) {
                        objM22097O18 = new fy4(onboardingAccentFragment, 16);
                        tj3Var22.m22131l0(objM22097O18);
                    }
                    AbstractC2175a.m9107a(onboardingAccentViewModel, (vi3) objM22097O18, tj3Var22, 0);
                } else {
                    tj3Var22.m22102U();
                }
                return xfa.f68157a;
            case 28:
                OnboardingAchieveFragment onboardingAchieveFragment = (OnboardingAchieveFragment) this.f67545b;
                ye1 ye1Var23 = (ye1) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                tj3 tj3Var23 = (tj3) ye1Var23;
                if (tj3Var23.m22099R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    boolean zM22124i19 = tj3Var23.m22124i(onboardingAchieveFragment);
                    Object objM22097O19 = tj3Var23.m22097O();
                    if (zM22124i19 || objM22097O19 == we1.f66679a) {
                        objM22097O19 = new fy4(onboardingAchieveFragment, i5);
                        tj3Var23.m22131l0(objM22097O19);
                    }
                    jtb.m14645a((vi3) objM22097O19, tj3Var23, 0);
                } else {
                    tj3Var23.m22102U();
                }
                return xfa.f68157a;
            default:
                OnboardingDailyGoalFragment onboardingDailyGoalFragment = (OnboardingDailyGoalFragment) this.f67545b;
                ye1 ye1Var24 = (ye1) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                tj3 tj3Var24 = (tj3) ye1Var24;
                if (tj3Var24.m22099R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    boolean zM22124i20 = tj3Var24.m22124i(onboardingDailyGoalFragment);
                    Object objM22097O20 = tj3Var24.m22097O();
                    if (zM22124i20 || objM22097O20 == we1.f66679a) {
                        objM22097O20 = new fy4(onboardingDailyGoalFragment, 18);
                        tj3Var24.m22131l0(objM22097O20);
                    }
                    AbstractC2200a.m9132b(null, (vi3) objM22097O20, tj3Var24, 0);
                } else {
                    tj3Var24.m22102U();
                }
                return xfa.f68157a;
        }
    }

    public /* synthetic */ wz2(Object obj, int i, int i2) {
        this.f67544a = i2;
        this.f67545b = obj;
    }
}
