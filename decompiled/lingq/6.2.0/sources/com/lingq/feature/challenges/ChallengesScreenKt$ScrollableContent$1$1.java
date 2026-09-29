package com.lingq.feature.challenges;

import androidx.compose.foundation.lazy.C0127b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.et0;
import p000.fs6;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesScreenKt$ScrollableContent$1$1", m4291f = "ChallengesScreen.kt", m4292l = {158}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengesScreenKt$ScrollableContent$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24459a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ et0 f24460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0127b f24461c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f24462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesScreenKt$ScrollableContent$1$1(et0 et0Var, C0127b c0127b, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f24460b = et0Var;
        this.f24461c = c0127b;
        this.f24462d = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengesScreenKt$ScrollableContent$1$1(this.f24460b, this.f24461c, this.f24462d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengesScreenKt$ScrollableContent$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24459a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            et0 et0Var = this.f24460b;
            if (!et0Var.f37790d.isEmpty() && et0Var.f37788b) {
                this.f24459a = 1;
                fs6 fs6Var = C0127b.f2435y;
                if (this.f24461c.m976f(0, 0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f24462d.mo0a();
        return xfa.f68157a;
    }
}
