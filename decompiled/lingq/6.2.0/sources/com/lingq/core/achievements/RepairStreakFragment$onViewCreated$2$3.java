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
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$3", m4291f = "RepairStreakFragment.kt", m4292l = {78}, m4293m = "invokeSuspend", m4294v = 2)
final class RepairStreakFragment$onViewCreated$2$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RepairStreakFragment f14199b;

    /* JADX INFO: renamed from: com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$3$1 */
    @c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$3$1", m4291f = "RepairStreakFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12301 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f14200a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RepairStreakFragment f14201b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12301(RepairStreakFragment repairStreakFragment, Continuation continuation) {
            super(2, continuation);
            this.f14201b = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12301 c12301 = new C12301(this.f14201b, continuation);
            c12301.f14200a = obj;
            return c12301;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C12301 c12301 = (C12301) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12301.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f14200a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
            RepairStreakFragment repairStreakFragment = this.f14201b;
            jfa.m14429l(repairStreakFragment.m6996m0().f579f);
            repairStreakFragment.m6996m0().f576c.setText(str);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$3(RepairStreakFragment repairStreakFragment, Continuation continuation) {
        super(2, continuation);
        this.f14199b = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepairStreakFragment$onViewCreated$2$3(this.f14199b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepairStreakFragment$onViewCreated$2$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14198a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
            RepairStreakFragment repairStreakFragment = this.f14199b;
            du0 du0Var = repairStreakFragment.m6997n0().f14233i;
            C12301 c12301 = new C12301(repairStreakFragment, null);
            this.f14198a = 1;
            if (AbstractC3224d.m15529h(du0Var, c12301, this) == coroutineSingletons) {
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
