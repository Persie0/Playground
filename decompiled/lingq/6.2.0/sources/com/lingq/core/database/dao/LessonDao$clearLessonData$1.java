package com.lingq.core.database.dao;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.LessonDao", m4291f = "LessonDao.kt", m4292l = {282, 283, 284}, m4293m = "clearLessonData", m4294v = 2)
final class LessonDao$clearLessonData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f16966a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16967b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1320h f16968c;

    /* JADX INFO: renamed from: d */
    public int f16969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDao$clearLessonData$1(AbstractC1320h abstractC1320h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16968c = abstractC1320h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16967b = obj;
        this.f16969d |= Integer.MIN_VALUE;
        return this.f16968c.m7499y0(0, this);
    }
}
