package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1688, 1690}, m4293m = "updateLessonSentence", m4294v = 2)
final class LessonRepositoryImpl$updateLessonSentence$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15614a;

    /* JADX INFO: renamed from: b */
    public int f15615b;

    /* JADX INFO: renamed from: c */
    public int f15616c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15617d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1295k f15618e;

    /* JADX INFO: renamed from: f */
    public int f15619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonSentence$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15618e = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15617d = obj;
        this.f15619f |= Integer.MIN_VALUE;
        return this.f15618e.m7281i0(0, 0, null, this);
    }
}
