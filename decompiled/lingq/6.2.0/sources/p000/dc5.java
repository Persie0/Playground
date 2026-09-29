package p000;

import android.graphics.LightingColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class dc5 extends fa1 {

    /* JADX INFO: renamed from: b */
    public final long f35389b;

    /* JADX INFO: renamed from: c */
    public final long f35390c;

    public dc5(long j, long j2) {
        super(new LightingColorFilter(d32.m10042h0(j), d32.m10042h0(j2)));
        this.f35389b = j;
        this.f35390c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc5)) {
            return false;
        }
        dc5 dc5Var = (dc5) obj;
        return aa1.m199c(this.f35389b, dc5Var.f35389b) && aa1.m199c(this.f35390c, dc5Var.f35390c);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f35390c) + (Long.hashCode(this.f35389b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        ux5.m23002y(this.f35389b, ", add=", sb);
        sb.append((Object) aa1.m205i(this.f35390c));
        sb.append(')');
        return sb.toString();
    }
}
