package com.lingq.feature.reader.content.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.content.domain.LessonTextProvider$observeLessonTextData$$inlined$map$1$2", m4291f = "LessonTextProvider.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class LessonTextProvider$observeLessonTextData$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27968a;

    /* JADX INFO: renamed from: b */
    public int f27969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f27970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonTextProvider$observeLessonTextData$$inlined$map$1$2$1(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f27970c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27968a = obj;
        this.f27969b |= Integer.MIN_VALUE;
        return this.f27970c.emit(null, this);
    }
}
