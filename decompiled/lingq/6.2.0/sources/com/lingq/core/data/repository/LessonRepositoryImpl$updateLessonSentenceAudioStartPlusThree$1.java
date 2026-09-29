package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {2000, 2002}, m4293m = "updateLessonSentenceAudioStartPlusThree", m4294v = 2)
final class LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15634a;

    /* JADX INFO: renamed from: b */
    public int f15635b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15636c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15637d;

    /* JADX INFO: renamed from: e */
    public int f15638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonSentenceAudioStartPlusThree$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15637d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15636c = obj;
        this.f15638e |= Integer.MIN_VALUE;
        return this.f15637d.m7287l0(0, 0, this);
    }
}
