package com.lingq.core.player;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.player.data.PlayerState;
import com.lingq.core.player.data.PlayerType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.hc7;
import p000.nn1;
import p000.pg9;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$3", m4291f = "PlayerController.kt", m4292l = {1114}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21904a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21905b;

    /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$3$1 */
    @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$3$1", m4291f = "PlayerController.kt", m4292l = {271}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18021 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f21906a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f21907b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1808b f21908c;

        /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$3$1$1, reason: invalid class name */
        /* JADX INFO: loaded from: classes2.dex */
        @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$3$1$1", m4291f = "PlayerController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1808b f21909a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1808b c1808b, Continuation continuation) {
                super(2, continuation);
                this.f21909a = c1808b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f21909a, continuation);
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
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                AbstractC3193b.m15359b(obj);
                this.f21909a.m8451P();
                return xfa.f68157a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18021(C1808b c1808b, Continuation continuation) {
            super(2, continuation);
            this.f21908c = c1808b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18021 c18021 = new C18021(this.f21908c, continuation);
            c18021.f21907b = obj;
            return c18021;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18021) create((hc7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C1808b c1808b = this.f21908c;
            nn1 nn1Var = c1808b.f21950c;
            hc7 hc7Var = (hc7) this.f21907b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f21906a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                PlayerState playerState = hc7Var.f42174b;
                PlayerType playerType = hc7Var.f42173a;
                PlayerState playerState2 = PlayerState.Playing;
                if (playerState == playerState2 && playerType == PlayerType.Audio) {
                    pg9 pg9Var = c1808b.f21971x;
                    if (pg9Var != null) {
                        AbstractC1263a.m7046a(pg9Var);
                    }
                    c1808b.f21971x = wfb.m23926u(c1808b.f21949b, nn1Var, null, new PlayerControllerImpl$playerPooling$1(c1808b, null), 2);
                } else if (playerState == playerState2 && C1808b.m8438E(playerType)) {
                    pg9 pg9Var2 = c1808b.f21971x;
                    if (pg9Var2 != null) {
                        AbstractC1263a.m7046a(pg9Var2);
                    }
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(c1808b, null);
                    this.f21907b = null;
                    this.f21906a = 1;
                    if (wfb.m23905G(anonymousClass1, nn1Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    pg9 pg9Var3 = c1808b.f21971x;
                    if (pg9Var3 != null) {
                        AbstractC1263a.m7046a(pg9Var3);
                    }
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            c1808b.m8459X(c1808b.m8467g());
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerImpl$3(C1808b c1808b, Continuation continuation) {
        super(2, continuation);
        this.f21905b = c1808b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$3(this.f21905b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21904a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1808b c1808b = this.f21905b;
            C3244l c3244l = c1808b.f21945C;
            C18021 c18021 = new C18021(c1808b, null);
            c3244l.getClass();
            this.f21904a = 1;
            if (AbstractC3224d.m15529h(c3244l, c18021, this) == coroutineSingletons) {
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
