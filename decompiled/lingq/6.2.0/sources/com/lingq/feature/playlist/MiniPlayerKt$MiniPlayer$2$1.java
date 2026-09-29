package com.lingq.feature.playlist;

import com.lingq.core.player.data.PlayerType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.MiniPlayerKt$MiniPlayer$2$1", m4291f = "MiniPlayer.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class MiniPlayerKt$MiniPlayer$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayerType f27587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f27588b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerKt$MiniPlayer$2$1(PlayerType playerType, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f27587a = playerType;
        this.f27588b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MiniPlayerKt$MiniPlayer$2$1(this.f27587a, this.f27588b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        MiniPlayerKt$MiniPlayer$2$1 miniPlayerKt$MiniPlayer$2$1 = (MiniPlayerKt$MiniPlayer$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        miniPlayerKt$MiniPlayer$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f27587a == PlayerType.Audio) {
            this.f27588b.setValue(null);
        }
        return xfa.f68157a;
    }
}
