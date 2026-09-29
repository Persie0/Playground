package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {903, 908}, m4293m = "syncLessonSentences", m4294v = 2)
final class LessonRepositoryImpl$syncLessonSentences$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15548a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15549b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1295k f15550c;

    /* JADX INFO: renamed from: d */
    public int f15551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$syncLessonSentences$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15550c = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15549b = obj;
        this.f15551d |= Integer.MIN_VALUE;
        return this.f15550c.m7265W(0, null, this);
    }
}
