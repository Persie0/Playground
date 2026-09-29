package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonBookmark;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel", m4291f = "ReaderViewModel.kt", m4292l = {1547, 1552, 1554, 1556, 1558, 1562, 1564}, m4293m = "setupBookmark", m4294v = 2)
final class ReaderViewModel$setupBookmark$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public LessonBookmark f29045a;

    /* JADX INFO: renamed from: b */
    public String f29046b;

    /* JADX INFO: renamed from: c */
    public LessonBookmark f29047c;

    /* JADX INFO: renamed from: d */
    public int f29048d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f29049e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2412n f29050f;

    /* JADX INFO: renamed from: g */
    public int f29051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$setupBookmark$1(C2412n c2412n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f29050f = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29049e = obj;
        this.f29051g |= Integer.MIN_VALUE;
        return this.f29050f.m9337q3(null, this);
    }
}
