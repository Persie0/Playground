package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {747}, m4293m = "setLynxDataImprovementOptIn", m4294v = 2)
final class ChatRepositoryImpl$setLynxDataImprovementOptIn$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1289e f14999b;

    /* JADX INFO: renamed from: c */
    public int f15000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$setLynxDataImprovementOptIn$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14999b = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14998a = obj;
        this.f15000c |= Integer.MIN_VALUE;
        return this.f14999b.m7171u(null, false, this);
    }
}
