package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageStatsRepositoryImpl", m4291f = "LanguageStatsRepositoryImpl.kt", m4292l = {129, 131}, m4293m = "fetchStudyStats", m4294v = 2)
final class LanguageStatsRepositoryImpl$fetchStudyStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15300a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15301b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1294j f15302c;

    /* JADX INFO: renamed from: d */
    public int f15303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsRepositoryImpl$fetchStudyStats$1(C1294j c1294j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15302c = c1294j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15301b = obj;
        this.f15303d |= Integer.MIN_VALUE;
        return this.f15302c.m7233g(null, this);
    }
}
