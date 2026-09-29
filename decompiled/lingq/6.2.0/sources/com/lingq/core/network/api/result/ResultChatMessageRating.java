package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatMessageRating {
    public static final C1703o0 Companion = new C1703o0();

    /* JADX INFO: renamed from: a */
    public final String f20733a;

    /* JADX INFO: renamed from: b */
    public final String f20734b;

    /* JADX INFO: renamed from: c */
    public final String f20735c;

    public /* synthetic */ ResultChatMessageRating(String str, int i, String str2, String str3) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, ResultChatMessageRating$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20733a = str;
        if ((i & 2) == 0) {
            this.f20734b = "";
        } else {
            this.f20734b = str2;
        }
        if ((i & 4) == 0) {
            this.f20735c = "";
        } else {
            this.f20735c = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8347a() {
        return this.f20733a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatMessageRating)) {
            return false;
        }
        ResultChatMessageRating resultChatMessageRating = (ResultChatMessageRating) obj;
        return fa4.m11650l(this.f20733a, resultChatMessageRating.f20733a) && fa4.m11650l(this.f20734b, resultChatMessageRating.f20734b) && fa4.m11650l(this.f20735c, resultChatMessageRating.f20735c);
    }

    public final int hashCode() {
        return this.f20735c.hashCode() + ux5.m22980c(this.f20733a.hashCode() * 31, this.f20734b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultChatMessageRating(value=", this.f20733a, ", reason=", this.f20734b, ", reasonText="), this.f20735c, ")");
    }
}
