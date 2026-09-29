package com.lingq.feature.reader.old;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel", m4291f = "ReaderViewModel.kt", m4292l = {1170, 1174}, m4293m = "fetchLessonParallel", m4294v = 2)
final class ReaderViewModel$fetchLessonParallel$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f28936a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28937b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f28938c;

    /* JADX INFO: renamed from: d */
    public int f28939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$fetchLessonParallel$1(C2412n c2412n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28938c = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28937b = obj;
        this.f28939d |= Integer.MIN_VALUE;
        return C2412n.m9313V2(this.f28938c, null, 0, this);
    }
}
