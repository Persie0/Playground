package com.lingq.feature.collections.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.domain.GetCollectionLessonInfoUseCase", m4291f = "GetCollectionLessonInfoUseCase.kt", m4292l = {13, 13}, m4293m = "invoke", m4294v = 2)
final class GetCollectionLessonInfoUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f25626a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2035a f25628c;

    /* JADX INFO: renamed from: d */
    public int f25629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCollectionLessonInfoUseCase$invoke$1(C2035a c2035a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25628c = c2035a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25627b = obj;
        this.f25629d |= Integer.MIN_VALUE;
        return this.f25628c.m8956b(0, this);
    }
}
