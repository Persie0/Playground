package com.lingq.core.domain.model.chat;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatPhraseCard {
    public static final C1406g Companion = new C1406g();

    /* JADX INFO: renamed from: a */
    public final int f18943a;

    /* JADX INFO: renamed from: b */
    public final int f18944b;

    /* JADX INFO: renamed from: c */
    public final Integer f18945c;

    public /* synthetic */ ChatPhraseCard(int i, int i2, int i3, Integer num) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, ChatPhraseCard$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18943a = i2;
        this.f18944b = i3;
        if ((i & 4) == 0) {
            this.f18945c = null;
        } else {
            this.f18945c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatPhraseCard)) {
            return false;
        }
        ChatPhraseCard chatPhraseCard = (ChatPhraseCard) obj;
        return this.f18943a == chatPhraseCard.f18943a && this.f18944b == chatPhraseCard.f18944b && fa4.m11650l(this.f18945c, chatPhraseCard.f18945c);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f18944b, Integer.hashCode(this.f18943a) * 31, 31);
        Integer num = this.f18945c;
        return iM24106b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f18943a, this.f18944b, "ChatPhraseCard(id=", ", status=", ", extendedStatus=");
        sbM22994q.append(this.f18945c);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }

    public ChatPhraseCard(int i, int i2, Integer num) {
        this.f18943a = i;
        this.f18944b = i2;
        this.f18945c = num;
    }
}
