package com.lingq.core.datastore;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ij2;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.datastore.DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2", m4291f = "DownloadProgressStore.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17505a;

    /* JADX INFO: renamed from: b */
    public int f17506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ij2 f17507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadProgressStoreImpl$observeProgress$$inlined$map$1$2$1(ij2 ij2Var, Continuation continuation) {
        super(continuation);
        this.f17507c = ij2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17505a = obj;
        this.f17506b |= Integer.MIN_VALUE;
        return this.f17507c.emit(null, this);
    }
}
