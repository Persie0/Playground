package com.lingq.core.achievements;

import android.text.Html;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.ViewOnClickListenerC3135j5;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$5", m4291f = "RepairStreakFragment.kt", m4292l = {99}, m4293m = "invokeSuspend", m4294v = 2)
final class RepairStreakFragment$onViewCreated$2$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RepairStreakFragment f14207b;

    /* JADX INFO: renamed from: com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$5$1 */
    @c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$2$5$1", m4291f = "RepairStreakFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12321 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f14208a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RepairStreakFragment f14209b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12321(RepairStreakFragment repairStreakFragment, Continuation continuation) {
            super(2, continuation);
            this.f14209b = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12321 c12321 = new C12321(this.f14209b, continuation);
            c12321.f14208a = obj;
            return c12321;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C12321 c12321 = (C12321) create((Boolean) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c12321.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Boolean bool = (Boolean) this.f14208a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                RepairStreakFragment repairStreakFragment = this.f14209b;
                if (zBooleanValue) {
                    bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
                    jfa.m14429l(repairStreakFragment.m6996m0().f579f);
                    jfa.m14425h(repairStreakFragment.m6996m0().f575b);
                    jfa.m14425h(repairStreakFragment.m6996m0().f574a);
                    repairStreakFragment.m6996m0().f576c.setText(Html.fromHtml(repairStreakFragment.m2111m(R$string.stats_not_enough_coins), 63));
                    repairStreakFragment.m6996m0().f576c.setOnClickListener(new ViewOnClickListenerC3135j5(repairStreakFragment, 3));
                } else {
                    bh4[] bh4VarArr2 = RepairStreakFragment.f14177T0;
                    jfa.m14429l(repairStreakFragment.m6996m0().f575b);
                    jfa.m14429l(repairStreakFragment.m6996m0().f574a);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$5(RepairStreakFragment repairStreakFragment, Continuation continuation) {
        super(2, continuation);
        this.f14207b = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepairStreakFragment$onViewCreated$2$5(this.f14207b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepairStreakFragment$onViewCreated$2$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14206a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = RepairStreakFragment.f14177T0;
            RepairStreakFragment repairStreakFragment = this.f14207b;
            c18 c18Var = repairStreakFragment.m6997n0().f14237m;
            C12321 c12321 = new C12321(repairStreakFragment, null);
            this.f14206a = 1;
            if (AbstractC3224d.m15529h(c18Var, c12321, this) == coroutineSingletons) {
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
