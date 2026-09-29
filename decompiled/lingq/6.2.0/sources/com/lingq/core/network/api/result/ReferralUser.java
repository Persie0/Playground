package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ReferralUser {
    public static final C1708p Companion = new C1708p();

    /* JADX INFO: renamed from: a */
    public final Integer f20596a;

    /* JADX INFO: renamed from: b */
    public final Boolean f20597b;

    /* JADX INFO: renamed from: c */
    public final String f20598c;

    /* JADX INFO: renamed from: d */
    public final Integer f20599d;

    /* JADX INFO: renamed from: e */
    public final String f20600e;

    /* JADX INFO: renamed from: f */
    public final String f20601f;

    public /* synthetic */ ReferralUser(int i, Integer num, Boolean bool, String str, Integer num2, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20596a = null;
        } else {
            this.f20596a = num;
        }
        if ((i & 2) == 0) {
            this.f20597b = null;
        } else {
            this.f20597b = bool;
        }
        if ((i & 4) == 0) {
            this.f20598c = null;
        } else {
            this.f20598c = str;
        }
        if ((i & 8) == 0) {
            this.f20599d = null;
        } else {
            this.f20599d = num2;
        }
        if ((i & 16) == 0) {
            this.f20600e = null;
        } else {
            this.f20600e = str2;
        }
        if ((i & 32) == 0) {
            this.f20601f = null;
        } else {
            this.f20601f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralUser)) {
            return false;
        }
        ReferralUser referralUser = (ReferralUser) obj;
        return fa4.m11650l(this.f20596a, referralUser.f20596a) && fa4.m11650l(this.f20597b, referralUser.f20597b) && fa4.m11650l(this.f20598c, referralUser.f20598c) && fa4.m11650l(this.f20599d, referralUser.f20599d) && fa4.m11650l(this.f20600e, referralUser.f20600e) && fa4.m11650l(this.f20601f, referralUser.f20601f);
    }

    public final int hashCode() {
        Integer num = this.f20596a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f20597b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f20598c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f20599d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f20600e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20601f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralUser(activityIndex=");
        sb.append(this.f20596a);
        sb.append(", deleted=");
        sb.append(this.f20597b);
        sb.append(", description=");
        hn1.m13371u(sb, this.f20598c, ", id=", this.f20599d, ", photo=");
        return wq1.m24125u(sb, this.f20600e, ", username=", this.f20601f, ")");
    }
}
