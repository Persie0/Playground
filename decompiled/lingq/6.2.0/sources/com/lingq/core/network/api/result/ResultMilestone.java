package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.u91;
import p000.ux5;
import p000.vk9;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultMilestone {
    public static final C1729s2 Companion = new C1729s2();

    /* JADX INFO: renamed from: a */
    public String f21326a;

    /* JADX INFO: renamed from: b */
    public String f21327b;

    /* JADX INFO: renamed from: c */
    public int f21328c;

    /* JADX INFO: renamed from: d */
    public String f21329d;

    /* JADX INFO: renamed from: a */
    public final String m8374a() {
        String str = this.f21326a;
        if (fa4.m11650l(this.f21329d, "daily_score") && vk9.m23365A0(str, new String[]{"."}, 0, 6).size() == 3) {
            return (String) u91.m22598P0(vk9.m23365A0(str, new String[]{"."}, 0, 6));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultMilestone)) {
            return false;
        }
        ResultMilestone resultMilestone = (ResultMilestone) obj;
        return fa4.m11650l(this.f21326a, resultMilestone.f21326a) && fa4.m11650l(this.f21327b, resultMilestone.f21327b) && this.f21328c == resultMilestone.f21328c && fa4.m11650l(this.f21329d, resultMilestone.f21329d);
    }

    public final int hashCode() {
        int iHashCode = this.f21326a.hashCode() * 31;
        String str = this.f21327b;
        int iM24106b = wq1.m24106b(this.f21328c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f21329d;
        return iM24106b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f21326a;
        String str2 = this.f21327b;
        int i = this.f21328c;
        String str3 = this.f21329d;
        StringBuilder sbM23000w = ux5.m23000w("ResultMilestone(slug=", str, ", name=", str2, ", goal=");
        sbM23000w.append(i);
        sbM23000w.append(", stat=");
        sbM23000w.append(str3);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
