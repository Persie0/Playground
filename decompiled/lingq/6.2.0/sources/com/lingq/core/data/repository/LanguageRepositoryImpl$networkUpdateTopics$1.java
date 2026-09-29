package com.lingq.core.data.repository;

import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl", m4291f = "LanguageRepositoryImpl.kt", m4292l = {272, 274, 275}, m4293m = "networkUpdateTopics", m4294v = 2)
final class LanguageRepositoryImpl$networkUpdateTopics$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Set f15200a;

    /* JADX INFO: renamed from: b */
    public int f15201b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15202c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1293i f15203d;

    /* JADX INFO: renamed from: e */
    public int f15204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateTopics$1(C1293i c1293i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15203d = c1293i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15202c = obj;
        this.f15204e |= Integer.MIN_VALUE;
        return this.f15203d.m7213j(null, null, this);
    }
}
