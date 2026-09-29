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
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$start$2$1", m4291f = "PlayerController.kt", m4292l = {580}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$start$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tb7 f21932c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f21933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerImpl$start$2$1(C1808b c1808b, tb7 tb7Var, int i, Continuation continuation) {
        super(2, continuation);
        this.f21931b = c1808b;
        this.f21932c = tb7Var;
        this.f21933d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$start$2$1(this.f21931b, this.f21932c, this.f21933d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$start$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21930a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1385g c1385g = this.f21931b.f21955h;
            String str = this.f21932c.f62110j;
            this.f21930a = 1;
            if (c1385g.m7996a(str, this.f21933d, 0L, null, this) == coroutineSingletons) {
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
