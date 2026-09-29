package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3473pu;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$archiveState$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$archiveState$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f27644a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f27645b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Playlist f27646c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        PlaylistViewModel$archiveState$1 playlistViewModel$archiveState$1 = new PlaylistViewModel$archiveState$1(4, (Continuation) obj4);
        playlistViewModel$archiveState$1.f27644a = zBooleanValue;
        playlistViewModel$archiveState$1.f27645b = zBooleanValue2;
        playlistViewModel$archiveState$1.f27646c = (Playlist) obj3;
        return playlistViewModel$archiveState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f27644a;
        boolean z2 = this.f27645b;
        Playlist playlist = this.f27646c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        boolean z3 = false;
        if (playlist != null && !playlist.f19557e) {
            z3 = true;
        }
        return new C3473pu(z, z2, z3);
    }
}
