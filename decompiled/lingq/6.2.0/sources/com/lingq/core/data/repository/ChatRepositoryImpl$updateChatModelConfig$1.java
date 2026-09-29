package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {693}, m4293m = "updateChatModelConfig", m4294v = 2)
final class ChatRepositoryImpl$updateChatModelConfig$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1289e f15023a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15024b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1289e f15025c;

    /* JADX INFO: renamed from: d */
    public int f15026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$updateChatModelConfig$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15025c = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15024b = obj;
        this.f15026d |= Integer.MIN_VALUE;
        return this.f15025c.m7150A(null, 0, null, null, this);
    }
}
