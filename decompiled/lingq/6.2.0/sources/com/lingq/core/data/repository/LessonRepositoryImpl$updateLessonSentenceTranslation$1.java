package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1706, 1715, 1717, 1729, 1731}, m4293m = "updateLessonSentenceTranslation", m4294v = 2)
final class LessonRepositoryImpl$updateLessonSentenceTranslation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15646a;

    /* JADX INFO: renamed from: b */
    public String f15647b;

    /* JADX INFO: renamed from: c */
    public int f15648c;

    /* JADX INFO: renamed from: d */
    public int f15649d;

    /* JADX INFO: renamed from: e */
    public boolean f15650e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f15651f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1295k f15652g;

    /* JADX INFO: renamed from: h */
    public int f15653h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonSentenceTranslation$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15652g = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15651f = obj;
        this.f15653h |= Integer.MIN_VALUE;
        return this.f15652g.m7291n0(0, 0, null, null, false, this);
    }
}
