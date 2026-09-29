package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.DictionaryRepositoryImpl", m4291f = "DictionaryRepositoryImpl.kt", m4292l = {160, 166, 167}, m4293m = "addDictionaryActive", m4294v = 2)
final class DictionaryRepositoryImpl$addDictionaryActive$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15113a;

    /* JADX INFO: renamed from: b */
    public int f15114b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15115c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1292h f15116d;

    /* JADX INFO: renamed from: e */
    public int f15117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$addDictionaryActive$1(C1292h c1292h, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15116d = c1292h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15115c = obj;
        this.f15117e |= Integer.MIN_VALUE;
        return this.f15116d.m7196b(0, null, this);
    }
}
