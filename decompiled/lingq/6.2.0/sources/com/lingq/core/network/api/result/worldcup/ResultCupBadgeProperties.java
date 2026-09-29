package com.lingq.core.network.api.result.worldcup;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupBadgeProperties {
    public static final C1757b Companion = new C1757b();

    /* JADX INFO: renamed from: a */
    public final String f21749a;

    /* JADX INFO: renamed from: b */
    public final Integer f21750b;

    /* JADX INFO: renamed from: c */
    public final String f21751c;

    public /* synthetic */ ResultCupBadgeProperties(int i, Integer num, String str, String str2) {
        this.f21749a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f21750b = null;
        } else {
            this.f21750b = num;
        }
        if ((i & 4) == 0) {
            this.f21751c = null;
        } else {
            this.f21751c = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8410a() {
        return this.f21749a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8411b() {
        return this.f21751c;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m8412c() {
        return this.f21750b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupBadgeProperties)) {
            return false;
        }
        ResultCupBadgeProperties resultCupBadgeProperties = (ResultCupBadgeProperties) obj;
        return fa4.m11650l(this.f21749a, resultCupBadgeProperties.f21749a) && fa4.m11650l(this.f21750b, resultCupBadgeProperties.f21750b) && fa4.m11650l(this.f21751c, resultCupBadgeProperties.f21751c);
    }

    public final int hashCode() {
        int iHashCode = this.f21749a.hashCode() * 31;
        Integer num = this.f21750b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f21751c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultCupBadgeProperties(kind=");
        sb.append(this.f21749a);
        sb.append(", tier=");
        sb.append(this.f21750b);
        sb.append(", team=");
        return AbstractC3393o1.m17738m(sb, this.f21751c, ")");
    }

    public ResultCupBadgeProperties() {
        this.f21749a = "";
        this.f21750b = null;
        this.f21751c = null;
    }
}
