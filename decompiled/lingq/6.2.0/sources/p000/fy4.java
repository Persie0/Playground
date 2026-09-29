package p000;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.material3.C0253l;
import androidx.compose.p002ui.node.C0358h;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$NotificationType;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.playlists.C1833i;
import com.lingq.core.settings.notifications.NotificationsSettingsFragment;
import com.lingq.feature.edit.LessonEditParentFragment;
import com.lingq.feature.notifications.C2168b;
import com.lingq.feature.notifications.NotificationsFragment;
import com.lingq.feature.onboarding.R$id;
import com.lingq.feature.onboarding.accent.OnboardingAccentFragment;
import com.lingq.feature.onboarding.achieve.OnboardingAchieveFragment;
import com.lingq.feature.onboarding.auth.login.C2177b;
import com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment;
import com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationFragment;
import com.lingq.feature.onboarding.dailygoal.OnboardingDailyGoalFragment;
import com.lingq.feature.onboarding.dictionary.C2206a;
import com.lingq.feature.onboarding.dictionary.OnboardingDictionaryLocaleFragment;
import com.lingq.feature.onboarding.domain.LoginAuthType;
import com.lingq.feature.onboarding.languages.C2208a;
import com.lingq.feature.onboarding.languages.OnboardingLanguageFragment;
import com.lingq.feature.onboarding.level.OnboardingLevelFragment;
import com.lingq.feature.onboarding.topics.OnboardingTopicsFragment;
import com.lingq.feature.playlist.PlaylistFragment;
import com.lingq.feature.reader.old.settings.LessonReviewMenuFragment;
import com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment;
import com.lingq.feature.reader.old.tutorial.LessonFirstLingQCongratsFragment;
import com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment;
import com.lingq.feature.reader.stats.p019ui.all.C2556c;
import com.lingq.feature.reader.stats.p019ui.all.LessonCompleteAllWordsFragment;
import com.lingq.feature.reader.vocabulary.C2610a;
import com.lingq.feature.reader.vocabulary.model.VocabularyType;
import com.lingq.p020ui.C2889e;
import com.lingq.p020ui.MainActivity;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.sync.C3248a;
import kotlinx.datetime.internal.format.C3257b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fy4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39923b;

    public /* synthetic */ fy4(C3248a c3248a, d76 d76Var) {
        this.f39922a = 12;
        this.f39923b = c3248a;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        String str;
        Object value;
        Object value2;
        int i = this.f39922a;
        int iM21693T = 0;
        tg6 tg6Var = tg6.f62255a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f39923b;
        switch (i) {
            case 0:
                LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment = (LessonCompleteAllWordsFragment) obj2;
                w65 w65Var = (w65) obj;
                bh4[] bh4VarArr = LessonCompleteAllWordsFragment.f30861F0;
                w65Var.getClass();
                if (w65Var instanceof LessonCard) {
                    C2556c c2556cM9466R0 = lessonCompleteAllWordsFragment.m9466R0();
                    String str2 = ((LessonCard) w65Var).f19178a;
                    TokenType tokenType = TokenType.CardType;
                    str2.getClass();
                    tokenType.getClass();
                    c2556cM9466R0.f30976x.mo4677k(new Pair(str2, tokenType));
                } else if (w65Var instanceof LessonWord) {
                    C2556c c2556cM9466R1 = lessonCompleteAllWordsFragment.m9466R0();
                    String str3 = ((LessonWord) w65Var).f19314a;
                    TokenType tokenType2 = TokenType.WordType;
                    str3.getClass();
                    tokenType2.getClass();
                    c2556cM9466R1.f30976x.mo4677k(new Pair(str3, tokenType2));
                }
                return xfaVar;
            case 1:
                bh4[] bh4VarArr2 = LessonDealWithWordsFragment.f29486Z0;
                ((LessonDealWithWordsFragment) obj2).m9348B0().mo8768j0(true);
                return xfaVar;
            case 2:
                LessonEditParentFragment lessonEditParentFragment = (LessonEditParentFragment) obj2;
                r15 r15Var = (r15) obj;
                r15Var.getClass();
                if (!r15Var.equals(r15.f58485a)) {
                    gm5.m12750e();
                    return null;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("lessonEdit", true);
                x74.m24338E(lessonEditParentFragment, "lessonEdit", bundle);
                lessonEditParentFragment.mo3657c0();
                return xfaVar;
            case 3:
                bh4[] bh4VarArr3 = LessonFirstLingQCongratsFragment.f29549U0;
                ((o25) ((LessonFirstLingQCongratsFragment) obj2).f29551T0.getValue()).mo8768j0(true);
                return xfaVar;
            case 4:
                ly1 ly1Var = (ly1) obj;
                ly1Var.getClass();
                return ly1Var.m16571a((s35) obj2);
            case 5:
                bh4[] bh4VarArr4 = LessonMoveKnownFragment.f29562H0;
                ((LessonMoveKnownFragment) obj2).m9352T0().mo8768j0(true);
                return xfaVar;
            case 6:
                bh4[] bh4VarArr5 = LessonReviewMenuFragment.f29427G0;
                ((LessonReviewMenuFragment) obj2).m9345S0().mo8733A0(true);
                return xfaVar;
            case 7:
                ((C2610a) obj2).f31676v.m15571i(((VocabularyType[]) VocabularyType.getEntries().toArray(new VocabularyType[0]))[((Integer) obj).intValue()]);
                return xfaVar;
            case 8:
                List list = (List) obj;
                list.getClass();
                int i2 = MainActivity.f33994m0;
                C2889e c2889eM9802q = ((MainActivity) obj2).m9802q();
                c2889eM9802q.getClass();
                c2889eM9802q.f34201c.mo8570k1(list);
                return xfaVar;
            case 9:
                ((C0358h) obj2).m1614b();
                return xfaVar;
            case 10:
                return ((cr5) obj2).m9865f(((Integer) obj).intValue());
            case 11:
                n06 n06Var = (n06) obj2;
                n06Var.show();
                return new C3531rd(n06Var, 4);
            case 12:
                ((C3248a) obj2).mo4387b(null);
                return xfaVar;
            case 13:
                C0253l c0253l = (C0253l) obj2;
                fb2 fb2Var = (fb2) obj;
                float fM19861h = c0253l.f3552b.f2241j.m19861h();
                if (!Float.isNaN(fM19861h)) {
                    iM21693T = ss5.m21693T(fM19861h);
                } else if (!c0253l.m1182c()) {
                    iM21693T = -fb2Var.mo916w0(zl2.f71693a);
                }
                return new f84(((long) iM21693T) << 32);
            case 14:
                NotificationsFragment notificationsFragment = (NotificationsFragment) obj2;
                vg6 vg6Var = (vg6) obj;
                vg6Var.getClass();
                if (vg6Var.equals(tg6Var)) {
                    b34.m3244j(notificationsFragment).m22689f();
                } else if (vg6Var.equals(xh6.f68209a)) {
                    w41 w41Var = notificationsFragment.f26845D0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var.m23737z(ia6.f43860b);
                } else if ((vg6Var instanceof yh6) && (str = ((yh6) vg6Var).f69850a.f54583e) != null) {
                    tad tadVarM22429b = new u32(str, ((C2168b) notificationsFragment.f26843B0.getValue()).f26882b.mo4589b2(), true).m22429b();
                    boolean z = tadVarM22429b instanceof p42;
                    hm5 hm5Var = notificationsFragment.f26844C0;
                    if (z) {
                        if (hm5Var == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("lingq inbox notification type", LqAnalyticsValues$NotificationType.DailyLingqs.getValue());
                        ((C1240a) hm5Var).m7025f("Lingq inbox notifications clicked", bundle2);
                        p42 p42Var = (p42) tadVarM22429b;
                        String str4 = p42Var.f55546a;
                        if (str4 == null) {
                            id3 id3VarM2089Q = notificationsFragment.m2089Q();
                            b34.m3244j(notificationsFragment);
                            mbd.m16755c(id3VarM2089Q, str, null, 26);
                        } else {
                            w41 w41Var2 = notificationsFragment.f26845D0;
                            if (w41Var2 == null) {
                                fa4.m11636J("navGraphController");
                                throw null;
                            }
                            w41Var2.m23737z(new ka6(true, -1, null, ReviewType.VocabularySRS, 0, str4, p42Var.f55548c, null, 296));
                        }
                    } else {
                        if (hm5Var == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("lingq inbox notification type", LqAnalyticsValues$NotificationType.Forum.getValue());
                        ((C1240a) hm5Var).m7025f("Lingq inbox notifications clicked", bundle3);
                        id3 id3VarM2089Q2 = notificationsFragment.m2089Q();
                        b34.m3244j(notificationsFragment);
                        mbd.m16755c(id3VarM2089Q2, str, null, 26);
                    }
                }
                return xfaVar;
            case 15:
                NotificationsSettingsFragment notificationsSettingsFragment = (NotificationsSettingsFragment) obj2;
                vg6 vg6Var2 = (vg6) obj;
                vg6Var2.getClass();
                if (vg6Var2.equals(tg6Var)) {
                    b34.m3244j(notificationsSettingsFragment).m22689f();
                } else if (vg6Var2 instanceof zh6) {
                    io6 io6Var = jo6.Companion;
                    zh6 zh6Var = (zh6) vg6Var2;
                    String str5 = zh6Var.f71578a;
                    String str6 = zh6Var.f71579b;
                    io6Var.getClass();
                    str5.getClass();
                    jfa.m14428k(b34.m3244j(notificationsSettingsFragment), new ho6(str5, str6), null);
                }
                return xfaVar;
            case 16:
                OnboardingAccentFragment onboardingAccentFragment = (OnboardingAccentFragment) obj2;
                vg6 vg6Var3 = (vg6) obj;
                vg6Var3.getClass();
                if (vg6Var3.equals(ai6.f698e)) {
                    String str7 = cx6.f34688g;
                    if (str7 != null) {
                        hm5 hm5Var2 = onboardingAccentFragment.f27001C0;
                        if (hm5Var2 == null) {
                            fa4.m11636J("analytics");
                            throw null;
                        }
                        ((C1240a) hm5Var2).m7025f("registration accent selected", g9a.m12429f("preferred accent", str7));
                    }
                    ud6 ud6VarM3244j = b34.m3244j(onboardingAccentFragment);
                    os6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j, new C2916d6(R$id.actionToOnboardingRegister), null);
                } else if (vg6Var3.equals(tg6Var)) {
                    b34.m3244j(onboardingAccentFragment).m22689f();
                }
                return xfaVar;
            case 17:
                OnboardingAchieveFragment onboardingAchieveFragment = (OnboardingAchieveFragment) obj2;
                vg6 vg6Var4 = (vg6) obj;
                vg6Var4.getClass();
                if (vg6Var4 instanceof di6) {
                    ud6 ud6VarM3244j2 = b34.m3244j(onboardingAchieveFragment);
                    ss6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j2, new C2916d6(R$id.actionToOnboardingDailyGoal), null);
                } else if (vg6Var4 instanceof tg6) {
                    b34.m3244j(onboardingAchieveFragment).m22689f();
                }
                return xfaVar;
            case 18:
                OnboardingDailyGoalFragment onboardingDailyGoalFragment = (OnboardingDailyGoalFragment) obj2;
                vg6 vg6Var5 = (vg6) obj;
                vg6Var5.getClass();
                if (vg6Var5 instanceof hi6) {
                    hm5 hm5Var3 = onboardingDailyGoalFragment.f27179B0;
                    if (hm5Var3 == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    Bundle bundle4 = new Bundle();
                    String str8 = cx6.f34684c;
                    int i3 = 50;
                    switch (str8.hashCode()) {
                        case -1367558293:
                            str8.equals("casual");
                            break;
                        case -1183796438:
                            if (str8.equals("insane")) {
                                i3 = 400;
                            }
                            break;
                        case -892381166:
                            if (str8.equals("steady")) {
                                i3 = 100;
                            }
                            break;
                        case 1958059306:
                            if (str8.equals("intense")) {
                                i3 = 200;
                            }
                            break;
                    }
                    bundle4.putInt("Registration daily goal", i3);
                    ((C1240a) hm5Var3).m7025f("registration daily goal selected", bundle4);
                    if (Build.VERSION.SDK_INT < 33 || do7.m10532h(onboardingDailyGoalFragment.m2090R(), "android.permission.POST_NOTIFICATIONS") == 0) {
                        ud6 ud6VarM3244j3 = b34.m3244j(onboardingDailyGoalFragment);
                        zs6.Companion.getClass();
                        ac6.Companion.getClass();
                        jfa.m14428k(ud6VarM3244j3, new C2916d6(R$id.actionToOnboardingTopics), null);
                    } else {
                        ud6 ud6VarM3244j4 = b34.m3244j(onboardingDailyGoalFragment);
                        zs6.Companion.getClass();
                        ac6.Companion.getClass();
                        jfa.m14428k(ud6VarM3244j4, new C2916d6(R$id.actionToNotifications), null);
                    }
                } else if (vg6Var5 instanceof tg6) {
                    b34.m3244j(onboardingDailyGoalFragment).m22689f();
                }
                return xfaVar;
            case 19:
                OnboardingDictionaryLocaleFragment onboardingDictionaryLocaleFragment = (OnboardingDictionaryLocaleFragment) obj2;
                vg6 vg6Var6 = (vg6) obj;
                vg6Var6.getClass();
                if (vg6Var6 instanceof bi6) {
                    String str9 = cx6.f34687f;
                    String str10 = str9 != null ? str9 : "";
                    hm5 hm5Var4 = onboardingDictionaryLocaleFragment.f27195C0;
                    if (hm5Var4 == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    ((C1240a) hm5Var4).m7025f("registration dictionary language selected", g9a.m12429f("dictionary language", str10));
                    ud6 ud6VarM3244j5 = b34.m3244j(onboardingDictionaryLocaleFragment);
                    jt6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j5, new C2916d6(R$id.actionToOnboardingAchievement), null);
                } else if (vg6Var6 instanceof tg6) {
                    b34.m3244j(onboardingDictionaryLocaleFragment).m22689f();
                }
                return xfaVar;
            case 20:
                il4 il4Var = (il4) obj;
                il4Var.getClass();
                String str11 = cx6.f34682a;
                String str12 = il4Var.f44255a;
                cx6.f34687f = str12;
                C3244l c3244l = ((C2206a) obj2).f27216d;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, str12));
                return xfaVar;
            case 21:
                OnboardingLanguageFragment onboardingLanguageFragment = (OnboardingLanguageFragment) obj2;
                vg6 vg6Var7 = (vg6) obj;
                vg6Var7.getClass();
                if (vg6Var7 instanceof gi6) {
                    hm5 hm5Var5 = onboardingLanguageFragment.f27231B0;
                    if (hm5Var5 == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("Registration language", cx6.f34682a);
                    ((C1240a) hm5Var5).m7025f("registration language selected", bundle5);
                    ud6 ud6VarM3244j6 = b34.m3244j(onboardingLanguageFragment);
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j6, new C2916d6(R$id.actionToOnboardingLevel), null);
                } else if (vg6Var7 instanceof tg6) {
                    b34.m3244j(onboardingLanguageFragment).m22689f();
                }
                return xfaVar;
            case 22:
                il4 il4Var2 = (il4) obj;
                il4Var2.getClass();
                String str13 = cx6.f34682a;
                String str14 = il4Var2.f44255a;
                str14.getClass();
                cx6.f34682a = str14;
                cx6.f34688g = null;
                C3244l c3244l2 = ((C2208a) obj2).f27244d;
                do {
                    value2 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value2, str14));
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                OnboardingLevelFragment onboardingLevelFragment = (OnboardingLevelFragment) obj2;
                vg6 vg6Var8 = (vg6) obj;
                vg6Var8.getClass();
                if (vg6Var8.equals(ai6.f695b)) {
                    onboardingLevelFragment.m9141e0();
                    ud6 ud6VarM3244j7 = b34.m3244j(onboardingLevelFragment);
                    xt6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j7, new C2916d6(R$id.actionToOnboardingDictionaryLocale), null);
                } else if (vg6Var8.equals(bi6.f8564a)) {
                    onboardingLevelFragment.m9141e0();
                    ud6 ud6VarM3244j8 = b34.m3244j(onboardingLevelFragment);
                    xt6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j8, new C2916d6(R$id.actionToOnboardingAchievement), null);
                } else if (vg6Var8.equals(tg6Var)) {
                    b34.m3244j(onboardingLevelFragment).m22689f();
                }
                return xfaVar;
            case 24:
                OnboardingLoginFragment onboardingLoginFragment = (OnboardingLoginFragment) obj2;
                AuthorizationResult authorizationResult = (AuthorizationResult) obj;
                PendingIntent pendingIntent = authorizationResult.f11567f;
                if (pendingIntent != null) {
                    ad3 ad3Var = onboardingLoginFragment.f27028H0;
                    IntentSender intentSender = pendingIntent.getIntentSender();
                    intentSender.getClass();
                    ad3Var.mo276a(new IntentSenderRequest(intentSender, null, 0, 0));
                } else {
                    String str15 = authorizationResult.f11562a;
                    if (str15 != null) {
                        C2177b.m9112V2((C2177b) onboardingLoginFragment.f27023C0.getValue(), null, null, str15, LoginAuthType.GOOGLE, 3);
                    }
                }
                return xfaVar;
            case 25:
                OnboardingRegistrationFragment onboardingRegistrationFragment = (OnboardingRegistrationFragment) obj2;
                vg6 vg6Var9 = (vg6) obj;
                vg6Var9.getClass();
                if (vg6Var9.equals(ai6.f697d)) {
                    hm5 hm5Var6 = onboardingRegistrationFragment.f27118E0;
                    if (hm5Var6 == null) {
                        fa4.m11636J("analytics");
                        throw null;
                    }
                    ((C1240a) hm5Var6).m7025f("Registration changed to login", null);
                    ud6 ud6VarM3244j9 = b34.m3244j(onboardingRegistrationFragment);
                    fw6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j9, new yb6(""), null);
                } else if (vg6Var9 instanceof ei6) {
                    ew6 ew6Var = fw6.Companion;
                    ei6 ei6Var = (ei6) vg6Var9;
                    String str16 = ei6Var.f37287a;
                    String str17 = ei6Var.f37288b;
                    boolean z2 = ei6Var.f37289c;
                    ew6Var.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(b34.m3244j(onboardingRegistrationFragment), new xb6(str16, str17, z2), null);
                } else if (vg6Var9.equals(tg6Var)) {
                    b34.m3244j(onboardingRegistrationFragment).m22689f();
                } else if (vg6Var9 instanceof ug6) {
                    mbd.m16755c(onboardingRegistrationFragment.m2089Q(), ((ug6) vg6Var9).f63890a, null, 30);
                }
                return xfaVar;
            case 26:
                OnboardingTopicsFragment onboardingTopicsFragment = (OnboardingTopicsFragment) obj2;
                vg6 vg6Var10 = (vg6) obj;
                vg6Var10.getClass();
                if (vg6Var10.equals(ai6.f694a)) {
                    onboardingTopicsFragment.m9148e0();
                    ud6 ud6VarM3244j10 = b34.m3244j(onboardingTopicsFragment);
                    yw6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j10, new C2916d6(R$id.actionToOnboardingAccent), null);
                } else if (vg6Var10.equals(ai6.f698e)) {
                    onboardingTopicsFragment.m9148e0();
                    ud6 ud6VarM3244j11 = b34.m3244j(onboardingTopicsFragment);
                    yw6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j11, new C2916d6(R$id.actionToOnboardingRegister), null);
                } else if (vg6Var10.equals(tg6Var)) {
                    b34.m3244j(onboardingTopicsFragment).m22689f();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                for (nz6 nz6Var : ((C3257b) obj2).f48228c) {
                    nz6Var.f53449a.m23438b(obj, nz6Var.f53450b);
                }
                return xfaVar;
            case 28:
                PlaylistFragment playlistFragment = (PlaylistFragment) obj2;
                vg6 vg6Var11 = (vg6) obj;
                vg6Var11.getClass();
                boolean z3 = vg6Var11 instanceof ki6;
                LqAnalyticsValues$LessonPath.Playlist playlist = LqAnalyticsValues$LessonPath.Playlist.f14310a;
                if (z3) {
                    w41 w41Var3 = playlistFragment.f27590D0;
                    if (w41Var3 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    ki6 ki6Var = (ki6) vg6Var11;
                    w41Var3.m23737z(new ja6(ki6Var.f47346a, ki6Var.f47347b, ki6Var.f47348c, playlist));
                } else if (vg6Var11 instanceof ii6) {
                    w41 w41Var4 = playlistFragment.f27590D0;
                    if (w41Var4 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var4.m23737z(new s96(((ii6) vg6Var11).f44146a, playlist, "", ""));
                } else if (vg6Var11 instanceof ji6) {
                    w41 w41Var5 = playlistFragment.f27590D0;
                    if (w41Var5 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    ji6 ji6Var = (ji6) vg6Var11;
                    w41Var5.m23737z(new aa6(ji6Var.f45580a, false, ji6Var.f45581b));
                }
                return xfaVar;
            default:
                Playlist playlist2 = (Playlist) obj;
                playlist2.getClass();
                C3244l c3244l3 = ((C1833i) obj2).f22317o;
                ld7 ld7Var = new ld7(playlist2.f19555c, null);
                c3244l3.getClass();
                c3244l3.m15572j(null, ld7Var);
                return xfaVar;
        }
    }

    public /* synthetic */ fy4(Object obj, int i) {
        this.f39922a = i;
        this.f39923b = obj;
    }
}
