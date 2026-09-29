package com.lingq.core.player.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.ac7;
import p000.bbb;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.vab;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.video.YoutubePlayerKt$YoutubePlayer$2$1", m4291f = "YoutubePlayer.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class YoutubePlayerKt$YoutubePlayer$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ac7 f22183a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f22184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YoutubePlayerKt$YoutubePlayer$2$1(ac7 ac7Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f22183a = ac7Var;
        this.f22184b = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YoutubePlayerKt$YoutubePlayer$2$1(this.f22183a, this.f22184b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        YoutubePlayerKt$YoutubePlayer$2$1 youtubePlayerKt$YoutubePlayer$2$1 = (YoutubePlayerKt$YoutubePlayer$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        youtubePlayerKt$YoutubePlayer$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        vab vabVar = (vab) this.f22184b.getValue();
        if (vabVar != null) {
            ((bbb) vabVar).m3597h(AbstractC1824e.m8505d(this.f22183a));
        }
        return xfa.f68157a;
    }
}
