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
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$trackEnded$2", m4291f = "PlayerController.kt", m4292l = {1032}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$trackEnded$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tb7 f21936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerImpl$trackEnded$2(C1808b c1808b, tb7 tb7Var, Continuation continuation) {
        super(2, continuation);
        this.f21935b = c1808b;
        this.f21936c = tb7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$trackEnded$2(this.f21935b, this.f21936c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$trackEnded$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21934a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1385g c1385g = this.f21935b.f21955h;
            tb7 tb7Var = this.f21936c;
            String str = tb7Var.f62110j;
            int i2 = tb7Var.f62101a;
            this.f21934a = 1;
            if (c1385g.m7996a(str, i2, 0L, null, this) == coroutineSingletons) {
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
