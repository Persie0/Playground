package com.lingq.feature.reader.stats;

import com.lingq.core.data.repository.C1289e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3513qw;
import p000.C3540rl;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$isCoachMessageStale$updatedAt$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {579}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$isCoachMessageStale$updatedAt$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30573b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f30574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$isCoachMessageStale$updatedAt$1(C2535j c2535j, int i, Continuation continuation) {
        super(2, continuation);
        this.f30573b = c2535j;
        this.f30574c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$isCoachMessageStale$updatedAt$1(this.f30573b, this.f30574c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$isCoachMessageStale$updatedAt$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30572a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C3540rl c3540rl = new C3540rl(AbstractC3224d.m15536o(new C3513qw(((C1289e) this.f30573b.f30795E.f90a).m7166p(this.f30574c), 9)), 5);
        this.f30572a = 1;
        Object objM15541t = AbstractC3224d.m15541t(c3540rl, this);
        return objM15541t == coroutineSingletons ? coroutineSingletons : objM15541t;
    }
}
