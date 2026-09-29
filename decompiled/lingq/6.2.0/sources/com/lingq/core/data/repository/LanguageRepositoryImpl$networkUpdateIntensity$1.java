package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {213, 215, 219}, m4293m = "networkUpdateIntensity", m4294v = 2)
final class LanguageRepositoryImpl$networkUpdateIntensity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15180a;

    /* JADX INFO: renamed from: b */
    public String f15181b;

    /* JADX INFO: renamed from: c */
    public int f15182c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15183d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1293i f15184e;

    /* JADX INFO: renamed from: f */
    public int f15185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateIntensity$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15184e = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15183d = obj;
        this.f15185f |= Integer.MIN_VALUE;
        return this.f15184e.m7209f(null, null, this);
    }
}
