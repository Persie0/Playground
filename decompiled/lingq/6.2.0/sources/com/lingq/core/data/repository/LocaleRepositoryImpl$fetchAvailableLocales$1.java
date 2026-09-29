package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LocaleRepositoryImpl", m4291f = "LocaleRepositoryImpl.kt", m4292l = {29, 30}, m4293m = "fetchAvailableLocales", m4294v = 2)
final class LocaleRepositoryImpl$fetchAvailableLocales$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1297m f15826b;

    /* JADX INFO: renamed from: c */
    public int f15827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleRepositoryImpl$fetchAvailableLocales$1(C1297m c1297m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15826b = c1297m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15825a = obj;
        this.f15827c |= Integer.MIN_VALUE;
        return this.f15826b.m7328b(this);
    }
}
