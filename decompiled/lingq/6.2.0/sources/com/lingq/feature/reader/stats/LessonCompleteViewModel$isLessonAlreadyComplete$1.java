package com.lingq.feature.reader.stats;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel", m4291f = "LessonCompleteViewModel.kt", m4292l = {585}, m4293m = "isLessonAlreadyComplete", m4294v = 2)
final class LessonCompleteViewModel$isLessonAlreadyComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30575a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30576b;

    /* JADX INFO: renamed from: c */
    public int f30577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$isLessonAlreadyComplete$1(C2535j c2535j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30576b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30575a = obj;
        this.f30577c |= Integer.MIN_VALUE;
        return this.f30576b.m9463Y2(this);
    }
}
