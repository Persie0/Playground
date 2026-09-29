package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1945, 1968}, m4293m = "updateLessonSentenceAudio", m4294v = 2)
final class LessonRepositoryImpl$updateLessonSentenceAudio$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15620a;

    /* JADX INFO: renamed from: b */
    public int f15621b;

    /* JADX INFO: renamed from: c */
    public int f15622c;

    /* JADX INFO: renamed from: d */
    public int f15623d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15624e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15625f;

    /* JADX INFO: renamed from: g */
    public int f15626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonSentenceAudio$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15625f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15624e = obj;
        this.f15626g |= Integer.MIN_VALUE;
        return this.f15625f.m7283j0(0, 0, 0, 0, this);
    }
}
