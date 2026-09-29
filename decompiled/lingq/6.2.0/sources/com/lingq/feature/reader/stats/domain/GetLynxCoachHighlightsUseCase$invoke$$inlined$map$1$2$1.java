package com.lingq.feature.reader.stats.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3475pw;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.domain.GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2", m4291f = "GetLynxCoachHighlightsUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30759a;

    /* JADX INFO: renamed from: b */
    public int f30760b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3475pw f30761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLynxCoachHighlightsUseCase$invoke$$inlined$map$1$2$1(C3475pw c3475pw, Continuation continuation) {
        super(continuation);
        this.f30761c = c3475pw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30759a = obj;
        this.f30760b |= Integer.MIN_VALUE;
        return this.f30761c.emit(null, this);
    }
}
