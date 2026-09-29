package com.lingq.feature.reader.settings;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.settings.ObserveGrammarGuideAvailabilityUseCase$invoke$$inlined$map$1$2", m4291f = "ObserveGrammarGuideAvailabilityUseCase.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class ObserveGrammarGuideAvailabilityUseCase$invoke$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30365a;

    /* JADX INFO: renamed from: b */
    public int f30366b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f30367c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveGrammarGuideAvailabilityUseCase$invoke$$inlined$map$1$2$1(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f30367c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30365a = obj;
        this.f30366b |= Integer.MIN_VALUE;
        return this.f30367c.emit(null, this);
    }
}
