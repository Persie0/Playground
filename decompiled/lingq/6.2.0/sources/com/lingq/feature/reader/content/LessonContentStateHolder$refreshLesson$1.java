package com.lingq.feature.reader.content;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder", m4291f = "LessonContentStateHolder.kt", m4292l = {363}, m4293m = "refreshLesson", m4294v = 2)
final class LessonContentStateHolder$refreshLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27894a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2260a f27895b;

    /* JADX INFO: renamed from: c */
    public int f27896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$refreshLesson$1(C2260a c2260a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27895b = c2260a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27894a = obj;
        this.f27896c |= Integer.MIN_VALUE;
        return this.f27895b.m9254g(0, null, this);
    }
}
