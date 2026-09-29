package com.lingq.core.data.chat;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.chat.LynxPrivacySyncImpl", m4291f = "LynxPrivacySyncImpl.kt", m4292l = {38}, m4293m = "hasPendingWork", m4294v = 2)
final class LynxPrivacySyncImpl$hasPendingWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14400a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1265a f14401b;

    /* JADX INFO: renamed from: c */
    public int f14402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxPrivacySyncImpl$hasPendingWork$1(C1265a c1265a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14401b = c1265a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14400a = obj;
        this.f14402c |= Integer.MIN_VALUE;
        return this.f14401b.m7052b(null, this);
    }
}
