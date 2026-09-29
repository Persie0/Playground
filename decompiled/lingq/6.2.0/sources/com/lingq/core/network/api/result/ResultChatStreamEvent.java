package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatStreamEvent {
    public static final C1745v0 Companion = new C1745v0();

    /* JADX INFO: renamed from: a */
    public final String f20765a;

    /* JADX INFO: renamed from: b */
    public final Integer f20766b;

    /* JADX INFO: renamed from: c */
    public final String f20767c;

    /* JADX INFO: renamed from: d */
    public final String f20768d;

    /* JADX INFO: renamed from: e */
    public final Double f20769e;

    /* JADX INFO: renamed from: f */
    public final Integer f20770f;

    /* JADX INFO: renamed from: g */
    public final Integer f20771g;

    /* JADX INFO: renamed from: h */
    public final String f20772h;

    /* JADX INFO: renamed from: i */
    public final String f20773i;

    /* JADX INFO: renamed from: j */
    public final String f20774j;

    public /* synthetic */ ResultChatStreamEvent(int i, String str, Integer num, String str2, String str3, Double d, Integer num2, Integer num3, String str4, String str5, String str6) {
        this.f20765a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f20766b = null;
        } else {
            this.f20766b = num;
        }
        if ((i & 4) == 0) {
            this.f20767c = null;
        } else {
            this.f20767c = str2;
        }
        if ((i & 8) == 0) {
            this.f20768d = null;
        } else {
            this.f20768d = str3;
        }
        if ((i & 16) == 0) {
            this.f20769e = null;
        } else {
            this.f20769e = d;
        }
        if ((i & 32) == 0) {
            this.f20770f = null;
        } else {
            this.f20770f = num2;
        }
        if ((i & 64) == 0) {
            this.f20771g = null;
        } else {
            this.f20771g = num3;
        }
        if ((i & 128) == 0) {
            this.f20772h = null;
        } else {
            this.f20772h = str4;
        }
        if ((i & 256) == 0) {
            this.f20773i = null;
        } else {
            this.f20773i = str5;
        }
        if ((i & 512) == 0) {
            this.f20774j = null;
        } else {
            this.f20774j = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatStreamEvent)) {
            return false;
        }
        ResultChatStreamEvent resultChatStreamEvent = (ResultChatStreamEvent) obj;
        return fa4.m11650l(this.f20765a, resultChatStreamEvent.f20765a) && fa4.m11650l(this.f20766b, resultChatStreamEvent.f20766b) && fa4.m11650l(this.f20767c, resultChatStreamEvent.f20767c) && fa4.m11650l(this.f20768d, resultChatStreamEvent.f20768d) && fa4.m11650l(this.f20769e, resultChatStreamEvent.f20769e) && fa4.m11650l(this.f20770f, resultChatStreamEvent.f20770f) && fa4.m11650l(this.f20771g, resultChatStreamEvent.f20771g) && fa4.m11650l(this.f20772h, resultChatStreamEvent.f20772h) && fa4.m11650l(this.f20773i, resultChatStreamEvent.f20773i) && fa4.m11650l(this.f20774j, resultChatStreamEvent.f20774j);
    }

    public final int hashCode() {
        int iHashCode = this.f20765a.hashCode() * 31;
        Integer num = this.f20766b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f20767c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20768d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f20769e;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.f20770f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f20771g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f20772h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20773i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20774j;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultChatStreamEvent(type=");
        sb.append(this.f20765a);
        sb.append(", chatId=");
        sb.append(this.f20766b);
        sb.append(", title=");
        AbstractC3393o1.m17725C(sb, this.f20767c, ", content=", this.f20768d, ", coins=");
        sb.append(this.f20769e);
        sb.append(", totalWords=");
        sb.append(this.f20770f);
        sb.append(", uniqueWords=");
        sb.append(this.f20771g);
        sb.append(", requiredTier=");
        sb.append(this.f20772h);
        sb.append(", code=");
        return wq1.m24125u(sb, this.f20773i, ", status=", this.f20774j, ")");
    }
}
