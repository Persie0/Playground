package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChats {
    public static final C1784y0 Companion = new C1784y0();

    /* JADX INFO: renamed from: a */
    public final int f20779a;

    /* JADX INFO: renamed from: b */
    public final String f20780b;

    /* JADX INFO: renamed from: c */
    public final String f20781c;

    /* JADX INFO: renamed from: d */
    public final String f20782d;

    public /* synthetic */ ResultChats(int i, int i2, String str, String str2, String str3) {
        this.f20779a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20780b = "";
        } else {
            this.f20780b = str;
        }
        if ((i & 4) == 0) {
            this.f20781c = null;
        } else {
            this.f20781c = str2;
        }
        if ((i & 8) == 0) {
            this.f20782d = "";
        } else {
            this.f20782d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChats)) {
            return false;
        }
        ResultChats resultChats = (ResultChats) obj;
        return this.f20779a == resultChats.f20779a && fa4.m11650l(this.f20780b, resultChats.f20780b) && fa4.m11650l(this.f20781c, resultChats.f20781c) && fa4.m11650l(this.f20782d, resultChats.f20782d);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f20779a) * 31, this.f20780b, 31);
        String str = this.f20781c;
        return this.f20782d.hashCode() + ((iM22980c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m22995r(this.f20779a, "ResultChats(id=", ", title=", this.f20780b, ", image="), this.f20781c, ", startedAt=", this.f20782d, ")");
    }
}
