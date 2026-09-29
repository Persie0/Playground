package com.lingq.core.domain.model.chat;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatMessagePhrases {
    public static final C1403d Companion = new C1403d();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f18929d = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new C3072he(19))};

    /* JADX INFO: renamed from: a */
    public final int f18930a;

    /* JADX INFO: renamed from: b */
    public final int f18931b;

    /* JADX INFO: renamed from: c */
    public final List f18932c;

    public /* synthetic */ ChatMessagePhrases(int i, int i2, int i3, List list) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, ChatMessagePhrases$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18930a = i2;
        this.f18931b = i3;
        this.f18932c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessagePhrases)) {
            return false;
        }
        ChatMessagePhrases chatMessagePhrases = (ChatMessagePhrases) obj;
        return this.f18930a == chatMessagePhrases.f18930a && this.f18931b == chatMessagePhrases.f18931b && fa4.m11650l(this.f18932c, chatMessagePhrases.f18932c);
    }

    public final int hashCode() {
        return this.f18932c.hashCode() + wq1.m24106b(this.f18931b, Integer.hashCode(this.f18930a) * 31, 31);
    }

    public final String toString() {
        return hn1.m13356f(ux5.m22994q(this.f18930a, this.f18931b, "ChatMessagePhrases(chatId=", ", messageIndex=", ", phrases="), this.f18932c, ")");
    }

    public ChatMessagePhrases(int i, int i2, List list) {
        list.getClass();
        this.f18930a = i;
        this.f18931b = i2;
        this.f18932c = list;
    }
}
