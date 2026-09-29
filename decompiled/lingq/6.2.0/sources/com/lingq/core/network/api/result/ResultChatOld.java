package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatOld {
    public static final C1715q0 Companion = new C1715q0();

    /* JADX INFO: renamed from: a */
    public final int f20738a;

    /* JADX INFO: renamed from: b */
    public final String f20739b;

    /* JADX INFO: renamed from: c */
    public final String f20740c;

    /* JADX INFO: renamed from: d */
    public final String f20741d;

    public /* synthetic */ ResultChatOld(int i, int i2, String str, String str2, String str3) {
        this.f20738a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20739b = null;
        } else {
            this.f20739b = str;
        }
        if ((i & 4) == 0) {
            this.f20740c = null;
        } else {
            this.f20740c = str2;
        }
        if ((i & 8) == 0) {
            this.f20741d = "";
        } else {
            this.f20741d = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8350a() {
        return this.f20738a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8351b() {
        return this.f20741d;
    }

    /* JADX INFO: renamed from: c */
    public final String m8352c() {
        return this.f20739b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatOld)) {
            return false;
        }
        ResultChatOld resultChatOld = (ResultChatOld) obj;
        return this.f20738a == resultChatOld.f20738a && fa4.m11650l(this.f20739b, resultChatOld.f20739b) && fa4.m11650l(this.f20740c, resultChatOld.f20740c) && fa4.m11650l(this.f20741d, resultChatOld.f20741d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20738a) * 31;
        String str = this.f20739b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20740c;
        return this.f20741d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m22995r(this.f20738a, "ResultChatOld(id=", ", title=", this.f20739b, ", image="), this.f20740c, ", startedAt=", this.f20741d, ")");
    }
}
