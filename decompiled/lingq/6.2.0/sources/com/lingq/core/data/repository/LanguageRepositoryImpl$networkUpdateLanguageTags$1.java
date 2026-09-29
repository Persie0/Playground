package com.lingq.core.data.repository;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {149, 151, 155}, m4293m = "networkUpdateLanguageTags", m4294v = 2)
final class LanguageRepositoryImpl$networkUpdateLanguageTags$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15186a;

    /* JADX INFO: renamed from: b */
    public List f15187b;

    /* JADX INFO: renamed from: c */
    public int f15188c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15189d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1293i f15190e;

    /* JADX INFO: renamed from: f */
    public int f15191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateLanguageTags$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15190e = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15189d = obj;
        this.f15191f |= Integer.MIN_VALUE;
        return this.f15190e.m7210g(null, this);
    }
}
