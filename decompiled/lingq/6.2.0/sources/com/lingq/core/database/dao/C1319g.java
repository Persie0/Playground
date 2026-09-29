package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.LanguageProgressEntity;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3704w;
import p000.bl2;
import p000.bq1;
import p000.ld0;
import p000.ql4;
import p000.qn3;
import p000.sn4;
import p000.sp0;
import p000.sv0;
import p000.u70;
import p000.un4;
import p000.v70;
import p000.vn4;
import p000.wn4;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1319g extends bq1 {
    public static final wn4 Companion = new wn4();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f17026K;

    /* JADX INFO: renamed from: L */
    public final bl2 f17027L;

    /* JADX INFO: renamed from: N */
    public final bl2 f17029N;

    /* JADX INFO: renamed from: O */
    public final bl2 f17030O;

    /* JADX INFO: renamed from: Q */
    public final bl2 f17032Q;

    /* JADX INFO: renamed from: R */
    public final bl2 f17033R;

    /* JADX INFO: renamed from: M */
    public final qn3 f17028M = new qn3(20);

    /* JADX INFO: renamed from: P */
    public final bl2 f17031P = new bl2(new sv0(14), new v70(11));

    public C1319g(AbstractC0746d abstractC0746d) {
        this.f17026K = abstractC0746d;
        int i = 1;
        this.f17027L = new bl2(new un4(this, i), new vn4(this, i));
        int i2 = 10;
        this.f17029N = new bl2(new u70(i2), new v70(i2));
        int i3 = 2;
        this.f17030O = new bl2(new un4(this, i3), new vn4(this, i3));
        int i4 = 9;
        this.f17032Q = new bl2(new u70(i4), new v70(i4));
        int i5 = 0;
        this.f17033R = new bl2(new un4(this, i5), new vn4(this, i5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B0 */
    public static Object m7478B0(C1319g c1319g, String str, String str2, String str3, int i, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsDao$addReadWordsAndStats$1 languageStatsDao$addReadWordsAndStats$1;
        if (continuationImpl instanceof LanguageStatsDao$addReadWordsAndStats$1) {
            languageStatsDao$addReadWordsAndStats$1 = (LanguageStatsDao$addReadWordsAndStats$1) continuationImpl;
            int i2 = languageStatsDao$addReadWordsAndStats$1.f16943g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageStatsDao$addReadWordsAndStats$1.f16943g = i2 - Integer.MIN_VALUE;
            } else {
                languageStatsDao$addReadWordsAndStats$1 = new LanguageStatsDao$addReadWordsAndStats$1(c1319g, continuationImpl);
            }
        } else {
            languageStatsDao$addReadWordsAndStats$1 = new LanguageStatsDao$addReadWordsAndStats$1(c1319g, continuationImpl);
        }
        Object obj = languageStatsDao$addReadWordsAndStats$1.f16941e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageStatsDao$addReadWordsAndStats$1.f16943g;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            languageStatsDao$addReadWordsAndStats$1.f16937a = c1319g;
            languageStatsDao$addReadWordsAndStats$1.f16938b = str;
            languageStatsDao$addReadWordsAndStats$1.f16939c = str3;
            languageStatsDao$addReadWordsAndStats$1.f16940d = i;
            languageStatsDao$addReadWordsAndStats$1.f16943g = 1;
            Object objM2861d = AbstractC0758a.m2861d(new sp0(str, i, 4, str2), c1319g.f17026K, languageStatsDao$addReadWordsAndStats$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = languageStatsDao$addReadWordsAndStats$1.f16940d;
        str3 = languageStatsDao$addReadWordsAndStats$1.f16939c;
        str = languageStatsDao$addReadWordsAndStats$1.f16938b;
        c1319g = languageStatsDao$addReadWordsAndStats$1.f16937a;
        AbstractC3193b.m15359b(obj);
        languageStatsDao$addReadWordsAndStats$1.f16937a = null;
        languageStatsDao$addReadWordsAndStats$1.f16938b = null;
        languageStatsDao$addReadWordsAndStats$1.f16939c = null;
        languageStatsDao$addReadWordsAndStats$1.f16940d = i;
        languageStatsDao$addReadWordsAndStats$1.f16943g = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new sp0(str, i, 2, str3), c1319g.f17026K, languageStatsDao$addReadWordsAndStats$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D0 */
    public static Object m7479D0(C1319g c1319g, String str, int i, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsDao$repairStreak$1 languageStatsDao$repairStreak$1;
        if (continuationImpl instanceof LanguageStatsDao$repairStreak$1) {
            languageStatsDao$repairStreak$1 = (LanguageStatsDao$repairStreak$1) continuationImpl;
            int i2 = languageStatsDao$repairStreak$1.f16949f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageStatsDao$repairStreak$1.f16949f = i2 - Integer.MIN_VALUE;
            } else {
                languageStatsDao$repairStreak$1 = new LanguageStatsDao$repairStreak$1(c1319g, continuationImpl);
            }
        } else {
            languageStatsDao$repairStreak$1 = new LanguageStatsDao$repairStreak$1(c1319g, continuationImpl);
        }
        Object obj = languageStatsDao$repairStreak$1.f16947d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageStatsDao$repairStreak$1.f16949f;
        xfa xfaVar = xfa.f68157a;
        int i4 = 1;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            languageStatsDao$repairStreak$1.f16944a = c1319g;
            languageStatsDao$repairStreak$1.f16945b = str;
            languageStatsDao$repairStreak$1.f16946c = i;
            languageStatsDao$repairStreak$1.f16949f = 1;
            Object objM2861d = AbstractC0758a.m2861d(new ql4(str, i4), c1319g.f17026K, languageStatsDao$repairStreak$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = languageStatsDao$repairStreak$1.f16946c;
        str = languageStatsDao$repairStreak$1.f16945b;
        c1319g = languageStatsDao$repairStreak$1.f16944a;
        AbstractC3193b.m15359b(obj);
        languageStatsDao$repairStreak$1.f16944a = null;
        languageStatsDao$repairStreak$1.f16945b = null;
        languageStatsDao$repairStreak$1.f16946c = i;
        languageStatsDao$repairStreak$1.f16949f = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new ld0(i, str, 7), c1319g.f17026K, languageStatsDao$repairStreak$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: z0 */
    public static Object m7480z0(C1319g c1319g, String str, String str2, String str3, double d, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsDao$addListeningTimeAndStats$1 languageStatsDao$addListeningTimeAndStats$1;
        double d2;
        C1319g c1319g2;
        String str4;
        String str5;
        if (continuationImpl instanceof LanguageStatsDao$addListeningTimeAndStats$1) {
            languageStatsDao$addListeningTimeAndStats$1 = (LanguageStatsDao$addListeningTimeAndStats$1) continuationImpl;
            int i = languageStatsDao$addListeningTimeAndStats$1.f16936g;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageStatsDao$addListeningTimeAndStats$1.f16936g = i - Integer.MIN_VALUE;
            } else {
                languageStatsDao$addListeningTimeAndStats$1 = new LanguageStatsDao$addListeningTimeAndStats$1(c1319g, continuationImpl);
            }
        } else {
            languageStatsDao$addListeningTimeAndStats$1 = new LanguageStatsDao$addListeningTimeAndStats$1(c1319g, continuationImpl);
        }
        Object obj = languageStatsDao$addListeningTimeAndStats$1.f16934e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageStatsDao$addListeningTimeAndStats$1.f16936g;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            languageStatsDao$addListeningTimeAndStats$1.f16930a = c1319g;
            languageStatsDao$addListeningTimeAndStats$1.f16931b = str;
            languageStatsDao$addListeningTimeAndStats$1.f16932c = str3;
            languageStatsDao$addListeningTimeAndStats$1.f16933d = d;
            languageStatsDao$addListeningTimeAndStats$1.f16936g = 1;
            Object objM2861d = AbstractC0758a.m2861d(new sn4(d, 2, str, str2), c1319g.f17026K, languageStatsDao$addListeningTimeAndStats$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                d2 = d;
                c1319g2 = c1319g;
                str4 = str3;
                str5 = str;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d2 = languageStatsDao$addListeningTimeAndStats$1.f16933d;
        str4 = languageStatsDao$addListeningTimeAndStats$1.f16932c;
        str5 = languageStatsDao$addListeningTimeAndStats$1.f16931b;
        c1319g2 = languageStatsDao$addListeningTimeAndStats$1.f16930a;
        AbstractC3193b.m15359b(obj);
        languageStatsDao$addListeningTimeAndStats$1.f16930a = null;
        languageStatsDao$addListeningTimeAndStats$1.f16931b = null;
        languageStatsDao$addListeningTimeAndStats$1.f16932c = null;
        languageStatsDao$addListeningTimeAndStats$1.f16933d = d2;
        languageStatsDao$addListeningTimeAndStats$1.f16936g = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new sn4(d2, 1, str5, str4), c1319g2.f17026K, languageStatsDao$addListeningTimeAndStats$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX INFO: renamed from: A0 */
    public final Object m7481A0(String str, String str2, String str3, int i, SuspendLambda suspendLambda) {
        Object objM2860c = AbstractC0758a.m2860c(new LanguageStatsDao_Impl$addReadWordsAndStats$2(this, str, str2, str3, i, null), this.f17026K, suspendLambda);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }

    /* JADX INFO: renamed from: C0 */
    public final Object m7482C0(String str, int i, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new LanguageStatsDao_Impl$repairStreak$2(this, str, i, null), this.f17026K, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new C3704w(19, this, (LanguageProgressEntity) obj), this.f17026K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m7483y0(String str, String str2, String str3, double d, SuspendLambda suspendLambda) {
        Object objM2860c = AbstractC0758a.m2860c(new LanguageStatsDao_Impl$addListeningTimeAndStats$2(this, str, str2, str3, d, null), this.f17026K, suspendLambda);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
