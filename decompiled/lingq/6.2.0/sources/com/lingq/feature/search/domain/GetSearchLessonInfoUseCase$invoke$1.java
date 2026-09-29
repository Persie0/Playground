package com.lingq.feature.search.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.domain.GetSearchLessonInfoUseCase", m4291f = "GetSearchLessonInfoUseCase.kt", m4292l = {13, 13}, m4293m = "invoke", m4294v = 2)
final class GetSearchLessonInfoUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f32821a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2765a f32823c;

    /* JADX INFO: renamed from: d */
    public int f32824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchLessonInfoUseCase$invoke$1(C2765a c2765a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32823c = c2765a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32822b = obj;
        this.f32824d |= Integer.MIN_VALUE;
        return this.f32823c.m9673a(0, this);
    }
}
