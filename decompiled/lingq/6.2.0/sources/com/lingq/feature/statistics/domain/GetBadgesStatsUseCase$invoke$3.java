package com.lingq.feature.statistics.domain;

import com.lingq.core.domain.model.milestones.Badge;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.datetime.LocalDateTime;
import p000.c32;
import p000.d80;
import p000.f80;
import p000.ma3;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.zh5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.domain.GetBadgesStatsUseCase$invoke$3", m4291f = "GetBadgesStatsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetBadgesStatsUseCase$invoke$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33408a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetBadgesStatsUseCase$invoke$3 getBadgesStatsUseCase$invoke$3 = new GetBadgesStatsUseCase$invoke$3(2, continuation);
        getBadgesStatsUseCase$invoke$3.f33408a = obj;
        return getBadgesStatsUseCase$invoke$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetBadgesStatsUseCase$invoke$3) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f33408a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (list.isEmpty()) {
            return d80.f35102a;
        }
        List<Badge> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (Badge badge : list2) {
            arrayList.add(Badge.m8096a(badge, zh5.m25656a(LocalDateTime.Companion, badge.f19512f).toString()));
        }
        return new f80(u91.m22615g1(u91.m22610b1(u91.m22614f1(arrayList, new ma3(17))), 4));
    }
}
