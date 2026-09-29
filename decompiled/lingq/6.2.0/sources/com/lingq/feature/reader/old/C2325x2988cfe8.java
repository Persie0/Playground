package com.lingq.feature.reader.old;

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

/* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1", m4291f = "ReaderPageFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2325x2988cfe8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28454a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28455b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f28456c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderPageFragment f28457d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f28458e;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28459a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28460b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28461c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28460b = readerPageFragment;
            this.f28461c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28461c, this.f28460b, continuation);
            anonymousClass1.f28459a = obj;
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
            un1 un1Var = (un1) this.f28459a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$3$1(this.f28461c, this.f28460b, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2325x2988cfe8(ReaderPageFragment readerPageFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReaderPageFragment readerPageFragment2, int i) {
        super(2, continuation);
        this.f28455b = readerPageFragment;
        this.f28456c = lifecycle$State;
        this.f28457d = readerPageFragment2;
        this.f28458e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2325x2988cfe8(this.f28455b, this.f28456c, continuation, this.f28457d, this.f28458e);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2325x2988cfe8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28454a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f28455b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28458e, this.f28457d, null);
            this.f28454a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f28456c, anonymousClass1, this) == coroutineSingletons) {
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
