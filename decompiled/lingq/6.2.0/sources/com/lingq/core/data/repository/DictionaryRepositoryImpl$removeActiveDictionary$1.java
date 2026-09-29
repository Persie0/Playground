package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.DictionaryRepositoryImpl", m4291f = "DictionaryRepositoryImpl.kt", m4292l = {203}, m4293m = "removeActiveDictionary", m4294v = 2)
final class DictionaryRepositoryImpl$removeActiveDictionary$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f15139a;

    /* JADX INFO: renamed from: b */
    public String f15140b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15141c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1292h f15142d;

    /* JADX INFO: renamed from: e */
    public int f15143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$removeActiveDictionary$1(C1292h c1292h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15142d = c1292h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15141c = obj;
        this.f15143e |= Integer.MIN_VALUE;
        return this.f15142d.m7202h(0, null, this);
    }
}
