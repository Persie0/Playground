package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {370, 371}, m4293m = "fetchLesson", m4294v = 2)
final class LessonRepositoryImpl$fetchLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15333a;

    /* JADX INFO: renamed from: b */
    public int f15334b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15335c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15336d;

    /* JADX INFO: renamed from: e */
    public int f15337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15336d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15335c = obj;
        this.f15337e |= Integer.MIN_VALUE;
        return this.f15336d.m7290n(0, null, this);
    }
}
