package com.lingq.feature.onboarding.p014v2.domain;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LanguageLevels;
import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1293i;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.feature.onboarding.p014v2.PendingMiniLessonLingq;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.joda.time.DateTime;
import p000.C3386nv;
import p000.C3509qs;
import p000.ac1;
import p000.ao0;
import p000.e7a;
import p000.fa4;
import p000.fs6;
import p000.g9a;
import p000.hm5;
import p000.hy3;
import p000.lm4;
import p000.nm7;
import p000.qm7;
import p000.u91;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.domain.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2220a {
    private static final ac1 Companion = new ac1();

    /* JADX INFO: renamed from: a */
    public final lm4 f27465a;

    /* JADX INFO: renamed from: b */
    public final nm7 f27466b;

    /* JADX INFO: renamed from: c */
    public final hm5 f27467c;

    /* JADX INFO: renamed from: d */
    public final fs6 f27468d;

    /* JADX INFO: renamed from: e */
    public final ao0 f27469e;

    /* JADX INFO: renamed from: f */
    public final e7a f27470f;

    public C2220a(lm4 lm4Var, nm7 nm7Var, hm5 hm5Var, fs6 fs6Var, ao0 ao0Var, e7a e7aVar) {
        lm4Var.getClass();
        nm7Var.getClass();
        hm5Var.getClass();
        ao0Var.getClass();
        e7aVar.getClass();
        this.f27465a = lm4Var;
        this.f27466b = nm7Var;
        this.f27467c = hm5Var;
        this.f27468d = fs6Var;
        this.f27469e = ao0Var;
        this.f27470f = e7aVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0134 A[PHI: r1 r2 r6 r7 r9
      0x0134: PHI (r1v5 java.util.List) = (r1v3 java.util.List), (r1v11 java.util.List) binds: [B:33:0x0130, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r2v15 java.lang.Object) = (r2v14 java.lang.Object), (r2v1 java.lang.Object) binds: [B:33:0x0130, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r6v8 java.lang.String) = (r6v6 java.lang.String), (r6v36 java.lang.String) binds: [B:33:0x0130, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r7v6 java.lang.String) = (r7v4 java.lang.String), (r7v9 java.lang.String) binds: [B:33:0x0130, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r9v6 java.lang.String) = (r9v4 java.lang.String), (r9v8 java.lang.String) binds: [B:33:0x0130, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0138  */
    /* JADX WARN: Code duplicated, block: B:40:0x0158  */
    /* JADX WARN: Code duplicated, block: B:43:0x015f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0192  */
    /* JADX WARN: Code duplicated, block: B:46:0x0199  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f2, code lost:
    
        if (m9171b(r1, r4) == r5) goto L56;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9170a(String str, String str2, String str3, String str4, Set set, List list, ContinuationImpl continuationImpl) throws Throwable {
        CompleteOnboardingUseCase$invoke$1 completeOnboardingUseCase$invoke$1;
        String str5;
        String str6;
        String str7;
        Set set2;
        List list2;
        String str8;
        String str9;
        String str10;
        String str11;
        Profile profile;
        String string;
        String value;
        C3509qs c3509qs = (C3509qs) this.f27468d.f39590b;
        if (continuationImpl instanceof CompleteOnboardingUseCase$invoke$1) {
            completeOnboardingUseCase$invoke$1 = (CompleteOnboardingUseCase$invoke$1) continuationImpl;
            int i = completeOnboardingUseCase$invoke$1.f27409h;
            if ((i & Integer.MIN_VALUE) != 0) {
                completeOnboardingUseCase$invoke$1.f27409h = i - Integer.MIN_VALUE;
            } else {
                completeOnboardingUseCase$invoke$1 = new CompleteOnboardingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            completeOnboardingUseCase$invoke$1 = new CompleteOnboardingUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15542u = completeOnboardingUseCase$invoke$1.f27407f;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = completeOnboardingUseCase$invoke$1.f27409h;
        lm4 lm4Var = this.f27465a;
        hm5 hm5Var = this.f27467c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15542u);
            this.f27470f.mo8777t0();
            completeOnboardingUseCase$invoke$1.f27402a = str;
            completeOnboardingUseCase$invoke$1.f27403b = str2;
            completeOnboardingUseCase$invoke$1.f27404c = str3;
            completeOnboardingUseCase$invoke$1.f27405d = set;
            completeOnboardingUseCase$invoke$1.f27406e = list;
            completeOnboardingUseCase$invoke$1.f27409h = 1;
            if (((C1293i) lm4Var).m7221r(str, str4, completeOnboardingUseCase$invoke$1) != obj) {
                str5 = str;
                str6 = str2;
                str7 = str3;
                set2 = set;
                list2 = list;
            }
            return obj;
        }
        if (i2 == 1) {
            list2 = completeOnboardingUseCase$invoke$1.f27406e;
            set2 = completeOnboardingUseCase$invoke$1.f27405d;
            str7 = completeOnboardingUseCase$invoke$1.f27404c;
            str6 = completeOnboardingUseCase$invoke$1.f27403b;
            str5 = completeOnboardingUseCase$invoke$1.f27402a;
            AbstractC3193b.m15359b(objM15542u);
        } else {
            if (i2 == 2) {
                list2 = completeOnboardingUseCase$invoke$1.f27406e;
                Set set3 = completeOnboardingUseCase$invoke$1.f27405d;
                str8 = completeOnboardingUseCase$invoke$1.f27404c;
                str9 = completeOnboardingUseCase$invoke$1.f27403b;
                str11 = completeOnboardingUseCase$invoke$1.f27402a;
                AbstractC3193b.m15359b(objM15542u);
                str10 = str11;
                qm7 qm7Var = ((C1369b) this.f27466b).f18480m;
                completeOnboardingUseCase$invoke$1.f27402a = str10;
                completeOnboardingUseCase$invoke$1.f27403b = str9;
                completeOnboardingUseCase$invoke$1.f27404c = str8;
                completeOnboardingUseCase$invoke$1.f27405d = null;
                completeOnboardingUseCase$invoke$1.f27406e = list2;
                completeOnboardingUseCase$invoke$1.f27409h = 3;
                objM15542u = AbstractC3224d.m15542u(qm7Var, completeOnboardingUseCase$invoke$1);
                if (objM15542u != obj) {
                    profile = (Profile) objM15542u;
                    if (profile != null) {
                        int i3 = profile.f19652a;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        ((C1240a) hm5Var).m7026g(sb.toString());
                    }
                    string = c3509qs.f58118b.getString("registerData2", "");
                    if (string == null) {
                        string = "";
                    }
                    if (string.length() > 0) {
                        Bundle bundleM12429f = g9a.m12429f("Registration client", "android");
                        bundleM12429f.putString("Registration date", hy3.f43148E.m14766a(new DateTime()));
                        bundleM12429f.putString("Registration language", str10);
                        bundleM12429f.putString("Registration method", string);
                        bundleM12429f.putString("Referral code", str8);
                        if (fa4.m11650l(str9, LearningLevel.Beginner1.getServerName())) {
                            value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                        } else if (fa4.m11650l(str9, LearningLevel.Intermediate1.getServerName())) {
                            value = LqAnalyticsValues$LanguageLevels.Intermediate1.getValue();
                        } else if (fa4.m11650l(str9, LearningLevel.Advanced1.getServerName())) {
                            value = LqAnalyticsValues$LanguageLevels.Advanced1.getValue();
                        } else {
                            value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                        }
                        bundleM12429f.putString("Registration level", value);
                        C1240a c1240a = (C1240a) hm5Var;
                        c1240a.m7025f("Registration confirmed", bundleM12429f);
                        Bundle bundle = new Bundle();
                        bundle.putString("Registration method", string);
                        c1240a.m7025f("registration account created", bundle);
                        c3509qs.m20138l("");
                    }
                    completeOnboardingUseCase$invoke$1.f27402a = null;
                    completeOnboardingUseCase$invoke$1.f27403b = null;
                    completeOnboardingUseCase$invoke$1.f27404c = null;
                    completeOnboardingUseCase$invoke$1.f27405d = null;
                    completeOnboardingUseCase$invoke$1.f27406e = null;
                    completeOnboardingUseCase$invoke$1.f27409h = 4;
                }
                return obj;
            }
            if (i2 == 3) {
                list2 = completeOnboardingUseCase$invoke$1.f27406e;
                Set set4 = completeOnboardingUseCase$invoke$1.f27405d;
                str8 = completeOnboardingUseCase$invoke$1.f27404c;
                str9 = completeOnboardingUseCase$invoke$1.f27403b;
                str10 = completeOnboardingUseCase$invoke$1.f27402a;
                AbstractC3193b.m15359b(objM15542u);
                profile = (Profile) objM15542u;
                if (profile != null) {
                    int i4 = profile.f19652a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i4);
                    ((C1240a) hm5Var).m7026g(sb2.toString());
                }
                string = c3509qs.f58118b.getString("registerData2", "");
                if (string == null) {
                    string = "";
                }
                if (string.length() > 0) {
                    Bundle bundleM12429f2 = g9a.m12429f("Registration client", "android");
                    bundleM12429f2.putString("Registration date", hy3.f43148E.m14766a(new DateTime()));
                    bundleM12429f2.putString("Registration language", str10);
                    bundleM12429f2.putString("Registration method", string);
                    bundleM12429f2.putString("Referral code", str8);
                    if (fa4.m11650l(str9, LearningLevel.Beginner1.getServerName())) {
                        value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                    } else if (fa4.m11650l(str9, LearningLevel.Intermediate1.getServerName())) {
                        value = LqAnalyticsValues$LanguageLevels.Intermediate1.getValue();
                    } else if (fa4.m11650l(str9, LearningLevel.Advanced1.getServerName())) {
                        value = LqAnalyticsValues$LanguageLevels.Advanced1.getValue();
                    } else {
                        value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                    }
                    bundleM12429f2.putString("Registration level", value);
                    C1240a c1240a2 = (C1240a) hm5Var;
                    c1240a2.m7025f("Registration confirmed", bundleM12429f2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("Registration method", string);
                    c1240a2.m7025f("registration account created", bundle2);
                    c3509qs.m20138l("");
                }
                completeOnboardingUseCase$invoke$1.f27402a = null;
                completeOnboardingUseCase$invoke$1.f27403b = null;
                completeOnboardingUseCase$invoke$1.f27404c = null;
                completeOnboardingUseCase$invoke$1.f27405d = null;
                completeOnboardingUseCase$invoke$1.f27406e = null;
                completeOnboardingUseCase$invoke$1.f27409h = 4;
            } else {
                if (i2 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = completeOnboardingUseCase$invoke$1.f27406e;
                Set set5 = completeOnboardingUseCase$invoke$1.f27405d;
                AbstractC3193b.m15359b(objM15542u);
            }
        }
        return xfa.f68157a;
        if (set2.isEmpty()) {
            str8 = str7;
            str9 = str6;
            str10 = str5;
            qm7 qm7Var2 = ((C1369b) this.f27466b).f18480m;
            completeOnboardingUseCase$invoke$1.f27402a = str10;
            completeOnboardingUseCase$invoke$1.f27403b = str9;
            completeOnboardingUseCase$invoke$1.f27404c = str8;
            completeOnboardingUseCase$invoke$1.f27405d = null;
            completeOnboardingUseCase$invoke$1.f27406e = list2;
            completeOnboardingUseCase$invoke$1.f27409h = 3;
            objM15542u = AbstractC3224d.m15542u(qm7Var2, completeOnboardingUseCase$invoke$1);
            if (objM15542u != obj) {
                profile = (Profile) objM15542u;
                if (profile != null) {
                    int i5 = profile.f19652a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i5);
                    ((C1240a) hm5Var).m7026g(sb3.toString());
                }
                string = c3509qs.f58118b.getString("registerData2", "");
                if (string == null) {
                    string = "";
                }
                if (string.length() > 0) {
                    Bundle bundleM12429f3 = g9a.m12429f("Registration client", "android");
                    bundleM12429f3.putString("Registration date", hy3.f43148E.m14766a(new DateTime()));
                    bundleM12429f3.putString("Registration language", str10);
                    bundleM12429f3.putString("Registration method", string);
                    bundleM12429f3.putString("Referral code", str8);
                    if (fa4.m11650l(str9, LearningLevel.Beginner1.getServerName())) {
                        value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                    } else if (fa4.m11650l(str9, LearningLevel.Intermediate1.getServerName())) {
                        value = LqAnalyticsValues$LanguageLevels.Intermediate1.getValue();
                    } else if (fa4.m11650l(str9, LearningLevel.Advanced1.getServerName())) {
                        value = LqAnalyticsValues$LanguageLevels.Advanced1.getValue();
                    } else {
                        value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                    }
                    bundleM12429f3.putString("Registration level", value);
                    C1240a c1240a3 = (C1240a) hm5Var;
                    c1240a3.m7025f("Registration confirmed", bundleM12429f3);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("Registration method", string);
                    c1240a3.m7025f("registration account created", bundle3);
                    c3509qs.m20138l("");
                }
                completeOnboardingUseCase$invoke$1.f27402a = null;
                completeOnboardingUseCase$invoke$1.f27403b = null;
                completeOnboardingUseCase$invoke$1.f27404c = null;
                completeOnboardingUseCase$invoke$1.f27405d = null;
                completeOnboardingUseCase$invoke$1.f27406e = null;
                completeOnboardingUseCase$invoke$1.f27409h = 4;
            }
        } else {
            Bundle bundle4 = new Bundle();
            bundle4.putString("topics", u91.m22596N0(set2, null, null, null, null, 63));
            ((C1240a) hm5Var).m7025f("Topics Chosen", bundle4);
            completeOnboardingUseCase$invoke$1.f27402a = str5;
            completeOnboardingUseCase$invoke$1.f27403b = str6;
            completeOnboardingUseCase$invoke$1.f27404c = str7;
            completeOnboardingUseCase$invoke$1.f27405d = null;
            completeOnboardingUseCase$invoke$1.f27406e = list2;
            completeOnboardingUseCase$invoke$1.f27409h = 2;
            if (((C1293i) lm4Var).m7224u(str5, set2, completeOnboardingUseCase$invoke$1) != obj) {
                str8 = str7;
                str9 = str6;
                str11 = str5;
                str10 = str11;
                qm7 qm7Var3 = ((C1369b) this.f27466b).f18480m;
                completeOnboardingUseCase$invoke$1.f27402a = str10;
                completeOnboardingUseCase$invoke$1.f27403b = str9;
                completeOnboardingUseCase$invoke$1.f27404c = str8;
                completeOnboardingUseCase$invoke$1.f27405d = null;
                completeOnboardingUseCase$invoke$1.f27406e = list2;
                completeOnboardingUseCase$invoke$1.f27409h = 3;
                objM15542u = AbstractC3224d.m15542u(qm7Var3, completeOnboardingUseCase$invoke$1);
                if (objM15542u != obj) {
                    profile = (Profile) objM15542u;
                    if (profile != null) {
                        int i6 = profile.f19652a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i6);
                        ((C1240a) hm5Var).m7026g(sb4.toString());
                    }
                    string = c3509qs.f58118b.getString("registerData2", "");
                    if (string == null) {
                        string = "";
                    }
                    if (string.length() > 0) {
                        Bundle bundleM12429f4 = g9a.m12429f("Registration client", "android");
                        bundleM12429f4.putString("Registration date", hy3.f43148E.m14766a(new DateTime()));
                        bundleM12429f4.putString("Registration language", str10);
                        bundleM12429f4.putString("Registration method", string);
                        bundleM12429f4.putString("Referral code", str8);
                        if (fa4.m11650l(str9, LearningLevel.Beginner1.getServerName())) {
                            value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                        } else if (fa4.m11650l(str9, LearningLevel.Intermediate1.getServerName())) {
                            value = LqAnalyticsValues$LanguageLevels.Intermediate1.getValue();
                        } else if (fa4.m11650l(str9, LearningLevel.Advanced1.getServerName())) {
                            value = LqAnalyticsValues$LanguageLevels.Advanced1.getValue();
                        } else {
                            value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                        }
                        bundleM12429f4.putString("Registration level", value);
                        C1240a c1240a4 = (C1240a) hm5Var;
                        c1240a4.m7025f("Registration confirmed", bundleM12429f4);
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("Registration method", string);
                        c1240a4.m7025f("registration account created", bundle5);
                        c3509qs.m20138l("");
                    }
                    completeOnboardingUseCase$invoke$1.f27402a = null;
                    completeOnboardingUseCase$invoke$1.f27403b = null;
                    completeOnboardingUseCase$invoke$1.f27404c = null;
                    completeOnboardingUseCase$invoke$1.f27405d = null;
                    completeOnboardingUseCase$invoke$1.f27406e = null;
                    completeOnboardingUseCase$invoke$1.f27409h = 4;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m9171b(List list, ContinuationImpl continuationImpl) throws Throwable {
        CompleteOnboardingUseCase$replayMiniLessonLingqs$1 completeOnboardingUseCase$replayMiniLessonLingqs$1;
        Iterator it;
        int i;
        if (continuationImpl instanceof CompleteOnboardingUseCase$replayMiniLessonLingqs$1) {
            completeOnboardingUseCase$replayMiniLessonLingqs$1 = (CompleteOnboardingUseCase$replayMiniLessonLingqs$1) continuationImpl;
            int i2 = completeOnboardingUseCase$replayMiniLessonLingqs$1.f27414e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                completeOnboardingUseCase$replayMiniLessonLingqs$1.f27414e = i2 - Integer.MIN_VALUE;
            } else {
                completeOnboardingUseCase$replayMiniLessonLingqs$1 = new CompleteOnboardingUseCase$replayMiniLessonLingqs$1(this, continuationImpl);
            }
        } else {
            completeOnboardingUseCase$replayMiniLessonLingqs$1 = new CompleteOnboardingUseCase$replayMiniLessonLingqs$1(this, continuationImpl);
        }
        Object obj = completeOnboardingUseCase$replayMiniLessonLingqs$1.f27412c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = completeOnboardingUseCase$replayMiniLessonLingqs$1.f27414e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            it = list.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = completeOnboardingUseCase$replayMiniLessonLingqs$1.f27411b;
            Iterator it2 = completeOnboardingUseCase$replayMiniLessonLingqs$1.f27410a;
            AbstractC3193b.m15359b(obj);
            it = it2;
        }
        while (it.hasNext()) {
            PendingMiniLessonLingq pendingMiniLessonLingq = (PendingMiniLessonLingq) it.next();
            String strM9153a = pendingMiniLessonLingq.m9153a();
            String strM9155c = pendingMiniLessonLingq.m9155c();
            TokenMeaning tokenMeaning = new TokenMeaning(0, null, pendingMiniLessonLingq.m9156d(), 0, false, null, false, 0, 1019);
            int value = CardStatus.New.getValue();
            String strM9154b = pendingMiniLessonLingq.m9154b();
            String value2 = LqAnalyticsValues$LingQCreatedLocation.Onboarding.getValue();
            completeOnboardingUseCase$replayMiniLessonLingqs$1.f27410a = it;
            completeOnboardingUseCase$replayMiniLessonLingqs$1.f27411b = i;
            completeOnboardingUseCase$replayMiniLessonLingqs$1.f27414e = 1;
            if (((C1287c) this.f27469e).m7118h(0, strM9153a, strM9155c, tokenMeaning, value, strM9154b, value2, false, completeOnboardingUseCase$replayMiniLessonLingqs$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfa.f68157a;
    }
}
