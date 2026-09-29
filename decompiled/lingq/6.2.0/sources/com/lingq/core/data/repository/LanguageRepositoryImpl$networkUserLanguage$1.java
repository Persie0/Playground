package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {569, 572}, m4293m = "networkUserLanguage", m4294v = 2)
final class LanguageRepositoryImpl$networkUserLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15205a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1293i f15207c;

    /* JADX INFO: renamed from: d */
    public int f15208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUserLanguage$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15207c = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15206b = obj;
        this.f15208d |= Integer.MIN_VALUE;
        return this.f15207c.m7214k(0, this);
    }
}
