package com.lingq.core.data.repository;

import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.wn0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.CardRepositoryImpl", m4291f = "CardRepositoryImpl.kt", m4292l = {452, 462, 480}, m4293m = "insertHint", m4294v = 2)
final class CardRepositoryImpl$insertHint$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TokenMeaning f14699a;

    /* JADX INFO: renamed from: b */
    public String f14700b;

    /* JADX INFO: renamed from: c */
    public wn0 f14701c;

    /* JADX INFO: renamed from: d */
    public ArrayList f14702d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f14703e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1287c f14704f;

    /* JADX INFO: renamed from: g */
    public int f14705g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$insertHint$1(C1287c c1287c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14704f = c1287c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14703e = obj;
        this.f14705g |= Integer.MIN_VALUE;
        return this.f14704f.m7120j(null, null, null, this);
    }
}
