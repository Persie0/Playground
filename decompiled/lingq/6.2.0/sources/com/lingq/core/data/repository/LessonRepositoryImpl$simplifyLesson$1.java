package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {2075, 2077, 2084}, m4293m = "simplifyLesson", m4294v = 2)
final class LessonRepositoryImpl$simplifyLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15492a;

    /* JADX INFO: renamed from: b */
    public int f15493b;

    /* JADX INFO: renamed from: c */
    public boolean f15494c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15495d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1295k f15496e;

    /* JADX INFO: renamed from: f */
    public int f15497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$simplifyLesson$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15496e = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15495d = obj;
        this.f15497f |= Integer.MIN_VALUE;
        return this.f15496e.m7262T(null, 0, false, this);
    }
}
