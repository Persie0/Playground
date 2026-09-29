package com.lingq.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {720, 721}, m4293m = "fetchLynxPrivacySettings", m4294v = 2)
final class ChatRepositoryImpl$fetchLynxPrivacySettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14927a;

    /* JADX INFO: renamed from: b */
    public Boolean f14928b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14929c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1289e f14930d;

    /* JADX INFO: renamed from: e */
    public int f14931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$fetchLynxPrivacySettings$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14930d = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14929c = obj;
        this.f14931e |= Integer.MIN_VALUE;
        return this.f14930d.m7161k(null, this);
    }
}
