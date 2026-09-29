package com.lingq.feature.review.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.domain.GetWordTagsUseCase", m4291f = "GetWordTagsUseCase.kt", m4292l = {10}, m4293m = "invoke", m4294v = 2)
final class GetWordTagsUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2755a f32417b;

    /* JADX INFO: renamed from: c */
    public int f32418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWordTagsUseCase$invoke$1(C2755a c2755a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32417b = c2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32416a = obj;
        this.f32418c |= Integer.MIN_VALUE;
        return this.f32417b.m9599f(null, null, this);
    }
}
