package com.lingq.core.data.repository;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageStatsRepositoryImpl", m4291f = "LanguageStatsRepositoryImpl.kt", m4292l = {106, 108}, m4293m = "fetchLanguageStats", m4294v = 2)
final class LanguageStatsRepositoryImpl$fetchLanguageStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15285a;

    /* JADX INFO: renamed from: b */
    public LanguageProgressPeriod f15286b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15287c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1294j f15288d;

    /* JADX INFO: renamed from: e */
    public int f15289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsRepositoryImpl$fetchLanguageStats$1(C1294j c1294j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15288d = c1294j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15287c = obj;
        this.f15289e |= Integer.MIN_VALUE;
        return this.f15288d.m7230d(null, null, this);
    }
}
