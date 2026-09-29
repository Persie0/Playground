package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {126, 127}, m4293m = "updateAllLanguages", m4294v = 2)
final class LanguageRepositoryImpl$updateAllLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1293i f15225b;

    /* JADX INFO: renamed from: c */
    public int f15226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateAllLanguages$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15225b = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15224a = obj;
        this.f15226c |= Integer.MIN_VALUE;
        return this.f15225b.m7218o(this);
    }
}
