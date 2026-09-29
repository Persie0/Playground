package com.lingq.feature.reader.stats;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel", m4291f = "LessonCompleteViewModel.kt", m4292l = {578}, m4293m = "isCoachMessageStale", m4294v = 2)
final class LessonCompleteViewModel$isCoachMessageStale$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30570b;

    /* JADX INFO: renamed from: c */
    public int f30571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$isCoachMessageStale$1(C2535j c2535j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30570b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30569a = obj;
        this.f30571c |= Integer.MIN_VALUE;
        return this.f30570b.m9462X2(0, this);
    }
}
