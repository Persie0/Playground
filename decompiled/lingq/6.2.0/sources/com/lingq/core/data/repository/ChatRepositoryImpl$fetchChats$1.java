package com.lingq.core.data.repository;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {205, 212, 216, 232}, m4293m = "fetchChats", m4294v = 2)
final class ChatRepositoryImpl$fetchChats$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14920a;

    /* JADX INFO: renamed from: b */
    public String f14921b;

    /* JADX INFO: renamed from: c */
    public List f14922c;

    /* JADX INFO: renamed from: d */
    public Set f14923d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f14924e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1289e f14925f;

    /* JADX INFO: renamed from: g */
    public int f14926g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$fetchChats$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14925f = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14924e = obj;
        this.f14926g |= Integer.MIN_VALUE;
        return this.f14925f.m7160j(null, null, this);
    }
}
