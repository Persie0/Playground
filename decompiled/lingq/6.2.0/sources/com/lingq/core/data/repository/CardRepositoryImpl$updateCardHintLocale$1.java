package com.lingq.core.data.repository;

import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {535, 542}, m4293m = "updateCardHintLocale", m4294v = 2)
final class CardRepositoryImpl$updateCardHintLocale$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TokenMeaning f14752a;

    /* JADX INFO: renamed from: b */
    public String f14753b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14754c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1287c f14755d;

    /* JADX INFO: renamed from: e */
    public int f14756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$updateCardHintLocale$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14755d = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14754c = obj;
        this.f14756e |= Integer.MIN_VALUE;
        return this.f14755d.m7131u(null, null, null, null, this);
    }
}
