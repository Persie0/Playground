package com.lingq.core.achievements;

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

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$4", m4291f = "RepairStreakFragment.kt", m4292l = {85}, m4293m = "invokeSuspend", m4294v = 2)
final class RepairStreakFragment$onViewCreated$2$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RepairStreakFragment f14203b;

    /* JADX INFO: renamed from: com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$4$1 */
    @c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$4$1", m4291f = "RepairStreakFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12311 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f14204a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RepairStreakFragment f14205b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12311(RepairStreakFragment repairStreakFragment, Continuation continuation) {
            super(2, continuation);
            this.f14205b = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12311 c12311 = new C12311(this.f14205b, continuation);
            c12311.f14204a = ((Boolean) obj).booleanValue();
            return c12311;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C12311 c12311 = (C12311) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12311.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f14204a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            RepairStreakFragment repairStreakFragment = this.f14205b;
            if (z) {
                bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
                repairStreakFragment.m6996m0().f580g.m6163e();
                jfa.m14425h(repairStreakFragment.m6996m0().f575b);
                jfa.m14425h(repairStreakFragment.m6996m0().f574a);
            } else {
                bh4[] bh4VarArr2 = RepairStreakFragment.f14177T0;
                jfa.m14425h(repairStreakFragment.m6996m0().f580g);
                jfa.m14429l(repairStreakFragment.m6996m0().f575b);
                jfa.m14429l(repairStreakFragment.m6996m0().f574a);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$4(RepairStreakFragment repairStreakFragment, Continuation continuation) {
        super(2, continuation);
        this.f14203b = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepairStreakFragment$onViewCreated$2$4(this.f14203b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepairStreakFragment$onViewCreated$2$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14202a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
            RepairStreakFragment repairStreakFragment = this.f14203b;
            c18 c18Var = repairStreakFragment.m6997n0().f14235k;
            C12311 c12311 = new C12311(repairStreakFragment, null);
            this.f14202a = 1;
            if (AbstractC3224d.m15529h(c18Var, c12311, this) == coroutineSingletons) {
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
