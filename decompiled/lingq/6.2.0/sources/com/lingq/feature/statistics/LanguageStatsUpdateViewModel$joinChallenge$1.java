package com.lingq.feature.statistics;

import com.lingq.core.data.repository.C1288d;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.or0;
import p000.un1;
import p000.vj6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsUpdateViewModel$joinChallenge$1", m4291f = "LanguageStatsUpdateViewModel.kt", m4292l = {184}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsUpdateViewModel$joinChallenge$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33250a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2817e f33251b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Challenge f33252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsUpdateViewModel$joinChallenge$1(C2817e c2817e, Challenge challenge, Continuation continuation) {
        super(2, continuation);
        this.f33251b = c2817e;
        this.f33252c = challenge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LanguageStatsUpdateViewModel$joinChallenge$1(this.f33251b, this.f33252c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LanguageStatsUpdateViewModel$joinChallenge$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33250a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2817e c2817e = this.f33251b;
        vj6 vj6Var = c2817e.f33449o;
        String strMo4589b2 = c2817e.f33436b.mo4589b2();
        this.f33250a = 1;
        or0 or0Var = (or0) vj6Var.f65506b;
        Challenge challenge = this.f33252c;
        Object objM7135b = ((C1288d) or0Var).m7135b(strMo4589b2, challenge.f18854b, challenge.f18859g, LeaderboardMetric.AllMembers.getKey(), this);
        if (objM7135b != coroutineSingletons) {
            objM7135b = xfaVar;
        }
        return objM7135b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
