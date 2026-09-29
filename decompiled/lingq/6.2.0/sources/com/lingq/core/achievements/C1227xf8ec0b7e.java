package com.lingq.core.achievements;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lg3;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.achievements.RepairStreakFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "RepairStreakFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C1227xf8ec0b7e extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RepairStreakFragment f14182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f14183c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RepairStreakFragment f14184d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f14185e;

    /* JADX INFO: renamed from: com.lingq.core.achievements.RepairStreakFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.core.achievements.RepairStreakFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "RepairStreakFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f14186a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RepairStreakFragment f14187b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f14188c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RepairStreakFragment repairStreakFragment, String str, Continuation continuation) {
            super(2, continuation);
            this.f14187b = repairStreakFragment;
            this.f14188c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14187b, this.f14188c, continuation);
            anonymousClass1.f14186a = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            anonymousClass1.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f14186a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = this.f14188c;
            RepairStreakFragment repairStreakFragment = this.f14187b;
            wfb.m23926u(un1Var, null, null, new RepairStreakFragment$onViewCreated$2$1(repairStreakFragment, str, null), 3);
            wfb.m23926u(un1Var, null, null, new RepairStreakFragment$onViewCreated$2$2(repairStreakFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new RepairStreakFragment$onViewCreated$2$3(repairStreakFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new RepairStreakFragment$onViewCreated$2$4(repairStreakFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new RepairStreakFragment$onViewCreated$2$5(repairStreakFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1227xf8ec0b7e(RepairStreakFragment repairStreakFragment, Lifecycle$State lifecycle$State, Continuation continuation, RepairStreakFragment repairStreakFragment2, String str) {
        super(2, continuation);
        this.f14182b = repairStreakFragment;
        this.f14183c = lifecycle$State;
        this.f14184d = repairStreakFragment2;
        this.f14185e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1227xf8ec0b7e(this.f14182b, this.f14183c, continuation, this.f14184d, this.f14185e);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C1227xf8ec0b7e) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14181a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f14182b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14184d, this.f14185e, null);
            this.f14181a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f14183c, anonymousClass1, this) == coroutineSingletons) {
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
