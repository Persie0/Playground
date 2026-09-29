package com.lingq.core.token;

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

/* JADX INFO: renamed from: com.lingq.core.token.TokenPopupHostFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenPopupHostFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "TokenPopupHostFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C1891x6267648e extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TokenPopupHostFragment f23464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f23465c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TokenPopupHostFragment f23466d;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupHostFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.core.token.TokenPopupHostFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "TokenPopupHostFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f23467a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TokenPopupHostFragment f23468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TokenPopupHostFragment tokenPopupHostFragment, Continuation continuation) {
            super(2, continuation);
            this.f23468b = tokenPopupHostFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23468b, continuation);
            anonymousClass1.f23467a = obj;
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
            un1 un1Var = (un1) this.f23467a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            wfb.m23926u(un1Var, null, null, new TokenPopupHostFragment$onViewCreated$1$1(this.f23468b, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891x6267648e(TokenPopupHostFragment tokenPopupHostFragment, Lifecycle$State lifecycle$State, Continuation continuation, TokenPopupHostFragment tokenPopupHostFragment2) {
        super(2, continuation);
        this.f23464b = tokenPopupHostFragment;
        this.f23465c = lifecycle$State;
        this.f23466d = tokenPopupHostFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1891x6267648e(this.f23464b, this.f23465c, continuation, this.f23466d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C1891x6267648e) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23463a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f23464b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23466d, null);
            this.f23463a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f23465c, anonymousClass1, this) == coroutineSingletons) {
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
