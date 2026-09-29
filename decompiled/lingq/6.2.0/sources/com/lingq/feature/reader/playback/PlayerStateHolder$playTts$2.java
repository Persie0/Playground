package com.lingq.feature.reader.playback;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.sca;
import p000.un1;
import p000.vj6;
import p000.w65;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$playTts$2", m4291f = "PlayerStateHolder.kt", m4292l = {547}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$playTts$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29740a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2465a f29741b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w65 f29742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$playTts$2(C2465a c2465a, w65 w65Var, Continuation continuation) {
        super(2, continuation);
        this.f29741b = c2465a;
        this.f29742c = w65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerStateHolder$playTts$2(this.f29741b, this.f29742c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerStateHolder$playTts$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29740a;
        C2465a c2465a = this.f29741b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vj6 vj6Var = c2465a.f29778l;
            String str = c2465a.f29787u;
            this.f29740a = 1;
            obj = vj6Var.m23348x(str, this.f29742c);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        sca.m21224J0(c2465a.f29768b, (String) obj, false, 2);
        return xfa.f68157a;
    }
}
