package com.lingq.feature.reader.playback;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.jy7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$observeTtsAvailability$1", m4291f = "PlayerStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$observeTtsAvailability$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f29726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2465a f29727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$observeTtsAvailability$1(C2465a c2465a, Continuation continuation) {
        super(2, continuation);
        this.f29727b = c2465a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlayerStateHolder$observeTtsAvailability$1 playerStateHolder$observeTtsAvailability$1 = new PlayerStateHolder$observeTtsAvailability$1(this.f29727b, continuation);
        playerStateHolder$observeTtsAvailability$1.f29726a = ((Boolean) obj).booleanValue();
        return playerStateHolder$observeTtsAvailability$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        PlayerStateHolder$observeTtsAvailability$1 playerStateHolder$observeTtsAvailability$1 = (PlayerStateHolder$observeTtsAvailability$1) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playerStateHolder$observeTtsAvailability$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        boolean z = this.f29726a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f29727b.f29782p;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, z, false, false, false, null, false, false, null, null, 65407)));
        return xfa.f68157a;
    }
}
