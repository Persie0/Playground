package com.lingq.feature.vocabulary.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.domain.GetVocabularyTotalPagesUseCase", m4291f = "GetVocabularyTotalPagesUseCase.kt", m4292l = {25, 28, 34}, m4293m = "invoke", m4294v = 2)
final class GetVocabularyTotalPagesUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f33563a;

    /* JADX INFO: renamed from: b */
    public int f33564b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33565c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2827c f33566d;

    /* JADX INFO: renamed from: e */
    public int f33567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVocabularyTotalPagesUseCase$invoke$1(C2827c c2827c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33566d = c2827c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33565c = obj;
        this.f33567e |= Integer.MIN_VALUE;
        return this.f33566d.m9751a(null, null, null, null, 0, this);
    }
}
