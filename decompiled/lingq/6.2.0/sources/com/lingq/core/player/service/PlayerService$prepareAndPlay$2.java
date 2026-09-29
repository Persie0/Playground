package com.lingq.core.player.service;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.service.PlayerService$prepareAndPlay$2", m4291f = "PlayerService.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerService$prepareAndPlay$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayerService f22014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f22015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerService$prepareAndPlay$2(PlayerService playerService, int i, Continuation continuation) {
        super(2, continuation);
        this.f22014a = playerService;
        this.f22015b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerService$prepareAndPlay$2(this.f22014a, this.f22015b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PlayerService$prepareAndPlay$2 playerService$prepareAndPlay$2 = (PlayerService$prepareAndPlay$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playerService$prepareAndPlay$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f22014a.m8471c().m8446I(this.f22015b, true);
        return xfa.f68157a;
    }
}
