package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.g23;
import p000.m58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupTeamLeaderboardViewModel$refreshTeams$1", m4291f = "CupTeamLeaderboardViewModel.kt", m4292l = {134, 135}, m4293m = "invokeSuspend", m4294v = 2)
final class CupTeamLeaderboardViewModel$refreshTeams$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1979f f24635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupTeamLeaderboardViewModel$refreshTeams$1(C1979f c1979f, Continuation continuation) {
        super(2, continuation);
        this.f24635b = c1979f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupTeamLeaderboardViewModel$refreshTeams$1(this.f24635b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupTeamLeaderboardViewModel$refreshTeams$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24634a;
        xfa xfaVar = xfa.f68157a;
        C1979f c1979f = this.f24635b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            m58 m58Var = c1979f.f24702d;
            this.f24634a = 1;
            if (m58Var.m16644h(this) != coroutineSingletons) {
            }
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        g23 g23Var = c1979f.f24700b;
        this.f24634a = 2;
        Object objM7192e = ((C1291g) g23Var.f40075a).m7192e(this);
        if (objM7192e != coroutineSingletons) {
            objM7192e = xfaVar;
        }
        return objM7192e == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
