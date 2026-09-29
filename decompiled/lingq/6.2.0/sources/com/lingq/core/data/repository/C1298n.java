package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.MilestoneMetWorker;
import com.lingq.core.database.entity.MilestoneMetEntity;
import com.lingq.core.database.entity.MilestoneStatsEntity;
import com.lingq.core.network.api.result.ResultMilestone;
import com.lingq.core.network.api.result.ResultMilestoneStats;
import com.lingq.core.network.api.result.ResultMilestones;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.h0a;
import p000.h85;
import p000.hi8;
import p000.rm5;
import p000.sm5;
import p000.tsc;
import p000.tx6;
import p000.ux6;
import p000.uy5;
import p000.v91;
import p000.vz1;
import p000.xfa;
import p000.xj1;
import p000.xsc;
import p000.xy5;
import p000.yy5;

/* JADX INFO: renamed from: com.lingq.core.data.repository.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1298n implements xy5 {

    /* JADX INFO: renamed from: a */
    public final uy5 f16520a;

    /* JADX INFO: renamed from: b */
    public final yy5 f16521b;

    /* JADX INFO: renamed from: c */
    public final C0773b f16522c;

    public C1298n(uy5 uy5Var, yy5 yy5Var, C0773b c0773b) {
        uy5Var.getClass();
        yy5Var.getClass();
        c0773b.getClass();
        this.f16520a = uy5Var;
        this.f16521b = yy5Var;
        this.f16522c = c0773b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7330a(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        MilestoneRepositoryImpl$meetMilestone$1 milestoneRepositoryImpl$meetMilestone$1;
        if (continuationImpl instanceof MilestoneRepositoryImpl$meetMilestone$1) {
            milestoneRepositoryImpl$meetMilestone$1 = (MilestoneRepositoryImpl$meetMilestone$1) continuationImpl;
            int i = milestoneRepositoryImpl$meetMilestone$1.f15832e;
            if ((i & Integer.MIN_VALUE) != 0) {
                milestoneRepositoryImpl$meetMilestone$1.f15832e = i - Integer.MIN_VALUE;
            } else {
                milestoneRepositoryImpl$meetMilestone$1 = new MilestoneRepositoryImpl$meetMilestone$1(this, continuationImpl);
            }
        } else {
            milestoneRepositoryImpl$meetMilestone$1 = new MilestoneRepositoryImpl$meetMilestone$1(this, continuationImpl);
        }
        Object obj = milestoneRepositoryImpl$meetMilestone$1.f15830c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = milestoneRepositoryImpl$meetMilestone$1.f15832e;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            MilestoneMetEntity milestoneMetEntity = new MilestoneMetEntity(vz1.m23629f(str, str2), str3);
            milestoneRepositoryImpl$meetMilestone$1.f15828a = str;
            milestoneRepositoryImpl$meetMilestone$1.f15829b = str2;
            milestoneRepositoryImpl$meetMilestone$1.f15832e = 1;
            uy5 uy5Var = this.f16520a;
            Object objM2861d = AbstractC0758a.m2861d(new h85(8, uy5Var, milestoneMetEntity), uy5Var.f64534K, milestoneRepositoryImpl$meetMilestone$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = milestoneRepositoryImpl$meetMilestone$1.f15829b;
            str = milestoneRepositoryImpl$meetMilestone$1.f15828a;
            AbstractC3193b.m15359b(obj);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(MilestoneMetWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("slug", str2)};
        hi8 hi8Var = new hi8(10);
        for (int i3 = 0; i3 < 2; i3++) {
            Pair pair = pairArr[i3];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16522c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: Exception -> 0x0050, CancellationException -> 0x0126, TryCatch #0 {Exception -> 0x0050, blocks: (B:21:0x0049, B:42:0x00a7, B:44:0x00ad, B:47:0x00c9), top: B:72:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9 A[Catch: Exception -> 0x0050, CancellationException -> 0x0126, TRY_LEAVE, TryCatch #0 {Exception -> 0x0050, blocks: (B:21:0x0049, B:42:0x00a7, B:44:0x00ad, B:47:0x00c9), top: B:72:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8 A[Catch: Exception -> 0x003a, CancellationException -> 0x0126, TryCatch #1 {Exception -> 0x003a, blocks: (B:14:0x0035, B:53:0x00d2, B:55:0x00d8, B:56:0x00de, B:58:0x00e4, B:61:0x00f2, B:63:0x00f6, B:26:0x0056, B:32:0x006a, B:34:0x0072, B:35:0x0081, B:37:0x0087, B:38:0x0095, B:29:0x005d), top: B:74:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: Exception -> 0x003a, CancellationException -> 0x0126, TryCatch #1 {Exception -> 0x003a, blocks: (B:14:0x0035, B:53:0x00d2, B:55:0x00d8, B:56:0x00de, B:58:0x00e4, B:61:0x00f2, B:63:0x00f6, B:26:0x0056, B:32:0x006a, B:34:0x0072, B:35:0x0081, B:37:0x0087, B:38:0x0095, B:29:0x005d), top: B:74:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6 A[Catch: Exception -> 0x003a, CancellationException -> 0x0126, TRY_LEAVE, TryCatch #1 {Exception -> 0x003a, blocks: (B:14:0x0035, B:53:0x00d2, B:55:0x00d8, B:56:0x00de, B:58:0x00e4, B:61:0x00f2, B:63:0x00f6, B:26:0x0056, B:32:0x006a, B:34:0x0072, B:35:0x0081, B:37:0x0087, B:38:0x0095, B:29:0x005d), top: B:74:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:56:0x00de->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7331b(String str, ContinuationImpl continuationImpl) throws Throwable {
        MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1 milestoneRepositoryImpl$networkGetMilestonesForLanguage$1;
        ResultMilestones resultMilestones;
        String str2;
        ResultMilestones resultMilestones2;
        int i;
        ResultMilestoneStats resultMilestoneStatsM8376b;
        Object objM2861d;
        String str3;
        List listM8375a;
        ResultMilestone resultMilestone;
        String strM8374a;
        if (continuationImpl instanceof MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1) {
            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1 = (MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1) continuationImpl;
            int i2 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15838f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15838f = i2 - Integer.MIN_VALUE;
            } else {
                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1 = new MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1(this, continuationImpl);
            }
        } else {
            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1 = new MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1(this, continuationImpl);
        }
        Object objM25382a = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15836d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15838f;
        int i4 = 10;
        uy5 uy5Var = this.f16520a;
        Object obj = null;
        try {
            try {
                if (i3 == 0) {
                    AbstractC3193b.m15359b(objM25382a);
                    yy5 yy5Var = this.f16521b;
                    milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15833a = str;
                    milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15838f = 1;
                    objM25382a = yy5Var.m25382a(str, milestoneRepositoryImpl$networkGetMilestonesForLanguage$1);
                    if (objM25382a == coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i5 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15835c;
                        ResultMilestones resultMilestones3 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15834b;
                        str2 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15833a;
                        try {
                            AbstractC3193b.m15359b(objM25382a);
                            i = i5;
                            resultMilestones2 = resultMilestones3;
                            resultMilestoneStatsM8376b = resultMilestones2.m8376b();
                            if (resultMilestoneStatsM8376b != null) {
                                MilestoneStatsEntity milestoneStatsEntityM22297a = tsc.m22297a(resultMilestoneStatsM8376b, str2);
                                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15833a = str2;
                                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15834b = resultMilestones2;
                                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15835c = i;
                                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15838f = 3;
                                objM2861d = AbstractC0758a.m2861d(new h85(i4, uy5Var, milestoneStatsEntityM22297a), uy5Var.f64534K, milestoneRepositoryImpl$networkGetMilestonesForLanguage$1, false, true);
                                if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d = xfa.f68157a;
                                }
                                if (objM2861d != coroutineSingletons) {
                                    str3 = str2;
                                }
                                return coroutineSingletons;
                            }
                            resultMilestones = resultMilestones2;
                            str = str2;
                            listM8375a = resultMilestones.m8375a();
                            if (listM8375a != null) {
                                for (Object obj2 : listM8375a) {
                                    if (((ResultMilestone) obj2).m8374a() != null) {
                                        obj = obj2;
                                        break;
                                    }
                                }
                                resultMilestone = (ResultMilestone) obj;
                                if (resultMilestone == null && (strM8374a = resultMilestone.m8374a()) != null) {
                                    return strM8374a;
                                }
                            }
                            return "";
                        } catch (Exception e) {
                            e = e;
                            str = str2;
                            rm5 rm5Var = sm5.Companion;
                            String str4 = "Milestones refresh failed for " + str + ": " + e.getMessage();
                            rm5Var.getClass();
                            h0a.f41641a.mo11431b(str4, new Object[0]);
                            return "";
                        }
                    }
                    if (i3 != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    resultMilestones2 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15834b;
                    str3 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15833a;
                    AbstractC3193b.m15359b(objM25382a);
                    str2 = str3;
                    resultMilestones = resultMilestones2;
                    str = str2;
                    listM8375a = resultMilestones.m8375a();
                    if (listM8375a != null) {
                        while (r13.hasNext()) {
                            if (((ResultMilestone) obj2).m8374a() != null) {
                                obj = obj2;
                                break;
                            }
                        }
                        resultMilestone = (ResultMilestone) obj;
                        if (resultMilestone == null) {
                        }
                    }
                    return "";
                }
                str = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15833a;
                AbstractC3193b.m15359b(objM25382a);
                resultMilestones = (ResultMilestones) objM25382a;
                List listM8375a2 = resultMilestones.m8375a();
                if (listM8375a2 != null) {
                    List list = listM8375a2;
                    ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xsc.m24663a((ResultMilestone) it.next(), str));
                    }
                    milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15833a = str;
                    milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15834b = resultMilestones;
                    milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15835c = 0;
                    milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15838f = 2;
                    if (uy5Var.mo4096w0(arrayList, milestoneRepositoryImpl$networkGetMilestonesForLanguage$1) != coroutineSingletons) {
                        str2 = str;
                        resultMilestones2 = resultMilestones;
                        i = 0;
                        resultMilestoneStatsM8376b = resultMilestones2.m8376b();
                        if (resultMilestoneStatsM8376b != null) {
                            MilestoneStatsEntity milestoneStatsEntityM22297a2 = tsc.m22297a(resultMilestoneStatsM8376b, str2);
                            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15833a = str2;
                            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15834b = resultMilestones2;
                            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15835c = i;
                            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f15838f = 3;
                            objM2861d = AbstractC0758a.m2861d(new h85(i4, uy5Var, milestoneStatsEntityM22297a2), uy5Var.f64534K, milestoneRepositoryImpl$networkGetMilestonesForLanguage$1, false, true);
                            if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d = xfa.f68157a;
                            }
                            if (objM2861d != coroutineSingletons) {
                                str3 = str2;
                                str2 = str3;
                            }
                        }
                        resultMilestones = resultMilestones2;
                        str = str2;
                    }
                    return coroutineSingletons;
                }
                listM8375a = resultMilestones.m8375a();
                if (listM8375a != null) {
                    while (r13.hasNext()) {
                        if (((ResultMilestone) obj2).m8374a() != null) {
                            obj = obj2;
                            break;
                        }
                    }
                    resultMilestone = (ResultMilestone) obj;
                    if (resultMilestone == null) {
                    }
                }
                return "";
            } catch (Exception e2) {
                e = e2;
            }
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
