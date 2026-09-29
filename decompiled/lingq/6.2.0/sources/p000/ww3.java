package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ww3 {

    /* JADX INFO: renamed from: a */
    public final int f67408a;

    /* JADX INFO: renamed from: b */
    public final String f67409b;

    /* JADX INFO: renamed from: c */
    public final Map f67410c;

    /* JADX INFO: renamed from: d */
    public final String f67411d;

    public ww3(int i, String str, Map map, String str2) {
        this.f67408a = i;
        this.f67409b = str;
        this.f67410c = map;
        this.f67411d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww3)) {
            return false;
        }
        ww3 ww3Var = (ww3) obj;
        return this.f67408a == ww3Var.f67408a && fa4.m11650l(this.f67409b, ww3Var.f67409b) && this.f67410c.equals(ww3Var.f67410c) && fa4.m11650l(this.f67411d, ww3Var.f67411d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f67408a) * 31;
        String str = this.f67409b;
        int iM10869a = e65.m10869a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f67410c);
        String str2 = this.f67411d;
        return iM10869a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(statusCode=");
        sb.append(this.f67408a);
        sb.append(", body=");
        sb.append(this.f67409b);
        sb.append(", headers=");
        sb.append(this.f67410c);
        sb.append(", statusMessage=");
        return ux5.m22992o(sb, this.f67411d, ')');
    }
}
