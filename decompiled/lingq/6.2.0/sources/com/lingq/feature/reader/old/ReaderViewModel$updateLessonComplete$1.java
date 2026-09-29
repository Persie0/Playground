package com.lingq.feature.reader.old;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel", m4291f = "ReaderViewModel.kt", m4292l = {1680, 1691, 1692}, m4293m = "updateLessonComplete", m4294v = 2)
final class ReaderViewModel$updateLessonComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29151b;

    /* JADX INFO: renamed from: c */
    public int f29152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$updateLessonComplete$1(C2412n c2412n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29151b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29150a = obj;
        this.f29152c |= Integer.MIN_VALUE;
        return C2412n.m9318a3(this.f29151b, this);
    }
}
