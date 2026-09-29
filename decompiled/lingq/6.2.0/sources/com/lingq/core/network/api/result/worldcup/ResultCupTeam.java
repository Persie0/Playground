package com.lingq.core.network.api.result.worldcup;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.ey8;
import p000.fa4;
import p000.mk9;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupTeam {
    public static final C1771p Companion = new C1771p();

    /* JADX INFO: renamed from: a */
    public final int f21810a;

    /* JADX INFO: renamed from: b */
    public final String f21811b;

    /* JADX INFO: renamed from: c */
    public final String f21812c;

    /* JADX INFO: renamed from: d */
    public final int f21813d;

    public /* synthetic */ ResultCupTeam(String str, int i, String str2, int i2, int i3) {
        if ((i & 1) == 0) {
            this.f21810a = 0;
        } else {
            this.f21810a = i2;
        }
        if ((i & 2) == 0) {
            this.f21811b = "";
        } else {
            this.f21811b = str;
        }
        if ((i & 4) == 0) {
            this.f21812c = "";
        } else {
            this.f21812c = str2;
        }
        if ((i & 8) == 0) {
            this.f21813d = 0;
        } else {
            this.f21813d = i3;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m8430d(ResultCupTeam resultCupTeam, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        int i = resultCupTeam.f21813d;
        String str = resultCupTeam.f21812c;
        String str2 = resultCupTeam.f21811b;
        int i2 = resultCupTeam.f21810a;
        if (mk9Var.m16872B(serialDescriptor) || i2 != 0) {
            mk9Var.m16878v(0, i2, serialDescriptor);
        }
        if (mk9Var.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9Var.m16882z(serialDescriptor, 1, str2);
        }
        if (mk9Var.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9Var.m16882z(serialDescriptor, 2, str);
        }
        if (!mk9Var.m16872B(serialDescriptor) && i == 0) {
            return;
        }
        mk9Var.m16878v(3, i, serialDescriptor);
    }

    /* JADX INFO: renamed from: a */
    public final String m8431a() {
        return this.f21811b;
    }

    /* JADX INFO: renamed from: b */
    public final int m8432b() {
        return this.f21810a;
    }

    /* JADX INFO: renamed from: c */
    public final String m8433c() {
        return this.f21812c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupTeam)) {
            return false;
        }
        ResultCupTeam resultCupTeam = (ResultCupTeam) obj;
        return this.f21810a == resultCupTeam.f21810a && fa4.m11650l(this.f21811b, resultCupTeam.f21811b) && fa4.m11650l(this.f21812c, resultCupTeam.f21812c) && this.f21813d == resultCupTeam.f21813d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21813d) + ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f21810a) * 31, this.f21811b, 31), this.f21812c, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21810a, "ResultCupTeam(id=", ", code=", this.f21811b, ", name=");
        sbM22995r.append(this.f21812c);
        sbM22995r.append(", challengeId=");
        sbM22995r.append(this.f21813d);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
