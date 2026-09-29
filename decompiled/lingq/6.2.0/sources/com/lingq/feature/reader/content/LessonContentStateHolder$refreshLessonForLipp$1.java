package com.lingq.feature.reader.content;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.LessonContentStateHolder", m4291f = "LessonContentStateHolder.kt", m4292l = {306}, m4293m = "refreshLessonForLipp", m4294v = 2)
final class LessonContentStateHolder$refreshLessonForLipp$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f27901a;

    /* JADX INFO: renamed from: b */
    public int f27902b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27903c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2260a f27904d;

    /* JADX INFO: renamed from: e */
    public int f27905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonContentStateHolder$refreshLessonForLipp$1(C2260a c2260a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f27904d = c2260a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27903c = obj;
        this.f27905e |= Integer.MIN_VALUE;
        return C2260a.m9248a(this.f27904d, null, 0, this);
    }
}
