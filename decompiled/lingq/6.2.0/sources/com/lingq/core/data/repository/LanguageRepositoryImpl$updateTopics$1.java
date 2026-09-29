package com.lingq.core.data.repository;

import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {261, 263}, m4293m = "updateTopics", m4294v = 2)
final class LanguageRepositoryImpl$updateTopics$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15254a;

    /* JADX INFO: renamed from: b */
    public Set f15255b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15256c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1293i f15257d;

    /* JADX INFO: renamed from: e */
    public int f15258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateTopics$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15257d = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15256c = obj;
        this.f15258e |= Integer.MIN_VALUE;
        return this.f15257d.m7224u(null, null, this);
    }
}
