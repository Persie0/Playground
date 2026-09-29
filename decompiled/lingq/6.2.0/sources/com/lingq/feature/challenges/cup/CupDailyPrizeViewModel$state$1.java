package com.lingq.feature.challenges.cup;

import com.lingq.core.domain.model.cup.CupClaim;
import com.lingq.core.domain.model.cup.CupPrize;
import com.lingq.core.domain.model.cup.CupPrizeKind;
import com.lingq.core.domain.model.cup.CupPrizeSource;
import com.lingq.core.domain.model.cup.CupToday;
import com.lingq.feature.challenges.cup.data.PrizeClaimUiState;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.ew1;
import p000.fz1;
import p000.ju1;
import p000.ma3;
import p000.n56;
import p000.qt1;
import p000.rt1;
import p000.u91;
import p000.v91;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupDailyPrizeViewModel$state$1", m4291f = "CupDailyPrizeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CupDailyPrizeViewModel$state$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ew1 f24597a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f24598b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ rt1 f24599c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1977d f24600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupDailyPrizeViewModel$state$1(C1977d c1977d, Continuation continuation) {
        super(4, continuation);
        this.f24600d = c1977d;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        CupDailyPrizeViewModel$state$1 cupDailyPrizeViewModel$state$1 = new CupDailyPrizeViewModel$state$1(this.f24600d, (Continuation) obj4);
        cupDailyPrizeViewModel$state$1.f24597a = (ew1) obj;
        cupDailyPrizeViewModel$state$1.f24598b = (List) obj2;
        cupDailyPrizeViewModel$state$1.f24599c = (rt1) obj3;
        return cupDailyPrizeViewModel$state$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fz1 fz1Var;
        CupToday cupToday;
        String str;
        fz1 fz1Var2;
        CupPrize cupPrize;
        ew1 ew1Var = this.f24597a;
        List list = this.f24598b;
        rt1 rt1Var = this.f24599c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        boolean z = ew1Var == null;
        ArrayList arrayList = null;
        if (ew1Var != null) {
            CupToday cupToday2 = ew1Var.f37983i;
            if (cupToday2 == null || (cupPrize = cupToday2.f19000b) == null) {
                fz1Var2 = null;
            } else {
                CupClaim cupClaim = cupToday2.f19001c;
                fz1Var2 = new fz1(cupPrize.f18991e, cupPrize.f18988b == CupPrizeKind.Multiplier, cupPrize.f18990d, cupPrize.f18989c, cupClaim == null ? PrizeClaimUiState.Anonymous : cupClaim.f18973a ? PrizeClaimUiState.Claimed : PrizeClaimUiState.Claimable, cupToday2.f18999a);
            }
            fz1Var = fz1Var2;
        } else {
            fz1Var = null;
        }
        if (ew1Var != null) {
            CupToday cupToday3 = ew1Var.f37983i;
            CupPrize cupPrize2 = cupToday3 != null ? cupToday3.f19000b : null;
            boolean z2 = (cupPrize2 != null ? cupPrize2.f18988b : null) == CupPrizeKind.Multiplier;
            CupPrizeSource cupPrizeSource = z2 ? cupPrize2.f18989c : CupPrizeSource.None;
            int i = z2 ? cupPrize2.f18990d : 1;
            List<CupPrizeSource> listM23605K = vz1.m23605K(CupPrizeSource.Reading, CupPrizeSource.Listening, CupPrizeSource.LingQ, CupPrizeSource.KnownWord);
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM23605K, 10));
            for (CupPrizeSource cupPrizeSource2 : listM23605K) {
                boolean z3 = cupPrizeSource == CupPrizeSource.All || cupPrizeSource == cupPrizeSource2;
                arrayList2.add(new n56(cupPrizeSource2, z3 ? i : 1, z3));
            }
            arrayList = arrayList2;
        }
        ?? arrayList3 = EmptyList.f47638a;
        ?? r5 = arrayList;
        if (arrayList == null) {
            r5 = arrayList3;
        }
        if (ew1Var != null && (cupToday = ew1Var.f37983i) != null && (str = cupToday.f18999a) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                String str2 = ((CupPrize) obj2).f18987a;
                if (str2 != null && str2.compareTo(str) < 0) {
                    arrayList4.add(obj2);
                }
            }
            List<CupPrize> listM22615g1 = u91.m22615g1(u91.m22614f1(arrayList4, new ma3(10)), 3);
            arrayList3 = new ArrayList(v91.m23189q0(listM22615g1, 10));
            for (CupPrize cupPrize3 : listM22615g1) {
                String str3 = cupPrize3.f18987a;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                String str5 = cupPrize3.f18991e;
                boolean z4 = cupPrize3.f18988b == CupPrizeKind.Multiplier;
                int i2 = cupPrize3.f18990d;
                CupPrizeSource cupPrizeSource3 = cupPrize3.f18989c;
                CupClaim cupClaim2 = cupPrize3.f18992f;
                arrayList3.add(new ju1(str4, str5, z4, i2, cupPrizeSource3, cupClaim2 != null && cupClaim2.f18973a));
            }
        }
        return new qt1(z, fz1Var, r5, arrayList3, rt1Var.f59785a, rt1Var.f59786b);
    }
}
