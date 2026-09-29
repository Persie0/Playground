package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {675}, m4293m = "getChatModelConfig", m4294v = 2)
final class ChatRepositoryImpl$getChatModelConfig$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1289e f14944a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14945b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1289e f14946c;

    /* JADX INFO: renamed from: d */
    public int f14947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$getChatModelConfig$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14946c = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14945b = obj;
        this.f14947d |= Integer.MIN_VALUE;
        return this.f14946c.m7164n(0, null, this);
    }
}
