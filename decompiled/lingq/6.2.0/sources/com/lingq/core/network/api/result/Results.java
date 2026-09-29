package com.lingq.core.network.api.result;

import java.util.List;
import p000.bg7;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class Results<ResultType> {
    public static final C1627b5 Companion = new C1627b5();

    /* JADX INFO: renamed from: a */
    public int f21736a;

    /* JADX INFO: renamed from: b */
    public String f21737b;

    /* JADX INFO: renamed from: c */
    public String f21738c;

    /* JADX INFO: renamed from: d */
    public List f21739d;

    static {
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.Results", null, 4);
        bg7Var.m3702k("count", true);
        bg7Var.m3702k("next", true);
        bg7Var.m3702k("previous", true);
        bg7Var.m3702k("results", true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Results)) {
            return false;
        }
        Results results = (Results) obj;
        return this.f21736a == results.f21736a && fa4.m11650l(this.f21737b, results.f21737b) && fa4.m11650l(this.f21738c, results.f21738c) && fa4.m11650l(this.f21739d, results.f21739d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21736a) * 31;
        String str = this.f21737b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21738c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f21739d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f21736a;
        String str = this.f21737b;
        String str2 = this.f21738c;
        List list = this.f21739d;
        StringBuilder sbM22995r = ux5.m22995r(i, "Results(count=", ", next=", str, ", previous=");
        sbM22995r.append(str2);
        sbM22995r.append(", results=");
        sbM22995r.append(list);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
