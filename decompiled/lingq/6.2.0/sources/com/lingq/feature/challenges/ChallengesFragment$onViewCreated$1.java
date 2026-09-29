package com.lingq.feature.challenges;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.lg3;
import p000.un1;
import p000.xfa;
import p000.ye0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesFragment$onViewCreated$1", m4291f = "ChallengesFragment.kt", m4292l = {49}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengesFragment$onViewCreated$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24443a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChallengesFragment f24444b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengesFragment$onViewCreated$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengesFragment$onViewCreated$1$1", m4291f = "ChallengesFragment.kt", m4292l = {50}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19571 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChallengesFragment f24446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19571(ChallengesFragment challengesFragment, Continuation continuation) {
            super(2, continuation);
            this.f24446b = challengesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C19571(this.f24446b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19571) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24445a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                bh4[] bh4VarArr = ChallengesFragment.f24437G0;
                ChallengesFragment challengesFragment = this.f24446b;
                c18 c18Var = challengesFragment.m8807R0().f24699j;
                ye0 ye0Var = new ye0(challengesFragment, 2);
                this.f24445a = 1;
                if (((C3244l) c18Var.f9311a).collect(ye0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            C3386nv.m17631r();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesFragment$onViewCreated$1(ChallengesFragment challengesFragment, Continuation continuation) {
        super(2, continuation);
        this.f24444b = challengesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengesFragment$onViewCreated$1(this.f24444b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengesFragment$onViewCreated$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24443a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ChallengesFragment challengesFragment = this.f24444b;
            lg3 lg3VarM2112n = challengesFragment.m2112n();
            Lifecycle$State lifecycle$State = Lifecycle$State.STARTED;
            C19571 c19571 = new C19571(challengesFragment, null);
            this.f24443a = 1;
            if (AbstractC0708b.m2510c(lg3VarM2112n, lifecycle$State, c19571, this) == coroutineSingletons) {
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
