package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {755}, m4293m = "getLessonInfo", m4294v = 2)
final class LessonRepositoryImpl$getLessonInfo$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1295k f15420b;

    /* JADX INFO: renamed from: c */
    public int f15421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$getLessonInfo$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15420b = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15419a = obj;
        this.f15421c |= Integer.MIN_VALUE;
        return this.f15420b.m7245C(0, this);
    }
}
