package com.lingq.core.data.repository;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {613, 630, 634, 647}, m4293m = "storeChatHistory", m4294v = 2)
final class ChatRepositoryImpl$storeChatHistory$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f15011a;

    /* JADX INFO: renamed from: b */
    public String f15012b;

    /* JADX INFO: renamed from: c */
    public List f15013c;

    /* JADX INFO: renamed from: d */
    public Iterator f15014d;

    /* JADX INFO: renamed from: e */
    public int f15015e;

    /* JADX INFO: renamed from: f */
    public int f15016f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f15017g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1289e f15018h;

    /* JADX INFO: renamed from: i */
    public int f15019i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$storeChatHistory$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f15018h = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15017g = obj;
        this.f15019i |= Integer.MIN_VALUE;
        return this.f15018h.m7174x(0, null, null, null, this);
    }
}
