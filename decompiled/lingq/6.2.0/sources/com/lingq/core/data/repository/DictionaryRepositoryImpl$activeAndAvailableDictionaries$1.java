package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.DictionaryRepositoryImpl", m4291f = "DictionaryRepositoryImpl.kt", m4292l = {63, 64, 66, 68}, m4293m = "activeAndAvailableDictionaries", m4294v = 2)
final class DictionaryRepositoryImpl$activeAndAvailableDictionaries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15108a;

    /* JADX INFO: renamed from: b */
    public List f15109b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15110c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1292h f15111d;

    /* JADX INFO: renamed from: e */
    public int f15112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$activeAndAvailableDictionaries$1(C1292h c1292h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15111d = c1292h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15110c = obj;
        this.f15112e |= Integer.MIN_VALUE;
        return this.f15111d.m7195a(null, this);
    }
}
