package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareViewModel$special$$inlined$flatMapLatest$1", m4291f = "StatsShareViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class StatsShareViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f33365a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f33366b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33367c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2821i f33368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareViewModel$special$$inlined$flatMapLatest$1(C2821i c2821i, Continuation continuation) {
        super(3, continuation);
        this.f33368d = c2821i;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        StatsShareViewModel$special$$inlined$flatMapLatest$1 statsShareViewModel$special$$inlined$flatMapLatest$1 = new StatsShareViewModel$special$$inlined$flatMapLatest$1(this.f33368d, (Continuation) obj3);
        statsShareViewModel$special$$inlined$flatMapLatest$1.f33366b = (e83) obj;
        statsShareViewModel$special$$inlined$flatMapLatest$1.f33367c = obj2;
        return statsShareViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f33366b;
        Object obj2 = this.f33367c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33365a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2821i c2821i = this.f33368d;
            c83 c83VarM7237k = ((C1294j) c2821i.f33471c).m7237k(c2821i.f33470b.mo4589b2());
            this.f33366b = null;
            this.f33367c = null;
            this.f33365a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7237k, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
