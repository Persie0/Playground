package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {659, 661}, m4293m = "fetchLessonWordsCards", m4294v = 2)
final class LessonRepositoryImpl$fetchLessonWordsCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15373a;

    /* JADX INFO: renamed from: b */
    public int f15374b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15375c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15376d;

    /* JADX INFO: renamed from: e */
    public int f15377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLessonWordsCards$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15376d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15375c = obj;
        this.f15377e |= Integer.MIN_VALUE;
        return this.f15376d.m7303w(0, null, this);
    }
}
