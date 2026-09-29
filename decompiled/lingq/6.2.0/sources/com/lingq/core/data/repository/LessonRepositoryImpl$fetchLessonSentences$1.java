package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {859, 864, 869, 871}, m4293m = "fetchLessonSentences", m4294v = 2)
final class LessonRepositoryImpl$fetchLessonSentences$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15353a;

    /* JADX INFO: renamed from: b */
    public int f15354b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15355c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15356d;

    /* JADX INFO: renamed from: e */
    public int f15357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLessonSentences$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15356d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15355c = obj;
        this.f15357e |= Integer.MIN_VALUE;
        return this.f15356d.m7299s(0, null, this);
    }
}
