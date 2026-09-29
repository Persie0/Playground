package com.lingq.core.network.api.requests;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestChatNew {
    public static final C1580j Companion = new C1580j();

    /* JADX INFO: renamed from: a */
    public final Boolean f20328a;

    /* JADX INFO: renamed from: b */
    public final Integer f20329b;

    /* JADX INFO: renamed from: c */
    public final String f20330c;

    /* JADX INFO: renamed from: d */
    public final String f20331d;

    /* JADX INFO: renamed from: e */
    public final String f20332e;

    /* JADX INFO: renamed from: f */
    public final String f20333f;

    public /* synthetic */ RequestChatNew(int i, Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f20328a = null;
        } else {
            this.f20328a = bool;
        }
        if ((i & 2) == 0) {
            this.f20329b = null;
        } else {
            this.f20329b = num;
        }
        if ((i & 4) == 0) {
            this.f20330c = null;
        } else {
            this.f20330c = str;
        }
        if ((i & 8) == 0) {
            this.f20331d = null;
        } else {
            this.f20331d = str2;
        }
        if ((i & 16) == 0) {
            this.f20332e = null;
        } else {
            this.f20332e = str3;
        }
        if ((i & 32) == 0) {
            this.f20333f = null;
        } else {
            this.f20333f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestChatNew)) {
            return false;
        }
        RequestChatNew requestChatNew = (RequestChatNew) obj;
        return fa4.m11650l(this.f20328a, requestChatNew.f20328a) && fa4.m11650l(this.f20329b, requestChatNew.f20329b) && fa4.m11650l(this.f20330c, requestChatNew.f20330c) && fa4.m11650l(this.f20331d, requestChatNew.f20331d) && fa4.m11650l(this.f20332e, requestChatNew.f20332e) && fa4.m11650l(this.f20333f, requestChatNew.f20333f);
    }

    public final int hashCode() {
        Boolean bool = this.f20328a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f20329b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f20330c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20331d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20332e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20333f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestChatNew(surprise=");
        sb.append(this.f20328a);
        sb.append(", content=");
        sb.append(this.f20329b);
        sb.append(", topic=");
        AbstractC3393o1.m17725C(sb, this.f20330c, ", message=", this.f20331d, ", mode=");
        return wq1.m24125u(sb, this.f20332e, ", instruction=", this.f20333f, ")");
    }

    public RequestChatNew(int i, Integer num, String str, String str2) {
        num = (i & 2) != 0 ? null : num;
        str = (i & 8) != 0 ? null : str;
        String str3 = (i & 32) != 0 ? null : "lesson_complete";
        this.f20328a = null;
        this.f20329b = num;
        this.f20330c = null;
        this.f20331d = str;
        this.f20332e = str2;
        this.f20333f = str3;
    }
}
