package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {552, 554}, m4293m = "chatStats", m4294v = 2)
final class ChatRepositoryImpl$chatStats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14874a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1289e f14876c;

    /* JADX INFO: renamed from: d */
    public int f14877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$chatStats$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14876c = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14875b = obj;
        this.f14877d |= Integer.MIN_VALUE;
        return this.f14876c.m7151a(0, null, this);
    }
}
