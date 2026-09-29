package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {2044, 2045, 2047}, m4293m = "buyLesson", m4294v = 2)
final class LessonRepositoryImpl$buyLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15315a;

    /* JADX INFO: renamed from: b */
    public int f15316b;

    /* JADX INFO: renamed from: c */
    public boolean f15317c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15318d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1295k f15319e;

    /* JADX INFO: renamed from: f */
    public int f15320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$buyLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15319e = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15318d = obj;
        this.f15320f |= Integer.MIN_VALUE;
        return this.f15319e.m7274f(0, 0, false, this);
    }
}
