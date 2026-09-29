package com.lingq.feature.statistics;

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
import p000.e80;
import p000.f80;
import p000.ma3;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.zh5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsBadgesViewModel$badgesStatsUiState$1", m4291f = "LanguageStatsBadgesViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsBadgesViewModel$badgesStatsUiState$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33162a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LanguageStatsBadgesViewModel$badgesStatsUiState$1 languageStatsBadgesViewModel$badgesStatsUiState$1 = new LanguageStatsBadgesViewModel$badgesStatsUiState$1(2, continuation);
        languageStatsBadgesViewModel$badgesStatsUiState$1.f33162a = obj;
        return languageStatsBadgesViewModel$badgesStatsUiState$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageStatsBadgesViewModel$badgesStatsUiState$1) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f33162a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (list == null) {
            return e80.f36830a;
        }
        if (list.isEmpty()) {
            return d80.f35102a;
        }
        List<Badge> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (Badge badge : list2) {
            arrayList.add(Badge.m8096a(badge, zh5.m25656a(LocalDateTime.Companion, badge.f19512f).toString()));
        }
        return new f80(u91.m22610b1(u91.m22614f1(arrayList, new ma3(22))));
    }
}
