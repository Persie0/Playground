package com.lingq.feature.challenges;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b34;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.xq0;
import p000.zi3;
import p000.zq0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsFragment$onViewCreated$2$1", m4291f = "ChallengeDetailsFragment.kt", m4292l = {122}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengeDetailsFragment$onViewCreated$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChallengeDetailsFragment f24359b;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.ChallengeDetailsFragment$onViewCreated$2$1$1 */
    @c32(m4290c = "com.lingq.feature.challenges.ChallengeDetailsFragment$onViewCreated$2$1$1", m4291f = "ChallengeDetailsFragment.kt", m4292l = {123}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19451 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public String f24360a;

        /* JADX INFO: renamed from: b */
        public String f24361b;

        /* JADX INFO: renamed from: c */
        public int f24362c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f24363d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ChallengeDetailsFragment f24364e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19451(ChallengeDetailsFragment challengeDetailsFragment, Continuation continuation) {
            super(2, continuation);
            this.f24364e = challengeDetailsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19451 c19451 = new C19451(this.f24364e, continuation);
            c19451.f24363d = obj;
            return c19451;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19451) create((Pair) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            String str2;
            Pair pair = (Pair) this.f24363d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24362c;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                String str3 = (String) pair.f47623a;
                str = (String) pair.f47624b;
                this.f24363d = null;
                this.f24360a = str3;
                this.f24361b = str;
                this.f24362c = 1;
                if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str3;
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.f24361b;
                str2 = this.f24360a;
                AbstractC3193b.m15359b(obj);
            }
            zq0.Companion.getClass();
            str2.getClass();
            str.getClass();
            jfa.m14428k(b34.m3244j(this.f24364e), new xq0(str2, str), null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeDetailsFragment$onViewCreated$2$1(ChallengeDetailsFragment challengeDetailsFragment, Continuation continuation) {
        super(2, continuation);
        this.f24359b = challengeDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChallengeDetailsFragment$onViewCreated$2$1(this.f24359b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChallengeDetailsFragment$onViewCreated$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24358a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ChallengeDetailsFragment.f24346G0;
            ChallengeDetailsFragment challengeDetailsFragment = this.f24359b;
            du0 du0Var = challengeDetailsFragment.m8806R0().f24502m;
            C19451 c19451 = new C19451(challengeDetailsFragment, null);
            this.f24358a = 1;
            if (AbstractC3224d.m15529h(du0Var, c19451, this) == coroutineSingletons) {
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
