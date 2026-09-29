package com.lingq.core.network.api.result.worldcup;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultCupTeamEntry {
    public static final C1772q Companion = new C1772q();

    /* JADX INFO: renamed from: a */
    public final String f21814a;

    /* JADX INFO: renamed from: b */
    public final int f21815b;

    /* JADX INFO: renamed from: c */
    public final int f21816c;

    /* JADX INFO: renamed from: d */
    public final boolean f21817d;

    public /* synthetic */ ResultCupTeamEntry(int i, int i2, int i3, String str, boolean z) {
        this.f21814a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f21815b = 0;
        } else {
            this.f21815b = i2;
        }
        if ((i & 4) == 0) {
            this.f21816c = 0;
        } else {
            this.f21816c = i3;
        }
        if ((i & 8) == 0) {
            this.f21817d = false;
        } else {
            this.f21817d = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupTeamEntry)) {
            return false;
        }
        ResultCupTeamEntry resultCupTeamEntry = (ResultCupTeamEntry) obj;
        return fa4.m11650l(this.f21814a, resultCupTeamEntry.f21814a) && this.f21815b == resultCupTeamEntry.f21815b && this.f21816c == resultCupTeamEntry.f21816c && this.f21817d == resultCupTeamEntry.f21817d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21817d) + wq1.m24106b(this.f21816c, wq1.m24106b(this.f21815b, this.f21814a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f21815b, "ResultCupTeamEntry(code=", this.f21814a, ", challengeId=", ", participants=");
        sbM17741p.append(this.f21816c);
        sbM17741p.append(", canJoinTeam=");
        sbM17741p.append(this.f21817d);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
