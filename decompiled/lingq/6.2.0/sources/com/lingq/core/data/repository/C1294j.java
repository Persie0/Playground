package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.AppUsageUpdateWorker;
import com.lingq.core.data.workers.LanguageProgressUpdateWorker;
import com.lingq.core.database.dao.C1319g;
import com.lingq.core.database.entity.LanguageProgressChartEntryEntity;
import com.lingq.core.database.entity.LanguageProgressEntity;
import com.lingq.core.database.entity.LanguageStatsEntity;
import com.lingq.core.database.entity.StatsCalendarEntity;
import com.lingq.core.database.entity.StreakEntity;
import com.lingq.core.database.entity.StudyStatsEntity;
import com.lingq.core.domain.model.language.ActivityLevel;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageProgressUpdate;
import com.lingq.core.domain.model.language.StudyStatsScores;
import com.lingq.core.network.api.requests.RequestAppUsageStat;
import com.lingq.core.network.api.requests.RequestLanguageProgress;
import com.lingq.core.network.api.result.ResultActivityLevel;
import com.lingq.core.network.api.result.ResultLanguageProgress;
import com.lingq.core.network.api.result.ResultLanguageProgressChartEntry;
import com.lingq.core.network.api.result.ResultLanguageStats;
import com.lingq.core.network.api.result.ResultStatsCalendar;
import com.lingq.core.network.api.result.ResultStreak;
import com.lingq.core.network.api.result.ResultStudyStats;
import com.lingq.core.network.api.result.ResultStudyStatsScores;
import com.lingq.feature.widget.C2864b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3537ri;
import p000.C3540rl;
import p000.C3704w;
import p000.bb0;
import p000.bn4;
import p000.bx0;
import p000.c83;
import p000.euc;
import p000.fa4;
import p000.h0a;
import p000.hi8;
import p000.hrc;
import p000.jd0;
import p000.ke2;
import p000.md0;
import p000.mrc;
import p000.oo4;
import p000.rp0;
import p000.shd;
import p000.sm5;
import p000.sn4;
import p000.sp0;
import p000.tx6;
import p000.ux6;
import p000.v91;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.xj1;

/* JADX INFO: renamed from: com.lingq.core.data.repository.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1294j implements oo4 {

    /* JADX INFO: renamed from: a */
    public final C1319g f16493a;

    /* JADX INFO: renamed from: b */
    public final bn4 f16494b;

    /* JADX INFO: renamed from: c */
    public final C0773b f16495c;

    /* JADX INFO: renamed from: d */
    public final C2864b f16496d;

    public C1294j(C1319g c1319g, bn4 bn4Var, C0773b c0773b, C2864b c2864b) {
        c1319g.getClass();
        bn4Var.getClass();
        c0773b.getClass();
        c2864b.getClass();
        this.f16493a = c1319g;
        this.f16494b = bn4Var;
        this.f16495c = c0773b;
        this.f16496d = c2864b;
    }

    /* JADX INFO: renamed from: a */
    public final void m7227a(String str, String str2, double d, Integer num) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(AppUsageUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("stat", str2), new Pair("value", Double.valueOf(d)), new Pair("lessonId", Integer.valueOf(num != null ? num.intValue() : -1))};
        hi8 hi8Var = new hi8(10);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16495c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        if (r39.f16493a.mo4095v0(r9, r3) == r4) goto L22;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7228b(String str, LanguageProgressInterval languageProgressInterval, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsRepositoryImpl$fetchLanguageProgress$1 languageStatsRepositoryImpl$fetchLanguageProgress$1;
        String str2;
        LanguageProgressInterval languageProgressInterval2;
        if (continuationImpl instanceof LanguageStatsRepositoryImpl$fetchLanguageProgress$1) {
            languageStatsRepositoryImpl$fetchLanguageProgress$1 = (LanguageStatsRepositoryImpl$fetchLanguageProgress$1) continuationImpl;
            int i = languageStatsRepositoryImpl$fetchLanguageProgress$1.f15275e;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$fetchLanguageProgress$1.f15275e = i - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$fetchLanguageProgress$1 = new LanguageStatsRepositoryImpl$fetchLanguageProgress$1(this, continuationImpl);
            }
        } else {
            languageStatsRepositoryImpl$fetchLanguageProgress$1 = new LanguageStatsRepositoryImpl$fetchLanguageProgress$1(this, continuationImpl);
        }
        Object objM3906u = languageStatsRepositoryImpl$fetchLanguageProgress$1.f15273c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageStatsRepositoryImpl$fetchLanguageProgress$1.f15275e;
        if (i2 != 0) {
            if (i2 == 1) {
                languageProgressInterval2 = languageStatsRepositoryImpl$fetchLanguageProgress$1.f15272b;
                String str3 = languageStatsRepositoryImpl$fetchLanguageProgress$1.f15271a;
                AbstractC3193b.m15359b(objM3906u);
                str2 = str3;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM3906u);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM3906u);
        String key = languageProgressInterval.getKey();
        languageStatsRepositoryImpl$fetchLanguageProgress$1.f15271a = str;
        languageStatsRepositoryImpl$fetchLanguageProgress$1.f15272b = languageProgressInterval;
        languageStatsRepositoryImpl$fetchLanguageProgress$1.f15275e = 1;
        objM3906u = this.f16494b.m3906u(str, key, languageStatsRepositoryImpl$fetchLanguageProgress$1);
        if (objM3906u != coroutineSingletons) {
            str2 = str;
            languageProgressInterval2 = languageProgressInterval;
        }
        return coroutineSingletons;
        ResultLanguageProgress resultLanguageProgress = (ResultLanguageProgress) objM3906u;
        String key2 = languageProgressInterval2.getKey();
        resultLanguageProgress.getClass();
        key2.getClass();
        str2.getClass();
        LanguageProgressEntity languageProgressEntity = new LanguageProgressEntity(key2, str2, resultLanguageProgress.f20889a, resultLanguageProgress.f20890b, resultLanguageProgress.f20891c, resultLanguageProgress.f20892d, resultLanguageProgress.f20893e, resultLanguageProgress.f20894f, resultLanguageProgress.f20895g, resultLanguageProgress.f20896h, resultLanguageProgress.f20897i, resultLanguageProgress.f20898j, resultLanguageProgress.f20899k, resultLanguageProgress.f20900l, resultLanguageProgress.f20901m, resultLanguageProgress.f20902n, resultLanguageProgress.f20903o, resultLanguageProgress.f20904p, resultLanguageProgress.f20905q, resultLanguageProgress.f20906r, resultLanguageProgress.f20907s, resultLanguageProgress.f20908t, resultLanguageProgress.f20909u, (int) resultLanguageProgress.f20910v);
        languageStatsRepositoryImpl$fetchLanguageProgress$1.f15271a = null;
        languageStatsRepositoryImpl$fetchLanguageProgress$1.f15272b = null;
        languageStatsRepositoryImpl$fetchLanguageProgress$1.f15275e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0120 A[LOOP:0: B:37:0x011a->B:39:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x016b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016c, code lost:
    
        if (r6 == r4) goto L44;
     */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.lingq.core.domain.model.language.LanguageProgressMetric, com.lingq.core.domain.model.language.LanguageProgressPeriod, java.lang.String, java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7229c(String str, LanguageProgressMetric languageProgressMetric, LanguageProgressPeriod languageProgressPeriod, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1 languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1;
        LanguageProgressMetric languageProgressMetric2;
        LanguageProgressPeriod languageProgressPeriod2;
        ArrayList arrayList;
        Throwable th;
        String str2;
        List list;
        int i;
        LanguageProgressPeriod languageProgressPeriod3;
        ArrayList arrayList2;
        Iterator it;
        Object objM2861d;
        String str3 = str;
        if (continuationImpl instanceof LanguageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1) {
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1 = (LanguageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1) continuationImpl;
            int i2 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15284i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15284i = i2 - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1 = new LanguageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1(this, continuationImpl);
            }
        } else {
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1 = new LanguageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1(this, continuationImpl);
        }
        Object objM3897l = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15282g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15284i;
        Object obj = xfa.f68157a;
        C1319g c1319g = this.f16493a;
        Throwable th2 = null;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM3897l);
            String key = languageProgressPeriod.getKey();
            String key2 = languageProgressMetric.getKey();
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15276a = str3;
            languageProgressMetric2 = languageProgressMetric;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15277b = languageProgressMetric2;
            languageProgressPeriod2 = languageProgressPeriod;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15278c = languageProgressPeriod2;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15284i = 1;
            objM3897l = this.f16494b.m3897l(str3, key, key2, languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1);
            if (objM3897l != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            LanguageProgressPeriod languageProgressPeriod4 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15278c;
            LanguageProgressMetric languageProgressMetric3 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15277b;
            String str4 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15276a;
            AbstractC3193b.m15359b(objM3897l);
            languageProgressPeriod2 = languageProgressPeriod4;
            languageProgressMetric2 = languageProgressMetric3;
            str3 = str4;
        } else if (i3 == 2) {
            int i4 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15281f;
            ArrayList arrayList3 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15280e;
            List list2 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15279d;
            languageProgressPeriod3 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15278c;
            languageProgressMetric2 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15277b;
            String str5 = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15276a;
            AbstractC3193b.m15359b(objM3897l);
            i = i4;
            list = list2;
            arrayList = arrayList3;
            th = null;
            str2 = str5;
            String key3 = languageProgressMetric2.getKey();
            String key4 = languageProgressPeriod3.getKey();
            arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((LanguageProgressChartEntryEntity) it.next()).m7600e());
            }
            ?? r8 = th;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15276a = r8;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15277b = r8;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15278c = r8;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15279d = list;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15280e = r8;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15281f = i;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15284i = 3;
            c1319g.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM LanguageProgressChartEntryEntity WHERE languageCode = ? AND metric = ? AND period = ? AND name NOT IN (");
            objM2861d = AbstractC0758a.m2861d(new C3537ri(AbstractC3393o1.m17736k(")", sb, arrayList2), str2, key3, key4, arrayList2, 5), c1319g.f17026K, languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1, false, true);
            if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                obj = objM2861d;
            }
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15279d;
            AbstractC3193b.m15359b(objM3897l);
        }
        return Boolean.valueOf(list.isEmpty());
        List list3 = (List) objM3897l;
        List list4 = list3;
        arrayList = new ArrayList(v91.m23189q0(list4, 10));
        int i5 = 0;
        for (Object obj2 : list4) {
            int i6 = i5 + 1;
            Throwable th3 = th2;
            if (i5 < 0) {
                vz1.m23628e0();
                throw th3;
            }
            arrayList.add(hrc.m13442a((ResultLanguageProgressChartEntry) obj2, languageProgressMetric2.getKey(), languageProgressPeriod2.getKey(), str3, i5));
            i5 = i6;
            th2 = th3;
        }
        th = th2;
        languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15276a = str3;
        languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15277b = languageProgressMetric2;
        languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15278c = languageProgressPeriod2;
        languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15279d = list3;
        languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15280e = arrayList;
        languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15281f = 0;
        languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15284i = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new ke2(16, c1319g, arrayList), c1319g.f17026K, languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1, false, true);
        if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM2861d2 = obj;
        }
        if (objM2861d2 != coroutineSingletons) {
            str2 = str3;
            list = list3;
            i = 0;
            languageProgressPeriod3 = languageProgressPeriod2;
            String key5 = languageProgressMetric2.getKey();
            String key6 = languageProgressPeriod3.getKey();
            arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((LanguageProgressChartEntryEntity) it.next()).m7600e());
            }
            ?? r9 = th;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15276a = r9;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15277b = r9;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15278c = r9;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15279d = list;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15280e = r9;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15281f = i;
            languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1.f15284i = 3;
            c1319g.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DELETE FROM LanguageProgressChartEntryEntity WHERE languageCode = ? AND metric = ? AND period = ? AND name NOT IN (");
            objM2861d = AbstractC0758a.m2861d(new C3537ri(AbstractC3393o1.m17736k(")", sb2, arrayList2), str2, key5, key6, arrayList2, 5), c1319g.f17026K, languageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1, false, true);
            if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                obj = objM2861d;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m7230d(String str, LanguageProgressPeriod languageProgressPeriod, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsRepositoryImpl$fetchLanguageStats$1 languageStatsRepositoryImpl$fetchLanguageStats$1;
        if (continuationImpl instanceof LanguageStatsRepositoryImpl$fetchLanguageStats$1) {
            languageStatsRepositoryImpl$fetchLanguageStats$1 = (LanguageStatsRepositoryImpl$fetchLanguageStats$1) continuationImpl;
            int i = languageStatsRepositoryImpl$fetchLanguageStats$1.f15289e;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$fetchLanguageStats$1.f15289e = i - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$fetchLanguageStats$1 = new LanguageStatsRepositoryImpl$fetchLanguageStats$1(this, continuationImpl);
            }
        } else {
            languageStatsRepositoryImpl$fetchLanguageStats$1 = new LanguageStatsRepositoryImpl$fetchLanguageStats$1(this, continuationImpl);
        }
        Object objM3896k = languageStatsRepositoryImpl$fetchLanguageStats$1.f15287c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageStatsRepositoryImpl$fetchLanguageStats$1.f15289e;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM3896k);
                bn4 bn4Var = this.f16494b;
                String key = languageProgressPeriod.getKey();
                languageStatsRepositoryImpl$fetchLanguageStats$1.f15285a = str;
                languageStatsRepositoryImpl$fetchLanguageStats$1.f15286b = languageProgressPeriod;
                languageStatsRepositoryImpl$fetchLanguageStats$1.f15289e = 1;
                objM3896k = bn4Var.m3896k(str, key, languageStatsRepositoryImpl$fetchLanguageStats$1);
                if (objM3896k == coroutineSingletons) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC3193b.m15359b(objM3896k);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            languageProgressPeriod = languageStatsRepositoryImpl$fetchLanguageStats$1.f15286b;
            str = languageStatsRepositoryImpl$fetchLanguageStats$1.f15285a;
            AbstractC3193b.m15359b(objM3896k);
            LanguageStatsEntity languageStatsEntityM17029a = mrc.m17029a((ResultLanguageStats) objM3896k, str, languageProgressPeriod.getKey());
            C1319g c1319g = this.f16493a;
            languageStatsRepositoryImpl$fetchLanguageStats$1.f15285a = null;
            languageStatsRepositoryImpl$fetchLanguageStats$1.f15286b = null;
            languageStatsRepositoryImpl$fetchLanguageStats$1.f15289e = 2;
            Object objM2861d = AbstractC0758a.m2861d(new ke2(14, c1319g, languageStatsEntityM17029a), c1319g.f17026K, languageStatsRepositoryImpl$fetchLanguageStats$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception e) {
            e.printStackTrace();
            return xfaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: e */
    public final Object m7231e(String str, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsRepositoryImpl$fetchLanguageStreak$1 languageStatsRepositoryImpl$fetchLanguageStreak$1;
        String str2 = str;
        if (continuationImpl instanceof LanguageStatsRepositoryImpl$fetchLanguageStreak$1) {
            languageStatsRepositoryImpl$fetchLanguageStreak$1 = (LanguageStatsRepositoryImpl$fetchLanguageStreak$1) continuationImpl;
            int i = languageStatsRepositoryImpl$fetchLanguageStreak$1.f15293d;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$fetchLanguageStreak$1.f15293d = i - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$fetchLanguageStreak$1 = new LanguageStatsRepositoryImpl$fetchLanguageStreak$1(this, continuationImpl);
            }
        } else {
            languageStatsRepositoryImpl$fetchLanguageStreak$1 = new LanguageStatsRepositoryImpl$fetchLanguageStreak$1(this, continuationImpl);
        }
        Object objM3898m = languageStatsRepositoryImpl$fetchLanguageStreak$1.f15291b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageStatsRepositoryImpl$fetchLanguageStreak$1.f15293d;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM3898m);
                bn4 bn4Var = this.f16494b;
                languageStatsRepositoryImpl$fetchLanguageStreak$1.f15290a = str2;
                languageStatsRepositoryImpl$fetchLanguageStreak$1.f15293d = 1;
                objM3898m = bn4Var.m3898m(str2, languageStatsRepositoryImpl$fetchLanguageStreak$1);
                if (objM3898m == coroutineSingletons) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC3193b.m15359b(objM3898m);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = languageStatsRepositoryImpl$fetchLanguageStreak$1.f15290a;
            AbstractC3193b.m15359b(objM3898m);
            String str3 = str2;
            ResultStreak resultStreak = (ResultStreak) objM3898m;
            C1319g c1319g = this.f16493a;
            resultStreak.getClass();
            str3.getClass();
            StreakEntity streakEntity = new StreakEntity(str3, Integer.valueOf(resultStreak.f21523a), Double.valueOf(resultStreak.f21524b), Integer.valueOf(resultStreak.f21525c), Boolean.valueOf(resultStreak.f21526d), resultStreak.f21527e);
            languageStatsRepositoryImpl$fetchLanguageStreak$1.f15290a = null;
            languageStatsRepositoryImpl$fetchLanguageStreak$1.f15293d = 2;
            Object objM2861d = AbstractC0758a.m2861d(new C3704w(21, c1319g, streakEntity), c1319g.f17026K, languageStatsRepositoryImpl$fetchLanguageStreak$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m7232f(int i, int i2, String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsRepositoryImpl$fetchStatsCalendar$1 languageStatsRepositoryImpl$fetchStatsCalendar$1;
        if (continuationImpl instanceof LanguageStatsRepositoryImpl$fetchStatsCalendar$1) {
            languageStatsRepositoryImpl$fetchStatsCalendar$1 = (LanguageStatsRepositoryImpl$fetchStatsCalendar$1) continuationImpl;
            int i3 = languageStatsRepositoryImpl$fetchStatsCalendar$1.f15299f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$fetchStatsCalendar$1.f15299f = i3 - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$fetchStatsCalendar$1 = new LanguageStatsRepositoryImpl$fetchStatsCalendar$1(this, continuationImpl);
            }
        } else {
            languageStatsRepositoryImpl$fetchStatsCalendar$1 = new LanguageStatsRepositoryImpl$fetchStatsCalendar$1(this, continuationImpl);
        }
        Object objM3905t = languageStatsRepositoryImpl$fetchStatsCalendar$1.f15297d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = languageStatsRepositoryImpl$fetchStatsCalendar$1.f15299f;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(objM3905t);
                bn4 bn4Var = this.f16494b;
                languageStatsRepositoryImpl$fetchStatsCalendar$1.f15294a = str;
                languageStatsRepositoryImpl$fetchStatsCalendar$1.f15295b = i;
                languageStatsRepositoryImpl$fetchStatsCalendar$1.f15296c = i2;
                languageStatsRepositoryImpl$fetchStatsCalendar$1.f15299f = 1;
                objM3905t = bn4Var.m3905t(str, str2, str3, languageStatsRepositoryImpl$fetchStatsCalendar$1);
                if (objM3905t == coroutineSingletons) {
                }
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    AbstractC3193b.m15359b(objM3905t);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = languageStatsRepositoryImpl$fetchStatsCalendar$1.f15296c;
            i = languageStatsRepositoryImpl$fetchStatsCalendar$1.f15295b;
            str = languageStatsRepositoryImpl$fetchStatsCalendar$1.f15294a;
            AbstractC3193b.m15359b(objM3905t);
            C1319g c1319g = this.f16493a;
            StatsCalendarEntity statsCalendarEntityM11355d = euc.m11355d((ResultStatsCalendar) objM3905t, str, i, i2);
            languageStatsRepositoryImpl$fetchStatsCalendar$1.f15294a = null;
            languageStatsRepositoryImpl$fetchStatsCalendar$1.f15295b = i;
            languageStatsRepositoryImpl$fetchStatsCalendar$1.f15296c = i2;
            languageStatsRepositoryImpl$fetchStatsCalendar$1.f15299f = 2;
            Object objM2861d = AbstractC0758a.m2861d(new ke2(15, c1319g, statsCalendarEntityM11355d), c1319g.f17026K, languageStatsRepositoryImpl$fetchStatsCalendar$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception e) {
            e.printStackTrace();
            return xfaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        if (r1 == r4) goto L42;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7233g(String str, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsRepositoryImpl$fetchStudyStats$1 languageStatsRepositoryImpl$fetchStudyStats$1;
        ArrayList arrayList;
        xfa xfaVar;
        String str2 = str;
        if (continuationImpl instanceof LanguageStatsRepositoryImpl$fetchStudyStats$1) {
            languageStatsRepositoryImpl$fetchStudyStats$1 = (LanguageStatsRepositoryImpl$fetchStudyStats$1) continuationImpl;
            int i = languageStatsRepositoryImpl$fetchStudyStats$1.f15303d;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$fetchStudyStats$1.f15303d = i - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$fetchStudyStats$1 = new LanguageStatsRepositoryImpl$fetchStudyStats$1(this, continuationImpl);
            }
        } else {
            languageStatsRepositoryImpl$fetchStudyStats$1 = new LanguageStatsRepositoryImpl$fetchStudyStats$1(this, continuationImpl);
        }
        Object objM3903r = languageStatsRepositoryImpl$fetchStudyStats$1.f15301b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageStatsRepositoryImpl$fetchStudyStats$1.f15303d;
        xfa xfaVar2 = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM3903r);
            languageStatsRepositoryImpl$fetchStudyStats$1.f15300a = str2;
            languageStatsRepositoryImpl$fetchStudyStats$1.f15303d = 1;
            objM3903r = this.f16494b.m3903r(str2, languageStatsRepositoryImpl$fetchStudyStats$1);
            if (objM3903r != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str2 = languageStatsRepositoryImpl$fetchStudyStats$1.f15300a;
            AbstractC3193b.m15359b(objM3903r);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM3903r);
            xfaVar = xfaVar2;
        }
        this.f16496d.m9779c();
        return xfaVar;
        String str3 = str2;
        ResultStudyStats resultStudyStats = (ResultStudyStats) objM3903r;
        resultStudyStats.getClass();
        str3.getClass();
        String str4 = resultStudyStats.f21530a;
        int i3 = resultStudyStats.f21531b;
        int i4 = resultStudyStats.f21532c;
        int i5 = resultStudyStats.f21533d;
        int i6 = resultStudyStats.f21534e;
        int i7 = resultStudyStats.f21535f;
        boolean z = resultStudyStats.f21536g;
        List list = resultStudyStats.f21537h;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ResultStudyStatsScores resultStudyStatsScores = (ResultStudyStatsScores) it.next();
                resultStudyStatsScores.getClass();
                int i8 = i5;
                int i9 = i6;
                String str5 = resultStudyStatsScores.f21539a;
                xfa xfaVar3 = xfaVar2;
                String str6 = resultStudyStatsScores.f21540b;
                Iterator it2 = it;
                int i10 = resultStudyStatsScores.f21541c;
                ResultActivityLevel resultActivityLevel = resultStudyStatsScores.f21542d;
                int i11 = i7;
                arrayList2.add(new StudyStatsScores(str5, str6, i10, resultActivityLevel != null ? new ActivityLevel(resultActivityLevel.f20602a, resultActivityLevel.f20603b) : null));
                it = it2;
                i5 = i8;
                i6 = i9;
                i7 = i11;
                str3 = str3;
                xfaVar2 = xfaVar3;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        int i12 = i5;
        int i13 = i6;
        xfaVar = xfaVar2;
        int i14 = i7;
        String str7 = str3;
        ResultActivityLevel resultActivityLevel2 = resultStudyStats.f21538i;
        StudyStatsEntity studyStatsEntity = new StudyStatsEntity(str7, str7, str4, i3, i4, i12, i13, i14, z, arrayList, resultActivityLevel2 != null ? resultActivityLevel2.f20602a : 0);
        languageStatsRepositoryImpl$fetchStudyStats$1.f15300a = null;
        languageStatsRepositoryImpl$fetchStudyStats$1.f15303d = 2;
        C1319g c1319g = this.f16493a;
        Object objM2861d = AbstractC0758a.m2861d(new C3704w(18, c1319g, studyStatsEntity), c1319g.f17026K, languageStatsRepositoryImpl$fetchStudyStats$1, false, true);
        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM2861d = xfaVar;
        }
    }

    /* JADX INFO: renamed from: h */
    public final c83 m7234h(String str, LanguageProgressInterval languageProgressInterval) {
        str.getClass();
        languageProgressInterval.getClass();
        String key = languageProgressInterval.getKey();
        C1319g c1319g = this.f16493a;
        c1319g.getClass();
        key.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1319g.f17026K, false, new String[]{"LanguageProgressEntity"}, new bb0(str, key, c1319g, 9)));
    }

    /* JADX INFO: renamed from: i */
    public final c83 m7235i(String str, LanguageProgressPeriod languageProgressPeriod, LanguageProgressMetric languageProgressMetric) {
        str.getClass();
        languageProgressPeriod.getClass();
        languageProgressMetric.getClass();
        String key = languageProgressMetric.getKey();
        String key2 = languageProgressPeriod.getKey();
        C1319g c1319g = this.f16493a;
        c1319g.getClass();
        key.getClass();
        key2.getClass();
        return AbstractC3224d.m15536o(new C3540rl(AbstractC3584sr.m21590A(c1319g.f17026K, true, new String[]{"LanguageProgressChartEntryEntity"}, new rp0(str, 2, key, key2)), 5));
    }

    /* JADX INFO: renamed from: j */
    public final c83 m7236j(String str, LanguageProgressPeriod languageProgressPeriod) {
        str.getClass();
        languageProgressPeriod.getClass();
        String key = languageProgressPeriod.getKey();
        C1319g c1319g = this.f16493a;
        c1319g.getClass();
        key.getClass();
        return AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(c1319g.f17026K, false, new String[]{"LanguageStatsEntity"}, new md0(str, 12, key)), 6));
    }

    /* JADX INFO: renamed from: k */
    public final c83 m7237k(String str) {
        str.getClass();
        C1319g c1319g = this.f16493a;
        c1319g.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1319g.f17026K, false, new String[]{"StreakEntity"}, new jd0(str, 12)));
    }

    /* JADX INFO: renamed from: l */
    public final c83 m7238l(String str) {
        str.getClass();
        C1319g c1319g = this.f16493a;
        c1319g.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1319g.f17026K, false, new String[]{"StudyStatsEntity"}, new C3704w(20, str, c1319g)));
    }

    /* JADX INFO: renamed from: m */
    public final Object m7239m(String str, LanguageProgressInterval languageProgressInterval, String str2, double d, SuspendLambda suspendLambda) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LanguageProgressUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("stat", str2), new Pair("value", Double.valueOf(d))};
        hi8 hi8Var = new hi8(10);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16495c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        LanguageProgressPeriod languageProgressPeriodM21392b = shd.m21392b(languageProgressInterval);
        boolean zM11650l = fa4.m11650l(str2, LanguageProgressUpdate.HoursListening.getKey());
        xfa xfaVar = xfa.f68157a;
        if (zM11650l) {
            Object objM7483y0 = this.f16493a.m7483y0(str, languageProgressInterval.getKey(), languageProgressPeriodM21392b.getKey(), d, suspendLambda);
            if (objM7483y0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM7483y0;
            }
        } else if (fa4.m11650l(str2, LanguageProgressUpdate.WordsReading.getKey())) {
            Object objM7481A0 = this.f16493a.m7481A0(str, languageProgressInterval.getKey(), languageProgressPeriodM21392b.getKey(), (int) d, suspendLambda);
            if (objM7481A0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM7481A0;
            }
        } else {
            boolean zM11650l2 = fa4.m11650l(str2, LanguageProgressUpdate.WordsWriting.getKey());
            C1319g c1319g = this.f16493a;
            if (zM11650l2) {
                Object objM2861d = AbstractC0758a.m2861d(new sp0(str, (int) d, 3, languageProgressInterval.getKey()), c1319g.f17026K, suspendLambda, false, true);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d == coroutineSingletons) {
                    return objM2861d;
                }
            } else if (fa4.m11650l(str2, LanguageProgressUpdate.HoursSpeaking.getKey())) {
                Object objM2861d2 = AbstractC0758a.m2861d(new sn4(d, 0, str, languageProgressInterval.getKey()), c1319g.f17026K, suspendLambda, false, true);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM2861d2 != coroutineSingletons2) {
                    objM2861d2 = xfaVar;
                }
                if (objM2861d2 == coroutineSingletons2) {
                    return objM2861d2;
                }
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m7240n(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LanguageStatsRepositoryImpl$repairStreak$1 languageStatsRepositoryImpl$repairStreak$1;
        C1319g c1319g;
        if (continuationImpl instanceof LanguageStatsRepositoryImpl$repairStreak$1) {
            languageStatsRepositoryImpl$repairStreak$1 = (LanguageStatsRepositoryImpl$repairStreak$1) continuationImpl;
            int i2 = languageStatsRepositoryImpl$repairStreak$1.f15311e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$repairStreak$1.f15311e = i2 - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$repairStreak$1 = new LanguageStatsRepositoryImpl$repairStreak$1(this, continuationImpl);
            }
        } else {
            languageStatsRepositoryImpl$repairStreak$1 = new LanguageStatsRepositoryImpl$repairStreak$1(this, continuationImpl);
        }
        Object objM3893h = languageStatsRepositoryImpl$repairStreak$1.f15309c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageStatsRepositoryImpl$repairStreak$1.f15311e;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM3893h);
                bn4 bn4Var = this.f16494b;
                languageStatsRepositoryImpl$repairStreak$1.f15307a = str;
                languageStatsRepositoryImpl$repairStreak$1.f15308b = i;
                languageStatsRepositoryImpl$repairStreak$1.f15311e = 1;
                objM3893h = bn4Var.m3893h(str, languageStatsRepositoryImpl$repairStreak$1);
                if (objM3893h == obj) {
                }
                return obj;
            }
            if (i3 == 1) {
                i = languageStatsRepositoryImpl$repairStreak$1.f15308b;
                str = languageStatsRepositoryImpl$repairStreak$1.f15307a;
                AbstractC3193b.m15359b(objM3893h);
            } else {
                if (i3 == 2) {
                    i = languageStatsRepositoryImpl$repairStreak$1.f15308b;
                    str = languageStatsRepositoryImpl$repairStreak$1.f15307a;
                    AbstractC3193b.m15359b(objM3893h);
                    languageStatsRepositoryImpl$repairStreak$1.f15307a = str;
                    languageStatsRepositoryImpl$repairStreak$1.f15308b = i;
                    languageStatsRepositoryImpl$repairStreak$1.f15311e = 3;
                    if (m7231e(str, languageStatsRepositoryImpl$repairStreak$1) != obj) {
                    }
                    return obj;
                }
                if (i3 != 3) {
                    if (i3 == 4) {
                        AbstractC3193b.m15359b(objM3893h);
                        return null;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = languageStatsRepositoryImpl$repairStreak$1.f15308b;
                str = languageStatsRepositoryImpl$repairStreak$1.f15307a;
                AbstractC3193b.m15359b(objM3893h);
            }
            c1319g = this.f16493a;
            languageStatsRepositoryImpl$repairStreak$1.f15307a = null;
            languageStatsRepositoryImpl$repairStreak$1.f15308b = i;
            languageStatsRepositoryImpl$repairStreak$1.f15311e = 4;
            if (c1319g.m7482C0(str, i, languageStatsRepositoryImpl$repairStreak$1) != obj) {
                return obj;
            }
            return null;
            ResultStreak resultStreak = (ResultStreak) objM3893h;
            String str2 = resultStreak.f21528f;
            if (str2 != null && !vk9.m23391n0(str2)) {
                return resultStreak.f21528f;
            }
            languageStatsRepositoryImpl$repairStreak$1.f15307a = str;
            languageStatsRepositoryImpl$repairStreak$1.f15308b = i;
            languageStatsRepositoryImpl$repairStreak$1.f15311e = 2;
            if (m7233g(str, languageStatsRepositoryImpl$repairStreak$1) != obj) {
                languageStatsRepositoryImpl$repairStreak$1.f15307a = str;
                languageStatsRepositoryImpl$repairStreak$1.f15308b = i;
                languageStatsRepositoryImpl$repairStreak$1.f15311e = 3;
                if (m7231e(str, languageStatsRepositoryImpl$repairStreak$1) != obj) {
                    c1319g = this.f16493a;
                    languageStatsRepositoryImpl$repairStreak$1.f15307a = null;
                    languageStatsRepositoryImpl$repairStreak$1.f15308b = i;
                    languageStatsRepositoryImpl$repairStreak$1.f15311e = 4;
                    if (c1319g.m7482C0(str, i, languageStatsRepositoryImpl$repairStreak$1) != obj) {
                        return null;
                    }
                }
            }
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return "Couldn't repair streak.Please try again";
        }
    }

    /* JADX INFO: renamed from: o */
    public final Object m7241o(String str, String str2, double d, Integer num, Continuation continuation) {
        RequestAppUsageStat requestAppUsageStat = new RequestAppUsageStat(str2.equals(AppUsageType.Reading.getKey()) ? new Double(d) : null, str2.equals(AppUsageType.Listening.getKey()) ? new Double(d) : null, str2.equals(AppUsageType.Review.getKey()) ? new Double(d) : null, str2.equals(AppUsageType.Speaking.getKey()) ? new Double(d) : null);
        sm5.Companion.getClass();
        h0a.f41641a.mo11431b("[LessonTracking] " + requestAppUsageStat, new Object[0]);
        bn4 bn4Var = this.f16494b;
        if (num == null || num.intValue() <= 0) {
            Object objM3904s = bn4Var.m3904s(str, requestAppUsageStat, continuation);
            if (objM3904s == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM3904s;
            }
        } else {
            Object objM3888c = bn4Var.m3888c(str, num.intValue(), requestAppUsageStat, continuation);
            if (objM3888c == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM3888c;
            }
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    public final Object m7242p(String str, String str2, double d, Continuation continuation) {
        RequestLanguageProgress requestLanguageProgress = new RequestLanguageProgress();
        if (str2.equals(LanguageProgressUpdate.HoursListening.getKey())) {
            requestLanguageProgress.f20376a = new Double(d);
        } else if (str2.equals(LanguageProgressUpdate.WordsReading.getKey())) {
            requestLanguageProgress.f20379d = new Integer((int) d);
        } else if (str2.equals(LanguageProgressUpdate.WordsWriting.getKey())) {
            requestLanguageProgress.f20378c = new Integer((int) d);
        } else if (str2.equals(LanguageProgressUpdate.HoursSpeaking.getKey())) {
            requestLanguageProgress.f20377b = new Double(d);
        }
        Object objM3902q = this.f16494b.m3902q(str, requestLanguageProgress, continuation);
        return objM3902q == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3902q : xfa.f68157a;
    }
}
