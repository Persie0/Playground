package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatPhraseCard {
    public static final C1727s0 Companion = new C1727s0();

    /* JADX INFO: renamed from: a */
    public final int f20748a;

    /* JADX INFO: renamed from: b */
    public final int f20749b;

    /* JADX INFO: renamed from: c */
    public final Integer f20750c;

    public /* synthetic */ ResultChatPhraseCard(int i, int i2, int i3, Integer num) {
        this.f20748a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20749b = -1;
        } else {
            this.f20749b = i3;
        }
        if ((i & 4) == 0) {
            this.f20750c = null;
        } else {
            this.f20750c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatPhraseCard)) {
            return false;
        }
        ResultChatPhraseCard resultChatPhraseCard = (ResultChatPhraseCard) obj;
        return this.f20748a == resultChatPhraseCard.f20748a && this.f20749b == resultChatPhraseCard.f20749b && fa4.m11650l(this.f20750c, resultChatPhraseCard.f20750c);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f20749b, Integer.hashCode(this.f20748a) * 31, 31);
        Integer num = this.f20750c;
        return iM24106b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f20748a, this.f20749b, "ResultChatPhraseCard(id=", ", status=", ", extendedStatus=");
        sbM22994q.append(this.f20750c);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
