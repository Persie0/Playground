package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {316, 320}, m4293m = "networkUpdateRepetitionLingqs", m4294v = 2)
final class LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15192a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15193b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1293i f15194c;

    /* JADX INFO: renamed from: d */
    public int f15195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15194c = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15193b = obj;
        this.f15195d |= Integer.MIN_VALUE;
        return this.f15194c.m7211h(0, null, this);
    }
}
