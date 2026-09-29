package com.lingq.core.network.api.result.worldcup;

import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupTeamStanding {
    public static final C1773r Companion = new C1773r();

    /* JADX INFO: renamed from: a */
    public final String f21818a;

    /* JADX INFO: renamed from: b */
    public final String f21819b;

    /* JADX INFO: renamed from: c */
    public final int f21820c;

    /* JADX INFO: renamed from: d */
    public final double f21821d;

    /* JADX INFO: renamed from: e */
    public final int f21822e;

    /* JADX INFO: renamed from: f */
    public final Integer f21823f;

    /* JADX INFO: renamed from: g */
    public final Integer f21824g;

    /* JADX INFO: renamed from: h */
    public final Integer f21825h;

    public /* synthetic */ ResultCupTeamStanding(int i, String str, String str2, int i2, double d, int i3, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f21818a = "";
        } else {
            this.f21818a = str;
        }
        if ((i & 2) == 0) {
            this.f21819b = "";
        } else {
            this.f21819b = str2;
        }
        if ((i & 4) == 0) {
            this.f21820c = 0;
        } else {
            this.f21820c = i2;
        }
        if ((i & 8) == 0) {
            this.f21821d = 0.0d;
        } else {
            this.f21821d = d;
        }
        if ((i & 16) == 0) {
            this.f21822e = 0;
        } else {
            this.f21822e = i3;
        }
        if ((i & 32) == 0) {
            this.f21823f = null;
        } else {
            this.f21823f = num;
        }
        if ((i & 64) == 0) {
            this.f21824g = null;
        } else {
            this.f21824g = num2;
        }
        if ((i & 128) == 0) {
            this.f21825h = null;
        } else {
            this.f21825h = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupTeamStanding)) {
            return false;
        }
        ResultCupTeamStanding resultCupTeamStanding = (ResultCupTeamStanding) obj;
        return fa4.m11650l(this.f21818a, resultCupTeamStanding.f21818a) && fa4.m11650l(this.f21819b, resultCupTeamStanding.f21819b) && this.f21820c == resultCupTeamStanding.f21820c && Double.compare(this.f21821d, resultCupTeamStanding.f21821d) == 0 && this.f21822e == resultCupTeamStanding.f21822e && fa4.m11650l(this.f21823f, resultCupTeamStanding.f21823f) && fa4.m11650l(this.f21824g, resultCupTeamStanding.f21824g) && fa4.m11650l(this.f21825h, resultCupTeamStanding.f21825h);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f21822e, g9a.m12424a(this.f21821d, wq1.m24106b(this.f21820c, ux5.m22980c(this.f21818a.hashCode() * 31, this.f21819b, 31), 31), 31), 31);
        Integer num = this.f21823f;
        int iHashCode = (iM24106b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21824g;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f21825h;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultCupTeamStanding(team=", this.f21818a, ", name=", this.f21819b, ", totalCoins=");
        sbM23000w.append(this.f21820c);
        sbM23000w.append(", coins=");
        sbM23000w.append(this.f21821d);
        sbM23000w.append(", participantCount=");
        sbM23000w.append(this.f21822e);
        sbM23000w.append(", rank=");
        sbM23000w.append(this.f21823f);
        sbM23000w.append(", prevRank=");
        sbM23000w.append(this.f21824g);
        sbM23000w.append(", delta=");
        sbM23000w.append(this.f21825h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
