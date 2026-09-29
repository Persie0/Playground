package com.lingq.core.data.workers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.workers.AddPlaylistWorker", m4291f = "AddPlaylistWorker.kt", m4292l = {32}, m4293m = "doWork", m4294v = 2)
final class AddPlaylistWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AddPlaylistWorker f16590b;

    /* JADX INFO: renamed from: c */
    public int f16591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPlaylistWorker$doWork$1(AddPlaylistWorker addPlaylistWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16590b = addPlaylistWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16589a = obj;
        this.f16591c |= Integer.MIN_VALUE;
        return this.f16590b.mo2213d(this);
    }
}
