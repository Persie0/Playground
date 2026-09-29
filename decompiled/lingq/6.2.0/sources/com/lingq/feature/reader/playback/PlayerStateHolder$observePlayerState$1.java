package com.lingq.feature.reader.playback;

import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerState;
import com.lingq.core.player.data.PlayerViewState;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.ac7;
import p000.c32;
import p000.hc7;
import p000.jy7;
import p000.tb7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$observePlayerState$1", m4291f = "PlayerStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$observePlayerState$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2465a f29725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$observePlayerState$1(C2465a c2465a, Continuation continuation) {
        super(2, continuation);
        this.f29725b = c2465a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlayerStateHolder$observePlayerState$1 playerStateHolder$observePlayerState$1 = new PlayerStateHolder$observePlayerState$1(this.f29725b, continuation);
        playerStateHolder$observePlayerState$1.f29724a = obj;
        return playerStateHolder$observePlayerState$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PlayerStateHolder$observePlayerState$1 playerStateHolder$observePlayerState$1 = (PlayerStateHolder$observePlayerState$1) create((hc7) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playerStateHolder$observePlayerState$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        long j;
        Object value2;
        C2465a c2465a = this.f29725b;
        C3244l c3244l = c2465a.f29782p;
        C1808b c1808b = c2465a.f29767a;
        hc7 hc7Var = (hc7) this.f29724a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        PlayerState playerState = hc7Var.f42174b;
        ac7 ac7Var = hc7Var.f42181i;
        int i = hc7Var.f42177e;
        boolean z = playerState == PlayerState.Playing;
        tb7 tb7VarM12625d = c1808b.f21961n.m12625d();
        if (tb7VarM12625d != null && tb7VarM12625d.f62101a == c2465a.f29786t) {
            do {
                value = c3244l.getValue();
                j = i;
            } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, z, false, j, hc7Var.f42176d, ac7Var.f486a, null, false, false, false, false, false, null, false, false, null, null, 65506)));
            if (z) {
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, jy7.m14750a((jy7) value2, false, true, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65533)));
                c1808b.m8466e0(PlayerViewState.Opened);
            }
            c2465a.m9367j(z, j, ac7Var.f486a);
        }
        return xfa.f68157a;
    }
}
