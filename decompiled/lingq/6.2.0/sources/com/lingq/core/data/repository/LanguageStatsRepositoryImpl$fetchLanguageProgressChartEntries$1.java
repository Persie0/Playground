package com.lingq.core.data.repository;

import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageStatsRepositoryImpl", m4291f = "LanguageStatsRepositoryImpl.kt", m4292l = {204, 210, 211}, m4293m = "fetchLanguageProgressChartEntries", m4294v = 2)
final class LanguageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15276a;

    /* JADX INFO: renamed from: b */
    public LanguageProgressMetric f15277b;

    /* JADX INFO: renamed from: c */
    public LanguageProgressPeriod f15278c;

    /* JADX INFO: renamed from: d */
    public List f15279d;

    /* JADX INFO: renamed from: e */
    public ArrayList f15280e;

    /* JADX INFO: renamed from: f */
    public int f15281f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f15282g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1294j f15283h;

    /* JADX INFO: renamed from: i */
    public int f15284i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsRepositoryImpl$fetchLanguageProgressChartEntries$1(C1294j c1294j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15283h = c1294j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15282g = obj;
        this.f15284i |= Integer.MIN_VALUE;
        return this.f15283h.m7229c(null, null, null, this);
    }
}
