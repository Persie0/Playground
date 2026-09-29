package com.lingq.feature.statistics;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.abd;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$1", m4291f = "StatsShareFragment.kt", m4292l = {276}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StatsShareFragment f33337b;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$1$1", m4291f = "StatsShareFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28071 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33338a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StatsShareFragment f33339b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28071(StatsShareFragment statsShareFragment, Continuation continuation) {
            super(2, continuation);
            this.f33339b = statsShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28071 c28071 = new C28071(this.f33339b, continuation);
            c28071.f33338a = obj;
            return c28071;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28071 c28071 = (C28071) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28071.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f33338a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) pair.f47623a).intValue();
            String str = (String) pair.f47624b;
            bh4[] bh4VarArr = StatsShareFragment.f33326U0;
            StatsShareFragment statsShareFragment = this.f33339b;
            abd.m251g(statsShareFragment.m9724A0().f57686c, str, 2.0f);
            statsShareFragment.m9724A0().f57689f.setText(String.valueOf(iIntValue));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareFragment$onViewCreated$3$1(StatsShareFragment statsShareFragment, Continuation continuation) {
        super(2, continuation);
        this.f33337b = statsShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatsShareFragment$onViewCreated$3$1(this.f33337b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StatsShareFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33336a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = StatsShareFragment.f33326U0;
            StatsShareFragment statsShareFragment = this.f33337b;
            c18 c18Var = statsShareFragment.m9725B0().f33477i;
            C28071 c28071 = new C28071(statsShareFragment, null);
            c18Var.getClass();
            this.f33336a = 1;
            if (AbstractC3224d.m15529h(c18Var, c28071, this) == coroutineSingletons) {
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
