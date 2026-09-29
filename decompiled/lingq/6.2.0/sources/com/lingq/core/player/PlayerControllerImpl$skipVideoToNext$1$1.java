package com.lingq.core.player;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.nn1;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$skipVideoToNext$1$1", m4291f = "PlayerController.kt", m4292l = {870}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$skipVideoToNext$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21928b;

    /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$skipVideoToNext$1$1$1 */
    @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$skipVideoToNext$1$1$1", m4291f = "PlayerController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18061 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1808b f21929a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18061(C1808b c1808b, Continuation continuation) {
            super(2, continuation);
            this.f21929a = c1808b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18061(this.f21929a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18061 c18061 = (C18061) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18061.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f21929a.m8455T();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerImpl$skipVideoToNext$1$1(C1808b c1808b, Continuation continuation) {
        super(2, continuation);
        this.f21928b = c1808b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$skipVideoToNext$1$1(this.f21928b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$skipVideoToNext$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21927a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1808b c1808b = this.f21928b;
            nn1 nn1Var = c1808b.f21950c;
            C18061 c18061 = new C18061(c1808b, null);
            this.f21927a = 1;
            if (wfb.m23905G(c18061, nn1Var, this) == coroutineSingletons) {
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
