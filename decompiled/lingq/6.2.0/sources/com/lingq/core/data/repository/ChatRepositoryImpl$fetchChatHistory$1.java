package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultChatHistory;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {241, 242, 244, 251, 262}, m4293m = "fetchChatHistory", m4294v = 2)
final class ChatRepositoryImpl$fetchChatHistory$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ResultChatHistory f14896a;

    /* JADX INFO: renamed from: b */
    public Iterator f14897b;

    /* JADX INFO: renamed from: c */
    public int f14898c;

    /* JADX INFO: renamed from: d */
    public int f14899d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f14900e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1289e f14901f;

    /* JADX INFO: renamed from: g */
    public int f14902g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$fetchChatHistory$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14901f = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14900e = obj;
        this.f14902g |= Integer.MIN_VALUE;
        return this.f14901f.m7157g(0, null, this);
    }
}
