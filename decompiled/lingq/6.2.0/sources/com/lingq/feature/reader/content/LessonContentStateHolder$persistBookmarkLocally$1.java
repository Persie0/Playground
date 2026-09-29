package com.lingq.feature.reader.content;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder", m4291f = "LessonContentStateHolder.kt", m4292l = {489}, m4293m = "persistBookmarkLocally", m4294v = 2)
final class LessonContentStateHolder$persistBookmarkLocally$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2260a f27892b;

    /* JADX INFO: renamed from: c */
    public int f27893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$persistBookmarkLocally$1(C2260a c2260a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27892b = c2260a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27891a = obj;
        this.f27893c |= Integer.MIN_VALUE;
        return this.f27892b.m9253f(0, this);
    }
}
