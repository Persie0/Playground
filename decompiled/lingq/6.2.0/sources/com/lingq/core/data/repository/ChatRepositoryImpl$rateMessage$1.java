package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {467}, m4293m = "rateMessage", m4294v = 2)
final class ChatRepositoryImpl$rateMessage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1289e f14988b;

    /* JADX INFO: renamed from: c */
    public int f14989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$rateMessage$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14988b = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14987a = obj;
        this.f14989c |= Integer.MIN_VALUE;
        return this.f14988b.m7168r(null, 0, 0, null, this);
    }
}
