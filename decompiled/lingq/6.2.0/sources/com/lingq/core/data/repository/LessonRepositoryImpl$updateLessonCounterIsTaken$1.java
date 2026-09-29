package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1832, 1835}, m4293m = "updateLessonCounterIsTaken", m4294v = 2)
final class LessonRepositoryImpl$updateLessonCounterIsTaken$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15594a;

    /* JADX INFO: renamed from: b */
    public boolean f15595b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15596c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1295k f15597d;

    /* JADX INFO: renamed from: e */
    public int f15598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateLessonCounterIsTaken$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15597d = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15596c = obj;
        this.f15598e |= Integer.MIN_VALUE;
        return this.f15597d.m7273e0(0, false, this);
    }
}
