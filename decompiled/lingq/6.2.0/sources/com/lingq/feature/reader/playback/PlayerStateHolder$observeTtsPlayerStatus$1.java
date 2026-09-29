package com.lingq.feature.reader.playback;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ada;
import p000.c32;
import p000.jy7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$observeTtsPlayerStatus$1", m4291f = "PlayerStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$observeTtsPlayerStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2465a f29729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$observeTtsPlayerStatus$1(C2465a c2465a, Continuation continuation) {
        super(2, continuation);
        this.f29729b = c2465a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlayerStateHolder$observeTtsPlayerStatus$1 playerStateHolder$observeTtsPlayerStatus$1 = new PlayerStateHolder$observeTtsPlayerStatus$1(this.f29729b, continuation);
        playerStateHolder$observeTtsPlayerStatus$1.f29728a = obj;
        return playerStateHolder$observeTtsPlayerStatus$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PlayerStateHolder$observeTtsPlayerStatus$1 playerStateHolder$observeTtsPlayerStatus$1 = (PlayerStateHolder$observeTtsPlayerStatus$1) create((ada) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playerStateHolder$observeTtsPlayerStatus$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        jy7 jy7VarM14750a;
        ada adaVar = (ada) this.f29728a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f29729b.f29782p;
        do {
            value = c3244l.getValue();
            jy7VarM14750a = (jy7) value;
            if (adaVar.f524c) {
                jy7VarM14750a = jy7.m14750a(jy7VarM14750a, false, false, 0L, 0L, 0.0f, null, false, false, adaVar.f523b, adaVar.f525d, false, null, false, false, null, null, 64767);
            }
        } while (!c3244l.m15570h(value, jy7VarM14750a));
        return xfa.f68157a;
    }
}
