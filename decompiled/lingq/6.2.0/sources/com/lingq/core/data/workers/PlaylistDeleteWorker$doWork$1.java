package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.PlaylistDeleteWorker", m4291f = "PlaylistDeleteWorker.kt", m4292l = {28}, m4293m = "doWork", m4294v = 2)
final class PlaylistDeleteWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlaylistDeleteWorker f16783b;

    /* JADX INFO: renamed from: c */
    public int f16784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistDeleteWorker$doWork$1(PlaylistDeleteWorker playlistDeleteWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16783b = playlistDeleteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16782a = obj;
        this.f16784c |= Integer.MIN_VALUE;
        return this.f16783b.mo2213d(this);
    }
}
