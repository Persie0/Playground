package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1042, 1054}, m4293m = "updateLessonBookmark", m4294v = 2)
final class LessonRepositoryImpl$updateLessonBookmark$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15579a;

    /* JADX INFO: renamed from: b */
    public String f15580b;

    /* JADX INFO: renamed from: c */
    public Integer f15581c;

    /* JADX INFO: renamed from: d */
    public int f15582d;

    /* JADX INFO: renamed from: e */
    public int f15583e;

    /* JADX INFO: renamed from: f */
    public int f15584f;

    /* JADX INFO: renamed from: g */
    public double f15585g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f15586h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1295k f15587i;

    /* JADX INFO: renamed from: j */
    public int f15588j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonBookmark$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15587i = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15586h = obj;
        this.f15588j |= Integer.MIN_VALUE;
        return this.f15587i.m7271c0(null, 0, 0, null, null, this);
    }
}
