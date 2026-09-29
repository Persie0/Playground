package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {386, 390, 391}, m4293m = "fetchTranslationForMessage", m4294v = 2)
final class ChatRepositoryImpl$fetchTranslationForMessage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14938a;

    /* JADX INFO: renamed from: b */
    public int f14939b;

    /* JADX INFO: renamed from: c */
    public int f14940c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14941d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1289e f14942e;

    /* JADX INFO: renamed from: f */
    public int f14943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$fetchTranslationForMessage$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14942e = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14941d = obj;
        this.f14943f |= Integer.MIN_VALUE;
        return this.f14942e.m7163m(0, 0, null, this);
    }
}
