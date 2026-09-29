package com.lingq.core.player;

import com.lingq.core.domain.lesson.C1385g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.tb7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$scheduledUpdate$1$2", m4291f = "PlayerController.kt", m4292l = {685}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$scheduledUpdate$1$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tb7 f21925c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f21926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerImpl$scheduledUpdate$1$2(C1808b c1808b, tb7 tb7Var, long j, Continuation continuation) {
        super(2, continuation);
        this.f21924b = c1808b;
        this.f21925c = tb7Var;
        this.f21926d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$scheduledUpdate$1$2(this.f21924b, this.f21925c, this.f21926d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$scheduledUpdate$1$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21923a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1385g c1385g = this.f21924b.f21955h;
            tb7 tb7Var = this.f21925c;
            String str = tb7Var.f62110j;
            int i2 = tb7Var.f62101a;
            this.f21923a = 1;
            if (c1385g.m7996a(str, i2, this.f21926d, null, this) == coroutineSingletons) {
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
