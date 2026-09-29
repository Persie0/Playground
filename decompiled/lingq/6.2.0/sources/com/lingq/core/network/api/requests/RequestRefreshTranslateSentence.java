package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestRefreshTranslateSentence {
    public static final C1603u0 Companion = new C1603u0();

    /* JADX INFO: renamed from: a */
    public final String f20447a;

    /* JADX INFO: renamed from: b */
    public final String f20448b;

    /* JADX INFO: renamed from: c */
    public final Integer f20449c;

    /* JADX INFO: renamed from: d */
    public final Integer f20450d;

    public /* synthetic */ RequestRefreshTranslateSentence(int i, String str, String str2, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f20447a = null;
        } else {
            this.f20447a = str;
        }
        if ((i & 2) == 0) {
            this.f20448b = null;
        } else {
            this.f20448b = str2;
        }
        if ((i & 4) == 0) {
            this.f20449c = null;
        } else {
            this.f20449c = num;
        }
        if ((i & 8) == 0) {
            this.f20450d = null;
        } else {
            this.f20450d = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestRefreshTranslateSentence)) {
            return false;
        }
        RequestRefreshTranslateSentence requestRefreshTranslateSentence = (RequestRefreshTranslateSentence) obj;
        return fa4.m11650l(this.f20447a, requestRefreshTranslateSentence.f20447a) && fa4.m11650l(this.f20448b, requestRefreshTranslateSentence.f20448b) && fa4.m11650l(this.f20449c, requestRefreshTranslateSentence.f20449c) && fa4.m11650l(this.f20450d, requestRefreshTranslateSentence.f20450d);
    }

    public final int hashCode() {
        String str = this.f20447a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20448b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20449c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f20450d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("RequestRefreshTranslateSentence(language=", this.f20447a, ", method=", this.f20448b, ", sentence=");
        sbM23000w.append(this.f20449c);
        sbM23000w.append(", sentenceBulk=");
        sbM23000w.append(this.f20450d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public RequestRefreshTranslateSentence(String str, Integer num, Integer num2) {
        this.f20447a = str;
        this.f20448b = "chatgpt";
        this.f20449c = num;
        this.f20450d = num2;
    }
}
