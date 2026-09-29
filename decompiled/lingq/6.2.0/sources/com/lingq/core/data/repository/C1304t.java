package com.lingq.core.data.repository;

import com.lingq.core.database.entity.ReferralEntity;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.network.api.result.ReferralUser;
import com.lingq.core.network.api.result.ResultReferralStats;
import com.lingq.core.network.api.result.ResultUserReferral;
import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.nm7;
import p000.u38;
import p000.v38;
import p000.v91;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.data.repository.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C1304t {

    /* JADX INFO: renamed from: a */
    public final u38 f16544a;

    /* JADX INFO: renamed from: b */
    public final v38 f16545b;

    /* JADX INFO: renamed from: c */
    public final nm7 f16546c;

    public C1304t(u38 u38Var, v38 v38Var, nm7 nm7Var) {
        u38Var.getClass();
        v38Var.getClass();
        nm7Var.getClass();
        this.f16544a = u38Var;
        this.f16545b = v38Var;
        this.f16546c = nm7Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e A[Catch: Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:13:0x002d, B:18:0x0039, B:32:0x006a, B:34:0x006e, B:35:0x0072, B:19:0x003d, B:25:0x004f, B:27:0x0056, B:29:0x005c, B:22:0x0044), top: B:42:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (((com.lingq.core.datastore.C1369b) r5).m7923j(r4, r0) == r1) goto L37;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7368a(ContinuationImpl continuationImpl) throws Throwable {
        ReferralRepositoryImpl$networkGetReferralStats$1 referralRepositoryImpl$networkGetReferralStats$1;
        ResultReferralStats resultReferralStats;
        if (continuationImpl instanceof ReferralRepositoryImpl$networkGetReferralStats$1) {
            referralRepositoryImpl$networkGetReferralStats$1 = (ReferralRepositoryImpl$networkGetReferralStats$1) continuationImpl;
            int i = referralRepositoryImpl$networkGetReferralStats$1.f16088d;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralRepositoryImpl$networkGetReferralStats$1.f16088d = i - Integer.MIN_VALUE;
            } else {
                referralRepositoryImpl$networkGetReferralStats$1 = new ReferralRepositoryImpl$networkGetReferralStats$1(this, continuationImpl);
            }
        } else {
            referralRepositoryImpl$networkGetReferralStats$1 = new ReferralRepositoryImpl$networkGetReferralStats$1(this, continuationImpl);
        }
        Object objM23081a = referralRepositoryImpl$networkGetReferralStats$1.f16086b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = referralRepositoryImpl$networkGetReferralStats$1.f16088d;
        nm7 nm7Var = this.f16546c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM23081a);
                v38 v38Var = this.f16545b;
                referralRepositoryImpl$networkGetReferralStats$1.f16088d = 1;
                objM23081a = v38Var.m23081a(referralRepositoryImpl$networkGetReferralStats$1);
                if (objM23081a == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM23081a);
            } else if (i2 == 2) {
                resultReferralStats = referralRepositoryImpl$networkGetReferralStats$1.f16085a;
                AbstractC3193b.m15359b(objM23081a);
                Integer num = resultReferralStats.f21478c;
                int iIntValue = num != null ? num.intValue() : 0;
                referralRepositoryImpl$networkGetReferralStats$1.f16085a = null;
                referralRepositoryImpl$networkGetReferralStats$1.f16088d = 3;
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM23081a);
            }
            return xfa.f68157a;
            resultReferralStats = (ResultReferralStats) objM23081a;
            Integer num2 = resultReferralStats.f21476a;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            referralRepositoryImpl$networkGetReferralStats$1.f16085a = resultReferralStats;
            referralRepositoryImpl$networkGetReferralStats$1.f16088d = 2;
            if (((C1369b) nm7Var).m7922i(iIntValue2, referralRepositoryImpl$networkGetReferralStats$1) != coroutineSingletons) {
                Integer num3 = resultReferralStats.f21478c;
                if (num3 != null) {
                }
                referralRepositoryImpl$networkGetReferralStats$1.f16085a = null;
                referralRepositoryImpl$networkGetReferralStats$1.f16088d = 3;
            }
            return coroutineSingletons;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7369b(ContinuationImpl continuationImpl) throws Throwable {
        ReferralRepositoryImpl$networkGetReferrals$1 referralRepositoryImpl$networkGetReferrals$1;
        if (continuationImpl instanceof ReferralRepositoryImpl$networkGetReferrals$1) {
            referralRepositoryImpl$networkGetReferrals$1 = (ReferralRepositoryImpl$networkGetReferrals$1) continuationImpl;
            int i = referralRepositoryImpl$networkGetReferrals$1.f16091c;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralRepositoryImpl$networkGetReferrals$1.f16091c = i - Integer.MIN_VALUE;
            } else {
                referralRepositoryImpl$networkGetReferrals$1 = new ReferralRepositoryImpl$networkGetReferrals$1(this, continuationImpl);
            }
        } else {
            referralRepositoryImpl$networkGetReferrals$1 = new ReferralRepositoryImpl$networkGetReferrals$1(this, continuationImpl);
        }
        Object objM23082b = referralRepositoryImpl$networkGetReferrals$1.f16089a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = referralRepositoryImpl$networkGetReferrals$1.f16091c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    AbstractC3193b.m15359b(objM23082b);
                } else {
                    if (i2 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(objM23082b);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(objM23082b);
            v38 v38Var = this.f16545b;
            Integer num = new Integer(1);
            Integer num2 = new Integer(5);
            referralRepositoryImpl$networkGetReferrals$1.f16091c = 1;
            objM23082b = v38Var.m23082b(num, num2, referralRepositoryImpl$networkGetReferrals$1);
            if (objM23082b == coroutineSingletons) {
            }
            return coroutineSingletons;
            List list = ((Results) objM23082b).f21739d;
            if (list != null) {
                List<ResultUserReferral> list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                for (ResultUserReferral resultUserReferral : list2) {
                    resultUserReferral.getClass();
                    Integer num3 = resultUserReferral.f21668e;
                    int iIntValue = num3 != null ? num3.intValue() : 0;
                    String str = resultUserReferral.f21673j;
                    ReferralUser referralUser = resultUserReferral.f21672i;
                    arrayList.add(new ReferralEntity(str, iIntValue, referralUser != null ? referralUser.f20600e : null, resultUserReferral.f21664a));
                }
                u38 u38Var = this.f16544a;
                referralRepositoryImpl$networkGetReferrals$1.f16091c = 2;
                objM23082b = u38Var.mo4096w0(arrayList, referralRepositoryImpl$networkGetReferrals$1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
