package com.lingq.core.domain.vocabulary;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.vocabulary.GetSampleLingqsUseCase$invoke$lambda$0$0$$inlined$map$1$2", m4291f = "GetSampleLingqsUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetSampleLingqsUseCase$invoke$lambda$0$0$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20157a;

    /* JADX INFO: renamed from: b */
    public int f20158b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f20159c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSampleLingqsUseCase$invoke$lambda$0$0$$inlined$map$1$2$1(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f20159c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20157a = obj;
        this.f20158b |= Integer.MIN_VALUE;
        return this.f20159c.emit(null, this);
    }
}
