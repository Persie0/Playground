package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {85, 86, 87}, m4293m = "allLanguages", m4294v = 2)
final class LanguageRepositoryImpl$allLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1293i f15160b;

    /* JADX INFO: renamed from: c */
    public int f15161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$allLanguages$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15160b = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15159a = obj;
        this.f15161c |= Integer.MIN_VALUE;
        return this.f15160b.m7204a(this);
    }
}
