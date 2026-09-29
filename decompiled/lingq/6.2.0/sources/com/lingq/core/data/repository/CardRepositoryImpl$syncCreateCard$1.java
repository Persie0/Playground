package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultVocabularyCard;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {694, 715, 717, 723}, m4293m = "syncCreateCard", m4294v = 2)
final class CardRepositoryImpl$syncCreateCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14723a;

    /* JADX INFO: renamed from: b */
    public ResultVocabularyCard f14724b;

    /* JADX INFO: renamed from: c */
    public int f14725c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14726d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1287c f14727e;

    /* JADX INFO: renamed from: f */
    public int f14728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$syncCreateCard$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14727e = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14726d = obj;
        this.f14728f |= Integer.MIN_VALUE;
        return this.f14727e.m7127q(0, null, null, this);
    }
}
