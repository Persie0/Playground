package com.lingq.core.player.service;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.SystemClock;
import android.support.v4.media.session.C0030d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bc7;
import p000.c32;
import p000.fa4;
import p000.fc7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.service.PlayerService$onCreate$1$1$1$1", m4291f = "PlayerService.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerService$onCreate$1$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayerService f22003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fc7 f22004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerService$onCreate$1$1$1$1(PlayerService playerService, fc7 fc7Var, Continuation continuation) {
        super(2, continuation);
        this.f22003a = playerService;
        this.f22004b = fc7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerService$onCreate$1$1$1$1(this.f22003a, this.f22004b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PlayerService$onCreate$1$1$1$1 playerService$onCreate$1$1$1$1 = (PlayerService$onCreate$1$1$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playerService$onCreate$1$1$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        fc7 fc7Var = this.f22004b;
        boolean z = fc7Var.f38849a;
        int i = fc7Var.f38850b;
        long j = fc7Var.f38851c;
        bc7 bc7Var = PlayerService.Companion;
        PlayerService playerService = this.f22003a;
        if (i == 3 && z) {
            playerService.f21987T = 3;
            C0030d c0030d = playerService.f21977J;
            if (c0030d == null) {
                fa4.m11636J("stateBuilder");
                throw null;
            }
            float f = playerService.m8471c().f21956i.m19809a().f486a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c0030d.f991b = 3;
            c0030d.f992c = j;
            c0030d.f995f = jElapsedRealtime;
            c0030d.f993d = f;
            playerService.m8474f();
        } else if (i == 3) {
            playerService.f21987T = 3;
            C0030d c0030d2 = playerService.f21977J;
            if (c0030d2 == null) {
                fa4.m11636J("stateBuilder");
                throw null;
            }
            float f2 = playerService.m8471c().f21956i.m19809a().f486a;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            c0030d2.f991b = 2;
            c0030d2.f992c = j;
            c0030d2.f995f = jElapsedRealtime2;
            c0030d2.f993d = f2;
            playerService.m8474f();
        } else if (i == 4) {
            if (playerService.f21987T != 4) {
                C0030d c0030d3 = playerService.f21977J;
                if (c0030d3 == null) {
                    fa4.m11636J("stateBuilder");
                    throw null;
                }
                float f3 = playerService.m8471c().f21956i.m19809a().f486a;
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                c0030d3.f991b = 1;
                c0030d3.f992c = j;
                c0030d3.f995f = jElapsedRealtime3;
                c0030d3.f993d = f3;
                try {
                    playerService.unregisterReceiver(playerService.f21979L);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
                AudioManager audioManager = playerService.f21980M;
                if (audioManager != null) {
                    AudioFocusRequest audioFocusRequest = playerService.f21976I;
                    if (audioFocusRequest == null) {
                        fa4.m11636J("focusRequest");
                        throw null;
                    }
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
                playerService.m8474f();
            }
            playerService.f21987T = 4;
        }
        return xfa.f68157a;
    }
}
