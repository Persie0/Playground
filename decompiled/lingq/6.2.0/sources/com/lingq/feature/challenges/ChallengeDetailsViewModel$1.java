package com.lingq.feature.challenges;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.fr0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {431}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1962b f24372b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsViewModel$1$1", m4291f = "ChallengeDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19461 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f24373a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1962b f24374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19461(C1962b c1962b, Continuation continuation) {
            super(2, continuation);
            this.f24374b = c1962b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19461 c19461 = new C19461(this.f24374b, continuation);
            c19461.f24373a = obj;
            return c19461;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19461 c19461 = (C19461) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19461.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            List list = (List) this.f24373a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f24374b.f24509t;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, fr0.m12004a((fr0) value, null, null, null, null, null, null, list, null, null, null, 4031)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsViewModel$1(C1962b c1962b, Continuation continuation) {
        super(2, continuation);
        this.f24372b = c1962b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeDetailsViewModel$1(this.f24372b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeDetailsViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24371a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1962b c1962b = this.f24372b;
            eh9 eh9VarMo4573B1 = c1962b.f24491b.mo4573B1();
            C19461 c19461 = new C19461(c1962b, null);
            eh9VarMo4573B1.getClass();
            this.f24371a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4573B1, c19461, this) == coroutineSingletons) {
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
