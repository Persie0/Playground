package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {677, 686, 690, 692, 697}, m4293m = "downloadLesson", m4294v = 2)
final class LessonRepositoryImpl$downloadLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15321a;

    /* JADX INFO: renamed from: b */
    public int f15322b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15323c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15324d;

    /* JADX INFO: renamed from: e */
    public int f15325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$downloadLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15324d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15323c = obj;
        this.f15325e |= Integer.MIN_VALUE;
        return this.f15324d.m7286l(0, null, this);
    }
}
