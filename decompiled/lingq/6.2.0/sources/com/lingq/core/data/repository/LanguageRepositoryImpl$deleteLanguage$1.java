package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {582, 583, 584}, m4293m = "deleteLanguage", m4294v = 2)
final class LanguageRepositoryImpl$deleteLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15162a;

    /* JADX INFO: renamed from: b */
    public int f15163b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15164c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1293i f15165d;

    /* JADX INFO: renamed from: e */
    public int f15166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$deleteLanguage$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15165d = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15164c = obj;
        this.f15166e |= Integer.MIN_VALUE;
        return this.f15165d.m7205b(null, this);
    }
}
