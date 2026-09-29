package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultVocabularyCard;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {733, 763, 765, 773, 784}, m4293m = "syncUpdateCard", m4294v = 2)
final class CardRepositoryImpl$syncUpdateCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14737a;

    /* JADX INFO: renamed from: b */
    public Integer f14738b;

    /* JADX INFO: renamed from: c */
    public String f14739c;

    /* JADX INFO: renamed from: d */
    public ResultVocabularyCard f14740d;

    /* JADX INFO: renamed from: e */
    public LinkedHashMap f14741e;

    /* JADX INFO: renamed from: f */
    public int f14742f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f14743g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1287c f14744h;

    /* JADX INFO: renamed from: i */
    public int f14745i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$syncUpdateCard$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14744h = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14743g = obj;
        this.f14745i |= Integer.MIN_VALUE;
        return this.f14744h.m7129s(null, null, null, null, this);
    }
}
