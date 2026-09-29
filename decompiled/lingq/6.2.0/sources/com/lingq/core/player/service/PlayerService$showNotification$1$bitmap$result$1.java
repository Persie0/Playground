package com.lingq.core.player.service;

import android.content.Context;
import coil.C0855a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e04;
import p000.p58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.service.PlayerService$showNotification$1$bitmap$result$1", m4291f = "PlayerService.kt", m4292l = {542}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerService$showNotification$1$bitmap$result$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22022a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlayerService f22023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e04 f22024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerService$showNotification$1$bitmap$result$1(PlayerService playerService, e04 e04Var, Continuation continuation) {
        super(2, continuation);
        this.f22023b = playerService;
        this.f22024c = e04Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerService$showNotification$1$bitmap$result$1(this.f22023b, this.f22024c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerService$showNotification$1$bitmap$result$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22022a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        Context applicationContext = this.f22023b.getApplicationContext();
        applicationContext.getClass();
        C0855a c0855aM18903m = p58.m18903m(applicationContext);
        this.f22022a = 1;
        Object objM4952c = c0855aM18903m.m4952c(this.f22024c, this);
        return objM4952c == coroutineSingletons ? coroutineSingletons : objM4952c;
    }
}
