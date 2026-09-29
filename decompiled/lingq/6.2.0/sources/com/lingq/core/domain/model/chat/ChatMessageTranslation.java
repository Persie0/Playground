package com.lingq.core.domain.model.chat;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatMessageTranslation {
    public static final C1404e Companion = new C1404e();

    /* JADX INFO: renamed from: a */
    public final int f18933a;

    /* JADX INFO: renamed from: b */
    public final int f18934b;

    /* JADX INFO: renamed from: c */
    public final String f18935c;

    public /* synthetic */ ChatMessageTranslation(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, ChatMessageTranslation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18933a = i2;
        this.f18934b = i3;
        this.f18935c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessageTranslation)) {
            return false;
        }
        ChatMessageTranslation chatMessageTranslation = (ChatMessageTranslation) obj;
        return this.f18933a == chatMessageTranslation.f18933a && this.f18934b == chatMessageTranslation.f18934b && fa4.m11650l(this.f18935c, chatMessageTranslation.f18935c);
    }

    public final int hashCode() {
        return this.f18935c.hashCode() + wq1.m24106b(this.f18934b, Integer.hashCode(this.f18933a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f18933a, this.f18934b, "ChatMessageTranslation(chatId=", ", messageIndex=", ", translation="), this.f18935c, ")");
    }

    public ChatMessageTranslation(int i, String str, int i2) {
        str.getClass();
        this.f18933a = i;
        this.f18934b = i2;
        this.f18935c = str;
    }
}
