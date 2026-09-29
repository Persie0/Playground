package com.lingq.feature.chat;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel", m4291f = "ChatViewModel.kt", m4292l = {1269}, m4293m = "awaitRefreshedSuggestions", m4294v = 2)
final class ChatViewModel$awaitRefreshedSuggestions$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f24926a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f24928c;

    /* JADX INFO: renamed from: d */
    public int f24929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$awaitRefreshedSuggestions$1(C2009m c2009m, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24928c = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24927b = obj;
        this.f24929d |= Integer.MIN_VALUE;
        return C2009m.m8916V2(this.f24928c, false, this);
    }
}
