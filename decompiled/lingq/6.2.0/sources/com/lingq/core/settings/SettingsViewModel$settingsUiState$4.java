package com.lingq.core.settings;

import android.content.Context;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.DailyStreakPreset;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.user.AccountTier;
import com.lingq.core.domain.model.user.FreeTrialDetails;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import com.lingq.core.premium.delegate.UpgradeTier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.joda.time.LocalDateTime;
import org.joda.time.format.AbstractC3432a;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.AbstractC3423or;
import p000.a29;
import p000.b39;
import p000.c32;
import p000.ci8;
import p000.cl9;
import p000.cma;
import p000.d39;
import p000.dj3;
import p000.e29;
import p000.ead;
import p000.f29;
import p000.f39;
import p000.fa4;
import p000.gm5;
import p000.hz1;
import p000.iz1;
import p000.j09;
import p000.jz1;
import p000.kz1;
import p000.m19;
import p000.mz1;
import p000.n19;
import p000.nz1;
import p000.o19;
import p000.ob1;
import p000.p19;
import p000.q19;
import p000.q29;
import p000.qz1;
import p000.r19;
import p000.t19;
import p000.u2d;
import p000.uk9;
import p000.v91;
import p000.vz1;
import p000.w19;
import p000.xfa;
import p000.y29;
import p000.ys2;
import p000.z19;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsViewModel$settingsUiState$4", m4291f = "SettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsViewModel$settingsUiState$4 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ q29 f22711a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ j09 f22712b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f22713c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Pair f22714d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Triple f22715e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1873e f22716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$settingsUiState$4(C1873e c1873e, Continuation continuation) {
        super(6, continuation);
        this.f22716f = c1873e;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        SettingsViewModel$settingsUiState$4 settingsViewModel$settingsUiState$4 = new SettingsViewModel$settingsUiState$4(this.f22716f, (Continuation) obj6);
        settingsViewModel$settingsUiState$4.f22711a = (q29) obj;
        settingsViewModel$settingsUiState$4.f22712b = (j09) obj2;
        settingsViewModel$settingsUiState$4.f22713c = (String) obj3;
        settingsViewModel$settingsUiState$4.f22714d = (Pair) obj4;
        settingsViewModel$settingsUiState$4.f22715e = (Triple) obj5;
        return settingsViewModel$settingsUiState$4.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x043d  */
    /* JADX WARN: Code duplicated, block: B:150:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:241:0x0821  */
    /* JADX WARN: Code duplicated, block: B:243:0x0827  */
    /* JADX WARN: Code duplicated, block: B:245:0x082d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0831  */
    /* JADX WARN: Code duplicated, block: B:248:0x0835  */
    /* JADX WARN: Code duplicated, block: B:250:0x083f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0844  */
    /* JADX WARN: Code duplicated, block: B:253:0x0849  */
    /* JADX WARN: Code duplicated, block: B:256:0x084f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0858  */
    /* JADX WARN: Code duplicated, block: B:260:0x085e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0864  */
    /* JADX WARN: Code duplicated, block: B:265:0x0868 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:266:0x086a  */
    /* JADX WARN: Code duplicated, block: B:267:0x0873 A[PHI: r20
      0x0873: PHI (r20v2 mz1) = (r20v1 mz1), (r20v1 mz1), (r20v4 mz1) binds: [B:262:0x0862, B:265:0x0868, B:266:0x086a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        p19 p19Var;
        String str;
        kz1 kz1Var;
        ob1 ob1Var;
        ListBuilder listBuilder;
        long longVersionCode;
        ViewKeys viewKeys;
        boolean z;
        List list;
        kz1 kz1Var2;
        String strValueOf;
        Integer numM22409c;
        Integer numValueOf;
        nz1 nz1Var;
        int iIntValue;
        jz1 jz1Var;
        hz1 hz1Var;
        List listM23635i;
        ViewKeys viewKeys2;
        ArrayList arrayList;
        DailyGoal dailyGoal;
        String str2;
        Profile profile;
        String strM14767b;
        String strM14767b2;
        ListBuilder listBuilder2;
        t19 t19VarM8643Y2;
        ListBuilder listBuilder3;
        String str3;
        t19 t19VarM8643Y3;
        int i;
        DailyGoal dailyGoal2;
        C1873e c1873e = this.f22716f;
        cma cmaVar = c1873e.f22962b;
        Context context = c1873e.f22965e;
        q29 q29Var = this.f22711a;
        j09 j09Var = this.f22712b;
        String str4 = this.f22713c;
        Pair pair = this.f22714d;
        Triple triple = this.f22715e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Pair pair2 = (Pair) pair.f47623a;
        Pair pair3 = (Pair) pair.f47624b;
        boolean zBooleanValue = ((Boolean) triple.f47633a).booleanValue();
        boolean zBooleanValue2 = ((Boolean) triple.f47634b).booleanValue();
        Set set = (Set) triple.f47635c;
        ViewKeys viewKeys3 = (ViewKeys) pair3.f47623a;
        String str5 = (String) pair3.f47624b;
        kz1 kz1Var3 = j09Var.f44858d;
        jz1 jz1VarM8644Z2 = kz1Var3.f48789a;
        if (jz1VarM8644Z2 == null) {
            jz1VarM8644Z2 = C1873e.m8644Z2(j09Var.f44857c);
        }
        Profile profile2 = j09Var.f44855a;
        SubscriptionDetails subscriptionDetails = j09Var.f44856b;
        ob1 ob1Var2 = c1873e.f22966f;
        ListBuilder listBuilderM23650t = vz1.m23650t();
        listBuilderM23650t.add(new e29(com.lingq.core.p012ui.R$string.settings_text_lesson_settings, null, ViewKeys.LessonSettings, null, null, 120));
        q19 q19Var = q19.f57132a;
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new e29(R$string.activities_settings, null, ViewKeys.ActivitiesSettings, null, null, 120));
        listBuilderM23650t.add(new o19(com.lingq.core.p012ui.R$string.lingq_languages));
        Map map = q29Var.f57170d;
        LqTheme lqTheme = q29Var.f57167a;
        Map map2 = (Map) map.get(cmaVar.mo4589b2());
        Pair pairM15221o = map2 != null ? AbstractC3184kh.m15221o(map2) : new Pair(LearningLevel.Beginner1, LearningLevel.Advanced2);
        ys2 entries = LearningLevel.getEntries();
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            Integer numM4844a0 = cl9.m4844a0(((LearningLevel) it.next()).getServerName());
            arrayList2.add(Integer.valueOf(numM4844a0 != null ? numM4844a0.intValue() : 0));
        }
        listBuilderM23650t.add(new w19(arrayList2, vz1.m23605K(Integer.valueOf(com.lingq.core.p012ui.R$string.levels_beginner), Integer.valueOf(com.lingq.core.p012ui.R$string.levels_intermediate), Integer.valueOf(com.lingq.core.p012ui.R$string.levels_advanced)), ((LearningLevel) pairM15221o.f47623a).ordinal(), ((LearningLevel) pairM15221o.f47624b).ordinal(), ViewKeys.LanguageFeedLevels, LearningLevel.getEntries().size() - 1.0f));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new e29(R$string.texts_daily_lingqs_settings, null, ViewKeys.DailyLingQ, null, null, 120));
        listBuilderM23650t.add(q19Var);
        mz1 mz1Var = null;
        if (jz1VarM8644Z2 instanceof iz1) {
            Iterator<E> it2 = DailyGoal.getEntries().iterator();
            do {
                if (!it2.hasNext()) {
                    uk9.m22775i("Collection contains no element matching the predicate.");
                    return null;
                }
                dailyGoal2 = (DailyGoal) it2.next();
            } while (dailyGoal2.getCoins() != ((iz1) jz1VarM8644Z2).f44794a.getCoins());
            p19Var = new p19(ead.m11004a(dailyGoal2, context), kz1Var3.f48791c, kz1Var3.f48792d);
        } else {
            if (!(jz1VarM8644Z2 instanceof hz1)) {
                gm5.m12750e();
                return null;
            }
            int i2 = R$string.settings_streak_target_custom_value;
            String string = context.getString(R$string.settings_streak_target_custom);
            int i3 = ((hz1) jz1VarM8644Z2).f43235a;
            Integer numValueOf2 = Integer.valueOf(i3);
            int i4 = i3 / 5;
            if (i4 < 1) {
                i4 = 1;
            }
            String string2 = context.getString(i2, string, numValueOf2, Integer.valueOf(i4));
            string2.getClass();
            p19Var = new p19(string2, kz1Var3.f48791c, kz1Var3.f48792d);
        }
        listBuilderM23650t.add(p19Var);
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new e29(R$string.settings_preferred_topics, null, ViewKeys.Topics, null, null, 120));
        if (ob1Var2.m17896j()) {
            listBuilderM23650t.add(q19Var);
            listBuilderM23650t.add(new e29(R$string.settings_delete_language, null, ViewKeys.DeleteLanguage, null, null, 56));
        }
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(r19.f58496a);
        listBuilderM23650t.add(new o19(R$string.settings_app));
        listBuilderM23650t.add(new e29(com.lingq.core.p012ui.R$string.settings_theme, Integer.valueOf(AbstractC3423or.m18259i0(lqTheme)), ViewKeys.Theme, null, lqTheme.name(), 88));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_playlist_3g, null, q29Var.f57169c, ViewKeys.DownloadOn3G, false));
        listBuilderM23650t.add(q19Var);
        int i5 = R$string.settings_timezone_alert;
        boolean z2 = q29Var.f57171e;
        ViewKeys viewKeys4 = ViewKeys.TimezoneAlert;
        if (profile2 == null || (str = profile2.f19662k) == null) {
            str = "";
        }
        listBuilderM23650t.add(new a29(i5, z2, viewKeys4, str));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new e29(R$string.settings_interface_language, null, ViewKeys.InterfaceLanguage, null, q29Var.f57168b, 88));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new e29(R$string.settings_clear_audio_cache, null, ViewKeys.ClearCache, str4, null, 104));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new e29(R$string.tooltips_restart_tutorial, null, ViewKeys.RestartTutorial, null, null, 120));
        if (profile2 != null) {
            ListBuilder listBuilderM23650t2 = vz1.m23650t();
            listBuilderM23650t2.add(new o19(R$string.settings_account));
            String str6 = "MMM dd";
            if (subscriptionDetails != null) {
                String str7 = subscriptionDetails.f19839g;
                String str8 = subscriptionDetails.f19837e;
                AccountTier accountTier = subscriptionDetails.f19834b;
                if (str7 != null) {
                    try {
                        strM14767b2 = AbstractC3432a.m18451a("MMM dd").m14769d(Locale.getDefault()).m14767b(LocalDateTime.m18367g(str7));
                    } catch (Exception unused) {
                        strM14767b2 = "";
                    }
                } else {
                    strM14767b2 = "";
                }
                UpgradeTier upgradeTier = (UpgradeTier) c1873e.f22963c.mo8562V0().getValue();
                boolean zMo4588a0 = cmaVar.mo4588a0();
                kz1Var = kz1Var3;
                boolean zM11650l = fa4.m11650l(subscriptionDetails.f19836d, "Google");
                int i6 = zM11650l ? com.lingq.core.p012ui.R$string.settings_upgrade_change_plan : R$string.settings_change_plan_on_lingq;
                profile = profile2;
                ListBuilder listBuilderM23650t3 = vz1.m23650t();
                String str9 = accountTier.f19628b;
                int i7 = i6;
                String str10 = accountTier.f19628b;
                ob1Var = ob1Var2;
                Boolean bool = accountTier.f19629c;
                listBuilder = listBuilderM23650t;
                if (fa4.m11650l(str9, "FREE")) {
                    str2 = "";
                } else {
                    str2 = "";
                    if (upgradeTier == UpgradeTier.FREE) {
                        str2 = str2;
                    } else {
                        FreeTrialDetails freeTrialDetails = subscriptionDetails.f19843k;
                        if (freeTrialDetails == null || !fa4.m11650l(freeTrialDetails.f19636b, Boolean.TRUE) || fa4.m11650l(str10, "FREE")) {
                            listBuilder2 = listBuilderM23650t3;
                            String str11 = strM14767b2;
                            Boolean bool2 = subscriptionDetails.f19840h;
                            if (str8 == null || str8.equals("0-Month")) {
                                str3 = str2;
                                Boolean bool3 = Boolean.TRUE;
                                if (fa4.m11650l(bool, bool3)) {
                                    t19VarM8643Y3 = C1873e.m8643Y2(c1873e, R$string.settings_sub_lifetime, null, cl9.m4839V(str10, "Lifetime Premium ", str3), R$string.settings_change_plan_on_lingq, true, 70);
                                } else if (accountTier.f19627a == 1 || !fa4.m11650l(bool2, bool3)) {
                                    t19VarM8643Y3 = null;
                                } else {
                                    int i8 = subscriptionDetails.f19833a.f19857c == 7 ? zMo4588a0 ? R$string.settings_sub_yearly_downgraded_plus : R$string.settings_sub_yearly_downgraded : zMo4588a0 ? R$string.settings_sub_premium_downgraded_plus : R$string.settings_sub_premium_downgraded;
                                    t19VarM8643Y3 = zM11650l ? C1873e.m8643Y2(c1873e, i8, str11, null, R$string.settings_sub_resub, false, 40) : C1873e.m8643Y2(c1873e, i8, str11, null, R$string.settings_change_plan_on_lingq, true, 72);
                                }
                                if (t19VarM8643Y3 != null) {
                                    listBuilder2.add(t19VarM8643Y3);
                                }
                                str2 = str3;
                            } else {
                                if (str8.equals("1-Month")) {
                                    i = fa4.m11650l(bool2, Boolean.TRUE) ? zMo4588a0 ? R$string.settings_sub_premium_plus : R$string.settings_sub_premium : zMo4588a0 ? R$string.settings_sub_premium_downgraded_plus : R$string.settings_sub_premium_downgraded;
                                } else if (fa4.m11650l(bool2, Boolean.TRUE)) {
                                    i = zMo4588a0 ? R$string.settings_sub_yearly_plus : R$string.settings_sub_yearly;
                                } else {
                                    i = zMo4588a0 ? R$string.settings_sub_yearly_downgraded_plus : R$string.settings_sub_yearly_downgraded;
                                }
                                str3 = str2;
                                t19VarM8643Y3 = C1873e.m8643Y2(c1873e, i, str11, null, i7, !zM11650l, 72);
                            }
                            if (t19VarM8643Y3 != null) {
                                listBuilder2.add(t19VarM8643Y3);
                            }
                            str2 = str3;
                        } else {
                            listBuilder2 = listBuilderM23650t3;
                            listBuilder2.add(C1873e.m8643Y2(c1873e, zMo4588a0 ? R$string.settings_sub_yearly_trial_plus : R$string.settings_sub_yearly_trial, strM14767b2, null, i7, !zM11650l, 72));
                        }
                        kz1Var = kz1Var;
                        str5 = str5;
                        jz1VarM8644Z2 = jz1VarM8644Z2;
                        profile = profile;
                        ob1Var = ob1Var;
                        listBuilder = listBuilder;
                    }
                    listBuilderM23650t2.addAll(vz1.m23635i(listBuilder2));
                    listBuilderM23650t2.add(q19Var);
                }
                pair2 = pair2;
                if (upgradeTier == UpgradeTier.FREE) {
                    listBuilder2 = listBuilderM23650t3;
                    t19VarM8643Y2 = C1873e.m8643Y2(c1873e, R$string.settings_sub_free, null, null, R$string.upgrade_upgrade_to_premium, false, 46);
                    str6 = "MMM dd";
                } else {
                    if (upgradeTier == UpgradeTier.PREMIUM_1_MONTH || upgradeTier == UpgradeTier.PREMIUM_YEAR || upgradeTier == UpgradeTier.PREMIUM_6_MONTH) {
                        str6 = "MMM dd";
                        set = set;
                        str2 = str2;
                        kz1Var = kz1Var;
                        listBuilder2 = listBuilderM23650t3;
                        t19VarM8643Y2 = C1873e.m8643Y2(c1873e, zMo4588a0 ? R$string.settings_sub_premium_default_plus : R$string.settings_sub_premium_default, null, null, 0, false, 126);
                    } else if (upgradeTier == UpgradeTier.PREMIUM_NOT_GOOGLE) {
                        if (fa4.m11650l(bool, Boolean.TRUE)) {
                            listBuilder3 = listBuilderM23650t3;
                            t19VarM8643Y2 = C1873e.m8643Y2(c1873e, R$string.settings_sub_lifetime, null, cl9.m4839V(str10, "Lifetime Premium ", str2), R$string.settings_change_plan_on_lingq, true, 70);
                        } else {
                            int i9 = zMo4588a0 ? R$string.upgrade_premium_plus : com.lingq.core.p012ui.R$string.upgrade_premium;
                            listBuilder3 = listBuilderM23650t3;
                            t19VarM8643Y2 = C1873e.m8643Y2(c1873e, i9, null, null, R$string.settings_change_plan_on_lingq, true, 78);
                            set = set;
                        }
                        listBuilder2 = listBuilder3;
                    } else {
                        listBuilder2 = listBuilderM23650t3;
                        str6 = "MMM dd";
                        str2 = str2;
                        t19VarM8643Y2 = null;
                    }
                    if (t19VarM8643Y2 != null) {
                        listBuilder2.add(t19VarM8643Y2);
                    }
                    listBuilderM23650t2.addAll(vz1.m23635i(listBuilder2));
                    listBuilderM23650t2.add(q19Var);
                }
                if (t19VarM8643Y2 != null) {
                    listBuilder2.add(t19VarM8643Y2);
                }
                listBuilderM23650t2.addAll(vz1.m23635i(listBuilder2));
                listBuilderM23650t2.add(q19Var);
            } else {
                pair2 = pair2;
                kz1Var = kz1Var3;
                listBuilder = listBuilderM23650t;
                str2 = "";
                profile = profile2;
                str6 = "MMM dd";
                str5 = str5;
                jz1VarM8644Z2 = jz1VarM8644Z2;
                ob1Var = ob1Var2;
            }
            if (cmaVar.mo4593p0() || cmaVar.mo4588a0()) {
                try {
                    strM14767b = AbstractC3432a.m18451a(str6).m14769d(Locale.getDefault()).m14767b(LocalDateTime.m18367g(profile.f19672u));
                } catch (Exception unused2) {
                    strM14767b = str2;
                }
                listBuilderM23650t2.add(new n19(ViewKeys.AudioTranscription, R$string.settings_audio_transcription, profile.f19674w, R$string.settings_audio_transcription_desc, strM14767b, (cmaVar.mo4588a0() || cmaVar.mo4590d0() || cmaVar.mo4592m0()) ? false : true));
            }
            listBuilderM23650t2.add(new f29(ViewKeys.UserLogOut, profile.f19654c));
            listBuilderM23650t2.add(q19Var);
            listBuilderM23650t2.add(new e29(com.lingq.core.p012ui.R$string.texts_email_support, null, ViewKeys.EmailSupport, null, null, 120));
            listBuilderM23650t2.add(q19Var);
            listBuilderM23650t2.add(new e29(R$string.settings_delete_account, null, ViewKeys.DeleteAccount, null, null, 56));
            listBuilder.addAll(vz1.m23635i(listBuilderM23650t2));
        } else {
            pair2 = pair2;
            kz1Var = kz1Var3;
            ob1Var = ob1Var2;
            listBuilder = listBuilderM23650t;
            str5 = str5;
            jz1VarM8644Z2 = jz1VarM8644Z2;
        }
        listBuilder.add(new o19(R$string.texts_about));
        try {
            Context context2 = ob1Var.f54126a;
            longVersionCode = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).getLongVersionCode();
        } catch (Exception unused3) {
            longVersionCode = 0;
        }
        listBuilder.add(new m19(longVersionCode, ob1Var.m17889b(), ViewKeys.About));
        ListBuilder listBuilderM23635i = vz1.m23635i(listBuilder);
        boolean zBooleanValue3 = ((Boolean) pair2.f47623a).booleanValue();
        boolean zBooleanValue4 = ((Boolean) pair2.f47624b).booleanValue();
        String strM17093L = AbstractC3352my.m17093L(context, cmaVar.mo4589b2());
        EmptyList emptyList = EmptyList.f47638a;
        if (viewKeys3 != null) {
            int i10 = f39.f38368a[viewKeys3.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 8) {
                            viewKeys2 = viewKeys3;
                            ys2<FeedTopic> entries2 = FeedTopic.getEntries();
                            arrayList = new ArrayList(v91.m23189q0(entries2, 10));
                            for (FeedTopic feedTopic : entries2) {
                                arrayList.add(new b39(viewKeys2, AbstractC3184kh.m15203K(feedTopic), set.contains(AbstractC3184kh.m15203K(feedTopic)), feedTopic));
                            }
                        } else if (i10 != 9) {
                            listM23635i = emptyList;
                        } else {
                            ListBuilder listBuilderM23650t4 = vz1.m23650t();
                            for (DailyStreakPreset dailyStreakPreset : DailyStreakPreset.getEntries()) {
                                Iterator<E> it3 = DailyGoal.getEntries().iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        uk9.m22775i("Collection contains no element matching the predicate.");
                                        return null;
                                    }
                                    dailyGoal = (DailyGoal) it3.next();
                                } while (dailyGoal.getCoins() != dailyStreakPreset.getCoins());
                                listBuilderM23650t4.add(new y29(0, 112, viewKeys3, ead.m11004a(dailyGoal, context), dailyStreakPreset.getIntensity(), fa4.m11650l(str5, dailyStreakPreset.getIntensity()), false, false));
                            }
                            String string3 = context.getString(R$string.settings_streak_target_custom);
                            string3.getClass();
                            listBuilderM23650t4.add(new y29(0, 112, viewKeys3, string3, "custom", fa4.m11650l(str5, "custom"), false, false));
                            listM23635i = vz1.m23635i(listBuilderM23650t4);
                            listBuilderM23635i = listBuilderM23635i;
                            viewKeys = viewKeys3;
                            set = set;
                        }
                        z = false;
                    } else {
                        viewKeys2 = viewKeys3;
                        String[] availableIDs = TimeZone.getAvailableIDs();
                        availableIDs.getClass();
                        arrayList = new ArrayList(availableIDs.length);
                        int length = availableIDs.length;
                        int i11 = 0;
                        while (i11 < length) {
                            String str12 = availableIDs[i11];
                            str12.getClass();
                            ViewKeys viewKeys5 = viewKeys2;
                            arrayList.add(new y29(0, 112, viewKeys5, str12, str12, str12.equalsIgnoreCase(str5), false, false));
                            i11++;
                            viewKeys2 = viewKeys5;
                        }
                    }
                    listBuilderM23635i = listBuilderM23635i;
                    viewKeys = viewKeys2;
                    listM23635i = arrayList;
                    z = false;
                } else {
                    ys2<LqTheme> entries3 = LqTheme.getEntries();
                    ArrayList arrayList3 = new ArrayList(v91.m23189q0(entries3, 10));
                    for (LqTheme lqTheme2 : entries3) {
                        String string4 = context.getString(AbstractC3423or.m18259i0(lqTheme2));
                        string4.getClass();
                        arrayList3.add(new y29(0, 112, viewKeys3, string4, lqTheme2.name(), fa4.m11650l(str5, lqTheme2.name()), false, false));
                    }
                    listM23635i = arrayList3;
                }
                viewKeys = viewKeys3;
                z = false;
            } else {
                set = set;
                String[] stringArray = context.getResources().getStringArray(R$array.interface_languages_values);
                stringArray.getClass();
                ArrayList arrayList4 = new ArrayList(stringArray.length);
                int length2 = stringArray.length;
                int i12 = 0;
                while (i12 < length2) {
                    String str13 = stringArray[i12];
                    str13.getClass();
                    Locale localeForLanguageTag = Locale.forLanguageTag(cl9.m4839V(str13, "_", "-"));
                    String displayName = localeForLanguageTag.getDisplayName(localeForLanguageTag);
                    displayName.getClass();
                    if (displayName.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        char cCharAt = displayName.charAt(0);
                        sb.append((Object) (Character.isLowerCase(cCharAt) ? ci8.m4711X(cCharAt, localeForLanguageTag) : String.valueOf(cCharAt)));
                        sb.append(displayName.substring(1));
                        displayName = sb.toString();
                    }
                    arrayList4.add(new y29(0, 112, viewKeys3, displayName, str13, false, false, false));
                    i12++;
                    listBuilderM23635i = listBuilderM23635i;
                }
                listBuilderM23635i = listBuilderM23635i;
                viewKeys = viewKeys3;
                z = false;
                listM23635i = arrayList4;
            }
            if (listM23635i != null) {
                list = listM23635i;
            }
            if (viewKeys == ViewKeys.DailyStreakTarget && fa4.m11650l(str5, "custom")) {
                z = true;
            }
            if (z) {
                kz1Var2 = kz1Var;
                strValueOf = kz1Var2.f48790b;
                if (strValueOf == null) {
                    jz1Var = jz1VarM8644Z2;
                    if (jz1Var instanceof hz1) {
                        hz1Var = (hz1) jz1Var;
                    } else {
                        hz1Var = null;
                    }
                    if (hz1Var != null) {
                        strValueOf = String.valueOf(hz1Var.f43235a);
                    }
                }
                if (strValueOf != null) {
                    numM22409c = u2d.m22409c(strValueOf);
                } else {
                    numM22409c = null;
                }
                if (numM22409c != null) {
                    iIntValue = numM22409c.intValue() / 5;
                    if (iIntValue < 1) {
                        iIntValue = 1;
                    }
                    numValueOf = Integer.valueOf(iIntValue);
                } else {
                    numValueOf = null;
                }
                boolean z3 = kz1Var2.f48791c;
                if (z) {
                    nz1Var = kz1Var2.f48792d;
                    if (nz1Var == null) {
                        if (numM22409c == null) {
                            mz1Var = new mz1(R$string.settings_daily_streak_target_invalid);
                        }
                        nz1Var = mz1Var;
                    }
                } else {
                    nz1Var = mz1Var;
                }
                return new d39(listBuilderM23635i, zBooleanValue3, zBooleanValue4, zBooleanValue, zBooleanValue2, viewKeys, str5, strM17093L, set, list, new qz1(strValueOf, numValueOf, z3, nz1Var));
            }
            kz1Var2 = kz1Var;
            strValueOf = null;
            if (strValueOf != null) {
                numM22409c = u2d.m22409c(strValueOf);
            } else {
                numM22409c = null;
            }
            if (numM22409c != null) {
                iIntValue = numM22409c.intValue() / 5;
                if (iIntValue < 1) {
                    iIntValue = 1;
                }
                numValueOf = Integer.valueOf(iIntValue);
            } else {
                numValueOf = null;
            }
            boolean z4 = kz1Var2.f48791c;
            if (z) {
                nz1Var = mz1Var;
            } else {
                nz1Var = kz1Var2.f48792d;
                if (nz1Var == null) {
                    if (numM22409c == null) {
                        mz1Var = new mz1(R$string.settings_daily_streak_target_invalid);
                    }
                    nz1Var = mz1Var;
                }
            }
            return new d39(listBuilderM23635i, zBooleanValue3, zBooleanValue4, zBooleanValue, zBooleanValue2, viewKeys, str5, strM17093L, set, list, new qz1(strValueOf, numValueOf, z4, nz1Var));
        }
        listBuilderM23635i = listBuilderM23635i;
        set = set;
        viewKeys = viewKeys3;
        z = false;
        list = emptyList;
        if (viewKeys == ViewKeys.DailyStreakTarget) {
            z = true;
        }
        if (z) {
            kz1Var2 = kz1Var;
            strValueOf = kz1Var2.f48790b;
            if (strValueOf == null) {
                jz1Var = jz1VarM8644Z2;
                if (jz1Var instanceof hz1) {
                    hz1Var = (hz1) jz1Var;
                } else {
                    hz1Var = null;
                }
                if (hz1Var != null) {
                    strValueOf = String.valueOf(hz1Var.f43235a);
                }
            }
            if (strValueOf != null) {
                numM22409c = u2d.m22409c(strValueOf);
            } else {
                numM22409c = null;
            }
            if (numM22409c != null) {
                iIntValue = numM22409c.intValue() / 5;
                if (iIntValue < 1) {
                    iIntValue = 1;
                }
                numValueOf = Integer.valueOf(iIntValue);
            } else {
                numValueOf = null;
            }
            boolean z5 = kz1Var2.f48791c;
            if (z) {
                nz1Var = mz1Var;
            } else {
                nz1Var = kz1Var2.f48792d;
                if (nz1Var == null) {
                    if (numM22409c == null) {
                        mz1Var = new mz1(R$string.settings_daily_streak_target_invalid);
                    }
                    nz1Var = mz1Var;
                }
            }
            return new d39(listBuilderM23635i, zBooleanValue3, zBooleanValue4, zBooleanValue, zBooleanValue2, viewKeys, str5, strM17093L, set, list, new qz1(strValueOf, numValueOf, z5, nz1Var));
        }
        kz1Var2 = kz1Var;
        strValueOf = null;
        if (strValueOf != null) {
            numM22409c = u2d.m22409c(strValueOf);
        } else {
            numM22409c = null;
        }
        if (numM22409c != null) {
            iIntValue = numM22409c.intValue() / 5;
            if (iIntValue < 1) {
                iIntValue = 1;
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            numValueOf = null;
        }
        boolean z6 = kz1Var2.f48791c;
        if (z) {
            nz1Var = mz1Var;
        } else {
            nz1Var = kz1Var2.f48792d;
            if (nz1Var == null) {
                if (numM22409c == null) {
                    mz1Var = new mz1(R$string.settings_daily_streak_target_invalid);
                }
                nz1Var = mz1Var;
            }
        }
        return new d39(listBuilderM23635i, zBooleanValue3, zBooleanValue4, zBooleanValue, zBooleanValue2, viewKeys, str5, strM17093L, set, list, new qz1(strValueOf, numValueOf, z6, nz1Var));
    }
}
