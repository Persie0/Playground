package com.lingq.feature.playlist;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel", m4291f = "PlaylistViewModel.kt", m4292l = {361}, m4293m = "setupAudioSources", m4294v = 2)
final class PlaylistViewModel$setupAudioSources$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f27757a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27758b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2255e f27759c;

    /* JADX INFO: renamed from: d */
    public int f27760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setupAudioSources$1(C2255e c2255e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27759c = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27758b = obj;
        this.f27760d |= Integer.MIN_VALUE;
        return C2255e.m9236X2(this.f27759c, null, this);
    }
}
