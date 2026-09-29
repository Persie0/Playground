package com.lingq.core.achievements;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$2", m4291f = "RepairStreakFragment.kt", m4292l = {72}, m4293m = "invokeSuspend", m4294v = 2)
final class RepairStreakFragment$onViewCreated$2$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14195a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RepairStreakFragment f14196b;

    /* JADX INFO: renamed from: com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$2$1 */
    @c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$2$1", m4291f = "RepairStreakFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12291 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RepairStreakFragment f14197a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12291(RepairStreakFragment repairStreakFragment, Continuation continuation) {
            super(2, continuation);
            this.f14197a = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C12291(this.f14197a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C12291 c12291 = (C12291) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12291.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f14197a.m3659e0(false, false);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$2(RepairStreakFragment repairStreakFragment, Continuation continuation) {
        super(2, continuation);
        this.f14196b = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepairStreakFragment$onViewCreated$2$2(this.f14196b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepairStreakFragment$onViewCreated$2$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14195a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
            RepairStreakFragment repairStreakFragment = this.f14196b;
            du0 du0Var = repairStreakFragment.m6997n0().f14239o;
            C12291 c12291 = new C12291(repairStreakFragment, null);
            this.f14195a = 1;
            if (AbstractC3224d.m15529h(du0Var, c12291, this) == coroutineSingletons) {
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
