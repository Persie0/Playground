package com.lingq.feature.challenges;

import com.lingq.core.domain.model.challenge.Challenge;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.jfa;
import p000.ld3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeShareFragment$onViewCreated$3$1", m4291f = "ChallengeShareFragment.kt", m4292l = {88}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeShareFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChallengeShareFragment f24424b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeShareFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeShareFragment$onViewCreated$3$1$1", m4291f = "ChallengeShareFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19551 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f24425a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChallengeShareFragment f24426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19551(ChallengeShareFragment challengeShareFragment, Continuation continuation) {
            super(2, continuation);
            this.f24426b = challengeShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19551 c19551 = new C19551(this.f24426b, continuation);
            c19551.f24425a = obj;
            return c19551;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19551 c19551 = (C19551) create((Challenge) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19551.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Challenge challenge = (Challenge) this.f24425a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (challenge != null) {
                bh4[] bh4VarArr = ChallengeShareFragment.f24412V0;
                ChallengeShareFragment challengeShareFragment = this.f24426b;
                jfa.m14423f(((ld3) challengeShareFragment.f24413S0.getValue(challengeShareFragment, ChallengeShareFragment.f24412V0[0])).f49496b, challenge.f18861i, 14);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeShareFragment$onViewCreated$3$1(ChallengeShareFragment challengeShareFragment, Continuation continuation) {
        super(2, continuation);
        this.f24424b = challengeShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeShareFragment$onViewCreated$3$1(this.f24424b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeShareFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24423a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ChallengeShareFragment challengeShareFragment = this.f24424b;
            c18 c18Var = ((C1973c) challengeShareFragment.f24414T0.getValue()).f24556f;
            C19551 c19551 = new C19551(challengeShareFragment, null);
            c18Var.getClass();
            this.f24423a = 1;
            if (AbstractC3224d.m15529h(c18Var, c19551, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
