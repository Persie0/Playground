package com.lingq.core.domain.model.notification;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class Notice {
    public static final C1481a Companion = new C1481a();

    /* JADX INFO: renamed from: a */
    public final int f19539a;

    /* JADX INFO: renamed from: b */
    public final String f19540b;

    /* JADX INFO: renamed from: c */
    public final String f19541c;

    /* JADX INFO: renamed from: d */
    public final String f19542d;

    /* JADX INFO: renamed from: e */
    public final String f19543e;

    public /* synthetic */ Notice(int i, int i2, String str, String str2, String str3, String str4) {
        this.f19539a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f19540b = "";
        } else {
            this.f19540b = str;
        }
        if ((i & 4) == 0) {
            this.f19541c = "";
        } else {
            this.f19541c = str2;
        }
        if ((i & 8) == 0) {
            this.f19542d = "";
        } else {
            this.f19542d = str3;
        }
        if ((i & 16) == 0) {
            this.f19543e = "";
        } else {
            this.f19543e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) obj;
        return this.f19539a == notice.f19539a && fa4.m11650l(this.f19540b, notice.f19540b) && fa4.m11650l(this.f19541c, notice.f19541c) && fa4.m11650l(this.f19542d, notice.f19542d) && fa4.m11650l(this.f19543e, notice.f19543e);
    }

    public final int hashCode() {
        return this.f19543e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f19539a) * 31, this.f19540b, 31), this.f19541c, 31), this.f19542d, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f19539a, "Notice(id=", ", title=", this.f19540b, ", endDate=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19541c, ", startDate=", this.f19542d, ", noticeType=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f19543e, ")");
    }

    public Notice(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f19539a = i;
        this.f19540b = str;
        this.f19541c = str2;
        this.f19542d = str3;
        this.f19543e = str4;
    }
}
