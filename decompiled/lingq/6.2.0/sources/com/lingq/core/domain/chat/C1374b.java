package com.lingq.core.domain.chat;

import com.lingq.core.domain.util.AbstractC1543a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.yl3;
import p000.zw0;

/* JADX INFO: renamed from: com.lingq.core.domain.chat.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1374b {

    /* JADX INFO: renamed from: a */
    public final zw0 f18622a;

    public C1374b(zw0 zw0Var) {
        zw0Var.getClass();
        this.f18622a = zw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final c83 m7980a(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        return AbstractC3224d.m15536o(AbstractC1543a.m8226a(new yl3(this, i, 0), new GetChatUseCase$invoke$2(i, this, str, str2, null)));
    }
}
