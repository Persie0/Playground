package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.PlaylistAddCourseWorker", m4291f = "PlaylistAddCourseWorker.kt", m4292l = {25}, m4293m = "doWork", m4294v = 2)
final class PlaylistAddCourseWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16778a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlaylistAddCourseWorker f16779b;

    /* JADX INFO: renamed from: c */
    public int f16780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistAddCourseWorker$doWork$1(PlaylistAddCourseWorker playlistAddCourseWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16779b = playlistAddCourseWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16778a = obj;
        this.f16780c |= Integer.MIN_VALUE;
        return this.f16779b.mo2213d(this);
    }
}
