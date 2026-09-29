package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLesson;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {2190, 2193, 2196}, m4293m = "generateTts", m4294v = 2)
final class LessonRepositoryImpl$generateTts$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultLesson f15401a;

    /* JADX INFO: renamed from: b */
    public int f15402b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15403c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15404d;

    /* JADX INFO: renamed from: e */
    public int f15405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$generateTts$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15404d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15403c = obj;
        this.f15405e |= Integer.MIN_VALUE;
        return this.f15404d.m7243A(0, null, null, null, this);
    }
}
