package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.PlaylistUpdateWorker", m4291f = "PlaylistUpdateWorker.kt", m4292l = {32}, m4293m = "doWork", m4294v = 2)
final class PlaylistUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16790a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlaylistUpdateWorker f16791b;

    /* JADX INFO: renamed from: c */
    public int f16792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistUpdateWorker$doWork$1(PlaylistUpdateWorker playlistUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16791b = playlistUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16790a = obj;
        this.f16792c |= Integer.MIN_VALUE;
        return this.f16791b.mo2213d(this);
    }
}
