package com.lingq.feature.reader.old;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel", m4291f = "ReaderViewModel.kt", m4292l = {2152}, m4293m = "isLessonDownloaded", m4294v = 2)
final class ReaderViewModel$isLessonDownloaded$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f28975a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28976b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f28977c;

    /* JADX INFO: renamed from: d */
    public int f28978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$isLessonDownloaded$1(C2412n c2412n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28977c = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28976b = obj;
        this.f28978d |= Integer.MIN_VALUE;
        return C2412n.m9315X2(this.f28977c, 0, this);
    }
}
