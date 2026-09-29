package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLesson;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {2093, 2095, 2110}, m4293m = "syncLessonSimplify", m4294v = 2)
final class LessonRepositoryImpl$syncLessonSimplify$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15552a;

    /* JADX INFO: renamed from: b */
    public ResultLesson f15553b;

    /* JADX INFO: renamed from: c */
    public int f15554c;

    /* JADX INFO: renamed from: d */
    public boolean f15555d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15556e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1295k f15557f;

    /* JADX INFO: renamed from: g */
    public int f15558g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$syncLessonSimplify$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15557f = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15556e = obj;
        this.f15558g |= Integer.MIN_VALUE;
        return this.f15557f.m7266X(null, 0, false, this);
    }
}
