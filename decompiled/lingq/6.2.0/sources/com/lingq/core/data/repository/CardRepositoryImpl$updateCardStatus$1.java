package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wn0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {379, 387, 402}, m4293m = "updateCardStatus", m4294v = 2)
final class CardRepositoryImpl$updateCardStatus$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14763a;

    /* JADX INFO: renamed from: b */
    public String f14764b;

    /* JADX INFO: renamed from: c */
    public Integer f14765c;

    /* JADX INFO: renamed from: d */
    public String f14766d;

    /* JADX INFO: renamed from: e */
    public wn0 f14767e;

    /* JADX INFO: renamed from: f */
    public int f14768f;

    /* JADX INFO: renamed from: g */
    public int f14769g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f14770h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1287c f14771i;

    /* JADX INFO: renamed from: j */
    public int f14772j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$updateCardStatus$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14771i = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14770h = obj;
        this.f14772j |= Integer.MIN_VALUE;
        return this.f14771i.m7133w(null, null, 0, null, this);
    }
}
