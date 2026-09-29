package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {575, 578}, m4293m = "updateCardNotes", m4294v = 2)
final class CardRepositoryImpl$updateCardNotes$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14757a;

    /* JADX INFO: renamed from: b */
    public String f14758b;

    /* JADX INFO: renamed from: c */
    public String f14759c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14760d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1287c f14761e;

    /* JADX INFO: renamed from: f */
    public int f14762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$updateCardNotes$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14761e = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14760d = obj;
        this.f14762f |= Integer.MIN_VALUE;
        return this.f14761e.m7132v(null, null, null, this);
    }
}
