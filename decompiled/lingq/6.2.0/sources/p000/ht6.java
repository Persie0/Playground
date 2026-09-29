package p000;

import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.settings.ReaderSettingsFragment;
import com.lingq.core.settings.SettingsFragment;
import com.lingq.core.settings.review.ReviewSettingsFragment;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.auth.registration.C2196e;
import com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationFragment;
import com.lingq.feature.onboarding.auth.registration.RegistrationField;
import com.lingq.feature.onboarding.dictionary.C2206a;
import com.lingq.feature.onboarding.dictionary.OnboardingDictionaryLocaleFragment;
import com.lingq.feature.onboarding.languages.OnboardingLanguageFragment;
import com.lingq.feature.onboarding.level.AbstractC2209a;
import com.lingq.feature.onboarding.level.C2210b;
import com.lingq.feature.onboarding.level.OnboardingLevelFragment;
import com.lingq.feature.onboarding.notification.OnboardingNotificationFragment;
import com.lingq.feature.onboarding.topics.AbstractC2211a;
import com.lingq.feature.onboarding.topics.OnboardingTopicsFragment;
import com.lingq.feature.onboarding.topics.OnboardingTopicsViewModel;
import com.lingq.feature.player.R$drawable;
import com.lingq.feature.playlist.AbstractC2253c;
import com.lingq.feature.playlist.C2255e;
import com.lingq.feature.playlist.PlaylistFragment;
import com.lingq.feature.reader.video.AbstractC2592h;
import com.lingq.feature.reader.video.ReaderVideoComposeFragment;
import com.lingq.feature.review.AbstractC2752c;
import com.lingq.feature.review.ReviewFragment;
import com.lingq.feature.search.search.AbstractC2776c;
import com.lingq.feature.search.search.SearchFragment;
import com.lingq.feature.statistics.C2818f;
import com.lingq.feature.statistics.StatsCalendarFragment;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.datetime.format.C3251b;
import kotlinx.datetime.internal.format.C3258c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ht6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42930b;

    public /* synthetic */ ht6(Object obj, int i) {
        this.f42929a = i;
        this.f42930b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f42929a;
        String str = "";
        b16 b16Var = b16.f7762a;
        int i2 = 19;
        String strM23620a0 = null;
        p84 p84Var = we1.f66679a;
        boolean z = false;
        final int i3 = 2;
        final int i4 = 1;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f42930b;
        switch (i) {
            case 0:
                OnboardingDictionaryLocaleFragment onboardingDictionaryLocaleFragment = (OnboardingDictionaryLocaleFragment) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C2206a c2206a = (C2206a) onboardingDictionaryLocaleFragment.f27194B0.getValue();
                    boolean zM22124i = tj3Var.m22124i(onboardingDictionaryLocaleFragment);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new fy4(onboardingDictionaryLocaleFragment, i2);
                        tj3Var.m22131l0(objM22097O);
                    }
                    otb.m18512a(c2206a, (vi3) objM22097O, tj3Var, 0);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                OnboardingLanguageFragment onboardingLanguageFragment = (OnboardingLanguageFragment) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zM22124i2 = tj3Var2.m22124i(onboardingLanguageFragment);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new fy4(onboardingLanguageFragment, 21);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    xtb.m24700a(null, (vi3) objM22097O2, tj3Var2, 0);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                OnboardingLevelFragment onboardingLevelFragment = (OnboardingLevelFragment) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C2210b c2210b = (C2210b) onboardingLevelFragment.f27247B0.getValue();
                    boolean zM22124i3 = tj3Var3.m22124i(onboardingLevelFragment);
                    Object objM22097O3 = tj3Var3.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new fy4(onboardingLevelFragment, 23);
                        tj3Var3.m22131l0(objM22097O3);
                    }
                    AbstractC2209a.m9142a(c2210b, (vi3) objM22097O3, tj3Var3, 0);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                OnboardingNotificationFragment onboardingNotificationFragment = (OnboardingNotificationFragment) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Locale locale = Locale.getDefault();
                    String strM2111m = onboardingNotificationFragment.m2111m(R$string.onboarding_notification_prompt_message);
                    strM2111m.getClass();
                    String str2 = cx6.f34684c;
                    switch (str2.hashCode()) {
                        case -1367558293:
                            if (str2.equals("casual")) {
                                Locale locale2 = Locale.getDefault();
                                String strM2111m2 = onboardingNotificationFragment.m2111m(com.lingq.core.achievements.R$string.onboarding_daily_goal_min_desc);
                                strM2111m2.getClass();
                                str = String.format(locale2, strM2111m2, Arrays.copyOf(new Object[]{Integer.valueOf(DailyGoal.Casual.getMins())}, 1));
                            }
                            break;
                        case -1183796438:
                            if (str2.equals("insane")) {
                                Locale locale3 = Locale.getDefault();
                                String strM2111m3 = onboardingNotificationFragment.m2111m(com.lingq.core.achievements.R$string.onboarding_daily_goal_min_desc);
                                strM2111m3.getClass();
                                str = String.format(locale3, strM2111m3, Arrays.copyOf(new Object[]{Integer.valueOf(DailyGoal.Insane.getMins())}, 1));
                            }
                            break;
                        case -892381166:
                            if (str2.equals("steady")) {
                                Locale locale4 = Locale.getDefault();
                                String strM2111m4 = onboardingNotificationFragment.m2111m(com.lingq.core.achievements.R$string.onboarding_daily_goal_min_desc);
                                strM2111m4.getClass();
                                str = String.format(locale4, strM2111m4, Arrays.copyOf(new Object[]{Integer.valueOf(DailyGoal.Steady.getMins())}, 1));
                            }
                            break;
                        case 1958059306:
                            if (str2.equals("intense")) {
                                Locale locale5 = Locale.getDefault();
                                String strM2111m5 = onboardingNotificationFragment.m2111m(com.lingq.core.achievements.R$string.onboarding_daily_goal_min_desc);
                                strM2111m5.getClass();
                                str = String.format(locale5, strM2111m5, Arrays.copyOf(new Object[]{Integer.valueOf(DailyGoal.Intense.getMins())}, 1));
                            }
                            break;
                    }
                    String str3 = String.format(locale, strM2111m, Arrays.copyOf(new Object[]{str, AbstractC3352my.m17093L(onboardingNotificationFragment.m2090R(), cx6.f34682a)}, 2));
                    boolean zM22124i4 = tj3Var4.m22124i(onboardingNotificationFragment);
                    Object objM22097O4 = tj3Var4.m22097O();
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        objM22097O4 = new nu6(onboardingNotificationFragment, z ? 1 : 0);
                        tj3Var4.m22131l0(objM22097O4);
                    }
                    ui3 ui3Var = (ui3) objM22097O4;
                    boolean zM22124i5 = tj3Var4.m22124i(onboardingNotificationFragment);
                    Object objM22097O5 = tj3Var4.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        objM22097O5 = new nu6(onboardingNotificationFragment, i4);
                        tj3Var4.m22131l0(objM22097O5);
                    }
                    ui3 ui3Var2 = (ui3) objM22097O5;
                    boolean zM22124i6 = tj3Var4.m22124i(onboardingNotificationFragment);
                    Object objM22097O6 = tj3Var4.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        objM22097O6 = new nu6(onboardingNotificationFragment, i3);
                        tj3Var4.m22131l0(objM22097O6);
                    }
                    cxb.m9927a(str3, ui3Var, ui3Var2, (ui3) objM22097O6, tj3Var4, 0);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                OnboardingRegistrationFragment onboardingRegistrationFragment = (OnboardingRegistrationFragment) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zM22124i7 = tj3Var5.m22124i(onboardingRegistrationFragment);
                    Object objM22097O7 = tj3Var5.m22097O();
                    if (zM22124i7 || objM22097O7 == p84Var) {
                        objM22097O7 = new cw6(onboardingRegistrationFragment, i4);
                        tj3Var5.m22131l0(objM22097O7);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O7;
                    boolean zM22124i8 = tj3Var5.m22124i(onboardingRegistrationFragment);
                    Object objM22097O8 = tj3Var5.m22097O();
                    if (zM22124i8 || objM22097O8 == p84Var) {
                        objM22097O8 = new cw6(onboardingRegistrationFragment, i3);
                        tj3Var5.m22131l0(objM22097O8);
                    }
                    ui3 ui3Var4 = (ui3) objM22097O8;
                    boolean zM22124i9 = tj3Var5.m22124i(onboardingRegistrationFragment);
                    Object objM22097O9 = tj3Var5.m22097O();
                    if (zM22124i9 || objM22097O9 == p84Var) {
                        objM22097O9 = new fy4(onboardingRegistrationFragment, 25);
                        tj3Var5.m22131l0(objM22097O9);
                    }
                    oxb.m18564c(null, ui3Var3, ui3Var4, (vi3) objM22097O9, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                C2196e c2196e = (C2196e) obj3;
                RegistrationField registrationField = (RegistrationField) obj;
                String str4 = (String) obj2;
                registrationField.getClass();
                str4.getClass();
                int i5 = nw6.f53328a[registrationField.ordinal()];
                if (i5 == 1) {
                    C2196e.m9123Y2(c2196e, str4, null, 2);
                } else if (i5 != 2) {
                    C2196e.m9123Y2(c2196e, null, str4, 1);
                } else {
                    C2196e.m9123Y2(c2196e, null, str4, 1);
                }
                return xfaVar;
            case 6:
                OnboardingTopicsFragment onboardingTopicsFragment = (OnboardingTopicsFragment) obj3;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    OnboardingTopicsViewModel onboardingTopicsViewModel = (OnboardingTopicsViewModel) onboardingTopicsFragment.f27273B0.getValue();
                    boolean zM22124i10 = tj3Var6.m22124i(onboardingTopicsFragment);
                    Object objM22097O10 = tj3Var6.m22097O();
                    if (zM22124i10 || objM22097O10 == p84Var) {
                        objM22097O10 = new fy4(onboardingTopicsFragment, 26);
                        tj3Var6.m22131l0(objM22097O10);
                    }
                    AbstractC2211a.m9149a(onboardingTopicsViewModel, (vi3) objM22097O10, tj3Var6, 0);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 7:
                AbstractC0150d abstractC0150d = (AbstractC0150d) obj3;
                abstractC0150d.f2687q.m21223i(abstractC0150d.m1035j(((Integer) obj2).intValue()));
                return xfaVar;
            case 8:
                PlaylistFragment playlistFragment = (PlaylistFragment) obj3;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    C2255e c2255e = (C2255e) playlistFragment.f27589C0.getValue();
                    boolean zM22124i11 = tj3Var7.m22124i(playlistFragment);
                    Object objM22097O11 = tj3Var7.m22097O();
                    if (zM22124i11 || objM22097O11 == p84Var) {
                        objM22097O11 = new fy4(playlistFragment, 28);
                        tj3Var7.m22131l0(objM22097O11);
                    }
                    AbstractC2253c.m9230p(c2255e, (vi3) objM22097O11, tj3Var7, 0);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 9:
                ((Integer) obj2).getClass();
                k3c.m14791b((oe7) obj3, (ye1) obj, pk9.m19383z(7));
                return xfaVar;
            case 10:
                DictionaryLocale dictionaryLocale = (DictionaryLocale) obj3;
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    lw9.m16554b(dictionaryLocale.f19022b, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 11:
                ReaderSettingsFragment readerSettingsFragment = (ReaderSettingsFragment) obj3;
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zM22124i12 = tj3Var9.m22124i(readerSettingsFragment);
                    Object objM22097O12 = tj3Var9.m22097O();
                    if (zM22124i12 || objM22097O12 == p84Var) {
                        objM22097O12 = new cg7(readerSettingsFragment, 4);
                        tj3Var9.m22131l0(objM22097O12);
                    }
                    AbstractC1858a.m8589e(null, (vi3) objM22097O12, tj3Var9, 0);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 12:
                ReaderVideoComposeFragment readerVideoComposeFragment = (ReaderVideoComposeFragment) obj3;
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ud6 ud6VarM3244j = b34.m3244j(readerVideoComposeFragment);
                    w41 w41Var = readerVideoComposeFragment.f31165B0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    AbstractC2592h.m9516a(null, null, null, ud6VarM3244j, w41Var, tj3Var10, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 13:
                rc8 rc8Var = (rc8) obj3;
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String str5 = rc8Var.f59072a;
                    zf1 zf1Var = ge9.f40637a;
                    lw9.m16554b(str5, AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var11.m22128k(zf1Var)).f38956e, ((fe9) tj3Var11.m22128k(zf1Var)).f38956e), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var11.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var11, 0, 0, 131068);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 14:
                ReviewFragment reviewFragment = (ReviewFragment) obj3;
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zM22124i13 = tj3Var12.m22124i(reviewFragment);
                    Object objM22097O13 = tj3Var12.m22097O();
                    if (zM22124i13 || objM22097O13 == p84Var) {
                        objM22097O13 = new cg7(reviewFragment, 8);
                        tj3Var12.m22131l0(objM22097O13);
                    }
                    AbstractC2752c.m9583f((vi3) objM22097O13, null, null, tj3Var12, 0);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 15:
                ReviewSettingsFragment reviewSettingsFragment = (ReviewSettingsFragment) obj3;
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zM22124i14 = tj3Var13.m22124i(reviewSettingsFragment);
                    Object objM22097O14 = tj3Var13.m22097O();
                    if (zM22124i14 || objM22097O14 == p84Var) {
                        objM22097O14 = new cg7(reviewSettingsFragment, 10);
                        tj3Var13.m22131l0(objM22097O14);
                    }
                    cxc.m9929b(null, (vi3) objM22097O14, tj3Var13, 0);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 16:
                Integer num = (Integer) obj3;
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    if (num == null) {
                        tj3Var14.m22111b0(-1363479461);
                    } else {
                        tj3Var14.m22111b0(-1363479460);
                        strM23620a0 = vz1.m23620a0(tj3Var14, num.intValue());
                    }
                    tj3Var14.m22139q(false);
                    lw9.m16554b(strM23620a0 == null ? "" : strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var14, 0, 0, 262142);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 17:
                fq8 fq8Var = (fq8) obj3;
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var15, fq8Var.f39489a), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var15, 0, 0, 262142);
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
            case 18:
                SearchFragment searchFragment = (SearchFragment) obj3;
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    String str6 = ((nq8) searchFragment.f32978B0.getValue()).f53142b;
                    ud6 ud6VarM3244j2 = b34.m3244j(searchFragment);
                    w41 w41Var2 = searchFragment.f32979C0;
                    if (w41Var2 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    bia biaVar = searchFragment.f32980D0;
                    if (biaVar == null) {
                        fa4.m11636J("upgradePopupDelegate");
                        throw null;
                    }
                    AbstractC2776c.m9701a(str6, ud6VarM3244j2, w41Var2, biaVar, null, tj3Var16, 0);
                } else {
                    tj3Var16.m22102U();
                }
                return xfaVar;
            case 19:
                ((Integer) obj2).getClass();
                u0d.m22381a((yq8) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 20:
                ij7 ij7Var = (ij7) obj3;
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.purchase_item_details, new Object[]{Integer.valueOf(ij7Var.f44189a), Integer.valueOf(ij7Var.f44190b)}, tj3Var17), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var17, 0, 0, 262142);
                } else {
                    tj3Var17.m22102U();
                }
                return xfaVar;
            case 21:
                xs8 xs8Var = (xs8) obj3;
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    lw9.m16554b(xs8Var.f68652a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var18, 0, 0, 262142);
                } else {
                    tj3Var18.m22102U();
                }
                return xfaVar;
            case 22:
                fm6 fm6Var = (fm6) obj3;
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                tj3 tj3Var19 = (tj3) ye1Var19;
                if (tj3Var19.m22099R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    lw9.m16554b(vz1.m23618Z(com.lingq.core.p012ui.R$string.not_enough_balance_purchase_lesson_details, new Object[]{Integer.valueOf(fm6Var.f39285a), Integer.valueOf(fm6Var.f39286b)}, tj3Var19), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var19, 0, 0, 262142);
                } else {
                    tj3Var19.m22102U();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((kg7) obj).m15189a();
                ((Ref$LongRef) obj3).f47717a = ((gq6) obj2).f41189a;
                return xfaVar;
            case 24:
                C3849zx c3849zx = (C3849zx) obj3;
                ye1 ye1Var20 = (ye1) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                tj3 tj3Var20 = (tj3) ye1Var20;
                if (tj3Var20.m22099R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ty3.m22352b(AbstractC3423or.m18236U(c3849zx.f72329c ? R$drawable.ic_player_pause : R$drawable.ic_player_play, tj3Var20, 0), null, c99.m4422o(b16Var, 32.0f), 0L, tj3Var20, 440, 8);
                } else {
                    tj3Var20.m22102U();
                }
                return xfaVar;
            case 25:
                SettingsFragment settingsFragment = (SettingsFragment) obj3;
                ye1 ye1Var21 = (ye1) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                tj3 tj3Var21 = (tj3) ye1Var21;
                if (tj3Var21.m22099R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    boolean zM22124i15 = tj3Var21.m22124i(settingsFragment);
                    Object objM22097O15 = tj3Var21.m22097O();
                    if (zM22124i15 || objM22097O15 == p84Var) {
                        objM22097O15 = new cg7(settingsFragment, i2);
                        tj3Var21.m22131l0(objM22097O15);
                    }
                    AbstractC1858a.m8608x(null, (vi3) objM22097O15, tj3Var21, 0);
                } else {
                    tj3Var21.m22102U();
                }
                return xfaVar;
            case 26:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                for (C3251b c3251b : ((C3258c) obj3).f48230b) {
                    c3251b.f48214a.m23438b(obj, Boolean.valueOf(zBooleanValue != fa4.m11650l(c3251b.f48214a.f65666a.get(obj), Boolean.TRUE)));
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                la9 la9Var = la9.f49371a;
                la9.m16041h((InterfaceC0310a) obj, ((gq6) obj2).f41189a, la9.f49372b, ((fa9) obj3).f38726b);
                return xfaVar;
            case 28:
                sb9 sb9Var = (sb9) obj3;
                ye1 ye1Var22 = (ye1) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                tj3 tj3Var22 = (tj3) ye1Var22;
                if (tj3Var22.m22099R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    lw9.m16554b(((vb9) sb9Var).f65169a.f66595a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var22, 0, 0, 262142);
                } else {
                    tj3Var22.m22102U();
                }
                return xfaVar;
            default:
                final StatsCalendarFragment statsCalendarFragment = (StatsCalendarFragment) obj3;
                w41 w41Var3 = statsCalendarFragment.f33299B0;
                ye1 ye1Var23 = (ye1) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                tj3 tj3Var23 = (tj3) ye1Var23;
                if (tj3Var23.m22099R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(((C2818f) w41Var3.getValue()).f33467h, tj3Var23);
                    LocalDate localDate = (LocalDate) AbstractC0711a.m2513c(((C2818f) w41Var3.getValue()).f33465f, tj3Var23).getValue();
                    hi9 hi9Var = (hi9) t66VarM2513c.getValue();
                    boolean zM22124i16 = tj3Var23.m22124i(statsCalendarFragment);
                    Object objM22097O16 = tj3Var23.m22097O();
                    if (zM22124i16 || objM22097O16 == p84Var) {
                        final int i6 = z ? 1 : 0;
                        objM22097O16 = new ui3() { // from class: ai9
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                Object value;
                                Object value2;
                                int i7 = i6;
                                xfa xfaVar2 = xfa.f68157a;
                                StatsCalendarFragment statsCalendarFragment2 = statsCalendarFragment;
                                switch (i7) {
                                    case 0:
                                        b34.m3244j(statsCalendarFragment2).m22689f();
                                        break;
                                    case 1:
                                        C3244l c3244l = ((C2818f) statsCalendarFragment2.f33299B0.getValue()).f33464e;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, ((LocalDate) c3244l.getValue()).plusMonths(1L)));
                                        break;
                                    default:
                                        C3244l c3244l2 = ((C2818f) statsCalendarFragment2.f33299B0.getValue()).f33464e;
                                        do {
                                            value2 = c3244l2.getValue();
                                        } while (!c3244l2.m15570h(value2, ((LocalDate) c3244l2.getValue()).plusMonths(-1L)));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var23.m22131l0(objM22097O16);
                    }
                    ui3 ui3Var5 = (ui3) objM22097O16;
                    boolean zM22124i17 = tj3Var23.m22124i(statsCalendarFragment);
                    Object objM22097O17 = tj3Var23.m22097O();
                    if (zM22124i17 || objM22097O17 == p84Var) {
                        objM22097O17 = new ui3() { // from class: ai9
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                Object value;
                                Object value2;
                                int i7 = i4;
                                xfa xfaVar2 = xfa.f68157a;
                                StatsCalendarFragment statsCalendarFragment2 = statsCalendarFragment;
                                switch (i7) {
                                    case 0:
                                        b34.m3244j(statsCalendarFragment2).m22689f();
                                        break;
                                    case 1:
                                        C3244l c3244l = ((C2818f) statsCalendarFragment2.f33299B0.getValue()).f33464e;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, ((LocalDate) c3244l.getValue()).plusMonths(1L)));
                                        break;
                                    default:
                                        C3244l c3244l2 = ((C2818f) statsCalendarFragment2.f33299B0.getValue()).f33464e;
                                        do {
                                            value2 = c3244l2.getValue();
                                        } while (!c3244l2.m15570h(value2, ((LocalDate) c3244l2.getValue()).plusMonths(-1L)));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var23.m22131l0(objM22097O17);
                    }
                    ui3 ui3Var6 = (ui3) objM22097O17;
                    boolean zM22124i18 = tj3Var23.m22124i(statsCalendarFragment);
                    Object objM22097O18 = tj3Var23.m22097O();
                    if (zM22124i18 || objM22097O18 == p84Var) {
                        objM22097O18 = new ui3() { // from class: ai9
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                Object value;
                                Object value2;
                                int i7 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                StatsCalendarFragment statsCalendarFragment2 = statsCalendarFragment;
                                switch (i7) {
                                    case 0:
                                        b34.m3244j(statsCalendarFragment2).m22689f();
                                        break;
                                    case 1:
                                        C3244l c3244l = ((C2818f) statsCalendarFragment2.f33299B0.getValue()).f33464e;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, ((LocalDate) c3244l.getValue()).plusMonths(1L)));
                                        break;
                                    default:
                                        C3244l c3244l2 = ((C2818f) statsCalendarFragment2.f33299B0.getValue()).f33464e;
                                        do {
                                            value2 = c3244l2.getValue();
                                        } while (!c3244l2.m15570h(value2, ((LocalDate) c3244l2.getValue()).plusMonths(-1L)));
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var23.m22131l0(objM22097O18);
                    }
                    h4d.m13054c(hi9Var, localDate, ui3Var5, ui3Var6, (ui3) objM22097O18, tj3Var23, 0, 0);
                } else {
                    tj3Var23.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ ht6(Object obj, int i, int i2) {
        this.f42929a = i2;
        this.f42930b = obj;
    }
}
