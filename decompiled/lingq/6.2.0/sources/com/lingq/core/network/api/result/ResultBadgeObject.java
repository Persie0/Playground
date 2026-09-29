package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultBadgeObject {
    public static final C1726s Companion = new C1726s();

    /* JADX INFO: renamed from: a */
    public final String f20612a;

    /* JADX INFO: renamed from: b */
    public final String f20613b;

    /* JADX INFO: renamed from: c */
    public final String f20614c;

    public /* synthetic */ ResultBadgeObject(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20612a = null;
        } else {
            this.f20612a = str;
        }
        if ((i & 2) == 0) {
            this.f20613b = null;
        } else {
            this.f20613b = str2;
        }
        if ((i & 4) == 0) {
            this.f20614c = null;
        } else {
            this.f20614c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultBadgeObject)) {
            return false;
        }
        ResultBadgeObject resultBadgeObject = (ResultBadgeObject) obj;
        return fa4.m11650l(this.f20612a, resultBadgeObject.f20612a) && fa4.m11650l(this.f20613b, resultBadgeObject.f20613b) && fa4.m11650l(this.f20614c, resultBadgeObject.f20614c);
    }

    public final int hashCode() {
        String str = this.f20612a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20613b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20614c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultBadgeObject(type=", this.f20612a, ", badge=", this.f20613b, ", title="), this.f20614c, ")");
    }
}
