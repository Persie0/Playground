package com.lingq.core.network.api.result.worldcup;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupJoinTeam {
    public static final C1765j Companion = new C1765j();

    /* JADX INFO: renamed from: a */
    public final int f21774a;

    /* JADX INFO: renamed from: b */
    public final String f21775b;

    /* JADX INFO: renamed from: c */
    public final String f21776c;

    /* JADX INFO: renamed from: d */
    public final int f21777d;

    public /* synthetic */ ResultCupJoinTeam(String str, int i, String str2, int i2, int i3) {
        if ((i & 1) == 0) {
            this.f21774a = 0;
        } else {
            this.f21774a = i2;
        }
        if ((i & 2) == 0) {
            this.f21775b = "";
        } else {
            this.f21775b = str;
        }
        if ((i & 4) == 0) {
            this.f21776c = "";
        } else {
            this.f21776c = str2;
        }
        if ((i & 8) == 0) {
            this.f21777d = 0;
        } else {
            this.f21777d = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8418a() {
        return this.f21776c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupJoinTeam)) {
            return false;
        }
        ResultCupJoinTeam resultCupJoinTeam = (ResultCupJoinTeam) obj;
        return this.f21774a == resultCupJoinTeam.f21774a && fa4.m11650l(this.f21775b, resultCupJoinTeam.f21775b) && fa4.m11650l(this.f21776c, resultCupJoinTeam.f21776c) && this.f21777d == resultCupJoinTeam.f21777d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21777d) + ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f21774a) * 31, this.f21775b, 31), this.f21776c, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21774a, "ResultCupJoinTeam(id=", ", code=", this.f21775b, ", name=");
        sbM22995r.append(this.f21776c);
        sbM22995r.append(", challengeId=");
        sbM22995r.append(this.f21777d);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
