package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {636, 656}, m4293m = "insertCardTag", m4294v = 2)
final class CardRepositoryImpl$insertCardTag$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14693a;

    /* JADX INFO: renamed from: b */
    public String f14694b;

    /* JADX INFO: renamed from: c */
    public String f14695c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14696d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1287c f14697e;

    /* JADX INFO: renamed from: f */
    public int f14698f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$insertCardTag$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14697e = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14696d = obj;
        this.f14698f |= Integer.MIN_VALUE;
        return this.f14697e.m7119i(null, null, null, this);
    }
}
