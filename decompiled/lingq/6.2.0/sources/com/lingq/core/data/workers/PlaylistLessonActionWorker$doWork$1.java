package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.PlaylistLessonActionWorker", m4291f = "PlaylistLessonActionWorker.kt", m4292l = {33}, m4293m = "doWork", m4294v = 2)
final class PlaylistLessonActionWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16786a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlaylistLessonActionWorker f16787b;

    /* JADX INFO: renamed from: c */
    public int f16788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistLessonActionWorker$doWork$1(PlaylistLessonActionWorker playlistLessonActionWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16787b = playlistLessonActionWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16786a = obj;
        this.f16788c |= Integer.MIN_VALUE;
        return this.f16787b.mo2213d(this);
    }
}
