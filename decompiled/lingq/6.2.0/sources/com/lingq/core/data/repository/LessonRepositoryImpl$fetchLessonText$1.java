package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.h25;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {592, 594, 596, 597, 608, 629}, m4293m = "fetchLessonText", m4294v = 2)
final class LessonRepositoryImpl$fetchLessonText$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15366a;

    /* JADX INFO: renamed from: b */
    public h25 f15367b;

    /* JADX INFO: renamed from: c */
    public int f15368c;

    /* JADX INFO: renamed from: d */
    public boolean f15369d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15370e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15371f;

    /* JADX INFO: renamed from: g */
    public int f15372g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$fetchLessonText$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15371f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15370e = obj;
        this.f15372g |= Integer.MIN_VALUE;
        return this.f15371f.m7302v(null, 0, false, this);
    }
}
