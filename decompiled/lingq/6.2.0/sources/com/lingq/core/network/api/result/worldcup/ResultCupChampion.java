package com.lingq.core.network.api.result.worldcup;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultCupChampion {
    public static final C1758c Companion = new C1758c();

    /* JADX INFO: renamed from: a */
    public final String f21752a;

    /* JADX INFO: renamed from: b */
    public final String f21753b;

    /* JADX INFO: renamed from: c */
    public final double f21754c;

    public /* synthetic */ ResultCupChampion(double d, int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21752a = "";
        } else {
            this.f21752a = str;
        }
        if ((i & 2) == 0) {
            this.f21753b = "";
        } else {
            this.f21753b = str2;
        }
        if ((i & 4) == 0) {
            this.f21754c = 0.0d;
        } else {
            this.f21754c = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupChampion)) {
            return false;
        }
        ResultCupChampion resultCupChampion = (ResultCupChampion) obj;
        return fa4.m11650l(this.f21752a, resultCupChampion.f21752a) && fa4.m11650l(this.f21753b, resultCupChampion.f21753b) && Double.compare(this.f21754c, resultCupChampion.f21754c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f21754c) + ux5.m22980c(this.f21752a.hashCode() * 31, this.f21753b, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultCupChampion(team=", this.f21752a, ", name=", this.f21753b, ", coins=");
        sbM23000w.append(this.f21754c);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
