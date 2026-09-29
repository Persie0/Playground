package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl", m4291f = "TtsRepositoryImpl.kt", m4292l = {509, 515}, m4293m = "downgradedNameFor", m4294v = 2)
final class TtsRepositoryImpl$downgradedNameFor$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f16207a;

    /* JADX INFO: renamed from: b */
    public String f16208b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16209c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1307w f16210d;

    /* JADX INFO: renamed from: e */
    public int f16211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$downgradedNameFor$1(C1307w c1307w, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16210d = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16209c = obj;
        this.f16211e |= Integer.MIN_VALUE;
        return this.f16210d.m7387b(null, null, null, this);
    }
}
