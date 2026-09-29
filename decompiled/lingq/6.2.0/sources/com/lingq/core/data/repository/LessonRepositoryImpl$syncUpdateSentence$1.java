package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl", m4291f = "LessonRepositoryImpl.kt", m4292l = {1883, 1885}, m4293m = "syncUpdateSentence", m4294v = 2)
final class LessonRepositoryImpl$syncUpdateSentence$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15563a;

    /* JADX INFO: renamed from: b */
    public int f15564b;

    /* JADX INFO: renamed from: c */
    public String f15565c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15566d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1295k f15567e;

    /* JADX INFO: renamed from: f */
    public int f15568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$syncUpdateSentence$1(C1295k c1295k, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15567e = c1295k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15566d = obj;
        this.f15568f |= Integer.MIN_VALUE;
        return this.f15567e.m7268Z(0, 0, null, this);
    }
}
