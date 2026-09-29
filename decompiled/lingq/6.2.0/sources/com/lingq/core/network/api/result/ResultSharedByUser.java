package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultSharedByUser {
    public static final C1724r3 Companion = new C1724r3();

    /* JADX INFO: renamed from: a */
    public final int f21496a;

    /* JADX INFO: renamed from: b */
    public final String f21497b;

    /* JADX INFO: renamed from: c */
    public final String f21498c;

    /* JADX INFO: renamed from: d */
    public final String f21499d;

    /* JADX INFO: renamed from: e */
    public final String f21500e;

    /* JADX INFO: renamed from: f */
    public final String f21501f;

    public /* synthetic */ ResultSharedByUser(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        this.f21496a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f21497b = "";
        } else {
            this.f21497b = str;
        }
        if ((i & 4) == 0) {
            this.f21498c = "";
        } else {
            this.f21498c = str2;
        }
        if ((i & 8) == 0) {
            this.f21499d = "";
        } else {
            this.f21499d = str3;
        }
        if ((i & 16) == 0) {
            this.f21500e = "";
        } else {
            this.f21500e = str4;
        }
        if ((i & 32) == 0) {
            this.f21501f = null;
        } else {
            this.f21501f = str5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8391a() {
        return this.f21496a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultSharedByUser)) {
            return false;
        }
        ResultSharedByUser resultSharedByUser = (ResultSharedByUser) obj;
        return this.f21496a == resultSharedByUser.f21496a && fa4.m11650l(this.f21497b, resultSharedByUser.f21497b) && fa4.m11650l(this.f21498c, resultSharedByUser.f21498c) && fa4.m11650l(this.f21499d, resultSharedByUser.f21499d) && fa4.m11650l(this.f21500e, resultSharedByUser.f21500e) && fa4.m11650l(this.f21501f, resultSharedByUser.f21501f);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f21496a) * 31, this.f21497b, 31), this.f21498c, 31), this.f21499d, 31), this.f21500e, 31);
        String str = this.f21501f;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21496a, "ResultSharedByUser(id=", ", firstName=", this.f21497b, ", lastName=");
        AbstractC3393o1.m17725C(sbM22995r, this.f21498c, ", photo=", this.f21499d, ", username=");
        return wq1.m24125u(sbM22995r, this.f21500e, ", role=", this.f21501f, ")");
    }
}
