package com.lingq.feature.statistics;

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
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$3", m4291f = "StatsShareFragment.kt", m4292l = {276}, m4293m = "invokeSuspend", m4294v = 2)
final class StatsShareFragment$onViewCreated$3$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33344a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ StatsShareFragment f33345b;

    /* JADX INFO: renamed from: com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$3$1 */
    @c32(m4290c = "com.lingq.feature.statistics.StatsShareFragment$onViewCreated$3$3$1", m4291f = "StatsShareFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28091 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f33346a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StatsShareFragment f33347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28091(StatsShareFragment statsShareFragment, Continuation continuation) {
            super(2, continuation);
            this.f33347b = statsShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28091 c28091 = new C28091(this.f33347b, continuation);
            c28091.f33346a = ((Boolean) obj).booleanValue();
            return c28091;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C28091 c28091 = (C28091) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28091.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f33346a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            StatsShareFragment statsShareFragment = this.f33347b;
            if (z) {
                bh4[] bh4VarArr = StatsShareFragment.f33326U0;
                jfa.m14429l(statsShareFragment.m9724A0().f57684a);
            } else {
                bh4[] bh4VarArr2 = StatsShareFragment.f33326U0;
                jfa.m14420c(statsShareFragment.m9724A0().f57684a);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareFragment$onViewCreated$3$3(StatsShareFragment statsShareFragment, Continuation continuation) {
        super(2, continuation);
        this.f33345b = statsShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StatsShareFragment$onViewCreated$3$3(this.f33345b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((StatsShareFragment$onViewCreated$3$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33344a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = StatsShareFragment.f33326U0;
            StatsShareFragment statsShareFragment = this.f33345b;
            c18 c18Var = statsShareFragment.m9725B0().f33480l;
            C28091 c28091 = new C28091(statsShareFragment, null);
            c18Var.getClass();
            this.f33344a = 1;
            if (AbstractC3224d.m15529h(c18Var, c28091, this) == coroutineSingletons) {
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
