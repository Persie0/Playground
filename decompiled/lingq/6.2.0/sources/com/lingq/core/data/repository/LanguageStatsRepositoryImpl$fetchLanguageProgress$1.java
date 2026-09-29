package com.lingq.core.data.repository;

import com.lingq.core.domain.model.language.LanguageProgressInterval;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageStatsRepositoryImpl", m4291f = "LanguageStatsRepositoryImpl.kt", m4292l = {87, 89}, m4293m = "fetchLanguageProgress", m4294v = 2)
final class LanguageStatsRepositoryImpl$fetchLanguageProgress$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15271a;

    /* JADX INFO: renamed from: b */
    public LanguageProgressInterval f15272b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15273c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1294j f15274d;

    /* JADX INFO: renamed from: e */
    public int f15275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsRepositoryImpl$fetchLanguageProgress$1(C1294j c1294j, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15274d = c1294j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15273c = obj;
        this.f15275e |= Integer.MIN_VALUE;
        return this.f15274d.m7228b(null, null, this);
    }
}
