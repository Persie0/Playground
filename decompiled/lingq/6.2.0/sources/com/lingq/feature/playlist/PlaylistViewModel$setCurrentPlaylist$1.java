package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel", m4291f = "PlaylistViewModel.kt", m4292l = {591, 593, 597, 599}, m4293m = "setCurrentPlaylist", m4294v = 2)
final class PlaylistViewModel$setCurrentPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Playlist f27736a;

    /* JADX INFO: renamed from: b */
    public int f27737b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27738c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2255e f27739d;

    /* JADX INFO: renamed from: e */
    public int f27740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setCurrentPlaylist$1(C2255e c2255e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27739d = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27738c = obj;
        this.f27740e |= Integer.MIN_VALUE;
        return C2255e.m9235W2(this.f27739d, null, this);
    }
}
