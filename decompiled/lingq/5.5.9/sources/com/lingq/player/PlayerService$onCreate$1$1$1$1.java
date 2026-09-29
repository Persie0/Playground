package com.lingq.player;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sh.C9015k;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.player.PlayerService$onCreate$1$1$1$1", m19206f = "PlayerService.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class PlayerService$onCreate$1$1$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ PlayerService f17715e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9015k f17716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerService$onCreate$1$1$1$1(PlayerService playerService, C9015k c9015k, InterfaceC9968c<? super PlayerService$onCreate$1$1$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17715e = playerService;
        this.f17716f = c9015k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlayerService$onCreate$1$1$1$1(this.f17715e, this.f17716f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlayerService$onCreate$1$1$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        C9015k c9015k = this.f17716f;
        boolean z10 = c9015k.f47241a;
        MediaSessionCompat mediaSessionCompat = PlayerService.f17687S;
        PlayerService playerService = this.f17715e;
        playerService.getClass();
        int i10 = c9015k.f47242b;
        long j10 = c9015k.f47243c;
        if (i10 == 3 && z10) {
            playerService.f17697Q = 3;
            PlaybackStateCompat.C0161d c0161d = playerService.f17707l;
            if (c0161d == null) {
                C5207g.m11117l("stateBuilder");
                throw null;
            }
            PlayerController playerControllerM9427b = playerService.m9427b();
            float f3 = playerControllerM9427b.f17624P.get(playerControllerM9427b.f17625Q).f47230a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c0161d.f418b = 3;
            c0161d.f419c = j10;
            c0161d.f422f = jElapsedRealtime;
            c0161d.f420d = f3;
            playerService.m9430f();
        } else if (i10 == 3) {
            playerService.f17697Q = 3;
            PlaybackStateCompat.C0161d c0161d2 = playerService.f17707l;
            if (c0161d2 == null) {
                C5207g.m11117l("stateBuilder");
                throw null;
            }
            PlayerController playerControllerM9427b2 = playerService.m9427b();
            float f10 = playerControllerM9427b2.f17624P.get(playerControllerM9427b2.f17625Q).f47230a;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            c0161d2.f418b = 2;
            c0161d2.f419c = j10;
            c0161d2.f422f = jElapsedRealtime2;
            c0161d2.f420d = f10;
            playerService.m9430f();
        } else if (i10 == 4) {
            if (playerService.f17697Q != 4) {
                PlaybackStateCompat.C0161d c0161d3 = playerService.f17707l;
                if (c0161d3 == null) {
                    C5207g.m11117l("stateBuilder");
                    throw null;
                }
                PlayerController playerControllerM9427b3 = playerService.m9427b();
                float f11 = playerControllerM9427b3.f17624P.get(playerControllerM9427b3.f17625Q).f47230a;
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                c0161d3.f418b = 1;
                c0161d3.f419c = j10;
                c0161d3.f422f = jElapsedRealtime3;
                c0161d3.f420d = f11;
                try {
                    playerService.unregisterReceiver(playerService.f17689I);
                } catch (IllegalArgumentException e10) {
                    e10.printStackTrace();
                }
                AudioManager audioManager = playerService.f17690J;
                if (audioManager != null) {
                    AudioFocusRequest audioFocusRequest = playerService.f17706k;
                    if (audioFocusRequest == null) {
                        C5207g.m11117l("focusRequest");
                        throw null;
                    }
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
                playerService.m9430f();
            }
            playerService.f17697Q = 4;
        }
        return C9072e.f47360a;
    }
}
