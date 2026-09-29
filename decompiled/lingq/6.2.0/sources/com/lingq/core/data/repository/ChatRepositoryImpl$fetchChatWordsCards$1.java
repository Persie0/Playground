package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultChatWordsCards;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl", m4291f = "ChatRepositoryImpl.kt", m4292l = {342, 354, 362, 366, 373}, m4293m = "fetchChatWordsCards", m4294v = 2)
final class ChatRepositoryImpl$fetchChatWordsCards$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f14908a;

    /* JADX INFO: renamed from: b */
    public ResultChatWordsCards f14909b;

    /* JADX INFO: renamed from: c */
    public Locale f14910c;

    /* JADX INFO: renamed from: d */
    public List f14911d;

    /* JADX INFO: renamed from: e */
    public Object f14912e;

    /* JADX INFO: renamed from: f */
    public Iterator f14913f;

    /* JADX INFO: renamed from: g */
    public int f14914g;

    /* JADX INFO: renamed from: h */
    public int f14915h;

    /* JADX INFO: renamed from: i */
    public int f14916i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f14917j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1289e f14918k;

    /* JADX INFO: renamed from: l */
    public int f14919l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$fetchChatWordsCards$1(C1289e c1289e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14918k = c1289e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14917j = obj;
        this.f14919l |= Integer.MIN_VALUE;
        return this.f14918k.m7159i(0, null, this);
    }
}
