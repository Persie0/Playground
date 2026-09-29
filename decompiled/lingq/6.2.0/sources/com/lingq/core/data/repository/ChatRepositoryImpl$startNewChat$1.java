package com.lingq.core.data.repository;

import com.lingq.core.network.api.requests.RequestChatNew;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {155, 162, 165}, m4293m = "startNewChat$data", m4294v = 2)
final class ChatRepositoryImpl$startNewChat$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15004a;

    /* JADX INFO: renamed from: b */
    public String f15005b;

    /* JADX INFO: renamed from: c */
    public RequestChatNew f15006c;

    /* JADX INFO: renamed from: d */
    public int f15007d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f15008e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1289e f15009f;

    /* JADX INFO: renamed from: g */
    public int f15010g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$startNewChat$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15009f = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15008e = obj;
        this.f15010g |= Integer.MIN_VALUE;
        return this.f15009f.m7173w(null, null, null, this);
    }
}
