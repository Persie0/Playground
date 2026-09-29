package com.lingq.core.database.dao;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.database.dao.ChatDao", m4291f = "ChatDao.kt", m4292l = {53, 54}, m4293m = "replaceChatSuggestions$suspendImpl", m4294v = 2)
final class ChatDao$replaceChatSuggestions$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C1315c f16861a;

    /* JADX INFO: renamed from: b */
    public ArrayList f16862b;

    /* JADX INFO: renamed from: c */
    public int f16863c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16864d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1315c f16865e;

    /* JADX INFO: renamed from: f */
    public int f16866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatDao$replaceChatSuggestions$1(C1315c c1315c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16865e = c1315c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16864d = obj;
        this.f16866f |= Integer.MIN_VALUE;
        return C1315c.m7463z0(this.f16865e, null, 0, null, this);
    }
}
