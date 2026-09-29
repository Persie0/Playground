package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {305, 307}, m4293m = "updateRepetitionLingqs", m4294v = 2)
final class LanguageRepositoryImpl$updateRepetitionLingqs$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15243a;

    /* JADX INFO: renamed from: b */
    public int f15244b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15245c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1293i f15246d;

    /* JADX INFO: renamed from: e */
    public int f15247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateRepetitionLingqs$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15246d = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15245c = obj;
        this.f15247e |= Integer.MIN_VALUE;
        return this.f15246d.m7222s(0, null, this);
    }
}
