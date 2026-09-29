package com.lingq.feature.reader.content.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.hm3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.domain.GetLessonPhrasesUseCase$invoke$$inlined$map$1$2", m4291f = "GetLessonPhrasesUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetLessonPhrasesUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27958a;

    /* JADX INFO: renamed from: b */
    public int f27959b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hm3 f27960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLessonPhrasesUseCase$invoke$$inlined$map$1$2$1(hm3 hm3Var, Continuation continuation) {
        super(continuation);
        this.f27960c = hm3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27958a = obj;
        this.f27959b |= Integer.MIN_VALUE;
        return this.f27960c.emit(null, this);
    }
}
