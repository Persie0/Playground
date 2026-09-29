package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.c76;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {2751, 1566, 1578, 1579}, m4293m = "syncLessonComplete", m4294v = 2)
final class LessonRepositoryImpl$syncLessonComplete$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15538a;

    /* JADX INFO: renamed from: b */
    public int f15539b;

    /* JADX INFO: renamed from: c */
    public int f15540c;

    /* JADX INFO: renamed from: d */
    public String f15541d;

    /* JADX INFO: renamed from: e */
    public String f15542e;

    /* JADX INFO: renamed from: f */
    public c76 f15543f;

    /* JADX INFO: renamed from: g */
    public Object f15544g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f15545h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1295k f15546i;

    /* JADX INFO: renamed from: j */
    public int f15547j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$syncLessonComplete$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15546i = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15545h = obj;
        this.f15547j |= Integer.MIN_VALUE;
        return this.f15546i.m7264V(0, null, null, this);
    }
}
