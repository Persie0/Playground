package com.lingq.core.data.repository;

import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {175, 177}, m4293m = "insertCard", m4294v = 2)
final class CardRepositoryImpl$insertCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14652a;

    /* JADX INFO: renamed from: b */
    public int f14653b;

    /* JADX INFO: renamed from: c */
    public String f14654c;

    /* JADX INFO: renamed from: d */
    public String f14655d;

    /* JADX INFO: renamed from: e */
    public TokenMeaning f14656e;

    /* JADX INFO: renamed from: f */
    public String f14657f;

    /* JADX INFO: renamed from: g */
    public String f14658g;

    /* JADX INFO: renamed from: h */
    public String f14659h;

    /* JADX INFO: renamed from: i */
    public boolean f14660i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f14661j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1287c f14662k;

    /* JADX INFO: renamed from: l */
    public int f14663l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$insertCard$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14662k = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14661j = obj;
        this.f14663l |= Integer.MIN_VALUE;
        return this.f14662k.m7118h(0, null, null, null, 0, null, null, false, this);
    }
}
