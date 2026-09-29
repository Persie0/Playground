package com.lingq.core.player;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.hc7;
import p000.i84;
import p000.jw2;
import p000.m83;
import p000.un1;
import p000.xfa;
import p000.yz0;
import p000.z91;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$playerPooling$1", m4291f = "PlayerController.kt", m4292l = {287}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$playerPooling$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21920b;

    /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$playerPooling$1$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$playerPooling$1$1", m4291f = "PlayerController.kt", m4292l = {286}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18041 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f21921a;

        public C18041() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18041(2, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18041) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f21921a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f21921a = 1;
                if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$playerPooling$1$2 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$playerPooling$1$2", m4291f = "PlayerController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18052 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1808b f21922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18052(C1808b c1808b, Continuation continuation) {
            super(2, continuation);
            this.f21922a = c1808b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18052(this.f21922a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18052 c18052 = (C18052) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18052.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C1808b c1808b = this.f21922a;
            jw2 jw2Var = c1808b.f21960m;
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            int iM14714j = (int) jw2Var.m14714j();
            if (iM14714j > 0) {
                C3244l c3244l = c1808b.f21945C;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, null, null, 0L, iM14714j, 0L, false, false, null, null, false, null, null, 8175)));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerImpl$playerPooling$1(C1808b c1808b, Continuation continuation) {
        super(2, continuation);
        this.f21920b = c1808b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$playerPooling$1(this.f21920b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$playerPooling$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21919a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            m83 m83Var = new m83(new yz0(new z91(new i84(1, Integer.MAX_VALUE, 1), 0), 3), new C18041(), 2);
            C18052 c18052 = new C18052(this.f21920b, null);
            this.f21919a = 1;
            if (AbstractC3224d.m15529h(m83Var, c18052, this) == coroutineSingletons) {
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
