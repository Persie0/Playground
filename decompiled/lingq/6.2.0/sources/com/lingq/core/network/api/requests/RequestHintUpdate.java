package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestHintUpdate {
    public static final C1604v Companion = new C1604v();

    /* JADX INFO: renamed from: a */
    public final String f20366a;

    /* JADX INFO: renamed from: b */
    public final String f20367b;

    /* JADX INFO: renamed from: c */
    public final String f20368c;

    /* JADX INFO: renamed from: d */
    public final Boolean f20369d;

    /* JADX INFO: renamed from: e */
    public final Integer f20370e;

    public /* synthetic */ RequestHintUpdate(int i, String str, String str2, String str3, Boolean bool, Integer num) {
        if ((i & 1) == 0) {
            this.f20366a = null;
        } else {
            this.f20366a = str;
        }
        if ((i & 2) == 0) {
            this.f20367b = null;
        } else {
            this.f20367b = str2;
        }
        if ((i & 4) == 0) {
            this.f20368c = null;
        } else {
            this.f20368c = str3;
        }
        if ((i & 8) == 0) {
            this.f20369d = Boolean.FALSE;
        } else {
            this.f20369d = bool;
        }
        if ((i & 16) == 0) {
            this.f20370e = null;
        } else {
            this.f20370e = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestHintUpdate)) {
            return false;
        }
        RequestHintUpdate requestHintUpdate = (RequestHintUpdate) obj;
        return fa4.m11650l(this.f20366a, requestHintUpdate.f20366a) && fa4.m11650l(this.f20367b, requestHintUpdate.f20367b) && fa4.m11650l(this.f20368c, requestHintUpdate.f20368c) && fa4.m11650l(this.f20369d, requestHintUpdate.f20369d) && fa4.m11650l(this.f20370e, requestHintUpdate.f20370e);
    }

    public final int hashCode() {
        String str = this.f20366a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20367b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20368c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f20369d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f20370e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("RequestHintUpdate(locale=", this.f20366a, ", text=", this.f20367b, ", term=");
        sbM23000w.append(this.f20368c);
        sbM23000w.append(", isGoogleTranslate=");
        sbM23000w.append(this.f20369d);
        sbM23000w.append(", popularity=");
        sbM23000w.append(this.f20370e);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public RequestHintUpdate(String str, String str2, String str3, Boolean bool, Integer num, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        num = (i & 16) != 0 ? null : num;
        this.f20366a = str;
        this.f20367b = str2;
        this.f20368c = str3;
        this.f20369d = bool;
        this.f20370e = num;
    }
}
