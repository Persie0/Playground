package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.DictionaryRepositoryImpl", m4291f = "DictionaryRepositoryImpl.kt", m4292l = {209, 210}, m4293m = "fetchDictionaries", m4294v = 2)
final class DictionaryRepositoryImpl$fetchDictionaries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15135a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1292h f15137c;

    /* JADX INFO: renamed from: d */
    public int f15138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$fetchDictionaries$1(C1292h c1292h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15137c = c1292h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15136b = obj;
        this.f15138d |= Integer.MIN_VALUE;
        return this.f15137c.m7199e(null, this);
    }
}
