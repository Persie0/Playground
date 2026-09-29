package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {664, 683}, m4293m = "removeCardTag", m4294v = 2)
final class CardRepositoryImpl$removeCardTag$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14711a;

    /* JADX INFO: renamed from: b */
    public String f14712b;

    /* JADX INFO: renamed from: c */
    public String f14713c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14714d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1287c f14715e;

    /* JADX INFO: renamed from: f */
    public int f14716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$removeCardTag$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14715e = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14714d = obj;
        this.f14716f |= Integer.MIN_VALUE;
        return this.f14715e.m7125o(null, null, null, this);
    }
}
