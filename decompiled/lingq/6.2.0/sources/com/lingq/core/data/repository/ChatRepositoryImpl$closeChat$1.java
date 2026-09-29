package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {543, 545}, m4293m = "closeChat", m4294v = 2)
final class ChatRepositoryImpl$closeChat$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14878a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1289e f14880c;

    /* JADX INFO: renamed from: d */
    public int f14881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$closeChat$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14880c = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14879b = obj;
        this.f14881d |= Integer.MIN_VALUE;
        return this.f14880c.m7152b(0, null, this);
    }
}
